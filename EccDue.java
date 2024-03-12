public class EccDue {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b; // qui verrà eseguita una divisione per zero
            System.out.println(c);
        }
        catch (ArithmeticException exc){
            System.out.println("Testa di minkia hai diviso per zero gnuranti!");
        }
    }
}
    