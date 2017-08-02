package player.firsttask;

/*Плеер 3.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет плейлист
        playSong Может проиграть первую песню
        playAllSongs может проиграть все песни*/

public class Player3 extends ModernPlayer{

    public Player3(String[] playlist, double price) {
        super(playlist[0], playlist, price);
    }

}
