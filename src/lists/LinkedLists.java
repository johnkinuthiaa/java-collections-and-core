package lists;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String [] args) {
//        can be used as a stack
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(45);
        nums.add(6);
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
//        linked list as QUEUE
        LinkedList<Integer> numsQueue = new LinkedList<>();
        numsQueue.offer(1);
        numsQueue.offer(2);
        numsQueue.offer(3);
        numsQueue.offer(4);
        System.out.println(numsQueue.poll());
        System.out.println(numsQueue.peek());
//        linked lists as a stack
        LinkedList<Integer> stackLinkedList = new LinkedList<>();
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.push(5);
        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.peek());

//    list as a priority queue
        LinkedList<Integer> priorityQue = new LinkedList<>();
        priorityQue.offer(2);
        priorityQue.offer(3);
        priorityQue.offer(4);
        priorityQue.poll();
        System.out.println("top of queue: "+priorityQue.peek());
    }
}
