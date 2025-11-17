import java.util.Scanner;
public class A2
{
        public static int SUM(int [] array)
        {
            int sum = 0;
            for(int x:array)
            {
                sum = sum + x;
            }
            return sum;
        }
        public static void main(String [] args)
        {
                Scanner input = new Scanner(System.in);
                int [] arr = new int[5];
                System.out.println("Enter array elements");
                
                for(int i = 0; i < arr.length; i++)
                {
                    arr[i] = input.nextInt();
                    
                }
                int sumOfArray = SUM(arr);
                System.out.println("SUM = " + sumOfArray);
                input.close();
        }
}