package conversor;

public class Reaumur implements Conversor {
    String name = "Reaumur";

    @Override
    public int transform(int temp) {
        return 4*temp/5;
    }
    public String getName(){
        return name;
    }
}