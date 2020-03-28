import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сообщие сумму на вaшем счету: ");
        float account = in.nextFloat();
        System.out.print("На какую сумму вы хотите пополнить счёт?: ");
        float deposit = in.nextFloat();
        if (deposit > 100) {
            account = account + deposit + (deposit / 100);
        } else {
            account = account + deposit;
        }
        System.out.println("Итого на счету с учётом бонусов: " + String.format("%.2f", account));
    }
}