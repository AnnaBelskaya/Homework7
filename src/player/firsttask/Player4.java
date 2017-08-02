package player.firsttask;

/*Плеер 4.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет плейлист
        playSong Может проиграть последнюю песню
        playAllSongs может проиграть все песни*/

public class Player4 extends ModernPlayer {

    public Player4(String[] playlist, double price) {
        super(playlist[playlist.length-1], playlist, price);
    }
}
