import java.io.*;
import java.util.*;

public class speedTest {
    public static void main(String[] args) throws Exception {

        String testInput = "123456789\n";

        // Scanner 테스트
        ByteArrayInputStream scannerInput = new ByteArrayInputStream(testInput.getBytes());
        Scanner sc = new Scanner(scannerInput);
        long startTime = System.nanoTime();
        int n1 = sc.nextInt();
        long scannerTime = System.nanoTime() - startTime;
        sc.close();

        // BufferedReader 테스트
        ByteArrayInputStream bufferInput = new ByteArrayInputStream(testInput.getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(bufferInput));
        startTime = System.nanoTime();
        int n2 = Integer.parseInt(br.readLine());
        long bufferTime = System.nanoTime() - startTime;
        br.close();

        // 결과 출력 (나노초 -> 밀리초 변환)
        System.out.println("Scanner speed: " + scannerTime / 1000000.0 + "ms");
        System.out.println("BufferedReader speed: " + bufferTime / 1000000.0 + "ms");
    }
}