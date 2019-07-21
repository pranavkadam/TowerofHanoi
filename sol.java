import java.util.*;

public class towerOfHanoiSolution{

    public static void towerOfHanoi(int n, char source, char spare, char target){

        if (n==1){
            System.out.println("Moved disk" +" " + n + " " + source + " " + "to" +" " + target);
        }
        else{
        towerOfHanoi(n-1, source, target, spare);
        System.out.println("Moved disk" +" " + n + " " + source + " " + "to" + " " + target);
        towerOfHanoi(n-1, spare, source, target);
        }
        
    }

     public static void main(String []args){
        
        towerOfHanoi(3, 'A', 'C','B');
       
     }
}







