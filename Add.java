import java.util.Scanner;



public class Add {

    public void sum(){
        int a = 7;
        int b = 10;
        String name="Ram";
        int c = a + b;
        System.out.println(c);
    }

    public void multiply(){
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(Name);
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
     
     
    public void checkevennum(){
         
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Number: ");

        int evennumber =scanner.nextInt();

        int check_even = evennumber % 2;
        if(check_even == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }



    public void greaternum(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstno =scanner.nextInt();

        System.out.println("Enter Second number: ");
        int secondno =scanner.nextInt();

        if (firstno > secondno) {
            System.out.println(firstno + " is greater than :" + secondno);
        }
        else if (firstno == secondno){
            System.out.println(firstno + " Both are Equal");
        }
        else {
            System.out.println(firstno + " is smaller than :" + secondno);
        }  

    }
    
    public void multiplyfloat() {
           
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Float number: ");
        
        float num1= scanner.nextFloat();

        System.out.println("Enter Second Float number: ");
        float num2 = scanner.nextFloat();

        float Result = num1 * num2;
        System.out.println(Result);


    }  

    public void swapnumbers(){

        int a = 5;
        int b = 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(a=a+b);
        System.out.println(b=a-b);
        System.out.println(a=a-b);

        System.out.println("After Swap");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }

    
    
}


