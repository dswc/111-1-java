import java.util.Scanner;

/*
0
 1
  2
   3
    4
     5
      6
       7
        8
         9
*/

public class Test7 {
    public static void main(String[] args) {
        int grade = 0;
        String space = "";
        
        while (grade < 10) {
            System.out.printf("%s", space);
            System.out.printf("%d%n", grade);
            grade = grade + 1;
            space = space + " ";
        }
    }
}
