package start.math087;

import start.number.ComplexNumber;

public class Math087 implements IMath087 {
    ComplexNumber numA;

    public Math087() {
        this.numA = null;
    }

    @Override
    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2) {
        double newReal = num1.real() + num2.real();
        double newImaginary = num1.imaginary() + num2.imaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber num1, ComplexNumber num2) {
        double newReal = num1.real() - num2.real();
        double newImaginary = num1.imaginary() - num2.imaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.real() * num2.real() - num1.imaginary() * num2.imaginary();
        double imaginary = num1.real() * num2.imaginary() + num1.imaginary() * num2.real();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.real() * num2.real() + num2.imaginary() * num2.imaginary();
        double real = (num1.real() * num2.real() + num1.imaginary() * num2.imaginary()) / denominator;
        double imaginary = (num1.imaginary() * num2.real() - num1.real() * num2.imaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }

}
