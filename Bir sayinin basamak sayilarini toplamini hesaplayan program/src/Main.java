import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int toplam = 0;
        int number;

        int basValue,basPow;

        System.out.print("Bir sayı giriniz :");
        number = inp.nextInt();
        int tempNumber = number;
        while(tempNumber != 0) {

       toplam += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println(toplam);

    }
}