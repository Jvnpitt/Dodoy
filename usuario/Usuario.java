package dodoy.usuario;

import java.io.Serializable;

/**
 *
 * @author jvnpitt
 */
public class Usuario implements Serializable {
    private String Login;
    private String password;

    public Usuario(String Login, String password) {
        this.Login = Login;
        this.password = password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
