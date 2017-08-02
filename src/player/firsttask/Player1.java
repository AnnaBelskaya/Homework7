package player.firsttask;

/*
Плеер 1.
Имеет final цену(задается в конструкторе) и геттер
        Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
        playSong Может проиграть песню.
*/

public class Player1 extends Player {

    public Player1(String song, double price) {
        super(song, new String[]{song}, price);
    }

}
