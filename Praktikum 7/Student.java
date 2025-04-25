public class Student extends Person{
    public Student(String name) {
        super(name);
    }
    public boolean isAsleep(int hr) {
        return 2 < hr || hr < 8;
    }
}