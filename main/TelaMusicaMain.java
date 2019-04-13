/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jvnpitt
 */
public class TelaMusicaMain {
     private static Stage stage;
    
    public static Stage getStage(){
        return stage;
    }
    
    public static void setStage(Stage stage){
        TelaMusicaMain.stage = stage;
    }
    
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/dodoy/view/TelaMusica.fxml"));//atores

        Scene scene = new Scene(root);//Cena

        stage.setTitle("");
        stage.setScene(scene);//Palco
        stage.show();

        setStage(stage);
    }
    
}
