module ni.edu.uam.practicahilos_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.practicahilos_javafx to javafx.fxml;
    exports ni.edu.uam.practicahilos_javafx;
}