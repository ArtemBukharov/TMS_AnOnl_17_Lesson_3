import  java.util.Scanner ;
public class Temperature {
    public static void main(String[] args) {
        Scanner win = new Scanner(System.in);
        System.out.println("Какая температура по ощущениям?");
        int t = win.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
            System.out.println("Одень майку");
        } else if (-5 <= t && t > -20) {
            System.out.println("Попробуй угадать по людям на улице как одеться");
        } else if (t >= -20) {
            System.out.println("Сиди дома , холодень такая");
        }
    }}


