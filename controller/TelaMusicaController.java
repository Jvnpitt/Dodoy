package dodoy.controller;

import dodoy.enuns.EnumThread;
import dodoy.factory.FactoryThread;
import dodoy.main.TelaMenuMain;
import dodoy.main.TelaMusicaMain;
import dodoy.thread.ThreadMusic;
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

public class TelaMusicaController implements Initializable {

    @FXML
    private Button btPlay;

    @FXML
    private Button btStop;

    @FXML
    private Button btBack;

    private Runnable thread;
    
    private Thread t1 ;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            thread = (ThreadMusic) FactoryThread.GETINSTANCE(EnumThread.Music);
            t1 = new Thread(thread);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaMusicaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JavaLayerException ex) {
            Logger.getLogger(TelaMusicaController.class.getName()).log(Level.SEVERE, null, ex);
        }

        btPlay.setOnMouseClicked(event -> {
            t1.start();
        });
        
        btStop.setOnMouseClicked(event ->{
            try {
                t1.wait(40000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TelaMusicaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void fechar() {
        TelaMusicaMain.getStage().close();
    }
}
