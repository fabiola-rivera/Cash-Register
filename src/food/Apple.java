package food;
import machine.Register;
import transaction.Payment;
public class Apple {

    // instance variables
    private String type;
    private double weight;
    private double pricePerUnitWeight;

    // constructor
    public Apple (String type, double pricePerUnitWeight, double weightInGrams){
        weight = 0.00220 * weightInGrams;

        this.type = type;
        this.pricePerUnitWeight = pricePerUnitWeight;
    }

    // setters & getters
    public String getType(){return type;}
    public double getWeight(){return weight;}
    public double getPricePerUnitWeight(){return pricePerUnitWeight;}

    public void setPricePerUnitWeight(double pricePerUnitWeight, String personal) {
        this.pricePerUnitWeight = pricePerUnitWeight;
        //this.personal = personal;
    }

    public void displayInfo(){
        System.out.println("================================");
        System.out.println("Apple Info: ");
        System.out.println("================================");
        System.out.printf("Type: \t\t\t\t %-15s\n", type);
        System.out.printf("Weight: \t\t\t %-6.4f lbs \n", weight);
        System.out.printf("Price per unit: \t %-10.2f\n", pricePerUnitWeight);
        System.out.printf("Price:  \t\t\t $%-10.2f\n", price());
    }

    public double price(){
        double price = weight * pricePerUnitWeight;
        return price;
    }




} // end Apple class
