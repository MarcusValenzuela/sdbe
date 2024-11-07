package com.sundevilbookexchange;

import java.time.LocalDate;

public class User {
    private Long userId;
    private LocalDate joinDate;

    // Constructor
    public User(Long userId, LocalDate joinDate) {
        this.userId = userId;
        this.joinDate = joinDate;
    }

    // Getters and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
