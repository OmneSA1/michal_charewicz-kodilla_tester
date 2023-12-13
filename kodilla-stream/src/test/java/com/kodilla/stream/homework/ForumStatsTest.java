package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    @Test
    public void testGetAverageNumberPostsForYoung() {
        //given
        List<User> users = Arrays.asList(
                new User("User1",38,10,"Group1"),
                new User("User2", 39,20,"Group2")
        );
        //when
        double average = ForumStats.getAveragePostsForYoungUser(users);

        //then
        assertEquals(15,average);
    }

    @Test
    public void testGetAverageNumberPostsForOld() {
        //given
        List<User> users = Arrays.asList(
           new User("User3", 45, 5,"Group3"),
           new User("User4", 42,10,"Group4")
        );
        //when
        double average = ForumStats.getAveragePostsForOldUser(users);

        //then
        assertEquals(7.5,average) ;
    }
}
