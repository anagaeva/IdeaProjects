package Variables;

public class MultiVariables {
    public static void main(String[] args){

       int a = 2;

       int b = 3;

       int c = 4;

       int x;

       //#1 int a = 5; you can't create variables with the same name, but you can reassign it
        // #2

        int d = 6, e =7, f = 8;
        /*
        you can declare and initialize variables on the same line if they are same data type
        you should separate them with a comma
         */

        int y, z, t, w;
        y=a;
        z = 5+b;
        t = y*z;


        System.out.println(t+c);
    }
}
