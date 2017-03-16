package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pl.sdaacademy.model.User;
import pl.sdaacademy.service.UserService;

public class LoginController extends Controller {

    @FXML
    private Button submit;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField loginTextField;

    @FXML
    void submitOnAction(ActionEvent event) {
//        System.out.println(loginTextField.getText());
//        System.out.println(passwordField.getText());
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Hello");
//        alert.show();
        /**
         * 1. Powołać userService
         * 2.Tworzymy użytkownika z polami pobranymi z fieldów.
         * 3. Korzystamy z metody authenticate
         * 4. Check out.
         */
        UserService userService = new UserService();
        User user = new User();
        user.setLogin(loginTextField.getText());
        user.setPassword(passwordField.getText());
        boolean flag = userService.authenticate(user);
        if (flag) {
            showErrorAllert("Zalogowano");

        } else {
            showErrorAllert("Nie zalogowano");

        }


    }
}



