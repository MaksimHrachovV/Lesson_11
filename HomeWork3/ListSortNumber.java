package src.Lesson11.HomeWork3;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortNumber {
    public static void main(String[] args) {
        List<String>list= List.of("1, 2, 0", "4, 5");
        List<String> result=list.stream()
                .map(res -> List.of(res.split(", ")))

                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("result = " + result);

    }
}
