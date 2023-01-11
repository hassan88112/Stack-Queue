
package teststack;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class TestStack {

    
    public static void main(String[] args) {
      
        //stack
        
        Stack s=new Stack();
        System.out.println("Empty :" + s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Empty :" + s.isEmpty());
        System.out.println("TOP :" + s.peek());    //  peek = top
        s.pop();
        System.out.println("TOP :" + s.peek());
        
        
        // queue 
        Queue<Character> q=new PriorityQueue<>();
        System.out.println("Empty :" +q.isEmpty());
        q.add('e');
        q.add('c');
        q.add('v');
        q.add('z');
        System.out.println("Empty :" +q.isEmpty());
        System.out.println("Front :"+q.peek());
        q.poll();
        System.out.println("Front :"+q.peek());
        q.poll();
        
        
        
        
        
        
    
}
}