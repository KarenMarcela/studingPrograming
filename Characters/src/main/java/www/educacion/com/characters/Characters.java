
package www.educacion.com.characters;
import java.util.Scanner;
import www.educacion.com.characters.people.People;


public class Characters {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese su nombre : ");
        String name=scanner.next();
        
        System.out.print("Ingrese su edad : ");
        int age=scanner.nextInt();
        
        System.out.print("Ingrese su sexo (F o M): ");
        char sex=scanner.next().charAt(0);
        
        System.out.print("Ingrese su peso : ");
        double weight= scanner.nextDouble();
        
        System.out.print("Ingrese su altura(el decimal se indica con una coma) : ");
        double height=scanner.nextDouble();
        
        People person1= new People (name, age, sex,weight,height);
        People person2= new People (name, age, sex);
        People person3= new People ();
        
        
        
        System.out.println("************************************");
        System.out.println("Persona 1: ");
        showResults(person1);
                
        System.out.println("************************************");
        System.out.println("Persona 2: ");
        showResults(person2);
        System.out.println("************************************");
        System.out.println("Persona 3: ");
        showResults(person3);
        
        
        
    }
    public static void showResults(People people){
            System.out.print("Su IMC es: "+people.calcularIMC());
            System.out.print("¿Es mayor de edad? :"+people.biggerMinor());
            System.out.println("Info personal: "+people.toString());
        }
}

