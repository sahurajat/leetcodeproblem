//wap implement of statck using two queue
import java .util.*;
public class seven 
{
    public static class queue
    {
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();

        //is empty
        public static boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty();
        }

        //add
        public static void push(int data)
        {
            if(! q1.isEmpty())
            {
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        //pop
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int top=-1;

            //case 1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top=q1.remove();
                    if(q1.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }
            }
            else
            {
                while(!q2.isEmpty())
                {
                    top=q2.remove();
                    if(q2.isEmpty())
                    {
                        break;
                    }
                    q1.add(top);
                }

            }
            return top;

        }

        //peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("queue is empty");
                return -1;
            }
            int top=-1;

            //case 1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top=q1.remove();
                    
                    q2.add(top);
                }
            }
            else
            {
                while(!q2.isEmpty())
                {
                    top=q2.remove();
                    
                    q1.add(top);
                }

            }
            return top;

          

        }
      

    }
    public static void main(String[] args) {
        Stack ss=new Stack<>();
        ss.push(12);
        ss.push(13);
        ss.push(14);
        while( !ss.isEmpty())
        {
            System.out.println(ss.peek());
            ss.pop();
        }
    }
    
}
