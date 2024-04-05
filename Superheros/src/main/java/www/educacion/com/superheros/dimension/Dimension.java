
package www.educacion.com.superheros.dimension;


public class Dimension {
    private double height;
    private double weight;
    private double depth;//profundidad
    private double maxVolumen;

    public Dimension() {
        this.height=0;
        this.weight=0;
        this.depth=0;
        this.maxVolumen=0;
        
    }

    public Dimension(double height, double weight, double depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }
    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    //Metodo para calcular el volumen maximo
    public double getVolumen(){
        return this.height*this.weight*this.depth;
    }
    public double getMaxVolumen(){
        return maxVolumen;
    }
    public void setMaxVolumen(double maxVolumen) {
        this.maxVolumen = maxVolumen;
    }
    
    public String toSring(){
        return "Dimensiones: "+
                "\n Altura: "+height+
                "\n Ancho: "+weight+
                "\n Profundidad: "+depth+
                "\n Máximo Volumen: "+maxVolumen;
    }
    
}
