import java.util.Scanner;

public class Exchange {
    //FIELDS
    private double euroToUsd;
    private double usdToEuro;
    private double ronToEuro;
    private double euroToRon;
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputText = new Scanner(System.in);

    // CONSTRUCTORS PARAMETRIZED
    public Exchange(double euroToUsd, double usdToEuro, double ronToEuro, double euroToRon) {
        this.euroToUsd = euroToUsd;
        this.usdToEuro = usdToEuro;
        this.ronToEuro = ronToEuro;
        this.euroToRon = euroToRon;
    }

    // METHODS
    public void showMenu() {
        System.out.println();
        System.out.println("---- MENU ----");
        System.out.println("1. EURO -> USD");
        System.out.println("2. USD -> EURO");
        System.out.println("3. RON -> EURO");
        System.out.println("4. EURO -> RON");
        System.out.println("5. EXIT");
    }

    public void startExchange() {
        int optionChoose;
        String answerClient = "n";
        do {
            showMenu();
            System.out.print("Choose an option from the menu: ");
            optionChoose = inputNumber.nextInt();
            switch (optionChoose) {
                case 1:
                    euroToUsd();
                    break;
                case 2:
                    usdToEuro();
                    break;
                case 3:
                    ronToEuro();
                    break;
                case 4:
                    euroToRon();
                    break;
                case 5:
                    System.out.println("Thank you for choosing us! Goodbye");
                    break;
                default:
                    System.out.println("Invalid option! Choose again!");
            }
            if (optionChoose != 5) {
                System.out.print("Do you want to perform another option? (y/n): ");
                answerClient = inputText.nextLine();
            }else {
                answerClient = "n";
            }
        }while (answerClient.equalsIgnoreCase("y"));
    }

    private void euroToUsd(){
        System.out.print("Enter the amount in EURO (whole amount) you want to exchange in USD: ");
        int amountEntered = (int) inputNumber.nextDouble();
        double resultInUSD = amountEntered * euroToUsd;
        System.out.println("Exchange made: " + resultInUSD + " USD");
    }

    private void usdToEuro(){
        System.out.print("Enter the amount in USD (whole amount) you want to exchange in EURO: ");
        int amountEntered = (int) inputNumber.nextDouble();
        double resultInEuro = amountEntered * usdToEuro;
        System.out.println("Exchange made: " + resultInEuro + " EURO");
    }

    private void ronToEuro(){
        System.out.print("Enter the amount in RON (whole amount) you want to exchange in EURO: ");
        int amountEntered = (int) inputNumber.nextDouble();
        double resultInEuro = amountEntered * ronToEuro;
        System.out.println("Exchange made: " + resultInEuro + " EURO");
    }

    private void euroToRon(){
        System.out.print("Enter the amount in EURO (whole amount) you want to exchange in RON: ");
        int amountEntered = (int) inputNumber.nextDouble();
        double resultInRon = amountEntered * euroToRon;
        System.out.println("Exchange made: " + resultInRon + " RON");
    }

    // GETTERS AND SETTERS
    public double getEuroToUsd() {
        return euroToUsd;
    }

    public void setEuroToUsd(double euroToUsd) {
        this.euroToUsd = euroToUsd;
    }

    public double getUsdToEuro() {
        return usdToEuro;
    }

    public void setUsdToEuro(double usdToEuro) {
        this.usdToEuro = usdToEuro;
    }

    public double getRonToEuro() {
        return ronToEuro;
    }

    public void setRonToEuro(double ronToEuro) {
        this.ronToEuro = ronToEuro;
    }

    public double getEuroToRon() {
        return euroToRon;
    }

    public void setEuroToRon(double euroToRon) {
        this.euroToRon = euroToRon;
    }
}
