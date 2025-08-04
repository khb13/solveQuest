import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class fastInOut {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = Arrays.stream((br.readLine().split(" "))).mapToInt(Integer::parseInt).sum();

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < total; i++){
            bw.write(arr[i]+"\n");
        }

        bw.flush();
        bw.close();
    }
}
