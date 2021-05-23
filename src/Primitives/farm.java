package Primitives;

public class farm {
    public static void main(String[] args) {

        int chickenLegs =2;
        int cowLegs =4;
        int totalCowLegs = 23;
        int totalChickenLegs = 12;
        int totalLeg = (cowLegs*totalCowLegs) + (totalChickenLegs*chickenLegs);

        System.out.println(" There are" + totalLeg + " in this farm");



        int cow = 1200;
        double chicken = 15.99;
        double totalCost = (cow*cowLegs)+(chickenLegs*chicken);

        System.out.println("Total cost of animal in htis area is: "+ totalCost);

    }
    /*
    calculate number of the legs in the famr is
    there are 23 cows and chicken 12 in this farm

    2. calculate the cost of the animals if:
    each cow is $1200, each chicken is $15.99




     */
}


