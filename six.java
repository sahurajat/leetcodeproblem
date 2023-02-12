//implement of queue using two statck heaving add time complexity is O(1)
import java.util.*;
public class six
{
    public static class Queue
    {
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        //is empty
        public static boolean isEmpty()
        {
            return s2.isEmpty()&& s1.isEmpty();
        }

        //add ->TC -O(1)
        public static void add(int data)
        {
            s1.add(data);
        }

        //remove   TC-O(n)
        public static int remove()
        {
           peek();
           return s2.pop();
        }

        //peek   TC-O(n)
        public static int peek()
        {
           while( ! s1.isEmpty())
           {
              s2.push(s1.pop());
           }
           return s2.peek();
           
        }
    }
    public static void main(String[] args) 
    {
        Queue q=new Queue();
        q.add(6);
        q.add(7);
       
        q.add(10);
        
        while(! q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
