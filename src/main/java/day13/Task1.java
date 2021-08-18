package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.subscribe(user2);
        user2.subscribe(user1);
        user3.subscribe(user1);
        user1.subscribe(user3);

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет, " + user3.getUsername() + "!");
        user2.sendMessage(user1, "Все ок, спасибо :)");
        user2.sendMessage(user1, "Как у тебя дела?");

        user3.sendMessage(user1, "не ругай снежинку");
        user3.sendMessage(user1, "что попала в глаз");
        user3.sendMessage(user1, "это просто небо");

        user1.sendMessage(user3, "смешались в кучу кони люди, и призадумался олег");
        user1.sendMessage(user3, "ну как мог врезаться титаник");
        user1.sendMessage(user3, "в ковчег");

        user3.sendMessage(user1, "падает на нас");

        MessageDatabase.showDialog(user1, user3);

    }
}
