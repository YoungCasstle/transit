package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLOutput;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Bob", "Morley", (byte) 25);
        userService.saveUser("John", "Weak", (byte) 35);
        userService.saveUser("Cole", "Bennet", (byte) 27);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
