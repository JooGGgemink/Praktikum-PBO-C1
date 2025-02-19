
import org.w3c.dom.css.Counter;

/*Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class
 */

public class Titik {
    /*******Atribut ******/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /***** Method ******/
    //konstruktor untuk membuat titik (0,0)
    Titik () {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik (double x,double y) {
        absis = x ;
        ordinat = y;
        counterTitik++;
    }
    
    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis 
    double getAbsis () {
        return absis;
    }

    //mengembalikan nilai ordinat 
    double getOrdinat () {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y 
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x,double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    //mencetak koordinat titik 
    void printTitik() {
        System.out.println("Titik (" + absis +"," + ordinat + ")");
    }
} //end class Titik