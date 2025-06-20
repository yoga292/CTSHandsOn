import java.util.Scanner;

public class FinancialForecast {
    public static double futureValue(double amount,double rate,int years)
    {
        if(years==0)
          return amount;
        else
          return futureValue(amount,rate,years-1)*(1+rate/100);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double initialAmount = sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int fyears = sc.nextInt();
        
        double finalAmount=futureValue(initialAmount,growthRate,fyears);
        System.out.printf("Future value after %d years: Rs %.2f\n", fyears, finalAmount);
    }
    
}
