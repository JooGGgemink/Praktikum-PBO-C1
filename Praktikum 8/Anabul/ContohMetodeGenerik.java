public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data)
    {
        data.getIsi().suara();
        data.getIsi().gerak();
    }
}
