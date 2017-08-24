package com.company.Logic;

import java.awt.*;

public class FindURL {

    public void goToURL (String url) {

        try {
            Desktop.getDesktop().browse(new java.net.URL(url).toURI());

        } catch (Exception e1) {}

    }

    public void sendToURl (String afsnit) {


        switch (afsnit) {

            //Sæson 1
            case "5 års-dagen":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/5-aarsdagen-17358/");
                break;
            case "De nye danskere":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/de-nye-danskere-17359/");
                break;
            case "Hushovmesteren":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/hushovmesteren-17364/");
                break;
            case "Dalai Lama":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/dalai-lama-17362/");
                break;
            case "Godfather of Drugs":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/godfather-of-drugs-17365/");
                break;
            case "Løft ikke hunden":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/loeft-ikke-hunden-17360/");
                break;
            case "Fars sidste ønske":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/fars-sidste-oenske-17361/");
                break;
            case "Str. 44":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/str-44-17363/");
                break;
            case "Årstiderne":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/aarstiderne-17367/");
                break;
            case "Farvel igen mor":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/farvel-igen-mor-17366/");
                break;

            //Sæson 2
            case "Casa Tua":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/casa-tua-17372/");
                break;
            case "Bye Bye Boldil":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/bye-bye-bodil-17377/");
                break;
            case "Don Ø æfferen":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/don-oe-affaeren-17369/");
                break;
            case "Thors øje":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/thors-oeje-52912/");
                break;
            case "It's a Jungle Down There":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/its-a-jungle-down-there-17368/");
                break;
            case "Ambassadøren":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/ambassadoeren-17374/");
                break;
            case "Carøes barnedåb":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/caroees-barnedaab-95902/");
                break;
            case "Irma-pigen":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/irma-pigen-17375/");
                break;
            case "Franks fede ferie":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/franks-fede-ferie-17376/");
                break;
            case "Kgl. Hofnar":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/kgl-hofnar-52913/");
                break;

            //Sæson 3
            case "Rosé-forbandelsen":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/ros-forbandelsen-17380/");
                break;
            case "London Kashmir":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/london-kashmir-17381/");
                break;
            case "Pepino & Pepito":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/pepino-og-pepito-17383/");
                break;
            case "Nina kære Nina":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/nina-kaere-nina-17378/");
                break;
            case "100 dage i Forum":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/100-dage-i-forum-17382/");
                break;
            case "Biggie Blackie":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/biggie-blackie-17379/");
                break;
            case "Længe leve demokratiet":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/laenge-leve-demokratiet-17385/");
                break;
            case "Bøssernes Kennedy":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/boessernes-kennedy-17387/");
                break;
            case "En revisor-smølfe-CD":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/en-revisor-smoelfe-cd-17386/");
                break;
            case "God jul, Frank":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/god-jul-frank-17384/");
                break;

            //Sæson 4
            case "Unge hjerter":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/unge-hjerter-17388/");
                break;
            case "Hjem til far":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/hjem-til-far-17394/");
                break;
            case "Sankt Hans":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/sankt-hans-17389/");
                break;
            case "Bornholm":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/bornholm-17390/");
                break;
            case "Aben Ditmark":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/aben-ditmark-17391/");
                break;
            case "Jarlens død":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/jarlens-doed-17400/");
                break;
            case "Piverts Polterarbend":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/piverts-polterabend-17393/");
                break;
            case "Hejsan Sverige":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/hejsan-sverige-17395/");
                break;
            case "Tango for tre":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/tango-for-tre-17402/");
                break;
            case "Ups!":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/ups-17401/");
                break;

            //Sæson 5
            case "Mamma Mia":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/mamma-mia-17397/");
                break;
            case "Mere ost Christian Braad Thomsen?":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/mere-ost-christian-braad-thomsen-17399/");
                break;
            case "White House Potential":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/white-house-potential-17404/");
                break;
            case "Tak for svaneæg":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/tak-for-svaneaeg-17403/");
                break;
            case "Den japanske have":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/den-japanske-have-17392/");
                break;
            case "Troldmanden fra Frederiksberg":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/troldmanden-fra-frederiksberg-17398/");
                break;
            case "Hør nu efter Frank!":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/hoer-nu-efter-frank-17396/");
                break;
            case "Tillykke Frank":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/tillykke-frank-17407/");
                break;
            case "Drys fra muffedissen":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/drys-fra-muffedissen-17406/");
                break;
            case "Suprise Mia":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/surprise-mia-17405/");
                break;

            //Sæson 6
            case "Guffeliguf":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/guffeliguf-17411/");
                break;
            case "Shut Up":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/shut-up-17408/");
                break;
            case "Sivsko og ægget":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/sivsko-og-aegget-17409/");
                break;
            case "Fru af og til":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/fru-af-og-til-17415/");
                break;
            case "Monsieur le boss":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/monsieur-le-boss-17410/");
                break;
            case "Bedragsholm slot":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/bedragsholm-slot-17417/");
                break;
            case "Bispebjerg Tricket":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/bispebjergtricket-26058/");
                break;
            case "Et krus for et knus":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/et-knus-for-et-krus-17414/");
                break;
            case "Dilettanterne":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/dilettanterne-17412/");
                break;
            case "Falsk Lorte Alarm":
                goToURL("http://play.tv2.dk/programmer/serier/komedie/klovn/falsk-lorte-alarm-17413/");
                break;
            default:


        }


    }


}
