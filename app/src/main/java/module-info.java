module PasswordGenerator.app.main {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires com.google.common;
    exports edu.isu.cs.student.project to com.google.gson;
    opens edu.isu.cs.student.project;
}