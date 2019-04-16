package dodoy.controller;

import dodoy.dao.DaoArquivo;
import dodoy.interfaces.DaoInterface;
import dodoy.usuario.Usuario;
import dodoy.validacao.ValidaLogin;

/**
 *
 * @author jvnpitt
 */
public class UsuarioController {

    private DaoInterface dao = DaoArquivo.GETINSTANCE(); //Bridgie

    public void Salvar(Usuario usuario) {
        dao.Salvar(usuario);
    }

    public Usuario Leitura() {
        return dao.Leitura();
    }

    public int Verifica(Usuario user) {
        return ValidaLogin.validarLogin(user);
    }

}
