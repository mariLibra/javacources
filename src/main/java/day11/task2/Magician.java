package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{

    private int physAtt;
    private int magicAtt;
    private int health;
    private double physDef;
    private double magicDef;

    public Magician() {
        super();
        this.physAtt = 5;
        this.magicAtt = 20;
        this.health = MAX_HEALTH;
        this.physDef=0;
        this.magicDef = 0.8;
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
        //проверяем условие, после атаки здоровье не может быть отрицательным
        if (helthOfHero > 0) {
            hero.setHealth(helthOfHero);
        } else
            hero.setHealth(MIN_HEALTH);
    }

    @Override
    public String toString() {
        return "Magician {health = "
                + getHealth()
                + "}";
    }
}
