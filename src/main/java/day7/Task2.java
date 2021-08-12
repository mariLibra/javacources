package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int stm_rdm = 90 + random.nextInt(11);

        Player player1 = new Player(stm_rdm);
        Player player2 = new Player(stm_rdm);
        Player player3 = new Player(stm_rdm);
        Player player4 = new Player(stm_rdm);
        Player player5 = new Player(stm_rdm);
        Player player6 = new Player(stm_rdm);

        Player player7 = new Player(stm_rdm);

        Player.info();

        while (player1.getStamina() >= 0) {
            player1.run();
        }

        Player.info();

    }
}
