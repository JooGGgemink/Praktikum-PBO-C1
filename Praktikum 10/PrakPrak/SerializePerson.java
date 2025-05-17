import java.io.*;

class Person implements Serializable {
    private String name;

    public Person (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}
public class SerializePerson {
    public static void main(String[] args) {
        Person p = new Person("Cuki");
        try {
            FileOutputStream s = new FileOutputStream("person.ser");
            ObjectOutputStream f = new ObjectOutputStream(s);
            f.writeObject(p);
            System.out.println("kelar tulis person.ser");
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
}