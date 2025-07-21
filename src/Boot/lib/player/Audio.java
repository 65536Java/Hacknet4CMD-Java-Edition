package Boot.lib.player;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Audio{
    Clip clp;
    public void init(String fname){
        try {
            if(clp != null){
                stop();
            }
            clp = AudioSystem.getClip();
            clp.open(AudioSystem.getAudioInputStream(new File(fname)));
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void play(){
        clp.start();
    }
    public void stop(){
        clp.stop();
    }
    public void lp(boolean bl){
        if(bl) clp.loop(-1);
    }
}
