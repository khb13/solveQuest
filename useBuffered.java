import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class useBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readInput = br.readLine();
        String[] tokens = readInput.split(" ");

        System.out.println(readInput);
        System.out.println(Arrays.toString(tokens));

        Stream<String> streamTokens = Arrays.stream(tokens);
        IntStream intStream = streamTokens.mapToInt(Integer::parseInt);
        int[] nums = intStream.toArray();

        System.out.println(streamTokens);
        System.out.println(intStream);
        System.out.println(Arrays.toString(nums));

    }
}
