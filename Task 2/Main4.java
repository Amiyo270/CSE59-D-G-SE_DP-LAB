class Sensor{
    String name;
    int batterylevel;

    void charge(){
        batterylevel = 100;
        System.out.println("Full charge!!");

    }
}




public class Main4 {
    public static void main(String[] args){
        Sensor s = new Sensor();
        s.name = "Temp sensor ";

        s.charge();
        System.out.println("Battery level :" + s.batterylevel);

    }
    
}

