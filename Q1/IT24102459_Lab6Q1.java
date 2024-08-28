import java.util.Scanner;
public class IT24102459_Lab6Q1{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number : ");
     double num = scanner.nextDouble();
     System.out.println(" ");
     
     double sqr = num * num;
     System.out.println("The square of "  + num + " is : " + sqr);
     
     double sqrt = Math.sqrt(num);
     System.out.println("The square root of "  + num + " is : " + sqrt);
     
    }
}