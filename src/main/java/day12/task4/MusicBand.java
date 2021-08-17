package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    //слияние двух групп, все участники из первой группы переходят во вторую
    public static void transferMembers(MusicBand a, MusicBand b) {

        for (int i = 0; i < a.getMembers().size(); i++) {
            b.getMembers().add(a.getMembers().get(i));
        }

        //все участники первой группы перешли во вторую группу, в первой группе никого не осталось
        a.getMembers().clear();

    }

    //вывод всех участников группы. Если в группе нет участников, выводится сообщение об этом
    public void printMembers() {
        if(members.size() == 0){
            System.out.println("В группе нет участников.");
            return;
        }

        for (int i = 0; i < members.size(); i++) {
            System.out.println((i+1) + " - " + members.get(i));
        }
    }

    @Override
    public String toString() {
        return "'" + name + '\'' +
                " (" + year +
                ")";
    }
}