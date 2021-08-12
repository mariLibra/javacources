package day7;

public class Player {
    private int stamina;
    static int countPlayers;

    public static final int MAX_PLAYERS = 6;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        add(this);
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            return;
        }
        stamina--;

        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {

        switch (countPlayers) {
            case 1:
                System.out.println("Команды неполные. На поле есть еще 5 свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные. На поле есть еще " + (MAX_PLAYERS - countPlayers) + " свободных местa");
                break;
            case 5:
                System.out.println("Команды неполные. На поле есть еще 1 свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
                break;
        }
    }

    public static void add(Player player) {
        Player[] players = new Player[MAX_PLAYERS];
        if (countPlayers < MAX_PLAYERS) {
            players[countPlayers - 1] = player;
        }
        else
            countPlayers = 6;
    }
}
