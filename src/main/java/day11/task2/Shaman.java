package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    private int physAtt;
    private int magicAtt;
    private int health;
    private double physDef;
    private double magicDef;

    public Shaman() {
        super();
        this.physAtt = 10;
        this.magicAtt = 15;
        this.health = MAX_HEALTH;
        this.physDef = 0.2;
        this.magicDef = 0.2;
    }

    public int getPhysAtt() {
        return this.physAtt;
    }

    public int getMagicAtt() {
        return this.magicAtt;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPhysDef() {
        return this.physDef;
    }

    public double getMagicDef() {
        return this.magicDef;
    }

    @Override
    public void healHimself() {
        //проверяем условие, после лечения здоровье не больше максимально возможного
        if (health + 25 < MAX_HEALTH) {
            health += 25;
        }else
            health = MAX_HEALTH;
    }

    @Override
    public void healTeammate(Hero hero) {
        //проверяем условие, после лечения здоровье не больше максимально возможного
        if (hero.getHealth() + 10 < MAX_HEALTH) {
            hero.setHealth(hero.getHealth() + 10);
        } else
            hero.setHealth(MAX_HEALTH);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int helthOfHero = hero.getHealth() - (int) (magicAtt - magicAtt * hero.getMagicDef());
        //проверяем условие, после атаки здоровье не может быть отрицательным
        if (helthOfHero > 0) {
            hero.setHealth(helthOfHero);
        } else
            hero.setHealth(MIN_HEALTH);
    }

    @Override
    public void physicalAttack(Hero hero) {
        int helthOfHero = hero.getHealth() - (int) (physAtt - physAtt * hero.getPhysDef());
        //проверяем условие, после атаки здоровье должно быть неотрицательным
        if (helthOfHero > 0) {
            hero.setHealth(helthOfHero);
        } else
            hero.setHealth(MIN_HEALTH);
    }

    @Override
    public String toString() {
        return "Shaman {health = "
                + getHealth()
                + "}";
    }
}
