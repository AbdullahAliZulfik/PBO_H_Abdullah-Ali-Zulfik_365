package Belajarjavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class memasukkan extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Nama:");
        TextField textField = new TextField();
        Button button = new Button("Kirim");

        button.setOnAction(e -> {
            String nama = textField.getText();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Menyapa");
            ;
            alert.setHeaderText(null);
            alert.setContentText("Halo, " + nama + "!");
            alert.showAndWait();
        });
        VBox root = new VBox(10, label, textField, button);
        Scene scene = new Scene(root, 350, 180);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Contoh JavaFx Sedernahana");
        primaryStage.show();
    }

    public static void main(String[] args) {
launch(args);
    }
    }

