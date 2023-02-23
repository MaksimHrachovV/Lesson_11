package src.Lesson11.HomeWork1;

public class ListName {
    private String name;

    private int number;


    public ListName(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return
                "number='" + number + '\'' +
                ", name=" + name
                ;
    }
}
