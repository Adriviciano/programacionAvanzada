package lista;

import vehiculos.Vehiculo;
import java.util.LinkedList;

public class ListaTodos implements Lista{
    LinkedList<Vehiculo> listaTodos;
    public ListaTodos(LinkedList<Vehiculo> listaVehiculos){
        listaTodos=listaVehiculos;
    }
    public void imprimirLista(){
        for(Vehiculo vehiculo : listaTodos){
            System.out.println(vehiculo.getTipo() + "-->" + vehiculo.getMatricula());
        }
    }
}