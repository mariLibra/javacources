package day11.task2;

public abstract class Hero {

    private int physAtt;
    private int magicAtt;
    private int health;
    private double physDef;
    private double magicDef;

    public Hero() {
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
    }

    public final static int MAX_HEALTH = 100;
    public final static int MIN_HEALTH = 0;


    public abstract int getPhysAtt();

    public abstract int getMagicAtt();

    public abstract int getHealth();

    public abstract void setHealth(int health);

    public abstract double getPhysDef();

    public abstract double getMagicDef();
}
