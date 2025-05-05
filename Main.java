import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        System.out.println("Sort these numbers:");
        for(int i : array){
            System.out.print(i + " ");
        }

        System.out.println("\n\n");
        for (int i = 0; i < array.length - 1; i++) {
            for(int j : array){
                System.out.print(j + " ");
            }

            System.out.println("\nPlease enter min: ");
            int minEntered = sc.nextInt();

//            System.out.println("Please enter temp: ");
//            int tempEntered = sc.nextInt();

            for (int j = i + 1; j < array.length; j++) {
                if (array[minEntered] > array[j]){
                    minEntered = j;
                }
            }

            //the user must enter min num
            //valid values

            int temp = array[i];
            array[i] = array[minEntered];
            array[minEntered] = temp;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            //outer for loop
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println("\nCorrect sort");
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}