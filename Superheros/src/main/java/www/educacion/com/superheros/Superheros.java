
package www.educacion.com.superheros;

import www.educacion.com.superheros.dimension.Dimension;
import www.educacion.com.superheros.figure.Figure;
import www.educacion.com.superheros.superhero.Superhero;


public class Superheros {

    public static void main(String[] args) {
        Superhero batman= new Superhero ("Barman");
        batman.setDescription("El señor de la noche");
        batman.setLayer(true);
        
        Dimension dimensionBatman= new Dimension(10,5,2);
        
        Figure figureBatman= new Figure("BCJ123",5000,batman,dimensionBatman); 
        
        batman.toStrig();
        
        //Subir precio de una figura
        
        
    }
}
