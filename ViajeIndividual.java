/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appviajes;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public class ViajeIndividual extends Viaje {

    ViajeIndividual(String origen, String destino, int costo, Date salida, Date llegada) {
        
        this.origen=origen;
        this.destino=destino;
        this.costo=costo;
        this.fechaSalida=salida;
        this.fechaLlegada=llegada;
            }

    
 // Constructor
 @Override
 public String descripcion() {
 return "Disfruta tu viaje individual";
 }
 //No se sobreescribe cualquierMetodo2()
}
