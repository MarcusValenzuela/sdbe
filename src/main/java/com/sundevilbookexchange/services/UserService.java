package com.sundevilbookexchange.services;

import com.sundevilbookexchange.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    // Mock method to return a list of buyers
    public List<User> getAllBuyers() {
        List<User> buyers = new ArrayList<>();
        buyers.add(new User(1L, LocalDate.now().minusDays(10)));
        buyers.add(new User(2L, LocalDate.now().minusDays(20)));
        return buyers;
    }

    // Mock method to return a list of sellers
    public List<User> getAllSellers() {
        List<User> sellers = new ArrayList<>();
        sellers.add(new User(3L, LocalDate.now().minusDays(15)));
        sellers.add(new User(4L, LocalDate.now().minusDays(25)));
        return sellers;
    }

    // Mock method to simulate deleting a user by ID
    public void deleteUserById(Long userId) {
        System.out.println("User with ID " + userId + " deleted.");
    }
}
