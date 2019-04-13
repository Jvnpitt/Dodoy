/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.controller;

import dodoy.main.TelaMenuMain;
import dodoy.main.TelaMusicaMain;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author jvnpitt
 */
public class TelaInicialController implements Initializable {
    
   
    @FXML
    private Button btMusic;  

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btMusic.setOnMouseClicked(event->{
            TelaMusicaMain tela = new TelaMusicaMain();
            try {
                tela.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaInicialController.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechar();
        });
    }
    
    private void fechar(){
        TelaMenuMain.getStage().close();
    }
    
}
