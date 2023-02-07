package conversor;

public class Fahrenheit implements Conversor {
    String name = "Fahrenheit";

    @Override
    public int transform(int temp) {
        return 9*temp/5+32;
    }
    public String getName(){
        return name;
    }
}