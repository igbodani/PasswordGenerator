module PasswordGenerator.app.main {
    requires javafx.graphics;
    requires javafx.controls;
    requires com.google.gson;
    requires com.google.common;
    exports edu.isu.cs.student.project;
    opens edu.isu.cs.student.project;
}