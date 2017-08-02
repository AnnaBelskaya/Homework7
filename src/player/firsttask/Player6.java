package player.firsttask;

/*Плеер 6.
        Имеет final цену(задается в конструкторе) и геттер ++
        Имеет плейлист ++
        playSong Может проиграть первую песню ++
        playAllSongs может проиграть все песни ++
        Имеет метод public void shuffle() - перемешивает все песни в плейлисте местами*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Player6 extends ModernPlayer{

    public Player6(String[] playlist, double price) {
        super(playlist[0], playlist, price);
    }

    public void shuffle(){
        List<String> list = Arrays.asList(playlist);
        Collections.shuffle(list);
        list.toArray(playlist);    }
}
