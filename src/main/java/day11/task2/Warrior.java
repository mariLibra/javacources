package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private int physAtt;
    private int health;
    private double physDef;
    private double magicDef;

    public Warrior() {
        super();
        this.physAtt = 30;
        this.health = MAX_HEALTH;
        this.physDef = 0.8;
        this.magicDef = 0;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return 0;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
        return "Warrior {health = "
                + getHealth()
                + "}";
    }
}
