import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Inserisci la stringa: ");
        String str=sc.nextLine();
        System.out.println("La stringa è composta da un num di caratteri pari?: "+stringaPariDispari(str));
        System.out.printf("Inserisci l'anno: ");
        int anno=sc.nextInt();
        System.out.println("L'anno "+anno+(annoBisestile(anno)? " è bisestile":" non è bisestile"));
        sc.close();
    }
    public static boolean stringaPariDispari(String str){
        if (str.length()%2==0) return true;
        else return false;
    }
    public static boolean annoBisestile(int anno){
        if (anno%4==0 || anno%100==0 && anno%400==0) return true;
        else return false;
    }
}