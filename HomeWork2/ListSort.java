package src.Lesson11.HomeWork2;

import java.util.List;
import java.util.stream.Collectors;



public class ListSort {
    public static void main(String[] args) {
        List<ListName2> namesBase2= List.of(
                new ListName2 (8,"Z"),
                new ListName2 (4,"I"),
                new ListName2 (3,"C"),
                new ListName2 (4,"A"),
                new ListName2 (5,"B"),
                new ListName2 (6,"V")
        );
        System.out.println("namesBase = " + namesBase2);
        System.out.println(end2(namesBase2));

    }

    public static List<ListName2> end2(List<ListName2> namesBase2){
        return namesBase2.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());

    }
}
