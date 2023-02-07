package tabla;

import conversor.Conversor;

import java.util.ArrayList;
import java.util.List;


public class Tabla {
    private final List<Conversor> conversorList = new ArrayList<>();

    public void addConversor(Conversor nuevo){
        conversorList.add(nuevo);
    }

    public void addHeader(){
        System.out.print("  Celsius  ");
        for(Conversor conversor : conversorList){
            System.out.format(" %s  ", conversor.getName());
        }
        System.out.format("%n");
    }

    public void addTabla(int start, int end, int jump){
        for(int i=start; i<=end; i+=jump){
            System.out.format("    %3d   ", i);
            for (Conversor conversor : conversorList){
                System.out.format("     %3d     ", conversor.transform(i));
            }
            System.out.format("%n");
        }
    }
}