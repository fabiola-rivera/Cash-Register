package app;
import food.Sandwhich;
import machine.Register;
import food.Apple;
import transaction.Payment;



public class Controller {
   public static void main(String[] args) {

 Register register = new Register(15,
               20,
               10,
               20,
               50);

       register.cashInfo("Manager");
       System.out.println();
       System.out.println();
       register.cashInfo("Staff");
       System.out.println();
       System.out.println();


       Apple grannySmith = new Apple("Granny Smith", 1.51, 140);
       grannySmith.displayInfo();

       Payment applePayment1 = new Payment(10,
               0,
               0,
               0,
               47);
       applePayment1.displayInfo();
       register.buyApple(grannySmith, applePayment1);
       register.cashInfo("Manager");



       Apple macintosh = new Apple("Macintosh", 1.70, 150);
       macintosh.displayInfo();
       Payment applePayment2 = new Payment(0,
               2,
               0,
               0,
               0);
       applePayment2.displayInfo();
       register.buyApple(macintosh, applePayment2);
       register.cashInfo("Manager");

       Sandwhich sandwhich = new Sandwhich(true, true, true);
       sandwhich.displayInfo();
       Payment sandwhichPayment1 = new Payment(5,
               2,
               1,
               1,
               2);
       sandwhichPayment1.displayInfo();
       register.buySandwhich(sandwhich, sandwhichPayment1);
       register.cashInfo("Manager");


       boolean meat = true;
       boolean cheese = true;
       boolean veggies = true;

       System.out.println(" ");


       for (int i = 1; i <= 8; i++) {
           if (i <= 4) {
               meat = true;
               if (i == 1 || i == 2) {
                   cheese = true;
               } else if(i == 3 || i ==4){cheese = false; }
               if (i % 2 == 1) {
                   veggies = true;
               } else if( i % 2 == 0){ veggies = false;}
               Sandwhich sand4 = new Sandwhich(meat, cheese, veggies);
               sand4.displayInfo();
               Payment sand4Payment = new Payment(10,0,0,
                       0,0);
           sand4Payment.displayInfo();
           register.buySandwhich(sand4, sand4Payment);
           register.cashInfo("Manager");
           System.out.println("=====================================================");
           System.out.println("=====================================================");
           System.out.println();
           System.out.println("=====================================================");
           System.out.println("=====================================================");
           } if(i > 4){
               meat = false;
               if(i == 5 || i == 6){
                   cheese = true;
               } else if(i == 6 || i == 7){ cheese = false;}
          if(i % 2 == 1){
              veggies = true;
          } else if(i % 2 == 0 ){ veggies = false;}
               Sandwhich sand5 = new Sandwhich(meat, cheese, veggies);
               sand5.displayInfo();
               Payment sand5Payment = new Payment(10,0,0,
                       0,0);
               sand5Payment.displayInfo();
               register.buySandwhich(sand5, sand5Payment);
               register.cashInfo("Manager");
               System.out.println("=====================================================");
               System.out.println("=====================================================");
               System.out.println();
               System.out.println("=====================================================");
               System.out.println("=====================================================");

           }


       }







       }








       } // end main


   //}
