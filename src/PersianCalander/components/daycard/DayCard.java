/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PersianCalander.components.daycard;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

/**
 *
 * @author Emad47
 */
public class DayCard extends VBox {

    Label lblfd;
    Label lblmd;
    Label lblgd;
    HBox hb;
//    AnchorPane ac;
    String hollylbl = "-fx-background-color: rgba(255,0,16,.1);";
    String hollytxt = "#ff1f1f";
    String fontName;
    Font f;
    public DayCard() {
        Parent root = null;

        try {
            root = FXMLLoader.load(DayCard.class.getResource("/PersianCalander/FXML/Days.fxml"));
            lblfd = (Label) root.lookup("#lblFD");
            lblgd = (Label) root.lookup("#lblGD");
            lblmd = (Label) root.lookup("#lblMD");
            hb = (HBox) root.lookup("#hbox");
            f = lblfd.getFont();
            fontName = lblfd.getFont().getFamily();
        } catch (IOException ex) {
            Logger.getLogger(DayCard.class.getName()).log(Level.SEVERE, null, ex);
        }

        getChildren().add(root);

    }

    public int getFacef() {
        return Integer.parseInt(lblfd.getText());
    }

    public int getFacem() {
        return Integer.parseInt(lblmd.getText());
    }

    public int getFaceg() {
        return Integer.parseInt(lblgd.getText());
    }

    public void setFacef(String fd) {

        lblfd.setText(fd);

    }

    public void setFacem(String md) {

        lblmd.setText(md + "");

    }

    public void setFaceg(String gd) {
        lblgd.setText(gd + "");
    }

    public void holly() {
        lblfd.setTextFill(Paint.valueOf(hollytxt));
        lblmd.setTextFill(Paint.valueOf(hollytxt));
        lblgd.setTextFill(Paint.valueOf(hollytxt));
//        lblfd.setStyle(hollylbl);
//        lblmd.setStyle(hollylbl);
//        lblgd.setStyle(hollylbl);

        hb.setStyle(hollylbl);
    }

    public void hilight() {

        hb.setStyle(hb.getStyle() + "-fx-border-color:blue;");
    }

    public void todayh() {

        lblfd.setTextFill(Paint.valueOf("#0066ff"));
        lblmd.setTextFill(Paint.valueOf("#0066ff"));
        lblgd.setTextFill(Paint.valueOf("#0066ff"));
    }

    public void reset() {
        hb.setStyle(hb.getStyle() + "-fx-border-color:none;");

    }

    public void updateFont(double font) {
//        System.out.println(lblfd.getFont());
//        lblfd.setFont(f);
        lblfd.setFont(Font.font(fontName, font));
//                lblfd.setFont(f);
    }

    public double getFont() {

        return lblfd.getFont().getSize();
    }

}
