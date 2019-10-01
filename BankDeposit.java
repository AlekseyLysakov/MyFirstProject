import java.util.Scanner;

public class BankDeposit {

    public static void main(String[] args) {

        Scanner deposit = new Scanner(System.in);
        System.out.print("Введите сумму вклада в гривне: ");
        int depositAmount1 = deposit.nextInt();

        double depositAmount = depositAmount1;

        Scanner percentage = new Scanner(System.in);
        System.out.print("Введите ставку годового процента: ");
        int annualPercentage1 = percentage.nextInt();

        double annualPercentage = annualPercentage1;

        Scanner period = new Scanner(System.in);
        System.out.print("Введите период вклада в годах: ");
        int periodYear = period.nextInt();

        double a = (1.0 + (annualPercentage / 100.0));
        double b = annualPercentage / 100.0;

        for (int i = 1; i <= periodYear; i++) {
            double percentPerYear = depositAmount*b;
            System.out.println("Начисленные проценты за " + i + " год: " + percentPerYear);
            depositAmount *= a;
            System.out.println("Накопленная сумма денег за " + i + " год: " + depositAmount);


        }

            }
    }
