
class Complex {
    double real;   
    double imag;   

    
    Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    
    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    
    Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    
    Complex multiply(Complex other) {
        double r = this.real * other.real - this.imag * other.imag;
        double i = this.real * other.imag + this.imag * other.real;
        return new Complex(r, i);
    }

    
    Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double r = (this.real * other.real + this.imag * other.imag) / denominator;
        double i = (this.imag * other.real - this.real * other.imag) / denominator;
        return new Complex(r, i);
    }

    
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }
}


public class Complex_Function {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);   
        Complex c2 = new Complex(4, -1);  

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("Addition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
        System.out.println("Multiplication: " + c1.multiply(c2));
        System.out.println("Division: " + c1.divide(c2));
    }
}