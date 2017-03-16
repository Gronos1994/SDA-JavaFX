package controller;

/**
 * Created by RENT on 2017-03-15.
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.event.*;
import javafx.scene.control.ToggleGroup;
import pl.sdaacademy.model.Adress;
import pl.sdaacademy.model.Company;
import pl.sdaacademy.model.StreetPrefix;

public class CompanyCreateController {

    @FXML
    private TextField streetField;

    @FXML
    private TextField houseNumberField;

    @FXML
    private TextField cityField;

    @FXML
    private RadioButton streetRadio;

    @FXML
    private TextField postalCodeField;

    @FXML
    private Button addCompanyButton;

    @FXML
    private TextField flatNumberField;

    @FXML
    private TextField nameField;

    @FXML
    private RadioButton avenueRadio;

    @FXML
    private TextField nipField;

    @FXML
    private RadioButton squereRadio;
    private StreetPrefix streetPrefix;

    @FXML
    void choosePrefixOnAction(ActionEvent event) {
        if (event.getSource() instanceof RadioButton) {
            RadioButton currentPrefixRadioButton = (RadioButton) event.getSource();
            String buttonName = currentPrefixRadioButton.getText();
            switch (buttonName) {
                case "Ulica":
                    streetPrefix = StreetPrefix.STREET;
                    break;
                case "Aleja":
                    streetPrefix = StreetPrefix.AVENUE;
                    break;
                case "Plac":
                    streetPrefix = StreetPrefix.SQUERE;
                    break;


            }
        }

    }

    @FXML
    void addCompanyOnAction(ActionEvent event) {
        Company company = new Company();
        company.setName(nameField.getText());
        Adress adress = new Adress();
        adress.setStreetPrefix(streetPrefix);
        adress.setStreetPrefix(streetPrefix);
        adress.setStreetPrefix(streetPrefix);
        adress.setStreetName(streetField.getText());
        adress.setHouseNumber(houseNumberField.getText());
        adress.setFlatNumber(flatNumberField.getText());
        adress.setPostalCode(postalCodeField.getText());
        adress.setCity(cityField.getText());
        company.setAdress(adress);
        company.setNip(nipField.getText());
        System.out.println(company);

    }

    @FXML
    void initialize() {
        ToggleGroup group = new ToggleGroup();
        streetRadio.setToggleGroup(group);
        squereRadio.setToggleGroup(group);
        avenueRadio.setToggleGroup(group);

    }
}

