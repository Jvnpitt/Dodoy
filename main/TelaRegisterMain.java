/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jvnpitt
 */
public class TelaRegisterMain extends Application{
    private static Stage stage;
    
    public static Stage getStage(){
        return stage;
    }
    
    public void setStage(Stage stage){
        TelaRegisterMain.stage = stage;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/dodoy/view/TelaRegistro.fxml"));//atores
        
        Scene scene = new Scene(root);//Cena
        
        stage.setTitle("Dodoy");
        stage.setScene(scene);//Palco
        stage.show();
        
        setStage(stage);
    }
}
