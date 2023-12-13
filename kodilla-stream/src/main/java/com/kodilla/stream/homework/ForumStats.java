package com.kodilla.stream.homework;
import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double getAveragePostsForYoungUser(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }

    public static double getAveragePostsForOldUser(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >=40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }
    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        double avgPostYoungUser = getAveragePostsForYoungUser(users);
        double avgPostOldUser = getAveragePostsForOldUser(users);

        System.out.println("Średnia liczba postów użytkowników poniżej 40 lat: " + avgPostYoungUser);
        System.out.println("Średnia liczba postów użytkowników w wieku 40 lat i starszych: " + avgPostOldUser);
    }
}
