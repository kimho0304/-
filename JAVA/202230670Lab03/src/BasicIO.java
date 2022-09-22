import java.util.*;

// An exploration of basic input and output.
class BasicIO {

   // Reads and processes string input.
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);
      
      // get first input
      System.out.print("Enter your name: ");
      String name = stdin.nextLine();
      System.out.print("Enter your ages: ");
      int years = stdin.nextInt();
      System.out.print("Enter your height ");
      int height = stdin.nextInt();
      
      
      // display output on console
      System.out.println("your name is " + name); 
      System.out.println("your age is " + years);
      System.out.println("your day is " + years * 365);
      System.out.println("your height is " + height);

      System.out.printf("2022년 09월 16일 현재 %s(%d)의 키는 %dcm 입니다",name,years,height); 
      
   }  // method main

}  // class BasicIO
