import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public static void main(String[] args) {
       Label label = new Label("Halo, ini Gui JavaFX di Intellij!");
       Button button = new Button("Klik Aku");

       button.setOnAction(e -> label.setText("Tombol Sudah Diklik!"));

       VBox layout = new VBox(10);
       layout.getChildren().addAll(label,button);

       Scene scene = new Scene(layout, 300, 200);

       primaryStage
    }
}