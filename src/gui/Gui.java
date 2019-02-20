package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import view.View;

/**
 * La classe prinipale qui lance l'application
 * @author anis
 *
 */
public class Gui extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Calculatrice");
		new View(primaryStage);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	

    public static void main(String[] args) {
        launch(args);
    }
    

}
