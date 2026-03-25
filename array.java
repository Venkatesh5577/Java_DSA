import java.util.Scanner;
public class fare {

    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 5;
        num[1] = 8;
        num[2] = 7;
        num[3] = 6;
        num[4] = 9;

        System.out.println(num[4]);

        for(int i = 0; i<5 ; i++)
        {
            System.out.println(i);
        }

//by user
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the size of the array: ");
                int size = sc.nextInt();

                int arr[] = new int[size];

                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.println("The elements of the array are:");
                for (int num : arr) {
                    System.out.print(num + " ");
                }





    }

}
