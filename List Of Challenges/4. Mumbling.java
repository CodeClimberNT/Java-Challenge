//If you wanna download this file remember to rename the file as the class name

/*  Kata The Supermarket Queue 6 kyu
    
    Description:
    There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!

    input
    customers: an array of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
    n: a positive integer, the number of checkout tills.
    output
    The function should return an integer, the total time required.

    Important
    Please look at the examples and clarifications below, to ensure you understand the task correctly :)

    Examples
    queueTime([5,3,4], 1)
    // should return 12
    // because when there is 1 till, the total time is just the sum of the times

    queueTime([10,2,3,3], 2)
    // should return 10
    // because here n=2 and the 2nd, 3rd, and 4th people in the 
    // queue finish before the 1st person has finished.

    queueTime([2,3,10], 2)
    // should return 12
    Clarifications
    There is only ONE queue serving many tills, and
    The order of the queue NEVER changes, and
    The front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.
    N.B. You should assume that all the test input will be valid, as specified above.

    P.S. The situation in this kata can be likened to the more-computer-science-related 
    idea of a thread pool, with relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool */
import java.util.ArrayList;

public class Solution {

  public static int solveSuperMarketQueue(int[] customers, int n) {

    if (customers.length == 1) {
      return customers[0];
    }

    if (n == 1) {
      int time = 0;
      for (int i : customers)
        time += i;
      return time;
    }

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < customers.length; i++) {
      list.add(0, Integer.valueOf(customers[i]));
    }

    int timeTot = 0;
    int i = 0;
    while (list.size() != 0) {

      for (i = 0; i < n; i++) {

        if (list.get(i).equals(0))
          list.remove(i);

        list.set(i, Integer.valueOf(list.get(i) - Integer.valueOf(1)));

      }

      timeTot++;
    }
    return timeTot;
  }

  public static void main(String args[]){
    int customers[] = {10, 2, 3};
    int till = 2;
    System.out.println(solveSuperMarketQueue(customers, till));
  }

}