package dodoy.controller;

import dodoy.main.TelaMenuMain;
import dodoy.main.TelaLoginMain;
import dodoy.main.TelaRegisterMain;
import dodoy.usuario.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class TelaLoginController implements Initializable {

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsuario;

    @FXML
    private Button btEntrar;

    @FXML
    private Button btRegister;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btEntrar.setOnMouseClicked(event -> {
            logar();
        });

        btEntrar.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                logar();
            }
        });

        btRegister.setOnMouseClicked(event -> {
           voltar();
        });
        
        btRegister.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                voltar();
            }
        });

    }

    private void fechar() {
        TelaLoginMain.getStage().close();
    }
    
    private void voltar(){
        try {
                TelaRegisterMain telaregistro = new TelaRegisterMain();
                telaregistro.start(new Stage());
                fechar();
            } catch (Exception ex) {
                Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    private void logar() {
        String login = txtUsuario.getText();
        String password = txtPassword.getText();

        Usuario usuario = new Usuario(login, password);
        BancoController banco = new BancoController();
        banco.Salvar(usuario);

        try {
            TelaMenuMain telaMenu = new TelaMenuMain();
            telaMenu.start(new Stage());
            fechar();
        } catch (Exception ex) {
            Logger.getLogger(TelaLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
