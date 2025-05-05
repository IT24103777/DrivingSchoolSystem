package com.DrivingSchoolSystem;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

    // Mock user database (you would replace this with an actual database connection)
    private static final Map<String, String> usersDB = new HashMap<>();

    static {
        // Example of a user with email and password (hashed password for 'password')
        usersDB.put("user@example.com", "5e884898da28047151d0e56f8dc6292773603d0d6b8dbe220c19b80b8e15b1c5"); // SHA-256 hash of 'password'
    }

    // Method to validate the user
    public static boolean validateUser(String email, String password) {
        String storedPasswordHash = usersDB.get(email); // Get the hashed password from the "database"
        if (storedPasswordHash != null) {
            // Compare the stored password hash with the hashed input password
            String inputPasswordHash = PasswordUtil.encrypt(password); // Hash the input password
            return storedPasswordHash.equals(inputPasswordHash); // Return true if they match
        }
        return false; // Return false if the email is not found
    }

    // Method to retrieve user information (this could be extended with more details)
    public static User getUser(String email) {
        // For simplicity, we return a mock User object with email and full name
        // In a real scenario, you would query the database for user details
        if (email.equals("user@example.com")) {
            return new User(email, "Sample User");
        }
        return null; // Return null if the user doesn't exist
    }
}
