package Primitives;

public class RemainderTask {
    public static void main(String[] args) {


        int number =123;
        int digit1 = number % 10; //3
        System.out.println(digit1);
        number = number / 10;
        System.out.println(number); //12

        int digit2 = number%10; //12
        System.out.println(digit2);

        number=number/10;
        System.out.println(number);


        int digit3 =number%10; //1
        int sum =digit1+digit2+digit3;
        System.out.println("Total of digits is" + sum);
    }

}
