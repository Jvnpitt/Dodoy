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
public class TelaLoginMain extends Application{
   private static Stage stage;
    
    public static Stage getStage(){
        return stage;
    }
    
    public static void setStage(Stage stage){
        TelaLoginMain.stage = stage;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/dodoy/view/TelaLogin.fxml"));//atores
        
        Scene scene = new Scene(root);//Cena
        
        stage.setTitle("");
        stage.setScene(scene);//Palco
        stage.show();
        
        setStage(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
    
