
package www.educacion.com.banckmoney.people;


public class User {
    private String name;
    private double money;

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public User(String name) {
        this.name = name;
        this.money=0;
    }

    
    

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    
    public void consignMoney(double qty){
        if(qty < 0){
            System.out.println("No se puede consignar");
            return;
        }
        this.money += money;
        System.out.println("Consignación exitosa");
    }
    public void whithdrawMoney(double qty){
        if(qty > this.money){
            System.out.println("No se puede retirar, dinero insuficiente");
            return;
        }
        this.money -= qty;
        System.out.println("Retiro exitoso");
    }
}
