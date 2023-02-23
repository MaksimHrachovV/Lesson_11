package src.Lesson11.HomeWork5;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Сomparison {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(11,22,33,44,55,66);
        Stream<Integer> zip = zip(stream1, stream2);
        System.out.println(zip.collect(Collectors.toList()));
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream<T> result = Stream.empty();
        Iterator<T> one = first.iterator();
        Iterator<T> two = second.iterator();

        while (one.hasNext() & two.hasNext()){
            result = Stream.concat(result, Stream.of(one.next(), two.next()));
        }
        return result;
    }


}

