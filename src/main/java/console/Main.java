package console;

import pl.sdaacademy.model.User;
import pl.sdaacademy.service.DataService;
import pl.sdaacademy.service.UserService;
import pl.sdaacademy.xmlFactory.XMLFactory;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        login(scanner);
//        DataService dataService = new DataService();
//        User user=new User("kowalski","abc123");
//        XMLFactory<User> xmlFactory = new XMLFactory<User>(User.class);
//        String xmlUser = xmlFactory.objectToXML(user);
////        User user = dataService.loadUserFromData();
////        System.out.println(user.getLogin() + " " + user.getPassword());
//
//        dataService.saveData(xmlUser);
    }

    private static void login(Scanner scanner) {

//        System.out.println(login + " " + password);
//
//

        UserService userService = new UserService();
        boolean isLogin = false;
        while (!isLogin) {
            System.out.println("Login: ");
            String login = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();

            User user = new User(login, password);
            isLogin = userService.authenticate(user);
            if (isLogin) {
                System.out.println("Zalogowany");
            } else {
                System.out.println("Nieprawidłowe haslo");
            }
        }
    }
}
