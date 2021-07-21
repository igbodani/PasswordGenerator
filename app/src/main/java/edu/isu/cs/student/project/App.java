package edu.isu.cs.student.project;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.Objects;

import static javafx.application.Application.launch;

public class App extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override

    public void start(Stage primaryStage) throws Exception {

        CheckBox lowercase = new CheckBox("Include lowercase");
        CheckBox uppercase = new CheckBox("Include uppercase");
        CheckBox numbers = new CheckBox("Include numbers");
        CheckBox symbols = new CheckBox("Include Symbols");
        Label numberText = new Label("Select password length :");
        TextField password = new TextField();

         /*
         Adding valid numbers to ComboBox
         Using a for loop
         */
        ComboBox<Integer> lengthOfPassword = new ComboBox<>();
        for(int i = 8; i<=24; i++) {
            lengthOfPassword.getItems().addAll(i);
        }

        /*
         Generate Button, upon click will generate the random password
         */

        Button generate = new Button("Generate");
        // generate.setStyle("-fx-background-color: h;");
        // generate.setId();
        generate.setOnAction(event -> {
            if(lengthOfPassword.getSelectionModel().isEmpty()){
                password.setText("Select password length");
            }
            else{
                if (lowercase.isSelected() && uppercase.isSelected() && numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.generateAll(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (lowercase.isSelected() && !uppercase.isSelected() && !numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.lowerCase(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (!lowercase.isSelected() && uppercase.isSelected() && !numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.upperCase(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }

                if (lowercase.isSelected() && uppercase.isSelected() && !numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.lettersOnly(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }

                if (lowercase.isSelected() && uppercase.isSelected() && numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.noSpecialChar(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (!lowercase.isSelected() && !uppercase.isSelected() && numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.numbersOnly(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }

                if (!lowercase.isSelected() && uppercase.isSelected() && numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.noLowerCase(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (lowercase.isSelected() && !uppercase.isSelected() && numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.noUpperCase(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (!lowercase.isSelected() && !uppercase.isSelected() && !numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.specialCharOnly(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (!lowercase.isSelected() && !uppercase.isSelected() &&! numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.generateAll(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }

                if (lowercase.isSelected() && !uppercase.isSelected() &&! numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.lowerSymbols(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (!lowercase.isSelected() && uppercase.isSelected() &&! numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.upperSymbols(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (!lowercase.isSelected() && !uppercase.isSelected() && numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.numberSymbols(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (lowercase.isSelected() && uppercase.isSelected() && !numbers.isSelected() && symbols.isSelected()) {
                    password.setText(PasswordGenerator.noNumbers(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (!lowercase.isSelected() && uppercase.isSelected() && numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.upperNumbers(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }
                if (lowercase.isSelected() && !uppercase.isSelected() && numbers.isSelected() && !symbols.isSelected()) {
                    password.setText(PasswordGenerator.lowerNumbers(lengthOfPassword.getSelectionModel().getSelectedItem()));
                }

            }
        });

         /*
        HBox node for Label and combobox for numbers

         */
        HBox numberBox = new HBox(numberText,lengthOfPassword);
        numberBox.setSpacing(3);
        VBox choices = new VBox(numberBox,lowercase,uppercase,numbers,symbols);
        choices.setSpacing(10);
        choices.setPadding(new Insets(10));


        /*
        HBox node for generated password and generate button

         */
        HBox displayBox = new HBox(password, generate);
        displayBox.setSpacing(20);
        displayBox.setPadding(new Insets(40));

         /*
         BorderPane is the parent node

         */

        BorderPane pane = new BorderPane();
        pane.setLeft(choices);
      //  pane.setStyle("-fx-background-color: red");
        pane.setBottom(displayBox);
        pane.setPadding(new Insets(10));



        Scene scene = new Scene(pane, 400, 300);
        URL url = new File("C:\\Users\\igbod\\Desktop\\Projects\\PasswordGenerator\\app\\src\\Stylesheets\\style.css").toURI().toURL();
        scene.getStylesheets().add(String.valueOf(url));
       // scene.getStylesheets().getClass().getResource("C:\\Users\\igbod\\Desktop\\Projects\\PasswordGenerator\\app\\src\\Stylesheets\\style.css").toExternalForm();
        primaryStage.setScene(scene);
       // primaryStage.getIcons().add(new Image(""));
        primaryStage.setTitle("Password-Generator");
        primaryStage.show();

    }


}





