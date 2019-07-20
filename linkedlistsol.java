import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class towerOfHanoiSolution{
    
    public static Stack<Integer> removeLast(Stack<Integer> q1){
        
        int size = q1.size()-1;
        
        Stack<Integer> q2 = new Stack<Integer>();
        
        int i = 0;
        
        while(i!=size){
            q2.push(q1.pop());
            i++;
        }
        return (q2.isEmpty())? q1 : q2;
    }
    
    public static void towerOfHanoi(int n, Stack<Integer> source, Stack<Integer> target, Stack<Integer> spare){

        if (n==1){
            target.push(source.pop());
            return;
        }
        
        towerOfHanoi(n-1, removeLast(source), spare, target);
        target.push(source.pop());
        System.out.println(target);
        towerOfHanoi(n-1, removeLast(spare), target, source);
        
    }

     public static void main(String []args){
        Stack<Integer> q1 = new Stack<Integer>();
        Stack<Integer> q2 = new Stack<Integer>();
        Stack<Integer> q3 = new Stack<Integer>();
        
        q1.add(1);
        q1.add(2);
        
        System.out.println(q1);
        
        
        towerOfHanoi(q1.size(), q1, q2, q3);
        System.out.println(q2);
     }
}
