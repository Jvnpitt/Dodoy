/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodoy.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author jvnpitt
 */
public class ThreadMusic extends Thread {

    private FileInputStream in;
    private Player audio;

    public ThreadMusic() throws FileNotFoundException, JavaLayerException {
        in = new FileInputStream("musica/musica.mp3");
        audio = new Player(in);
        start();
    }

    @Override
    public void run() {
        try {
            audio.play();
        } catch (JavaLayerException ex) {
            Logger.getLogger(ThreadMusic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
