package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> musicBandList =
                new ArrayList<>(Arrays.asList(
                        new MusicBand("Green Day", 1987),
                        new MusicBand("Coldplay", 1996),
                        new MusicBand("Linkin Park ", 1996),
                        new MusicBand("Foo Fighters", 1994),
                        new MusicBand("Outkast", 1991),
                        new MusicBand("Maroon 5", 1994),
                        new MusicBand("The White Stripes", 1997),
                        new MusicBand("U2", 1976),
                        new MusicBand("Radiohead", 1985),
                        new MusicBand("The Strokes", 1998),
                        new MusicBand("Arctic Monkeys", 2002),
                        new MusicBand("Paramore", 2004),
                        new MusicBand("Neon Trees", 2008),
                        new MusicBand("Muse", 1994),
                        new MusicBand("The Killers", 2001)));

        Collections.shuffle(musicBandList);

        System.out.println("Оригинальный список групп: \n" + musicBandList);

        groupsAfter2000(musicBandList);
        System.out.println("Обновленный список групп, образованных после 2000 года: \n" + musicBandList);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        //-------цикл for работает некорректно, не понимаю, почему

        //for(int i = 0; i < bands.size(); i++){
        //    if(bands.get(i).getYear() <= 2000){
        //        bands.remove(bands.get(i));
        //  }
        //}

        // ------цикл foreach выдает ConcurrentModificationException

        //for (MusicBand band : bands) {
        //    if (band.getYear() <= 2000) {
        //       bands.remove(band);
        //   }
        // }

        //lambda-выражение, преобразованное из цикла foreach работает корректно
        bands.removeIf(band -> band.getYear() <= 2000);
        return bands;
    }
}