
package www.educacion.com.superheros.collection;
import java.util.ArrayList;
import www.educacion.com.superheros.figure.Figure;

public class Collection {
    private String nameCollection;
    private ArrayList<Figure> listFigures;

    public Collection(String nameCollection) {
        this.nameCollection = nameCollection;
        this.listFigures= new ArrayList<>();
        
    }

    public String getNameCollection() {
        return nameCollection;
    }

    public void setNameCollection(String nameCollection) {
        this.nameCollection = nameCollection;
    }
    
    //Metodo para añadir la figura al array list
    public void addFigure(Figure figure){
        listFigures.add(figure);
    }
    
    //Metodo subir precio
    public void raicePrice(double qty, String id){
        for(Figure figure : listFigures){
            if(figure.getCode().equals(id)){
                figure.raicePrice(qty);
            }
        }
    }
    
}
