package src.Lesson11.HomeWork4;

import java.util.stream.LongStream;

public class StreamIterate {
    public static void main(String[] args) {
        Long a =25214903917L;
        Integer c= 11;
        Integer m =2^48;

        LongStream stream = LongStream.iterate(0, x -> (a * x + c) % m );
        stream
                .limit(20)

                .forEach(System.out::println);


    }
}
