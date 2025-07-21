package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        //создание новой таблицы
        userService.createUsersTable();
        //добавление четырех пользователей
        userService.saveUser("Saveliy", "Korneev", (byte) 25);
        System.out.println("User с именем Saveliy добавлен в базу данных");
        userService.saveUser("Ivan", "Smirnov", (byte) 26);
        System.out.println("User с именем Ivan добавлен в базу данных");
        userService.saveUser("Alex", "Ivanov", (byte) 27);
        System.out.println("User с именем Alex добавлен в базу данных");
        userService.saveUser("Oleg", "Ryduko", (byte) 29);
        System.out.println("User с именем Oleg добавлен в базу данных");
        //Получение всех User из базы и вывод в консоль
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        //Очистка таблицы User(ов)
        userService.cleanUsersTable();
        //Удаление таблицы
        userService.dropUsersTable();

    }
}
