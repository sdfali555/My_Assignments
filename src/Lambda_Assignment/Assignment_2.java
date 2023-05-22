package Lambda_Assignment;
import java.util.ArrayList;

public class Assignment_2 {
    private int totalPrice;
    private String status;

    public static ArrayList<Assignment_2> listOfOrders(ArrayList<Assignment_2> orders) {
        ArrayList<Assignment_2> ansList = new ArrayList<>();
        orders.forEach(assignmentObj -> {
            if((assignmentObj.totalPrice > 10000) && (assignmentObj.status.equals("ACCEPTED")) || (assignmentObj.status.equals("COMPLETED"))){
                ansList.add(assignmentObj);
            }
        });
        return ansList;
    }
    public static void main(String[] args) {
        Assignment_2 obj1 = new Assignment_2();
        obj1.totalPrice = 20000;
        obj1.status = "ACCEPTED";

        Assignment_2 obj2 = new Assignment_2();
        obj2.totalPrice = 30000;
        obj2.status = "COMPLETED";

        Assignment_2 obj3 = new Assignment_2();
        obj3.totalPrice = 10000;
        obj3.status = "ACCEPTED";

        Assignment_2 obj4 = new Assignment_2();
        obj4.totalPrice = 2000;
        obj4.status = "NOT COMPLETED";

        Assignment_2 obj5 = new Assignment_2();
        obj5.totalPrice = 50000;
        obj5.status = "COMPLETED";

        ArrayList<Assignment_2> orders = new ArrayList<>();
        orders.add(obj1);
        orders.add(obj2);
        orders.add(obj3);
        orders.add(obj4);
        orders.add(obj5);

        ArrayList<Assignment_2> listObtained = listOfOrders(orders);
        listObtained.forEach(mainObj -> System.out.println("Total Price: " + mainObj.totalPrice + " Status: " + mainObj.status));
    }
}