public class ExceptionOnArray {
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[] arrayinteger = new Integer[4];
        try{
            arrayinteger[2] = 11;
            arrayinteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}