package player.firsttask;

public abstract class ModernPlayer extends Player {

    public ModernPlayer(String song, String[] playlist, double price) {
        super(song, playlist, price);
    }

    public void playAllSongs(){
        for (int i = 0; i < playlist.length; i++){
            song = playlist[i];
            super.playSong();
        }
    }

}
