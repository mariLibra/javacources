package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    private int physAtt;
    private int health;
    private double physDef;
    private double magicDef;

    public Paladin() {
        super();
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.health = MAX_HEALTH;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {this.health = health; }

    public int getPhysAtt() {
        return this.physAtt;
    }

    public double getPhysDef() {
        return this.physDef;
    }

    public double getMagicDef() {
        return this.magicDef;
    }

    public int getMagicAtt() {
        return 0;
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
    public void physicalAttack(Hero hero) {
        int helthOfHero = hero.getHealth() - (int) (physAtt - physAtt * hero.getPhysDef());
        //проверяем условие, после атаки здоровье не может быть отрицательным
        if (helthOfHero > 0) {
            hero.setHealth(helthOfHero);
        } else
            hero.setHealth(MIN_HEALTH);

    }

    @Override
    public String toString() {
        return "Paladin {health = "
                + getHealth()
                + "}";
    }
}
