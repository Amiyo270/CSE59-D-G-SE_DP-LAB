interface Clickble{
    void  onClick();
}
class Button implements Clickble{
    @Override
    public  void onClick() {
        System.out.println("Button was clicked!");

    }
}



public class Main7 {
    public static void main(String[] args){
        Button btn = new Button();

        btn.onClick();
    }
}

