package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> band1 = new ArrayList<>();
        band1.add(new MusicArtist("Anthony Kiedis", 60));
        band1.add(new MusicArtist("Michael „Flea“ Balzary", 59));
        band1.add(new MusicArtist("Chad Smith", 61));
        band1.add(new MusicArtist("John Frusciante", 52));
        MusicBand mb1 = new MusicBand("Red Hot Chili Peppers", 1983, band1);

        List<MusicArtist> band2 = new ArrayList<>();
        band2.add(new MusicArtist("2D", 23));
        band2.add(new MusicArtist("Murdoc Niccals", 23));
        band2.add(new MusicArtist("Noodle", 23));
        band2.add(new MusicArtist("Russel Hobbs", 23));
        MusicBand mb2 = new MusicBand("Gorillaz", 1998, band2);

        System.out.println("Музыканты " + mb1 + ": ");
        mb1.printMembers();
        System.out.println();

        MusicBand.transferMembers(mb1, mb2);

        System.out.println("Музыканты " + mb1 + " после слияния c " + mb2 + ": ");
        mb1.printMembers();
        System.out.println();

        System.out.println("Музыканты " + mb2 + " после слияния: ");
        mb2.printMembers();
        System.out.println();

    }
}