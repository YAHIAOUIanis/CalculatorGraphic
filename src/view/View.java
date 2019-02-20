package view;

import controller.Controller;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *Cette classe gère l'affichage de l'interface
 *@author Anis
 */
public class View {

	private TextField display;
	private Scene scene;
	private Group root;
	private Button c,point;
	private Button zero, one, two, three, four, five, six, seven, eight, nine;
	private Button equal, addition, substraction, multiplication, division, modulo;
	Button btn;
	
	/**
	 * Constructeur pour créer l'interface
	 * @param primaryStage
	 */
	public View(Stage primaryStage) {

		this.zero = new Button("0");	
		this.zero.setFont(Font.font(40));
		this.zero.setTranslateX(5);
		this.zero.setTranslateY(525);
    	this.zero.setId("0");
    	this.zero.setPrefSize(110, 90);
    	this.zero.setOnAction(new Controller(this));

    	this.one = new Button("1");
    	this.one.setFont(Font.font(40));
    	this.one.setTranslateX(5);
    	this.one.setTranslateY(430);
    	this.one.setId("1");
    	this.one.setPrefSize(110, 90);
    	this.one.setOnAction(new Controller(this));
    	
    	this.two = new Button("2");
    	this.two.setFont(Font.font(40));
    	this.two.setId("2");
    	this.two.setPrefSize(110, 90);
    	this.two.setTranslateX(120);
    	this.two.setTranslateY(430);
    	this.two.setOnAction(new Controller(this));

    	this.three = new Button("3");
    	this.three.setFont(Font.font(40));
    	this.three.setId("3");
    	this.three.setPrefSize(110, 90);
    	this.three.setTranslateX(235);
    	this.three.setTranslateY(430);
    	this.three.setOnAction(new Controller(this));
    	
    	this.four = new Button("4");
    	this.four.setFont(Font.font(40));
    	this.four.setId("4");
    	this.four.setPrefSize(110, 90);
    	this.four.setTranslateX(5);
    	this.four.setTranslateY(335);
    	this.four.setOnAction(new Controller(this));
    	
    	this.five = new Button("5");
    	this.five.setFont(Font.font(40));
    	this.five.setId("5");
    	this.five.setPrefSize(110, 90);
    	this.five.setTranslateX(120);
    	this.five.setTranslateY(335);
    	this.five.setOnAction(new Controller(this));
    	
    	this.six = new Button("6");
    	this.six.setFont(Font.font(40));
    	this.six.setId("6");
    	this.six.setPrefSize(110, 90);
    	this.six.setTranslateX(235);
    	this.six.setTranslateY(335);
    	this.six.setOnAction(new Controller(this));

    	this.seven = new Button("7");
    	this.seven.setFont(Font.font(40));
    	this.seven.setId("7");
    	this.seven.setPrefSize(110, 90);
    	this.seven.setTranslateX(5);
    	this.seven.setTranslateY(240);
    	this.seven.setOnAction(new Controller(this));

    	this.eight = new Button("8");
    	this.eight.setFont(Font.font(40));
    	this.eight.setId("8");
    	this.eight.setPrefSize(110, 90);
    	this.eight.setTranslateX(120);
    	this.eight.setTranslateY(240);
    	this.eight.setOnAction(new Controller(this));

    	this.nine = new Button("9");
    	this.nine.setFont(Font.font(40));
    	this.nine.setId("9");
    	this.nine.setPrefSize(110, 90);
    	this.nine.setTranslateX(235);
    	this.nine.setTranslateY(240);
    	this.nine.setOnAction(new Controller(this));

    	this.equal = new Button("=");
    	this.equal.setFont(Font.font(40));
    	this.equal.setId("=");
    	this.equal.setPrefSize(225, 90);
    	this.equal.setTranslateX(235);
    	this.equal.setTranslateY(525);
    	this.equal.setOnAction(new Controller(this));

    	this.point = new Button(".");
    	this.point.setFont(Font.font(40));
    	this.point.setId(".");
    	this.point.setPrefSize(110, 90);
    	this.point.setTranslateX(120);
    	this.point.setTranslateY(525);
    	this.point.setOnAction(new Controller(this));

    	this.addition = new Button("+");
    	this.addition.setFont(Font.font(40));
    	this.addition.setId("+");
    	this.addition.setPrefSize(110, 90);
    	this.addition.setTranslateX(350);
    	this.addition.setTranslateY(430);
    	this.addition.setOnAction(new Controller(this));

    	this.substraction = new Button("-");
    	this.substraction.setFont(Font.font(40));
    	this.substraction.setId("-");
    	this.substraction.setPrefSize(110, 90);
    	this.substraction.setTranslateX(350);
    	this.substraction.setTranslateY(335);
    	this.substraction.setOnAction(new Controller(this));

    	this.multiplication = new Button("*");
    	this.multiplication.setFont(Font.font(40));
    	this.multiplication.setId("*");
    	this.multiplication.setPrefSize(110, 90);
    	this.multiplication.setTranslateX(350);
    	this.multiplication.setTranslateY(240);
    	this.multiplication.setOnAction(new Controller(this));

    	this.division = new Button("/");
    	this.division.setFont(Font.font(40));
    	this.division.setId("/");
    	this.division.setPrefSize(110, 90);
    	this.division.setTranslateX(350);
    	this.division.setTranslateY(145);
    	this.division.setOnAction(new Controller(this));

    	this.modulo = new Button("%");
    	this.modulo.setFont(Font.font(40));
    	this.modulo.setId("%");
    	this.modulo.setPrefSize(110, 90);
    	this.modulo.setTranslateX(235);
    	this.modulo.setTranslateY(145);
    	this.modulo.setOnAction(new Controller(this));
    	
    	this.c = new Button("C");
    	this.c.setFont(Font.font(40));
    	this.c.setId("c");
    	this.c.setPrefSize(225, 90);
    	this.c.setTranslateX(5);
    	this.c.setTranslateY(145);   
    	this.c.setOnAction(new Controller(this));
    	
		this.display = new TextField("");
		this.display.setPrefSize(450, 100);
    	this.display.setTranslateX(5);
    	this.display.setTranslateY(5);
    	this.display.setFont(Font.font(40));
    	this.display.setEditable(false);
    	
    	this.root = new Group();
    	this.root.getChildren().addAll(display, addition, point, equal, zero, one, two, three,substraction,
    			six, five, four, multiplication, eight, nine, seven, division, c, modulo);
    	
    	this.scene = new Scene(root, 455, 610);
        this.scene.setFill(Color.LIGHTBLUE);
        primaryStage.setScene(scene);
    }
	
	public void setDisplay(String result) {
		
		this.display.setText(result);
					
	}
	
	public TextField getDisplay() {
		
		return this.display;
		
	}
	
}