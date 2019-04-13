package dodoy.controller;

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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jvnpitt
 */
public class TelaRegistroController implements Initializable {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField tstPassword;

    @FXML
    private Button BtRegistrar;

    @FXML
    private Button BtVoltar;
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        BtRegistrar.setOnMouseClicked(event -> {
            registrar();
        });

        BtRegistrar.setOnKeyPressed((KeyEvent e) -> {
            if (e.getCode() == KeyCode.ENTER) {
                registrar();
            }
        });

        BtVoltar.setOnMouseClicked(event -> {
            voltar();
        });
        
        BtVoltar.setOnKeyPressed((KeyEvent e)->{
            if(e.getCode() == KeyCode.ENTER){
                voltar();
            }
        });
    }

    private void exibe(int i, BancoController banco, Usuario user) {
        switch (i) {
            case 0:
                label.setText(" Cadastrado com sucesso");
                banco.Salvar(user);
                break;
            case 1:
                label.setText("Login não pode conter espaço");
                break;
            case 2:
                label.setText("Login não pode ter Dígito");
                break;
            case 3:
                label.setText("Senha não pode conter espaço");

        }
    }

    private void fechar() {
        TelaRegisterMain.getStage().close();
    }

    private void voltar() {
        TelaLoginMain tela = new TelaLoginMain();
        try {
            tela.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(TelaRegistroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        fechar();
    }

    private void registrar() {
        String login = txtLogin.getText();
        String password = tstPassword.getText();
        Usuario user = new Usuario(login, password);

        BancoController banco = new BancoController();

        int codigo = banco.Verifica(user);
        exibe(codigo, banco, user);
    }

}
