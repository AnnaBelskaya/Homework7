package player.firsttask;

public class Main {

    public static void main(String[] args) {
        String song1 = "Show Must Go On";
        String song2 = "We are the Champions";

        String[] queenPlaylist = new String[]{"Bohemian Rhapsody",
                "Made in Heaven", "I want to Break Free", "Mother Love"};
        String[] bowiePlaylist = new String[]{"Space Oddity", "Let`s dance",
                "China girl", "Heroes", "Lazarus"};
        String[] beatlesPlaylist = new String[]{"Yellow Submarine",
                "Yesterday"};
        String[] elvisPlaylist = new String[]{"Hound Dog", "Blue Suede Shoes",
                "Can't Help Falling in Love", "Love Me Tender", "Jailhouse Rock"};

        Player1 p1 = new Player1(song1, 2);
        Player2 p2 = new Player2(song2, 9);
        Player3 p3 = new Player3(queenPlaylist, 5);
        Player4 p4 = new Player4(bowiePlaylist,10);
        Player5 p5 = new Player5(beatlesPlaylist,10);
        Player6 p6 = new Player6(elvisPlaylist,10);

        Player[] player = new Player[]{p1,p2};
        ModernPlayer[] modernPlayer = new ModernPlayer[]{p3,p4,p5,p6};

        System.out.println("OLD FASHIONED PLAYERS");

        for (int i = 0; i < player.length; i++){
            System.out.println("-------------------------------");
            System.out.println("Player №" + (i+1) + ": ");
            System.out.println("Price " + player[i]. getPRICE());
            player[i].playSong();
        }

        System.out.println("MODERN PLAYERS");

        for (int i = 0; i < modernPlayer.length; i++){
            System.out.println("-------------------------------");
            System.out.println("Player №" + (i+1) + ": ");
            System.out.println("Price: " + modernPlayer[i]. getPRICE());
            modernPlayer[i].playAllSongs();
        }
    }
}