package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        //Воин атакует Паладина
        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        //Паладин атакует Мага
        paladin.physicalAttack(magician);
        System.out.println(magician);

        //Шаман лечит Мага
        shaman.healTeammate(magician);
        System.out.println(magician);

        //Маг атакует Паладина, тип атаки М
        magician.magicalAttack(paladin);
        System.out.println(paladin);

        //Шаман атакует Воина, тип атаки Ф
        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        //Паладин лечит себя
        paladin.healHimself();
        System.out.println(paladin);
        System.out.println();

        //Воин атакует Мага 5 раз
        for(int i = 0; i<5; i++){
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }



    }
}
