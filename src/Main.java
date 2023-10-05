import java.util.Scanner;

/* Money Exchange App
The following menu will be displayed and after each chosen option the user will be asked if he wants to perform a new operation.
If you answer with y -> the menu will be displayed again, if you answer with n-> you will leave the application.
1. EURO -> USD
2. USD -> EURO
3. RON -> EURO
4. EURO -> RON
5. EXIT
The exchange rate for each currency will be read from the keyboard at the start of the program!
 */
public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Enter EURO-USD exchange rate: ");
        double euroToUsd = inputNumber.nextDouble();
        System.out.print("Enter USD-EURO exchange rate: ");
        double usdToEuro = inputNumber.nextDouble();
        System.out.print("Enter RON-EURO exchange rate: ");
        double ronToEuro = inputNumber.nextDouble();
        System.out.print("Enter EURO-RON exchange rate: ");
        double euroToRon = inputNumber.nextDouble();

        Exchange exchange = new Exchange(euroToUsd, usdToEuro, ronToEuro, euroToRon);
        exchange.startExchange();

    }
}
