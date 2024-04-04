
package www.educacion.com.characters.people;

import java.util.Random;


public class People {
    private String name;
    private int age;
    private String dni;
    private char sex;
    private static final char sex_flaw='F';
    private double weight;
    private double height;
    private static final double mal= -1;
    private static final double regular= 0;
    private static final double bien= 1;
    

    // Constructor sin parametros, dando valores por defecto
    public People() {
        this.name = " ";
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

    //Calulcar imc ( validación)
    public double calcularIMC(){
        double properWeight= (this.weight/(this.height*this.height));
        System.out.println("Bien= 1   Regular= 0  Mal= -1");
        if(properWeight < 20){
            return mal;
        }
        else if(properWeight >= 20 && properWeight <= 25){
            return regular;
        }
        else{
            return bien;
        }
    }
    
    //metodo para comprobar si es mayor de edad
    public boolean biggerMinor(){
        return age >= 18;
    }
    
    //comprobar el sexo(sino es correcto, por defecto será H)
    public char checkSex(char resultSex){
        if(sex == this.sex){
            resultSex= this.sex;
        }
        else{
            resultSex= 'H';
        }
        return resultSex;
    }
    
    //devolver toda la información del objeto
    public String toString(){
        return ("Nombre : "+name+" Edad: "+age+" DNI : "+dni+" Peso: "+weight+" Altura: "+height);
    }
    
    //generar un numero para el DNI aleatorio
    public void triggerDni(){
        Random random= new Random();
        StringBuilder dniBuilder = new StringBuilder();
        //Genera los primeros 8 digitos del dni
        for(int i=0;i<8 ;i++){
            dniBuilder.append(random.nextInt(10));
        }
        int dniNumber = Integer.parseInt(dniBuilder.toString());
        char dniLetter= calcularLetraDNI(dniNumber);//Calcula la letra correspondiente
        this.dni = dniNumber + String.valueOf(dniLetter);
    }
    //Metodo privado para calcular la letra del dni
    private char calcularLetraDNI(int dniNumber) {
        String letters= "TRWAGMYFPDXBNJZSQVHLCKE";
        int rest= dniNumber % 23;
        return letters.charAt(rest);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    
}
