package com.example.passwordgenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    private Label numberSymbols;

    @FXML
    public void initialize(){numberSymbols.setText("Enter the number of symbols at 6 to 16 : ");}

    @FXML
    private TextField textField;

    @FXML
    private CheckBox checkBox1;

    @FXML
    private CheckBox checkBox2;

    @FXML
    private CheckBox checkBox3;

    @FXML
    private CheckBox checkBox4;

    @FXML
    private Label password;

    private final String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
    private final String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private final String numbers = "0123456789";
    private final String symbols = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`";
    private final String lowerAndUpperCase = lowerCase + upperCase;
    private final String lowerCaseAndNumbers = lowerCase + numbers;
    private final String upperCaseAndNumbers = upperCase + numbers;
    private final String lowerAndUpperCaseAndNumbers = lowerCase + upperCase + numbers;
    private final String lowerCaseAndNumbersAndSymbols = lowerCase + numbers + symbols;
    private final String upperCaseAndNumbersAndSymbols = upperCase + numbers + symbols;
    private final String upperCaseAndSymbols = upperCase + symbols;
    private final String numbersAndSymbols =  numbers + symbols;
    private final String lowerCaseAndSymbols =  lowerCase + symbols;
    private final String all = lowerCase + upperCase + numbers + symbols;
    private  String pass;
    private final Random random = new Random();

    @FXML
    public  void setCheckBox1(ActionEvent event){
        if(checkBox1.isSelected()){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = lowerCase.charAt(random.nextInt(lowerCase.length())) ;
            }
            pass = String.valueOf(newPass);
        }
    }
    @FXML
    public  void setCheckBox2(ActionEvent event){
        if(checkBox2.isSelected() && checkBox1.isSelected()){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = lowerAndUpperCase.charAt(random.nextInt(lowerAndUpperCase.length())) ;
            }
            pass = String.valueOf(newPass);
        } else if(checkBox2.isSelected()){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = upperCase.charAt(random.nextInt(upperCase.length())) ;
            }
            pass = String.valueOf(newPass);
        }
    }
    @FXML
    public  void setCheckBox3(ActionEvent event) {
        if (checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected()) {
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for (int i = 0; i < Integer.parseInt(textField.getText()); i++) {
                newPass[i] = lowerAndUpperCaseAndNumbers.charAt(random.nextInt(lowerAndUpperCaseAndNumbers.length()));
            }
            pass = String.valueOf(newPass);

        } else if (checkBox1.isSelected() && checkBox3.isSelected()) {
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for (int i = 0; i < Integer.parseInt(textField.getText()); i++) {
                newPass[i] = lowerCaseAndNumbers.charAt(random.nextInt(lowerCaseAndNumbers.length()));
            }
            pass = String.valueOf(newPass);

          }
        else if (checkBox2.isSelected() && checkBox3.isSelected()) {
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for (int i = 0; i < Integer.parseInt(textField.getText()); i++) {
                newPass[i] = upperCaseAndNumbers.charAt(random.nextInt(upperCaseAndNumbers.length()));
            }
            pass = String.valueOf(newPass);
        }
         else if (checkBox3.isSelected()) {
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for (int i = 0; i < Integer.parseInt(textField.getText()); i++) {
                newPass[i] = numbers.charAt(random.nextInt(numbers.length()));
            }
            pass = String.valueOf(newPass);

        }
    }
    @FXML
    public  void setCheckBox4(ActionEvent event){
        if(checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected() && checkBox4.isSelected() ){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = all.charAt(random.nextInt(all.length())) ;
            }
            pass = String.valueOf(newPass);
        }
         else if(checkBox1.isSelected() &&  checkBox3.isSelected() && checkBox4.isSelected() ){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = lowerCaseAndNumbersAndSymbols.charAt(random.nextInt(lowerCaseAndNumbersAndSymbols.length())) ;
            }
            pass = String.valueOf(newPass);
        }
        else if(checkBox2.isSelected() &&  checkBox3.isSelected() && checkBox4.isSelected() ){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = upperCaseAndNumbersAndSymbols.charAt(random.nextInt(upperCaseAndNumbersAndSymbols.length())) ;
            }
            pass = String.valueOf(newPass);
        }
        else if( checkBox3.isSelected() && checkBox4.isSelected() ){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = numbersAndSymbols.charAt(random.nextInt(numbersAndSymbols.length())) ;
            }
            pass = String.valueOf(newPass);
        }
        else if( checkBox2.isSelected() && checkBox4.isSelected() ){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = upperCaseAndSymbols.charAt(random.nextInt(upperCaseAndSymbols.length())) ;
            }
            pass = String.valueOf(newPass);
        }
        else if( checkBox1.isSelected() && checkBox4.isSelected() ){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = lowerCaseAndSymbols.charAt(random.nextInt(lowerCaseAndSymbols.length())) ;
            }
            pass = String.valueOf(newPass);
        }
        else if(checkBox4.isSelected()){
            char[] newPass = new char[Integer.parseInt(textField.getText())];
            for(int i = 0; i < Integer.parseInt(textField.getText()); i++){
                newPass[i] = symbols.charAt(random.nextInt(symbols.length())) ;
            }
            pass = String.valueOf(newPass);

        }
    }
    @FXML
    protected void onButtonClick() {
     if( Integer.parseInt(textField.getText()) >= 6 &&  Integer.parseInt(textField.getText()) <= 16 ) {
        password.setText(pass);
     }
     else {
         Alert alert = new Alert(Alert.AlertType.ERROR);
//         alert.setTitle("ERROR");
//         alert.setHeaderText("Insert the number at 6 to 16 !!!");
//
       alert.showAndWait();

     }

    }
}