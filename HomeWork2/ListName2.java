package src.Lesson11.HomeWork2;

public class ListName2 {
    private String name;

    private int number;


    public ListName2(int number, String name) {
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
