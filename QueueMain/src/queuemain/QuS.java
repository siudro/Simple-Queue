
package queuemain;


import java.util.Stack;

public class QuS {

    Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();


     int deQueue() {

        if (st1.isEmpty()) {
            System.out.println("Queue is Empty. ");
            System.exit(0);
        }

         int x = st1.peek();
         
          return x;
    }

    void enQueue(int x) {

        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }


public static void main(String[] args) { 
QuS qu = new QuS();
qu.enQueue(1);
qu.enQueue(2);
qu.enQueue(3);
System.out.println(qu.deQueue());
System.out.println(qu.deQueue());
System.out.println(qu.deQueue());
}
} 
