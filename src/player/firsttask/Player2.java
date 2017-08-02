package player.firsttask;

/*Плеер 2.
        Имеет final цену(задается в конструкторе) и геттер
        Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
        playSong Пытаясь проиграть песню выдает ошибку в консоль - “error”.*/

public class Player2 extends Player {

    public Player2(String song, double price) {
        super(song, new String[]{song}, price);
    }

    @Override
    public void playSong(){
        System.out.println("Error.");
    }

}
