package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return (this.isSubscribed(user) && user.isSubscribed(this));
    }

    //сообщения могут быть отправлены только друзьям
    public void sendMessage(User user, String text) {
        if (this.isFriend(user))
            MessageDatabase.addNewMessage(this, user, text);

    }

    @Override
    public String toString() {
        return username;
    }
}
