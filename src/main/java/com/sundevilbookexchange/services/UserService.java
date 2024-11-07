package com.sundevilbookexchange.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    // Mock method to return a list of buyers
    public List<String> getAllBuyers() {
        // For now, return a mock list of buyer names (or mock objects)
        List<String> buyers = new ArrayList<>();
        buyers.add("Buyer1");
        buyers.add("Buyer2");
        return buyers;
    }

    // Mock method to return a list of sellers
    public List<String> getAllSellers() {
        // For now, return a mock list of seller names (or mock objects)
        List<String> sellers = new ArrayList<>();
        sellers.add("Seller1");
        sellers.add("Seller2");
        return sellers;
    }

    // Mock method to simulate deleting a user by ID
    public void deleteUserById(Long userId) {
        // Mock deletion logic (print statement for now)
        System.out.println("User with ID " + userId + " deleted.");
    }
}
