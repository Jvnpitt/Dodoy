/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.controller;

import dodoy.enuns.EnumThread;
import dodoy.factory.FactoryThread;
import dodoy.main.TelaMenuMain;
import dodoy.main.TelaMusicaMain;
import dodoy.thread.ThreadMusic;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * FXML Controller class
 *
 * @author jvnpitt
 */
public class TelaMusicaController implements Initializable {

    @FXML
    private Button btPlay;

    @FXML
    private Button btStop;

    @FXML
    private Button btBack;

    private Thread thread;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btPlay.setOnMouseClicked(event -> {
            try {
                thread = FactoryThread.GETINSTANCE(EnumThread.Music);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TelaMusicaController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaMusicaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        btStop.setOnMouseClicked(event -> {
            this.thread.stop();
        });

        btBack.setOnMouseClicked(event -> {
            TelaMenuMain tela = new TelaMenuMain();
            try {
                tela.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMusicaController.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechar();
        });
    }

    private void fechar() {
        TelaMusicaMain.getStage().close();
    }
}
