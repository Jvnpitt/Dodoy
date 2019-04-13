/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.validacao;

import dodoy.usuario.Usuario;

/**
 *
 * @author jvnpitt
 */
public class ValidaLogin {
    public static int validarLogin(Usuario user){
        String login = user.getLogin();
        int TAM = login.length();
        for(int i=0; i<TAM; i++){
            char letter = login.charAt(i);
            if(Character.isSpaceChar(letter)){
               return 1; 
            }
            if(Character.isDigit(letter)){
                return 2;
            }
        }
        String password = user.getPassword();
        TAM = password.length();
        for(int i=0; i<TAM; i++){
            char letter = password.charAt(i);
            if(Character.isSpaceChar(letter)){
                return 3;
            }
        }
        return 0;
    }
}
