import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream s = new FileInputStream("person.ser");
            ObjectInputStream f = new ObjectInputStream(s);
            p = (Person) f.readObject();
            System.out.println("kelar baca person.ser");
            System.out.println("Nama: " + p.getName());
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}