package arrays;

public class Arrays {
    public static void main(String [] args) {
//        arrays to hold integers
        int[] nums = {1, 2, 3, 4, 5, 6};
//        length
        System.out.println(nums.length);

        var sum = java.util.Arrays.stream(nums).sum();
        System.out.println(sum);
//        or
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println(total);
        System.out.println(java.util.Arrays.stream(nums).max());
        int max = 0;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        System.out.println("max value "+max);
//        add arrays
        int[] anotherArray ={2,3,4,5,6,7};
        int[] newArray =new int[6];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < anotherArray.length; j++) {
                newArray[i]= nums[i]+anotherArray[j];
            }
        }
        for(int num:newArray){
            System.out.println(num);
        }
//        index
        int[] jh ={2,34,4,6,7,8};
        System.out.println(jh[2]);

//        string arrays
        String[] chars ={"john","link","kj"};
//        loop
        for(String name:chars){
            System.out.println(name);
        }



    }
}
