/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.factory;

import dodoy.enuns.EnumThread;
import dodoy.thread.ThreadMusic;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author jvnpitt
 */
public class FactoryThread {
    
    public static Runnable GETINSTANCE(EnumThread thread) throws FileNotFoundException, JavaLayerException{ 
        switch(thread){
            case Music:
                return ThreadMusic.GETINSTANCE();
        }
        return null;
    }
}
