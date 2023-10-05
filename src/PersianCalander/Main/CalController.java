/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersianCalander.Main;

//import static PersianCalander.components.Calendar.MainCal.map;
import PersianCalander.components.Calendar.Calendar;
import static PersianCalander.components.Calendar.Calendar.*;
import static ir.ui.ac.cg.zaeri.persiancalendar.DateConvert.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Emad47
 */
public class CalController implements Initializable {

    @FXML
    private Label lblfy;
    @FXML
    private Label lblfm;
    @FXML
    private Label lblgy;
    @FXML
    private Label lblgm;
    @FXML
    private Label lblmm;
    @FXML
    private Label lblmy;
    @FXML
    private VBox mainvb;
    @FXML
    private Label lbltdf;
    @FXML
    private Label lbltdm;
    @FXML
    private Label lbltdg;

    private HijrahDate hdf;
    private HijrahDate hdl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String image;
        lblfm.setText(hmonth2str(getmonth(today())));
        lblfy.setText(getyear(today()) + "");
        lblmy.setText(getyear(todaym()) + "");
        lblmm.setText(map.get(getmonth(today()) + ""));
        fdaym = h2m(1, fmindex, fyindex);
        ldaym = h2m(maxDayOfMonth(fmindex, fyindex), fmindex, fyindex);
        hdl = HijrahChronology.INSTANCE.date(LocalDate.of(myindex, mmindex2, ldaym[0]));
        hdf = HijrahChronology.INSTANCE.date(LocalDate.of(myindex, mmindex, fdaym[0]));
        lblgm.setText(gmonth2str(hdf.get(java.time.temporal.ChronoField.MONTH_OF_YEAR)) + " - "
                + gmonth2str((hdl.get(java.time.temporal.ChronoField.MONTH_OF_YEAR))));
        lblgy.setText(hdl.get(java.time.temporal.ChronoField.YEAR) + "");

         hdf = HijrahChronology.INSTANCE.date(LocalDate.of(getyear(todaym()), getmonth(todaym()), getday(todaym())));
        lbltdf.setText(todayFull());
        lbltdm.setText(todayFullm());
        lbltdg.setText(dayFullg(gyindex + "/" + gmindex + "/" + hdf.get(java.time.temporal.ChronoField.DAY_OF_MONTH)));

        if (fmindex == 1 || fmindex == 2 || fmindex == 3) {
            image = Calendar.class.getResource("/PersianCalander/IMAGE/springf.jpg").toExternalForm();
            mainvb.setStyle("-fx-background-image: url('" + image + "'); "
                    + "-fx-background-position: center center; "
                    + "-fx-background-repeat: stretch;");
        }

        if (fmindex == 4 || fmindex == 5 || fmindex == 6) {

            image = Calendar.class.getResource("/PersianCalander/IMAGE/f.jpg").toExternalForm();
            mainvb.setStyle("-fx-background-image: url('" + image + "'); "
                    + "-fx-background-position: center center; "
                    + "-fx-background-repeat: stretch;");
        }

        if (fmindex == 7 || fmindex == 8 || fmindex == 9) {
            image = Calendar.class.getResource("/PersianCalander/IMAGE/fallf.jpg").toExternalForm();
            mainvb.setStyle("-fx-background-image: url('" + image + "'); "
                    + "-fx-background-position:  center  center; "
                    + "-fx-background-repeat: stretch;");
        }

        if (fmindex == 10 || fmindex == 11 || fmindex == 12) {
            image = Calendar.class.getResource("/PersianCalander/IMAGE/winterf.jpg").toExternalForm();
            mainvb.setStyle("-fx-background-image: url('" + image + "'); "
                    + "-fx-background-position: center center; "
                    + "-fx-background-repeat: stretch;");
        }

    }

}
