package exercise3;

public class Rubrica {
    private String name;
    private int telephonenumber;

    public Rubrica(String name, int telephonenumber) {
        this.name = name;
        this.telephonenumber = telephonenumber;
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "name='" + name + '\'' +
                ", telephonenumber=" + telephonenumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getTelephonenumber() {
        return telephonenumber;
    }
}
