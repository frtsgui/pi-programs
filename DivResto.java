import java.util.*;
import java.lang.*;
import java.io.*;


public class DivResto{

     public static void main(String []args){
         
         Scanner reader = new Scanner(System.in);
         int w, x, y, z;
         
         w = reader.nextInt();
         x = reader.nextInt();
         y = w/x;
         z = w%x;
         
         System.out.println(y+ " " +z);
         
     }
}