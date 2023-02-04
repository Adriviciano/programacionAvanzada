package lista;

import vehiculos.Vehiculo;
import java.util.LinkedList;

public class ListaCoches implements Lista{
    LinkedList<Vehiculo> listaCoches = new LinkedList<>();
    public ListaCoches(LinkedList<Vehiculo> listaVehiculos){
        for(Vehiculo vehiculo : listaVehiculos){
            if ("Utilitario, Familiar, Deportivo".contains(vehiculo.getTipo())){
                listaCoches.add(vehiculo);
            }
        }
    }
    public void imprimirLista(){
        for(Vehiculo coche : listaCoches){
            System.out.println(coche.getTipo() + "-->" + coche.getMatricula());
        }
    }
}