import java.util.Scanner;
import java.lang.*;

public class task2
{
public static void main(String args[ ])
{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt(); 
        int arr[ ] = new int[n];
        int prefixSum[ ] = new int[n];
        System.out.println("Enter the elements of the array"); 
        for (int i = 0; i < n; i++)
            {
            arr[i] = sc.nextInt();
            }

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
        {

             prefixSum[i] = prefixSum[i - 1] + arr[i]; }

        System.out.println("PREFIX SUM IS");
        for (int i = 0; i < n; i++)
            {
            System.out.print(prefixSum[i] + " ");
            }
 }
}
