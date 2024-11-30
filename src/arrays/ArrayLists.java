package arrays;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args){
        ArrayList<String> people =new ArrayList<>();
        people.add("john");
        people.add("peter");
        people.add("jes");
        people.add("pinkman");
        people.add("king");

        people.remove("king");
        people.addFirst("me of");
        for(String name:people){
            if(name.equals("john")){
                System.out.println("john is on the list");
            }
        }
    }
}
