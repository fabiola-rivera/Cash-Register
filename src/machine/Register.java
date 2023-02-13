package machine;
import food.Apple;
import food.Sandwhich;
import transaction.Payment;
import java.util.Scanner;

public class Register {

    // class variables

    private static int registerCounter = 0;
    private static final String REGISTERCODE = "US-FL-032020";
    private static final double ONEDOLLARVALUE = 1.00;
    private static final double QUARTERVALUE = 0.25;
    private static final double DIMEVALUE = 0.10;
    private static final double NICKELVALUE = 0.05;
    private static final double PENNYVALUE = 0.01;

    // instance variables
    private String registerID;
    private int numberOfOneDollarBills;
    private int numberOfQuarters;
    private int numberOfDimes;
    private int numberOfNickels;
    private int numberOfPennies;
    private double currentTotal;

    // constructor
    public Register(int numberOfOneDollarBills,
                    int numberOfQuarters,
                    int numberOfDimes,
                    int numberOfNickels,
                    int numberOfPennies) {
        registerCounter+=1;
        registerID = REGISTERCODE +registerCounter;
        currentTotal = 0.0;

        this.numberOfOneDollarBills = numberOfOneDollarBills;
        this.numberOfQuarters = numberOfQuarters;
        this.numberOfDimes = numberOfDimes;
        this.numberOfNickels = numberOfNickels;
        this.numberOfPennies = numberOfPennies;
    }

    // utility methods
    // private bc u dont want anyone to manipulate money in cash register
    private double cashValue(){
        double total = (numberOfOneDollarBills * ONEDOLLARVALUE) +
                        (numberOfQuarters * QUARTERVALUE) +
                        (numberOfDimes * DIMEVALUE) +
                        (numberOfNickels * NICKELVALUE) +
                        (numberOfPennies * PENNYVALUE);

        return total;
    }

    public void cashInfo(String personal){
        if(personal.equals("Manager")){
            System.out.println("=====================================");
            System.out.println("Register Cash Info");
            System.out.println("=====================================");
            System.out.println("Access Level: \t\t\t Valid");
            System.out.printf("Cash in the Register:\t $%-15.2f\n", cashValue());
            System.out.printf("Dollars: \t\t\t\t %-15d\n", numberOfOneDollarBills);
            System.out.printf("Quarters: \t\t\t\t %-15d\n", numberOfQuarters);
            System.out.printf("Dimes: \t\t\t\t\t %-15d\n",numberOfDimes);
            System.out.printf("Nickles: \t\t\t\t %-15d\n", numberOfNickels);
            System.out.printf("Pennies: \t\t\t\t %-15d\n", numberOfPennies);
        }else{
            System.out.println("====================================");
            System.out.println("Register Cash Info");
            System.out.println("====================================");
            System.out.println("Access Level: \t\t\tNot valid by "+ personal);
            System.out.println(" ");
        }
        }

        public void buyApple(Apple apple, Payment payment){
        System.out.println("==================================");
        System.out.println("Register Buy Apple");
        System.out.println("==================================");
        System.out.printf("Apple Price:\t\t\t $%-15.2f\n", apple.price());
        System.out.printf("Payment:\t\t\t\t $%-15.2f\n", payment.paymentValue());
        payment.paymentValue();
       double shortAmount = 0;


        if( payment.paymentValue() < apple.price() ) {
            shortAmount = apple.price() - payment.paymentValue();
            System.out.printf("You need:\t\t\t\t $%-15.2f\n", shortAmount);
            System.out.println(" ");
            System.out.println("Sorry but you don't have enough money to buy the apple");
            System.out.println("==============================================");
            System.out.println("\n");
        }else if(payment.paymentValue() >=  apple.price()){
            giveChange(apple.price(), payment);


            }

    }

   public void buySandwhich(Sandwhich sandwhich, Payment payment){
       System.out.println("=====================================");
       System.out.println("Register Buy Sandwhich");
       System.out.println("=====================================");
       System.out.printf("Sandwhich Price:\t\t $%-15.2f\n", sandwhich.price());
       System.out.printf("Payment:\t\t\t\t $%-15.2f\n", payment.paymentValue());

       payment.paymentValue();

       double shortAmount = 0;

       if( payment.paymentValue() < sandwhich.price() ) {
           shortAmount = sandwhich.price() - payment.paymentValue();
           System.out.printf("You need:\t\t\t\t $%-15.2f\n", shortAmount);
           System.out.println(" ");
           System.out.println("Sorry but you don't have enough money to buy the sandwhich");
           System.out.println("==============================================");
           System.out.println("\n");
       }else if(payment.paymentValue() >=  sandwhich.price()){
           giveChange(sandwhich.price(), payment);
       }

   }
   private void giveChange(double price, Payment payment){
numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
numberOfQuarters += payment.getNumberOfQuarters();
numberOfDimes += payment.getNumberOfDimes();
numberOfNickels += payment.getNumberOfNickels();
numberOfPennies += payment.getNumberOfPennies();




       double neededChange;
       neededChange =  (payment.paymentValue() - price);
       int neededChangeWhole = (int)Math.round(neededChange * 100);

       int changeDollars = neededChangeWhole / 100;
       neededChangeWhole -= changeDollars * 100;

       int changeQuarters = neededChangeWhole / 25;
       neededChangeWhole -= changeQuarters * 25;

       int changeDimes = neededChangeWhole / 10;
       neededChangeWhole -= changeDimes * 10;

       int changeNickels = neededChangeWhole / 5;
       neededChangeWhole -= changeNickels * 5;
       int changePennies = neededChangeWhole;

    numberOfOneDollarBills-= changeDollars;
    numberOfQuarters -= changeQuarters;
    numberOfDimes -= changeDimes;
    numberOfNickels -= changeNickels;
    numberOfPennies -= changePennies;
System.out.printf("Change:\t\t\t\t\t $%-4.2f\n",  neededChange);
    System.out.printf("Dollars:\t\t\t\t %-15d\n", changeDollars);
    System.out.printf("Quarters:\t\t\t\t %-15d\n", changeQuarters);
    System.out.printf("Dimes:\t\t\t\t\t %-15d\n", changeDimes);
    System.out.printf("Nickels:\t\t\t\t %-15d\n", changeNickels);
    System.out.printf("Pennies:\t\t\t\t %-15d\n", changePennies);





    }









} // end Register class
