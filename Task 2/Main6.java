
class Applet{
    void launch(){
        System.out.println("Applet lonched");

    }
}

class GameApplet extends Applet{
    void play(){
        System.out.println("playing game!");

    }
}


public class Main6 {
    public static void main(String[] args){
       GameApplet game = new GameApplet();

       game.launch();
       game.play();
    }
    
}
