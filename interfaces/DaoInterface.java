/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.interfaces;

import dodoy.usuario.Usuario;

/**
 *
 * @author jvnpitt
 */
public interface DaoInterface {
    public void Salvar(Usuario usuario);
    public Usuario Leitura();
}
