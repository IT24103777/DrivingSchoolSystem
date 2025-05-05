package com.DrivingSchoolSystem;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {

    // This method hashes the password using SHA-256
    public static String encrypt(String password) {
        try {
            // Get a MessageDigest instance for SHA-256 hashing
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            // Hash the password
            byte[] hashedBytes = messageDigest.digest(password.getBytes());

            // Convert the hashed bytes to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedBytes) {
                hexString.append(String.format("%02x", b));
            }

            // Return the hashed password
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
