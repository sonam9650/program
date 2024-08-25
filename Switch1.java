
import java.util.Scanner;

public class Switch1 {
    

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        int mt =scanner.nextInt();

        //Switch expression  
        switch(mt)
        {  
        //Case statements  
        case 1: System.out.println("January");  
        break;  
        case 2: System.out.println("Feb");  
        break;  
        case 3: System.out.println("Mar");  
        break;  
        //Default case statement  
        default:System.out.println("Error statment");  
        }  
    }  



    }

