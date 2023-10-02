import java.util.Scanner;

    public class add_num {
        //Funtion to add two numbers
        public static float Sum(float a, float b){
            float sum_of_nums= a+b;
            return sum_of_nums;
    }

    public static void main(String[] args) {
        float num1, num2, sum;

        Scanner sc=new Scanner(System.in);

        //Taking numbers as user input
        System.out.println("Enter the first number: ");
        num1=sc.nextFloat();
        System.out.println("Enter the second number: ");
        num2=sc.nextFloat();
        
        //Calling sum function
        sum= Sum(num1, num2);
        System.out.println("Sum of the two numbers is: "+sum);
    }
}
