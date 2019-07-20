import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class towerOfHanoiSolution{
    
    public static LinkedList<Integer> removeThis(LinkedList<Integer> q1){
        
        if(q1.size() == 1){
            return q1;
        }
        
        q1.remove(q1.size()-1);
        return q1;
    }
    
    public static void towerOfHanoi(int n, LinkedList<Integer> source, LinkedList<Integer> target, LinkedList<Integer> spare){

        if (n==1){
            target.add(source.remove());
            return;
        }
        
        towerOfHanoi(n-1, removeThis(source), spare, target);
        target.add(source.remove());
        System.out.println(target);
        towerOfHanoi(n-1, removeThis(source), target, source);
        
    }

     public static void main(String []args){
        LinkedList<Integer> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();
        LinkedList<Integer> q3 = new LinkedList<>();
        
        q1.add(1);
        q1.add(2);
        System.out.println(q1);
        
        
        towerOfHanoi(q1.size(), q1, q2, q3);
        System.out.println(q2);
     }
}
