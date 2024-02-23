import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, largerNum, smallNum, ebob, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextInt();

        if (n1 > n2) {
            largerNum = n1;
            smallNum = n2;
        } else {
            largerNum = n2;
            smallNum = n1;
        }
        for (int i = smallNum; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("En büyük ortak bölen :" + ebob);
                break;
            }
        }
        for (int j = smallNum; j <= (n1 * n2); j++) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                System.out.print("En küçük ortak kat :" + ekok);
                break;
            }

        }

    }
}