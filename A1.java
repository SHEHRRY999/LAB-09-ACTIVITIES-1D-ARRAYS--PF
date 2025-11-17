import java.util.Scanner;
public class A1
{
        public static void main(String [] args)
        {
                Scanner input = new Scanner(System.in);
                int [] arr = new int [10];
                System.out.println("Enter array elements");
                int max1 = 0;
                for(int i = 0; i < 10; i++)
                {
                    arr [i] = input.nextInt();
                    if (max1 < arr [i])
                    {
                        max1 = arr [i];
                    }
                }
                int max2;
                if (arr [0] == max1)
                {
                    max2 = arr [1];
                }
                else
                {
                    max2 = arr [0];
                }
                for (int i = 0; i < 10; i++)
                {
                    if (arr[i] != max1)
                    {
                        if (arr [i] > max2)
                        {
                            max2 = arr [i];
                        }
                    }
                }
                System.out.println("Largest = " + max1);
                System.out.println("2nd Largest = " + max2);
                input.close();
        }
}