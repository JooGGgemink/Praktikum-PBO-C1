public class TestSenjata {
    public static void main(String [] args){
        Senjata AK47 = new Senjata("Tar");
        Senjata M16 = new Senjata("Dor");
        
        System.out.println("AK47 Menembak 3x: ");   //AK47.menembak(3);
        System.out.println("M16 Menembak 1x: ");    //M16.menembak(1);
        
        System.out.println("AK47 Menusuk: " + AK47.menusuk());
        AK47.pasangBayonet();
        System.out.println("AK47 Menusuk: " + AK47.menusuk());
    }
}