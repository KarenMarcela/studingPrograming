
package www.educacion.com.superheros.superhero;

public class Superhero {
    private String name;
    private String Description;
    private boolean layer; //capa

    public Superhero(String name) {
        this.name = name;
        this.Description="";
        this.layer=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean isLayer() {
        return layer;
    }

    public void setLayer(boolean layer) {
        this.layer = layer;
    }
    public String toStrig (){
        return ("Se llama "+this.name+" es : "+this.Description+" Lleva capa? "+this.layer);
    }
    
}
