
package javaapplication7;
import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter your name: ");
       String name = input.nextLine();
       
       System.out.println("======1st Quarter======");

       System.out.print("English: ");
       double english1 = input.nextDouble();
       System.out.print("E.S.P: ");
       double Esp1 = input.nextDouble();
       System.out.print("Science: ");
       double science1 = input.nextDouble();
       System.out.print("Math: ");
       double math1 = input.nextDouble();
       System.out.print("T.L.E: ");
       double tle1 = input.nextDouble();
       System.out.print("Filipino: ");
       double filipino1 = input.nextDouble();
       System.out.print("Mapeh: ");
       double mapeh1 = input.nextDouble();
       System.out.print("A.P: ");
       double ap1 = input.nextDouble();
       
       
       double Average1 = (english1 + Esp1 + science1 + math1 + tle1 +
              filipino1 + mapeh1 + ap1)/8;
       
       System.out.println("Student: " + name);
       System.out.println("Average: " + Average1);
       
       if (Average1 >= 75) {
         System.out.println("Result: PASSED ");
       }else{  
         System.out.println("Result: FAILED ");
         
         
         System.out.println("======2nd Quarter======");

       System.out.print("English: ");
       double english2 = input.nextDouble();
       System.out.print("E.S.P: ");
       double Esp2 = input.nextDouble();
       System.out.print("Science: ");
       double science2 = input.nextDouble();
       System.out.print("Math: ");
       double math2 = input.nextDouble();
       System.out.print("T.L.E: ");
       double tle2 = input.nextDouble();
       System.out.print("Filipino: ");
       double filipino2 = input.nextDouble();
       System.out.print("Mapeh: ");
       double mapeh2 = input.nextDouble();
       System.out.print("A.P: ");
       double ap2= input.nextDouble();
       
       double Average2 = (english2 + Esp2 + science2 + math2 + tle2 +
              filipino2 + mapeh2 + ap2)/8;
       
       System.out.println("Student: " + name);
       System.out.println("Average: " + Average2);
       
       if (Average2 >= 75) {
         System.out.println("Result: PASSED ");
       }else{  
         System.out.println("Result: FAILED ");
         
         
          System.out.println("======3rd Quarter======");

       System.out.print("English: ");
       double english3 = input.nextDouble();
       System.out.print("E.S.P: ");
       double Esp3 = input.nextDouble();
       System.out.print("Science: ");
       double science3 = input.nextDouble();
       System.out.print("Math: ");
       double math3 = input.nextDouble();
       System.out.print("T.L.E: ");
       double tle3 = input.nextDouble();
       System.out.print("Filipino: ");
       double filipino3 = input.nextDouble();
       System.out.print("Mapeh: ");
       double mapeh3 = input.nextDouble();
       System.out.print("A.P: ");
       double ap3= input.nextDouble();
       
       double Average3 = (english3 + Esp3 + science3 + math3 + tle3 +
              filipino3 + mapeh3 + ap3)/8;
       
       System.out.println("Student: " + name);
       System.out.println("Average: " + Average3);
       
       if (Average3 >= 75) {
         System.out.println("Result: PASSED ");
       }else{  
         System.out.println("Result: FAILED ");
         
           System.out.println("======4th Quarter======");

       System.out.print("English: ");
       double english4 = input.nextDouble();
       System.out.print("E.S.P: ");
       double Esp4 = input.nextDouble();
       System.out.print("Science: ");
       double science4 = input.nextDouble();
       System.out.print("Math: ");
       double math4 = input.nextDouble();
       System.out.print("T.L.E: ");
       double tle4 = input.nextDouble();
       System.out.print("Filipino: ");
       double filipino4 = input.nextDouble();
       System.out.print("Mapeh: ");
       double mapeh4 = input.nextDouble();
       System.out.print("A.P: ");
       double ap4= input.nextDouble();
       
       double Average4 = (english4 + Esp4 + science4 + math4 + tle4 +
              filipino4 + mapeh4 + ap4)/8;
       
       System.out.println("Student: " + name);
       System.out.println("Average: " + Average4);
       
       if (Average4 >= 75) {
         System.out.println("Result: PASSED ");
       }else{  
         System.out.println("Result: FAILED ");
         
         System.out.println("======Final Grade======");
         
         System.out.print("Final Grade: ");
       double Final = input.nextDouble();
       
       double FinalGrade = (Average1 + Average2 + Average3 + Average4 )/4;
       
       if (FinalGrade >= 75) {
           System.out.println("Result: PASSED ");
       }else{ 
           System.out.println("Result: FAILED ");
       }    
       }
       
       
         
         
         
         
       }
       
       
    }
    
}
