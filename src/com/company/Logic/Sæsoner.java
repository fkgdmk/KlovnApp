package com.company.Logic;

import java.util.Random;

public class Sæsoner {


    Random random = new Random();

    //Arrays til de forskellige sæsoner og top 10
    public String [] sæson1 = {"5 års-dagen", "De nye danskere", "Hushovmesteren", "Dalai Lama", "Godfather of Drugs",
            "Løft ikke hunden", "Fars sidste ønske", "Str. 44", "Årstiderne", "Farvel igen mor"};


    public String [] sæson2 = {"Casa Tua", "Bye Bye Boldil", "Don Ø æfferen", "Thors øje", "Kgl. Hofnar",
            "It's a Jungle Down There", "Ambassadøren", "Carøes barnedåb", "Irma-pigen", "Franks fede ferie"};


    public String [] sæson3 = {"Rosé-forbandelsen", "London Kashmir", "Pepino & Pepito", "Nina kære Nina", "100 dage i Forum",
            "Biggie Blackie", "Længe leve demokratiet", "Bøssernes Kennedy", "En revisor-smølfe-CD", "God jul, Frank"};


    public String [] sæson4 = {"Unge hjerter", "Hjem til far", "Sankt Hans", "Bornholm", "Aben Ditmark", "Jarlens død",
            "Piverts Polterarbend", "Hejsan Sverige", "Tango for tre", "Ups!"};


    public String [] sæson5 = {"Mamma Mia", "Mere ost Christian Braad Thomsen?", "White House Potential", "Tak for svaneæg",
            "Den japanske have", "Troldmanden fra Frederiksberg", "Hør nu efter Frank!", "Tillykke Frank",
            "Drys fra muffedissen", "Suprise Mia"};


    public String [] sæson6 = {"Guffeliguf", "Shut Up", "Sivsko og ægget", "Fru af og til", "Monsieur le boss",
            "Bedragsholm slot", "Bispebjerg Tricket", "Et krus for et knus", "Dilettanterne", "Falsk Lorte Alarm"};


    public String [] top10 = {"Bedragsholm slot", "White House Potential", "De nye danskere",
            "Bornholm", "Hejsan Sverige", "Hushovmesteren", "Godfather of Drugs",
            "Falsk lorte alarm", "Piverts Polterarbend", "Franks fede ferie"};




    //Metode der vælger et tilfædigt index (afsnit) i et array
    public String randomnizer (String [] sæson) {

        int randomNumb = random.nextInt(sæson.length);

        String afsnit = sæson[randomNumb];

        return afsnit;

    }




    //Metode til at finde et tilfædigt array og til derefer at finde et tilfældigt afsnit i det fundne array
    public String allSeasons () {

        int randomNumb = random.nextInt(6)+1;

        String afsnit = "";

        switch (randomNumb) {

            case 1:
                afsnit = randomnizer(sæson1);
                break;
            case 2:
                afsnit = randomnizer(sæson2);
                break;
            case 3:
                afsnit = randomnizer(sæson3);
                break;
            case 4:
                afsnit = randomnizer(sæson4);
                break;
            case 5:
                afsnit = randomnizer(sæson5);
                break;
            case 6:
                afsnit = randomnizer(sæson6);
                break;
                default:

        }

        return afsnit;

    }




}
