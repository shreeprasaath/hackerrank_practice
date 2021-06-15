import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();  
        
        
        if (i % 2 == 0){
            if (2 <= i && i <= 5){
                System.out.println("Not Weird");
            }
            else if (6 <= i && i <= 20){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
    }
}
