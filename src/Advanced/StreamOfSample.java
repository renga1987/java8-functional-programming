package Advanced;

import java.util.*;
import java.util.stream.*;

public class StreamOfSample {

    public static void main(String[] args) {

        //java.util.stream.ReferencePipeline$Head@610455d6
        System.out.println(Stream.of(1,2,3,4,4));

        long count = Stream.of(1,2,3,4,4).count();
        System.out.println(count);

        System.out.println(Stream.of(1,2,3,4,4).reduce(0,Integer::sum));

        int arr[] = {1,2,3,4,5};
        //java.util.stream.IntPipeline$Head@1d81eb93
        System.out.println(Arrays.stream(arr));

        System.out.println(Arrays.stream(arr).max());

        System.out.println(Arrays.stream(arr).count());
    }
}
