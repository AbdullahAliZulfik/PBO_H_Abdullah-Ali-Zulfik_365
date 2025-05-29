import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Masukkan nama:");
        TextField textField = new TextField();
        Button button = new Button("Tampilkan");

        button.setOnAction(e -> {
            String nama = textField.getText();
            System.out.println("Halo, " + nama);
        });

        VBox root = new VBox(10, label, textField, button);
        Scene scene = new Scene(root, 300, 150);

        primaryStage.setTitle("Contoh JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
