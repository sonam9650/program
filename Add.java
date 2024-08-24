import java.util.Scanner;


public class Add {

    public void sum(){
        int a = 7;
        int b = 10;
        int c = a + b;
        System.out.println(c);
    }
    public void multiply(){
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
    }

    public void usersum(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");

        int first_num = scanner.nextInt();

        System.out.print("Enter your second number: ");

        int second_num = scanner.nextInt();

        int output = first_num + second_num;

        System.out.println(output);

    }

    public void usermultiply(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        
        int first_number= scanner.nextInt();

        System.out.println("Enter Second number: ");
        int second_number = scanner.nextInt();

        int output1 = first_number * second_number;
        System.out.println(output1);


    }
     
          
}
