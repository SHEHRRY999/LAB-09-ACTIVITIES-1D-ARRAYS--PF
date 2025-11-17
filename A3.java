import java.util.Scanner;
public class A3
{
        public static void main(String [] args)
        {
                Scanner input = new Scanner(System.in);
                char [] arr = new char[10];
                int size = 0;
                int element = arr[0];
                char[] unique = new char[size];
                System.out.println("Enter array elements");
                int count = 0;
                for(int i = 0; i < arr.length; i++)
                {
                    System.out.println("A[" + i + "] = ");
                    arr[i] = input.next().charAt(0);
                }
                for(int i = 0; i < arr.length; i++)
                {
                    for(int j = 0; j < arr.length; j++)
                    {
                        if(arr[i] == arr[j])
                        {
                            count++;
                        }
                    }
                    System.out.println(arr[i] + " occurs " + count);
                    count = 0;
                }
                input.close();
        }
}