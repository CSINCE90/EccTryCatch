/*  come gia asserito in precedenza lo sviluppatore ha a sua disposizione cinque parole chiave per gestire le eccezioni: try, catch, finally, throw, throws. */
/* se necessita sviluppare una parte di codice che possa potenzialmente scatenare un'eccezione è possibile circondarla con un blocco try seguito da uno o più blocchi catch. Per esempio, consideriamo la seguente classe:  */

public class EccUno {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a/b; // qui verrà eseguita una divisione per zero
        System.err.println(c);
    }
}
// questa classe lancerà un eccezione durante la sua esecuzione, dovuta all'impossibilità di eseguire una DIVISIONE PER ZERO. 
/* NELL'OUTPUT PRODOTTO SPIEGHIAMO: 
 * > tipo di eccezione: "java.lang.ArithmeticException);
 * > un messaggio descrittivo: "/ by zero";
 * > il metodo in cui è stata lanciata l'eccezione: "EccUno.main";
 * > il file in cui è stata lanciata l'eccezione: "EccUno.java";
 * > la riga in cui è stata lanciata l'eccezione: ":8";
 * Utilizzando le parole chiave "Try - Catch" sarà possibile gestire l'eccezione, facendo terminare il programma senza che sia interrotto bruscamente. 
 */