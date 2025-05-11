/*
 * Johan Miracle Simanjuntak
 * 24060123120026
 * 
 */
 import java.util.ArrayList;

 public class ArrayListTest {
     public static void main(String[] args) {
         ArrayList<String> strings = new ArrayList<String>();
         strings.add("Joo");
         strings.add("Simanjuntak");
         strings.add("GG");
 
         System.out.println(strings);
         for (String s : strings) {
             System.out.println(s);
         }
         strings.remove("Ali");
         System.out.println(strings);
 
     }
 }