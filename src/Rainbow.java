import  java.util.Scanner;
public class Rainbow {
    public static void main(String[] args) {
        Scanner win = new Scanner(System.in);
        System.out.println("Введите номер цвета");
        int number = win.nextInt();
        if (number==1) {
            System.out.println("Красный");}
        if (number==2) {
            System.out.println("Оранжевый");}
        if (number==3) {
            System.out.println("Жёлтый");}
        if (number==4) {
            System.out.println("Зелёный");}
        if (number==5) {
            System.out.println("Голубой");}
        if (number==6) {
            System.out.println("Синий");}
        if (number==7) {
            System.out.println("Фиолетовый");}
        else {
            System.out.println("Такого номера нет");
        }
        }
}
