package com.company.GUI;

import javafx.application.Platform;
import javafx.scene.control.*;

/**
 * Created by Fredrik on 18-04-2017.
 */
public class MenuB {

    MenuBar bar = new MenuBar();
    String style = "";

    public void setStyle(String style) {
        this.style = style;
    }

    public MenuB() {

        bar.setStyle("-fx-background-color: #ef4e49; -fx-text-fill: white;");

        //Opretter en overkategori (help) til menuBar

        Menu help = new Menu("Hjælp");

        help.setStyle("-fx-text-fill: white;");

        //Opretter to underkategorier (top 10, about) til overkategorien (help).
        MenuItem top10itm = new MenuItem("Top 10");

        top10itm.setOnAction(e -> new Vindue("Top 10", "Top 10: Bedragsholm slot, White House Potential\nDe nye danskere," +
                " Bornholm, Hejsan Sverige\nHushovermesteren, Godfather of Drugs, Falsk lorte alarm\n" +
                "Piverts polterarbend, Franks fede ferie", "Luk"));

        top10itm.setStyle("-fx-text-fill: black");


        MenuItem aboutItm = new MenuItem("Om");

        aboutItm.setOnAction(e -> new Vindue("Om", "Created by Fredrik Mikkelsen © 2017", "Luk"));


        //Opretter sepererings linje
        SeparatorMenuItem sep = new SeparatorMenuItem();
        MenuItem exitItm = new MenuItem("Luk");

        exitItm.setOnAction(e -> Platform.exit());


        //Tilføjer de to underkategorier til overkategorien
        help.getItems().addAll(top10itm, aboutItm, sep, exitItm);

        //Tilføjer overkategorien til menuBar
        bar.getMenus().add(help);

    }

    public MenuBar getMenuBar() {
        return bar;
    }
}
