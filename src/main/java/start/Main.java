package start;


import start.math087.ComplexNumber;
import start.math087.Math087;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ComplexNumber num1 = new ComplexNumber(7,3);
        ComplexNumber num2 = new ComplexNumber(6,2);
        Math087 math087 = new Math087();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();
        System.out.println(math087.addition(num1, num2));
        System.out.println(math087.subtraction(num1, num2));
        System.out.println(math087.multiplication(num1, num2));
        System.out.println(math087.division(num1, num2));




    }
}