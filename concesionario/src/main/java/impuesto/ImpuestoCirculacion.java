package impuesto;

import vehiculos.Vehiculo;

public class ImpuestoCirculacion {
    int cilindrada;
    double tara;
    String combustible;
    public ImpuestoCirculacion(Vehiculo vehiculo){
        cilindrada = vehiculo.getCilindrada();
        combustible = vehiculo.getCombustible();
        tara = vehiculo.getTara();
    }

    public double calcularImpuesto(){
        return cilindrada*tara;
    }

}