
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package dodoy.dao;

import dodoy.arquivo.Arquivo;

import dodoy.interfaces.DaoInterface;

import dodoy.usuario.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jvnpitt
 */
public class DaoArquivo implements DaoInterface {
    private static DaoArquivo instance;
    private Arquivo arquivo;

    private DaoArquivo() {
        arquivo = new Arquivo();
    }

    public static DaoArquivo GETINSTANCE() {
        if (instance == null) {
            return instance = new DaoArquivo();
        }

        return instance;
    }

    @Override
    public Usuario Leitura() {
        try {
            return arquivo.Leitura();
        } catch (IOException ex) {
            Logger.getLogger(DaoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void Salvar(Usuario usuario) {
        try {
            arquivo.salvar(usuario);
        } catch (IOException ex) {
            Logger.getLogger(DaoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
