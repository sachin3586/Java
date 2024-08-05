package oops.encapsulation;

public class WriteOnlyClass {
    private int x=400;

    private String name="SACHIN";

    public void setX(int x) {
        this.x = x;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }
}
