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
public class TelaMenuMain extends Application {
    private static Stage stage;
    
    public static Stage getStage(){
        return stage;
    }
    
    public static void setStage(Stage stage){
        TelaMenuMain.stage = stage;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/dodoy/view/TelaInicial.fxml"));//atores

        Scene scene = new Scene(root);//Cena

        stage.setTitle("");
        stage.setScene(scene);//Palco
        stage.show();

        setStage(stage);
    }
    
}
