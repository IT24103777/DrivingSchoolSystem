package com.DrivingSchoolSystem;

import java.util.ArrayList;
import java.util.List;

    public class UserDB {
        private static List<User> users = new ArrayList<>();

        public static boolean create(User user) {
            // Check if user already exists by email
            if (findByEmail(user.getEmail()) != null) {
                return false; // User already exists
            }
            return users.add(user);
        }

        public static User findByEmail(String email) {
            for (User user : users) {
                if (user.getEmail().equalsIgnoreCase(email)) {
                    return user;
                }
            }
            return null;
        }

        public static boolean updatePassword(String email, String newPassword) {
            User user = findByEmail(email);
            if (user != null) {
                user.setPassword(newPassword);
                return true;
            }
            return false;
        }

        public static List<User> getAllUsers() {
            return users;
        }
    }


