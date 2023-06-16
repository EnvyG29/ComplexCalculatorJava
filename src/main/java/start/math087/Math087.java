package start.math087;

public class Math087 implements IMath087 {
    ComplexNumber numA;

    public Math087() {
        this.numA = null;
    }

    @Override
    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2) {
        double newReal = num1.getReal() + num2.getReal();
        double newImaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber num1, ComplexNumber num2) {
        double newReal = num1.getReal() - num2.getReal();
        double newImaginary = num1.getImaginary() - num2.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }

}
