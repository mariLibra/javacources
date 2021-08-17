package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    //слияние участников двух групп, во второй группе участников не остается
    public static void transferMembers(MusicBand a, MusicBand b) {

        for (int i = 0; i < a.getMembers().size(); i++) {
            b.getMembers().add(a.getMembers().get(i));
        }

        //все участники первой группы перешли во вторую группу, в первой группе никого не осталось
        a.getMembers().clear();
    }

    //вывод музыкантов группы в консоль, если в группе нет участников, об этом выводится сообщение
    public void printMembers() {
        if (members.size() == 0) {
            System.out.println("В группе нет участников.");
            return;
        }
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + " - " + members.get(i));
        }
    }

    @Override
    public String toString() {
        return "MusicBand" +
                " " + name +
                " (" + year + ')';
    }
}