package com.company.GUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class StartVindue extends Application {


    //Metode til at køre GUI
    public void run () {
        launch();
    }


    //Metode som opretter det første vindue
    @Override
    public void start(Stage primaryStage) throws Exception  {

        primaryStage.setTitle("Klappen");

        primaryStage.getIcons().add(new Image("/res/klovn.png"));

        //Opretter stackPane til primary stage
        StackPane layout = new StackPane();

        layout.setStyle("-fx-background-color: white;");

        //Tilføjer metoden root til stackpane
        layout.getChildren().add(root());

        //Opretter scene til primary stage og tilføjer stackPane (layout)
        Scene scene = new Scene(layout, 280, 360);

        //Tilføjer scenen til primaryStage
        primaryStage.setScene(scene);

        primaryStage.show();


    }


    //BorderPane til det første vindue
    public BorderPane root () {

        BorderPane root = new BorderPane();

        root.setTop(borderline());

        root.setCenter(new Knapper().getGrid());

        return root;

    }


    //BorderPane til toppen, så der både kan være en menuBar og et klovn logo
    public BorderPane borderline () {

        BorderPane root = new BorderPane();

        root.setTop(new MenuB().getMenuBar());

        root.setCenter(billede());

        return root;

    }

    //Klovn logo
    public StackPane billede () {

        StackPane stack = new StackPane();

        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/res/klovn.png"),
                260, 120, true, true));

        stack.getChildren().add(image);

        return stack;


    }



}
