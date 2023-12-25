import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       
    
        
       //Create array of person(Owner&Customers)
        Person[] person = new Person[3];
        
        //Hard code for Owner person
        
        //First Person
        person[0] = new Owner("MOHAMED","1234","Macdonald's");
        Talabat.owners.add((Owner) person[0]);
        ((Owner)person[0]).restaurant.setID(0);
        ((Owner) person[0]).restaurant.addmeal("Big mac", "Chicken and sauce", 75F,1);
        ((Owner) person[0]).restaurant.addmeal("Big Tasty", "Chicken and sauce", 90F,2);
        ((Owner) person[0]).restaurant.addmeal("Big zak", "Chicken and sauce", 150F,3);
        ((Owner) person[0]).restaurant.setDescription("Fried chicken");
        
        
        //Second Person
        person[1]=new Owner("FARES","1234","Arabiata");
        Talabat.owners.add((Owner) person[1]);
        ((Owner)person[1]).restaurant.setID(1);
        ((Owner) person[1]).restaurant.addmeal("  Fol", "Fol", 5F,13);
        ((Owner) person[1]).restaurant.addmeal("  Flafl", "Fol", 5F,13);
        ((Owner) person[1]).restaurant.addmeal("  Btats", "Fol", 7F,13);
        ((Owner) person[1]).restaurant.addmeal("Baba 8no", "Fol", 5F,13);
        ((Owner) person[1]).restaurant.setDescription("Fol we Flafl");
        
        //Third person (Customer)
        person[2] = new Customer("GALAL","1234","0123456789","Cairo-egypt");
        Talabat.customers.add((Customer) person[2]);
        
        
        
        customerOrOwner c = new customerOrOwner();
       
        Meal m1 = new Meal("big mac", "aa", 111);
        Meal m2 = new Meal("big tasty", "bb", 1);
        Customer cc = new Customer("MOHAMED","1234");
        
        cc.createOrder(1);
        cc.talab(m1, 2);
        
        cc.submitOrder();
        cc.createOrder(1);
        cc.talab(m2, 3);
        
        cc.submitOrder();
     
      for(int i=0;i<Talabat.owners.size();i++){
            for(int j=0;j<Talabat.owners.get(i).restaurant.orders.size();j++){
                System.out.println(Talabat.owners.get(i).restaurant.orders.get(j).getTotalPrice(Talabat.owners.get(i).restaurant.orders.get(j)));
            }
      }
        System.out.println("orders of: "+cc.getUsername());
        for(int i=0;i<cc.latestOrders.size();i++){
            System.out.println("Meal Id: " + cc.latestOrders.get(i).getId());
            System.out.println("Meal name: "+cc.latestOrders.get(i).meals.get(0).getName());
            System.out.println("Meal quantity: "+cc.latestOrders.get(i).meals.get(0).getQuantity());
            System.out.println("Meal Price: "+cc.latestOrders.get(i).meals.get(0).getPrice());
            System.out.println("Total Price of order: "+cc.latestOrders.get(i).getTotalPrice(cc.latestOrders.get(i)));
        }
        
        
        
        
  
 }
}
