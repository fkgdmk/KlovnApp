package com.company.GUI;

import com.company.Logic.FindURL;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Fredrik on 18-04-2017.
 */
public class Vindue {


    public Vindue (String title, String brødTekst, String knapTekst) {

        //Opretter en ny stage (vindue)
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        window.setMinWidth(200);
        window.setMinHeight(140);


        //Opretter et nyt label med den text der skal stå i vinduet
        Label label = new Label();

        label.setStyle("-fx-text-fill: #ef4e49; -fx-font-size: 14; -fx-font-weight: bold;");

        label.setPadding(new Insets(10));

        label.setText(brødTekst);

        //Tilføjer en button
        Button seNuBtn = new Button();
        seNuBtn.setText(knapTekst);

        seNuBtn.setStyle("-fx-background-color: #ef4e49; -fx-text-fill: white; -fx-font-weight: bold; " +
                "-fx-background-radius: 6, 5; -fx-background-insets: 0, 1; -fx-effect: " +
                "dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );");
        seNuBtn.setPrefSize(50, 5);

        seNuBtn.setOnAction(e -> {

            FindURL findURL = new FindURL();

            findURL.sendToURl(brødTekst);

            window.close();

        });


        //Opretter en VBox og tilføjer dertil et label (teksten) og en button (luk knappen)
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, seNuBtn);
        layout.setAlignment(Pos.CENTER);

        //Opretter en scene til det sekundærer vindue, og tilføjer VBoxen layout
        Scene scene = new Scene(layout);

        //Tilføjer til sidst scenen til stagen (vinduet)
        window.setScene(scene);

        //Åbner vinduet og venter til at de bliver lukket
        window.showAndWait();


    }

}
