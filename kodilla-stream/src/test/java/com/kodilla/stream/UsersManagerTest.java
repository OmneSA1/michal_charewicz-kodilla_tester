package com.kodilla.stream;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        // Given
        List<User> users = UsersRepository.getUsersList();

        // When
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();

        // Then
        assertNotNull(chemistUsernames);
        assertFalse(chemistUsernames.isEmpty());
        assertEquals(2, chemistUsernames.size());
        assertTrue(chemistUsernames.contains("Walter White"));
        assertTrue(chemistUsernames.contains("Gale Boetticher"));
    }
    @Test
    public void testGetUsersOlderThan() {
        // Given
        int ageLimit = 30;

        // When
        List<User> usersOlderThanLimit = UsersManager.getUsersOlderThan(ageLimit);

        // Then
        assertNotNull(usersOlderThanLimit);
        assertFalse(usersOlderThanLimit.isEmpty());
        for (User user : usersOlderThanLimit) {
            assertTrue(user.getAge() > ageLimit);
        }
    }
    @Test
    public void testGetUsersWithMinPosts() {
        // Given
        int minPosts = 100;

        // When
        List<User> result = UsersManager.getUsersWithMinPosts(minPosts);

        // Then
        assertNotNull(result);
        assertFalse(result.isEmpty());
        for (User user : result) {
            assertTrue(user.getNumberOfPost() >= minPosts);
        }
    }
}