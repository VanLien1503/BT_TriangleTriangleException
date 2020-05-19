import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static int[] input() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("nhập cạnh a");
        int a = scanner.nextInt();
        arr[0] = a;
        System.out.println("nhập cạnh b");
        int b = scanner.nextInt();
        arr[1] = b;
        System.out.println("nhập cạnh c");
        int c = scanner.nextInt();
        arr[2] = c;
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("a,b,c # 0");
        }
        return arr;
    }

    public static void CheckTriangle(int[] arr) throws Exception {
        if (arr[0] + arr[1] > arr[2] || arr[1] + arr[2] > arr[0] || arr[2] + arr[0] > arr[1])
            throw new Exception(" Khong Phai La tam giac");
    }

    public static void CheckTriangleSquare(int arr[]) {
        int a=arr[0];
        int b=arr[1];
        int c=arr[2];


    }

    public static int CheckMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) throws Exception {
        try {
            int[] myArr = input();
            System.out.println(Arrays.toString(myArr));
            int max = CheckMax(myArr);
            System.out.println(max);
            CheckTriangle(myArr);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
