package start.math087;

public class ComplexNumber{
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + "+" + imaginary + "i";
        } else {
            return real + String.valueOf(imaginary) + "i";
        }
    }
}
