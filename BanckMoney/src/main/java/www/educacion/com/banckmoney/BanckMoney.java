

package www.educacion.com.banckmoney;

import www.educacion.com.banckmoney.people.User;

public class BanckMoney {

    public static void main(String[] args) {
        
        User user1= new User("Anamaría");
        User user2= new User("Karen", 50000);
        
        user1.whithdrawMoney(20_000);
        user2.consignMoney(100_000);
        
        System.out.println("La cantidad total asignada es $"+user2.getMoney());
      
    }
}
