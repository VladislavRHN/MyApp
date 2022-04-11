package  org.where;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My first App");
        Button btn = new Button();
        btn.setText("Say 'I am JavaFX'");
        btn.setOnAction(new EventHandler<ActionEvent>() {


            public void handle(ActionEvent event) {
                System.out.println("I am JavaFX");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    //<version>${javafx.maven.plugin.version}</version>    //Версия плагина в <build>version</build>
}
