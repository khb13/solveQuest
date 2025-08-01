import java.util.ArrayList;
import java.util.Scanner;

public class ab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            list.add(a+b);

            if(a == 0 && b == 0) break;
        }
        for(int i = 0; i < list.size()-1; i++){
            System.out.println(list.get(i));

        }
    }
}
