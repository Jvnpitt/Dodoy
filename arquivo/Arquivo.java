package dodoy.arquivo;

import dodoy.usuario.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author jvnpitt
 */
public class Arquivo {
   public void salvar (Usuario usuario) throws FileNotFoundException, IOException{
       String arq = "users";
       
       FileOutputStream fileOutput = new FileOutputStream(arq); //Cria o buffer
       ObjectOutputStream ObjectOutput = new ObjectOutputStream(fileOutput); //Serializa para por no buffer
       
       ObjectOutput.writeObject(usuario);//Transforma o usuario em object
       ObjectOutput.flush();
       ObjectOutput.close();
   }
   
   public Usuario Leitura () throws FileNotFoundException, IOException, ClassNotFoundException{
       String arq = "users";
       FileInputStream fileInputStream = new FileInputStream(arq);
       ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       Usuario user = (Usuario)objectInputStream.readObject();
       objectInputStream.close();
       return user;
   }
}
