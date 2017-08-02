package player.firsttask;

/*Плеер 5.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет плейлист
        playSong Может проиграть первую песню
        playAllSongs может проиграть все песни с конца плейлиста в начало*/

public class Player5 extends ModernPlayer {

    public Player5(String[] playlist, double price) {
        super(playlist[0], playlist, price);
    }


    @Override
    public void playAllSongs() {
        for (int i = playlist.length-1; i >= 0; i--){
            song = playlist[i];
            super.playSong();
        }
    }
}