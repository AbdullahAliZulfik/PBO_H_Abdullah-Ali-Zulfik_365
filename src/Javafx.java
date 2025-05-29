import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Javafx extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Halo, ini Gui JavaFX di Intellij!");
        Button button = new Button("Klik Aku");

        button.setOnAction(e -> label.setText("Tombol Sudah Diklik!"));

        VBox layout = new VBox(10);
        layout.getChildren().

                addAll(label, button);

        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("Aplikasi JavaFX Pertama");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}