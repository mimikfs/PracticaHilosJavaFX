package ni.edu.uam.practicahilos_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HMainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HMainApp.class.getResource("Hilos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Scene");
        stage.setScene(scene);
        stage.show();

        HiloController controller = fxmlLoader.getController();

        stage.setOnCloseRequest(event -> controller.detenerAlCerrar());

    }
    public static void main(String[] args){
        launch(args);
    }
}
