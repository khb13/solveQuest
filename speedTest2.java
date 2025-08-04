import java.io.*;
import java.util.*;

public class speedTest2 {
    private static final int WARMUP_ROUNDS = 1000;
    private static final int TEST_ROUNDS = 10000;
    private static final String TEST_DATA = generateTestData(1000); // 더 큰 데이터셋

    public static void main(String[] args) throws Exception {
        // 워밍업
        for (int i = 0; i < WARMUP_ROUNDS; i++) {
            testScanner();
            testBufferedReader();
        }

        // 실제 측정
        long scannerTotal = 0;
        long bufferTotal = 0;

        for (int i = 0; i < TEST_ROUNDS; i++) {
            scannerTotal += testScanner();
            bufferTotal += testBufferedReader();
        }

        System.out.println("Average Scanner time: " + (scannerTotal / TEST_ROUNDS / 1000000.0) + "ms");
        System.out.println("Average BufferedReader time: " + (bufferTotal / TEST_ROUNDS / 1000000.0) + "ms");
    }

    private static String generateTestData(int numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers; i++) {
            sb.append(i).append("\n");
        }
        return sb.toString();
    }

    private static long testScanner() throws Exception {
        ByteArrayInputStream input = new ByteArrayInputStream(TEST_DATA.getBytes());
        Scanner sc = new Scanner(input);

        long startTime = System.nanoTime();
        while (sc.hasNextInt()) {
            sc.nextInt();
        }
        long endTime = System.nanoTime();

        sc.close();
        return endTime - startTime;
    }

    private static long testBufferedReader() throws Exception {
        ByteArrayInputStream input = new ByteArrayInputStream(TEST_DATA.getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(input));

        long startTime = System.nanoTime();
        String line;
        while ((line = br.readLine()) != null) {
            Integer.parseInt(line);
        }
        long endTime = System.nanoTime();

        br.close();
        return endTime - startTime;
    }
}