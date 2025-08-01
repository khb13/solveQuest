import java.util.Scanner;

public class ab3 {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] arr = new int[total];
        for(int i = 1; i <= total; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i-1] = a+b;
        }

        for(int i=1; i <= total; i++){
            System.out.println(arr[i-1]);
        }
    }

}
