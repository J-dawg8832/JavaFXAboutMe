package u3a1_aboutmebyjavafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;


public class U3A1_AboutMeByJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        //Create a quadrant with my name in it
        Rectangle r1 = new Rectangle();
        r1.setFill(Color.LIGHTBLUE);
        r1.setHeight(250);
        r1.setWidth(250);
        r1.setX(0);
        r1.setY(0);
        pane.getChildren().add(r1);
        //Create my name and set its properties
        Text myName = new Text("Jason Music");
        myName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        myName.setX(78);
        myName.setY(125);
        pane.getChildren().add(myName);
        
        //Create a second quadrant to hold an image
        Image image = new Image("IMG_0026.jpg");
        ImageView imageview1 = new ImageView(image);
        imageview1.setFitHeight(250);
        imageview1.setFitWidth(250);
        imageview1.setX(250);
        imageview1.setY(0);
        pane.getChildren().add(imageview1);
        
        //Create a third quadrant to hold an image of my favorite sport
        Image image2 = new Image("georgia-bulldogs.jpg");
        ImageView imageview2 = new ImageView(image2);
        imageview2.setFitHeight(250);
        imageview2.setFitWidth(250);
        imageview2.setX(0);
        imageview2.setY(250);
        pane.getChildren().add(imageview2);
        
        //Create fourth quadrant to hold my favorite food
        Rectangle r2 = new Rectangle();
        r2.setFill(Color.RED);
        r2.setHeight(250);
        r2.setWidth(250);
        r2.setX(250);
        r2.setY(250);
        pane.getChildren().add(r2);
        //Create a label with my favorite food
        Text favFood = new Text("Cajun Pasta");
        favFood.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        favFood.setX(320);
        favFood.setY(380);
        pane.getChildren().add(favFood);
        
        //Create a scene and place the components in it.
        Scene scene = new Scene(pane);
        primaryStage.setTitle("U3A1_AboutMeByJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
