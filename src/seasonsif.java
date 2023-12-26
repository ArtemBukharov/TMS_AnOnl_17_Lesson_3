import java.util.Scanner;
public class seasonsif {
    public static void main(String[] args) {
        Scanner win = new Scanner(System.in);
        System.out.println("Введите число");
        int number = win.nextInt();
        if (number == 1 || number == 2 || number == 12) {
            System.out.println("Winter");}
            else if (number == 3 || number == 4 || number == 5) {
                System.out.println("Spring");}
            else if (number == 6 || number == 7 || number == 8) {
                    System.out.println("Summer");}
            else if (number == 9 || number == 10 || number == 11) {
                        System.out.println("Autumn");}
            else {
                            System.out.println("Такого номера месяца не найдено");
                        }}}



