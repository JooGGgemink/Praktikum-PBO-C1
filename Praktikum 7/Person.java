public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public boolean isAsleep(int hr) {
        return 22 <= hr || hr < 7;
    }
    public String toString() {
        return name;
    }

    public void stat(int hr){
        if (this.isAsleep(hr))
            System.out.println("tidur" + this);
        else
            System.out.println("not tidur" + this);
    }
}