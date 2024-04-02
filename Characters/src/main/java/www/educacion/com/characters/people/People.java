
package www.educacion.com.characters.people;


public class People {
    private String name;
    private int age;
    private int dni;
    private char sex;
    private static final char sex_flaw='F';
    private double weight;
    private double height;
    private static final double mal= -1;
    private static final double regular= 0;
    private static final double bien= 1;
    

    // Constructor sin parametros, dando valores por defecto
    public People() {
        this.name = "";
        this.age = 0;
        this.sex = sex_flaw;
        this.weight = 0;
        this.height = 0;
    }
    // Constructor con los parametros de (nombre,edad,sexo) y los demas son los valores por defecto
    public People(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = 0;
        this.height = 0;
    }
    // Constructor con todos los parametros
    public People(String name, int age,  char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }
    public void calcularIMC(){
        
        
        double properWeight= (this.weight/(this.height*this.height));
        System.out.println("Bien = 1__ Estas por debajo del peso ideal = 0__ Mal = -1");
        if(properWeight < 20){
            System.out.println(mal);
        }
        else if(properWeight >= 20 && properWeight <= 25){
            System.out.println(regular);
        }
        else{
            System.out.println(bien);
        }
    }
    
    
    
}
