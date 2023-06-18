package start.number;

public final class ComplexNumber {
    private  double real;
    private  double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + "+" + imaginary + "i";
        } else {
            return real + String.valueOf(imaginary) + "i";
        }
    }

    public double real() {
        return real;
    }

    public double imaginary() {
        return imaginary;
    }

}
