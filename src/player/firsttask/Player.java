package player.firsttask;

public abstract class Player {
    protected final double PRICE;
    public String song;
    public String[] playlist;

    public Player(String song, String[] playlist, double price) {
        this.song = song;
        this.playlist = playlist;
        this.PRICE = price;
    }

    public void playSong(){
        System.out.print("Playing: " + song + "\n");
    }

    public double getPRICE(){
        return PRICE;
    }
}
