package stream_api_example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting5 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(10, "Vali"));
        users.add(new User(11, "Oktay"));
        users.add(new User(12, "Samir"));
        users.add(new User(13, "Ramal"));
        users.add(new User(14, "Nicat"));
        users.add(new User(15, "Hesen"));
        users.add(new User(16, "Samed"));
        users.add(new User(17, "Ali"));

        users.stream().forEach(user -> {
            System.out.println("Java8");
            System.out.println(user.toString());
        });
        System.out.println("--------------------------");

        users.stream().forEach(user -> user.talk());
        //users.stream().forEach(User :: talk); - qisa yol
        System.out.println("--------------------------");

        Long count = users.stream().filter(user -> user.id > 13).count();
        System.out.println("Count " + count);
        System.out.println("--------------------------");

        List<User> filteredList = users.stream().filter(user -> user.id > 13).collect(Collectors.toList());
        filteredList.stream().forEach(User::talk);
        System.out.println("--------------------------");

        List<User> mappedList = users.stream().map(user -> new User(user.id + 100, user.name)).collect(Collectors.toList());
        mappedList.stream().forEach(user -> System.out.println(user.toString()));
    }
}


class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void talk() {
        System.out.println("Hi, I am " + this.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
