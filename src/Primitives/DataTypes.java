package Primitives;

import java.lang.management.MonitorInfo;

public class DataTypes {
    public static void main(String[] args){

        byte num1 = 127;
        byte num2 = -128;
        // byte num3 = 200; too big
        byte num4 = 12;

        short num3 =3200;
        short num5 = 4500;
        num3 = num1;
        System.out.println(num3);
       //  num4 = num5; compile time error, you are trying to put bigger box into the smaller one
        int num6 = num1+num3;
        System.out.println(num1+num2);

        long num7 = 5578912234l; //l or L -specify long number
        long num8 = 2_245_600_000l; // you can use the undercore btw the digits
                // data type, name, value

        float fl1 =6; //6=> 6.0
        float fl2 = 6.4f; //you need to use f/F to the end of the floating number

        //double type

        double dbl1 =5.2; //if it's decimal it shoulbe double
        // fl2 = db1;not gonna work. bigger to smaller. Not possible!
        //db1 = fl2; //possible, putting smaller to bigger
        int a =5;
        System.out.println(a);
        double d =5; //5.0
        System.out.println(d);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("");


    }
}
