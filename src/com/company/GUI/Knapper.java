package com.company.GUI;

import com.company.Logic.Sæsoner;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * Created by Fredrik on 18-04-2017.
 */
public class Knapper {

    GridPane grid = new GridPane();

    public Knapper () {

        Sæsoner sæsoner = new Sæsoner();

        grid.setHgap(20);
        grid.setVgap(15);
        grid.setPadding(new Insets(10, 10, 30, 10));
        grid.setAlignment(Pos.CENTER);


        //Sæson 1 button
        Button sæson1Btn = new Button();

        styleBtn(sæson1Btn, "Sæson 1");


        sæson1Btn.setOnAction(e -> {
            new Vindue("Sæson 1", sæsoner.randomnizer(sæsoner.sæson1), "Se nu");

        });

        grid.add(sæson1Btn, 0, 0);


        //Sæson 2 button
        Button sæson2Btn = new Button();

        styleBtn(sæson2Btn, "Sæson 2");

        sæson2Btn.setOnAction(e -> new Vindue("Sæson 2", sæsoner.randomnizer(sæsoner.sæson2), "Se nu"));

        grid.add(sæson2Btn, 1, 0);


        //Sæson 3 button
        Button sæson3Btn = new Button();

        styleBtn(sæson3Btn, "Sæson 3");

        sæson3Btn.setOnAction(e -> new Vindue("Sæson 3", sæsoner.randomnizer(sæsoner.sæson3), "Se nu"));

        grid.add(sæson3Btn, 0, 1);


        //Sæson 4 button
        Button sæson4Btn = new Button();

        styleBtn(sæson4Btn, "Sæson 4");

        sæson4Btn.setOnAction(e -> new Vindue("Sæson 4", sæsoner.randomnizer(sæsoner.sæson4), "Se nu"));

        grid.add(sæson4Btn, 1, 1);


        //Sæson 5 button
        Button sæson5Btn = new Button();

        styleBtn(sæson5Btn, "Sæson 5");

        sæson5Btn.setOnAction(e -> new Vindue("Sæson 5", sæsoner.randomnizer(sæsoner.sæson5), "Se nu"));

        grid.add(sæson5Btn, 0, 2);


        //Sæson 6 button
        Button sæson6Btn = new Button();

        styleBtn(sæson6Btn, "Sæson 6");

        sæson6Btn.setOnAction(e -> new Vindue("Sæson 6", sæsoner.randomnizer(sæsoner.sæson6), "Se nu"));

        grid.add(sæson6Btn, 1, 2);


        //Top 10 button
        Button top10Btn = new Button();

        styleBtn(top10Btn, "Top 10");

        top10Btn.setOnAction(e -> new Vindue("Top 10", sæsoner.randomnizer(sæsoner.top10), "Se nu"));

        grid.add(top10Btn, 0, 3);


        //Alle sæsoner buton
        Button alleSæsonerBtn = new Button();

        styleBtn(alleSæsonerBtn, "Alle Sæsoner");

        alleSæsonerBtn.setOnAction(event -> new Vindue("Alle Sæsoner", sæsoner.allSeasons(), "Se nu"));

        grid.add(alleSæsonerBtn, 1, 3);

    }


    public Button styleBtn (Button button, String txt) {

        button.setPrefSize(100, 20);

        button.setStyle("-fx-background-color: #ef4e49; -fx-text-fill: white; -fx-font-weight: bold; " +
                "-fx-background-radius: 6, 5; -fx-background-insets: 0, 1; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 );");

        button.setText(txt);

        return button;

    }


    public GridPane getGrid () {

        return grid;
    }

}
