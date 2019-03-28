import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static int[] getArr(int n, int j) throws FileNotFoundException {
        File f = new File("arrays.txt");
        Scanner scanner = new Scanner(f);
        for (int i = 0; i < j; i++) scanner.nextLine();
        String[] arr1 = scanner.nextLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arr1[i]);
        }
        return arr;
    }

    public static void main (String[] args) throws FileNotFoundException {

        int n=50;
        int j=0;
        for (int i = 0; i < 99; i++) {
            System.out.print(n + " ");
            HeapSort hs = new HeapSort();
            double time1 = System.nanoTime();
            hs.sort(getArr(n, j));
            double time2 = System.nanoTime();
            System.out.print(time2 - time1);
            System.out.println("");
            n=n+50;
            j++;
        }
    }
}
