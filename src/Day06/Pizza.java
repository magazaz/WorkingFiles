package Day06;

public class Pizza {
    public static void main(String[] args) {
        String pizzaType = "Square";
        int numOfSlices = 195, numOfPeople = 20;
        int eachAte = numOfSlices / numOfPeople;
        int leftOver = numOfSlices % numOfPeople;
//        int leftOver = numOfSlices - (numOfPeople * eachAte);

        System.out.println("We ordered " + pizzaType + " pizza with " + numOfSlices + " slices, " + numOfPeople + " people ate " + eachAte + " slices each with " + leftOver + " left over");



    }
}
