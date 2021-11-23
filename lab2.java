import java.util.InputMismatchException;
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        int num = 0;
        int i = 0;
        int flag=0;
        int facF=1;
        int facW=1;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите целое неотрицательное число <15");
            num = in.nextInt();
        }
        catch (InputMismatchException e) {
            flag=1;
        }
        if ((flag==0) & (num>=0) & (num<15)) {
            for(i=1; i<=num; i++) {
                facF = (facF*i);
            }
            System.out.println("Цикл For: " + facF);
            i=1;
            while (i<=num){
                facW=(facW*i);
                i++;
            }
            System.out.println("Цикл While: " + facW);
        }
        else{
            System.out.println("Ошибка, некорректные данные");
        }
    }
}