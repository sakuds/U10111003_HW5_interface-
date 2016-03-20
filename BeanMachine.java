
//U10111003 朱永捷

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

public class BeanMachine extends Application {
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();
		
		// Create the Bean Machine size
		Line l1 = new Line(140,40,140,60);
		l1.setStroke(Color.BLACK);
		pane.getChildren().add(l1);

		Line l2 = new Line(160,40,160,60);
		l2.setStroke(Color.BLACK);
		pane.getChildren().add(l2);

		Line l3 = new Line(140,60,50,240);
		l3.setStroke(Color.BLACK);
		pane.getChildren().add(l3);

		Line l4 = new Line(160,60,250,240);
		l4.setStroke(Color.BLACK);
		pane.getChildren().add(l4);

		Line l5 = new Line(50,280,250,280);
		l5.setStroke(Color.BLACK);
		pane.getChildren().add(l5);

		Line l6 = new Line(50,240,50,280);
		l6.setStroke(Color.BLACK);
		pane.getChildren().add(l6);

		Line l7 = new Line(75,240,75,280);
		l7.setStroke(Color.BLACK);
		pane.getChildren().add(l7);

		Line l8 = new Line(100,240,100,280);
		l8.setStroke(Color.BLACK);
		pane.getChildren().add(l8);

		Line l9 = new Line(125,240,125,280);
		l9.setStroke(Color.BLACK);
		pane.getChildren().add(l9);

		Line l10 = new Line(150,240,150,280);
		l10.setStroke(Color.BLACK);
		pane.getChildren().add(l10);

		Line l11 = new Line(175,240,175,280);
		l11.setStroke(Color.BLACK);
		pane.getChildren().add(l11);

		Line l12 = new Line(200,240,200,280);
		l12.setStroke(Color.BLACK);
		pane.getChildren().add(l12);

		Line l13 = new Line(225,240,225,280);
		l13.setStroke(Color.BLACK);
		pane.getChildren().add(l13);

		Line l14 = new Line(250,240,250,280);
		l14.setStroke(Color.BLACK);
		pane.getChildren().add(l14);


		// Create and set Beans in Machine
		Circle b1 = new Circle(75,240,5);
		b1.setFill(Color.BLUE);
		pane.getChildren().add(b1);

		Circle b2 = new Circle(100,240,5);
		b2.setFill(Color.BLUE);
		pane.getChildren().add(b2);

		Circle b3 = new Circle(125,240,5);
		b3.setFill(Color.BLUE);
		pane.getChildren().add(b3);

		Circle b4 = new Circle(150,240,5);
		b4.setFill(Color.BLUE);
		pane.getChildren().add(b4);

		Circle b5 = new Circle(175,240,5);
		b5.setFill(Color.BLUE);
		pane.getChildren().add(b5);

		Circle b6 = new Circle(200,240,5);
		b6.setFill(Color.BLUE);
		pane.getChildren().add(b6);

		Circle b7 = new Circle(225,240,5);
		b7.setFill(Color.BLUE);
		pane.getChildren().add(b7);

		Circle b8 = new Circle(87.5,215,5);
		b8.setFill(Color.BLUE);
		pane.getChildren().add(b8);

		Circle b9 = new Circle(112.5,215,5);
		b9.setFill(Color.BLUE);
		pane.getChildren().add(b9);

		Circle b10 = new Circle(137.5,215,5);
		b10.setFill(Color.BLUE);
		pane.getChildren().add(b10);

		Circle b11 = new Circle(162.5,215,5);
		b11.setFill(Color.BLUE);
		pane.getChildren().add(b11);

		Circle b12 = new Circle(187.5,215,5);
		b12.setFill(Color.BLUE);
		pane.getChildren().add(b12);

		Circle b13 = new Circle(212.5,215,5);
		b13.setFill(Color.BLUE);
		pane.getChildren().add(b13);

		Circle b14 = new Circle(100,190,5);
		b14.setFill(Color.BLUE);
		pane.getChildren().add(b14);

		Circle b15 = new Circle(125,190,5);
		b15.setFill(Color.BLUE);
		pane.getChildren().add(b15);

		Circle b16 = new Circle(150,190,5);
		b16.setFill(Color.BLUE);
		pane.getChildren().add(b16);

		Circle b17 = new Circle(175,190,5);
		b17.setFill(Color.BLUE);
		pane.getChildren().add(b17);

		Circle b18 = new Circle(200,190,5);
		b18.setFill(Color.BLUE);
		pane.getChildren().add(b18);

		Circle b19 = new Circle(112.5,165,5);
		b19.setFill(Color.BLUE);
		pane.getChildren().add(b19);

		Circle b20 = new Circle(137.5,165,5);
		b20.setFill(Color.BLUE);
		pane.getChildren().add(b20);

		Circle b21 = new Circle(162.5,165,5);
		b21.setFill(Color.BLUE);
		pane.getChildren().add(b21);

		Circle b22 = new Circle(187.5,165,5);
		b22.setFill(Color.BLUE);
		pane.getChildren().add(b22);

		Circle b23 = new Circle(125,140,5);
		b23.setFill(Color.BLUE);
		pane.getChildren().add(b23);

		Circle b24 = new Circle(150,140,5);
		b24.setFill(Color.BLUE);
		pane.getChildren().add(b24);

		Circle b25 = new Circle(175,140,5);
		b25.setFill(Color.BLUE);
		pane.getChildren().add(b25);

		Circle b26 = new Circle(137.5,115,5);
		b26.setFill(Color.BLUE);
		pane.getChildren().add(b26);

		Circle b27 = new Circle(162.5,115,5);
		b27.setFill(Color.BLUE);
		pane.getChildren().add(b27);

		Circle b28 = new Circle(150,90,5);
		b28.setFill(Color.BLUE);
		pane.getChildren().add(b28);


		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,300,300);
		// Set title
		primaryStage.setTitle("Bean Machine");
		// Place scene in the stage
		primaryStage.setScene(scene);
		// Display the stage
		primaryStage.show();
	}
}
