import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Create HelloFX.java
// javac --module-path %PATH_TO_FX% --add-modules javafx.controls HelloFX.java
// java --module-path %PATH_TO_FX% --add-modules javafx.controls HelloFX
// javaw --module-path %PATH_TO_FX% --add-modules javafx.controls HelloFX


public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}