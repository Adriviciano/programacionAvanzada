package lista;

import vehiculos.Vehiculo;
import java.util.LinkedList;

public class ListaMotos implements Lista{
    LinkedList<Vehiculo> listaMotos = new LinkedList<>();
    public ListaMotos(LinkedList<Vehiculo> listaVehiculos){
        for(Vehiculo vehiculo : listaVehiculos){
            if ("MotoCarretera, Scooter".contains(vehiculo.getTipo())){
                listaMotos.add(vehiculo);
            }
        }
    }
    public void imprimirLista(){
        for(Vehiculo moto : listaMotos){
            System.out.println(moto.getTipo() + "-->" + moto.getMatricula());
        }
    }
}