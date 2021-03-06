import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Generic popup box that displays a title and information that are supplied as arguments.
 * @author Oliver
 * @version 1.0
 * */
public class InformationBox {
    public static void display(String title, String info) {
        Stage window = new Stage();
        window.setWidth(500);
        window.setHeight(200); //edit?
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        
        Label label = new Label(info);
        
        Button close = new Button("OK");
        close.setOnAction(e -> window.close());
        
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, close);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        
        window.showAndWait();
    }
}