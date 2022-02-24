import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + size + " element of list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        insertionSort(list);
        for (int e : list ){
            System.out.print(e + "\t");
        }
    }
    public static void insertionSort(int[] list){
        for (int k = 1; k < list.length ; k++) {
            int currentElement = list[k];
            int i;
            for ( i = k -1; i >= 0 && list[i]> currentElement ; i--) {
                list[i + 1 ] = list[i];
            }
            list[i+1] = currentElement;
        }
    }
}
