package com.acompany.springdemo.dao;

import com.acompany.springdemo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User(100, "Kwa"));
        users.add(new User(200, "Ava"));
        users.add(new User(300, "Blo"));
        users.add(new User(400, "MDO"));
        users.add(new User(500, "OAP"));
        users.add(new User(600, "JUNG"));
    }

    public List<User> getAllUsers() {
        System.out.println("사용자 전체보기::repository");
        return users;
    }

    public User getUserByUserId(Integer userId) {
        System.out.println("사용자 상세보기::repository");
        return users.stream()
                .filter(user -> user.getUserId().equals(userId))
                .findAny()
                .orElse(new User(0, "no user"));
    }

    public User insertUser(User user) {
        System.out.println("사용자 등록::repository");
        users.add(user);
        return user;
    }

    public void updateUser(User user) {
        System.out.println("사용자 정보 수정::repository");

        users.stream().filter(item -> item.getUserId().equals(user.getUserId()))
                .findAny()
                .orElse(new User(0, "no user"))
                .setUserName(user.getUserName());
    }

    public void deleteUser(Integer userId) {
        System.out.println("사용자 삭제::repository");
        users.removeIf(user -> user.getUserId().equals(userId));
    }
}
