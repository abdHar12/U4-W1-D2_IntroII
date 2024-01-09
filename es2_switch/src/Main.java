import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Scrivi un numero: ");
        int num=sc.nextInt();
        switchFun(num);
        sc.close();
    }
    public static void switchFun(int num){
        switch (num){
            case 0:
                System.out.println("Il numero è compreso tra 0 e 3");
                break;
            case 1:
                System.out.println("Il numero è compreso tra 0 e 3");
                break;
            case 2:
                System.out.println("Il numero è compreso tra 0 e 3");
                break;
            case 3:
                System.out.println("Il numero è compreso tra 0 e 3");
                break;
            default:
                System.out.println("Il numero non è compreso tra 0 e 3");
        }
    }
}