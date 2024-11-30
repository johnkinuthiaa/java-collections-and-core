import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String []args){
        List<Integer> nums =new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(10);
        nums.add(20);
        nums.add(29);
        System.out.println();Collections.binarySearch(nums,10);
    }
}