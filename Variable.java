import java.util.Scanner;


public class Variable {
    public static void main(String[] args) {

//1. Variables and Data Types      
  // Swaping of two numbers

        int a = 5;
        int b = 10;
       //after swap
       int c=a;
       a=b;
       b=c;
       
       System.out.println("a = "+ a);
       System.out.println("b = "+ b);
//2.Control Statements   
  //even or odd
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int evenodd =scanner.nextInt();

        if (evenodd%2==0){
            System.out.println("It is even number");
        }else{
            System.out.println("It is odd number");
        }
        System.out.println("hello world");

//largest of three numbers
        Scanner largestofthree = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 =largestofthree.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 =largestofthree.nextInt();

        System.out.println("Enter the 3rd number: ");
        int num3 =largestofthree.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("Largest number is num 1 : "+ num1);
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("Largest number is num 2 : "+ num2);
        }
        else {
            System.out.println("Largest number is num 3 : "+ num3);
        }
//multiplication table of a given number

         Scanner multiplicationtable = new Scanner(System.in);
         System.out.println("Enter any number for table : ");
         int table =multiplicationtable.nextInt();
         
         System.out.println("Enter any number for table range : ");
         int range =multiplicationtable.nextInt();

         for(int i=1; i<=range;i=i+1){
            System.out.println(table + " x " + i + " = " + (table * i));

    
         }

}
}