package www.educacion.com.superheros.figure;

import www.educacion.com.superheros.dimension.Dimension;
import www.educacion.com.superheros.superhero.Superhero;


public class Figure {

    public static boolean getCode;
    private String code;
    private double price;
    private Superhero superhero;
    private Dimension dimensions;

    public Figure(String code, double price, Superhero superhero, Dimension dimensions) {
        this.code = code;
        this.price = price;
        this.superhero = superhero;
        this.dimensions = dimensions;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Superhero getSuperhero() {
        return superhero;
    }

    public void setSuperhero(Superhero superhero) {
        this.superhero = superhero;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }
    
    public String toString(){
        return "Figura:"+
                "\n Código: "+code+
                "\n Precio: "+price+
                "\n Superheroe: "+superhero+
                "\n Dimenciones: "+dimensions;
    }
    
    //Metodo para subir el precio
    public double raicePrice(double qtyMoney){
        return price += qtyMoney;
    }
    
    
}
