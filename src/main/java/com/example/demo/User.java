package com.example.demo;

public class User {

        private long userId;
        private String userName;
        private Integer userAge;
        private String userEmail;

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setUserAge(Integer userAge) {
            this.userAge = userAge;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public long getUserId() {
            return userId;
        }

        public String getUserName() {
            return userName;
        }

        public Integer getUserAge() {
            return userAge;
        }

        public String getUserEmail() {
            return userEmail;
        }
    }

