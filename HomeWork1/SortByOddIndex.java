package src.Lesson11.HomeWork1;

import java.util.List;
import java.util.stream.Collectors;

public class SortByOddIndex {
    public static void main(String[] args) {
        List<ListName> namesBase=List.of(
                new ListName (1,"IvanQ"),
                new ListName (2,"IvanQQ"),
                new ListName (3,"IvanQQQ"),
                new ListName (4,"IvanQQQQ"),
                new ListName (5,"IvanQQQQQ"),
                new ListName (6,"IvanQQQQQQ")
        );
        System.out.println("namesBase = " + namesBase);
        System.out.println(end(namesBase));


    }
    public static List<ListName> end (List<ListName> namesBase){
        return namesBase.stream()
                .filter(listName ->listName.getNumber()%2!=0)
                .collect(Collectors.toList());

    }
}
