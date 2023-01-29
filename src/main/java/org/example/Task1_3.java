package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task1_3 {

    static class User {
        private String name;
        private int age;
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return (age == user.age &&
                    name.equals(user.name));
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {
        Set<Task1_3.User> users = new HashSet<>();
        users.add(new Task1_3.User("Max", 27));
        users.add(new Task1_3.User("Veronika", 20));
        users.add(new Task1_3.User("Denis", 30));
        users.add(new Task1_3.User("Max", 27));

        if (users.size() == 3) {
            System.out.println("System works well!");
        } else {
            throw new RuntimeException("Users set size should be 3!");
        }
    }
}
