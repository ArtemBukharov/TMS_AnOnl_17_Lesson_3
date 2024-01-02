import java.util.Scanner;

public class cycles3 {
    public static void main(String[] args) {
        Scanner win = new Scanner(System.in);
        System.out.println("Введите число");
        int number = win.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=number){
            sum=sum+i;
            i++;
        }
        System.out.println("сумма чисел от 1 до " +  number +"равна" + sum);
    }
}
