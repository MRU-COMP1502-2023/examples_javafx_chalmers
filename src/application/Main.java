package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Button button1;
	Button button2;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("my first GUI");
		
		
		Label label = new Label("click one of these buttons");
		this.button1 = new Button("click me!");
		this.button1.setOnAction(new Button1ClickHandler());
		
		this.button2 = new Button("no, click me!");
		this.button2.setOnAction(new Button2ClickHandler());
		
		VBox vbox = new VBox(label, button1, button2);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox, 200, 300);
		
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public class Button1ClickHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent arg0) {
			button1.setText("Hello World!");
		}
	}
	
	public class Button2ClickHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent arg0) {
			button2.setText("Goodbye World!");
		}
	}
}
