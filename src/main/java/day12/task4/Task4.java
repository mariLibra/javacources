package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> band1 = new ArrayList<>();
        band1.add("Rudolf Schenker");
        band1.add("Karl-Heinz Vollmer");
        band1.add("Joachim Kirchhoff");
        band1.add("Wolfgang Dziony");
        MusicBand m1 = new MusicBand("Scorpions", 1972, band1);

        List<String> band2 = new ArrayList<>();
        band2.add("Freddie Mercury");
        band2.add("Brian May");
        band2.add("Roger Taylor");
        band2.add("Mike Grose");
        MusicBand m2 = new MusicBand("Queen", 1970, band2);

        System.out.print("Музыканты " + m1 + ": \n");
        m1.printMembers();
        System.out.println();

        MusicBand.transferMembers(m1, m2);

        System.out.print("Музыканты " + m1 + " после слияния: \n");
        m1.printMembers();
        System.out.println();

        System.out.print("Музыканты " + m2 + " после слияния: \n");
        m2.printMembers();

    }
}
