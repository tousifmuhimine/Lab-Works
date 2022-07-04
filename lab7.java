import java.util.Scanner;

class Fraction{

    private int numerator;
    private int denominator;

    Fraction(){};
    Fraction(int a, int b)
    {
        numerator=a;
        denominator=b;
    }

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    void add(Fraction a, Fraction b){
        numerator = a.numerator*b.denominator+b.numerator*a.denominator;
        denominator = a.denominator*b.denominator;
    }
    void sub(Fraction a, Fraction b){
        numerator = a.numerator*b.denominator-b.numerator*a.denominator;
        denominator = a.denominator*b.denominator;
    }
    void multiplication(Fraction a, Fraction b){
        numerator = a.numerator*b.numerator;
        denominator = a.denominator*b.denominator;
    }
    void division(Fraction a, Fraction b){
        numerator = a.numerator*b.denominator;
        denominator = a.denominator*b.numerator;
    }

    public String toString() {
        return numerator+"/"+denominator;
    }
}
public class lab7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction f1= new Fraction();
        System.out.print("Enter Numerator of Fraction 1 :");
        int n1 = in.nextInt();
        f1.setNumerator(n1);
        System.out.print("Enter Denominator of Fraction 1 :");
        int d1 = in.nextInt();
        f1.setDenominator(d1);
        System.out.print("Enter Numerator of Fraction 2 :");
        int n2 = in.nextInt();
        System.out.print("Enter Denominator of Fraction 2 :");
        int d2 = in.nextInt();
        Fraction f2= new Fraction(n2,d2);

        Fraction f3 = new Fraction();

        f3.add(f1,f2);
        int n3= f3.getNumerator();
        int d3 = f3.getDenominator();
        System.out.println(f1+"+"+f2+"="+f3);

        f3.sub(f1,f2);
        n3= f3.getNumerator();
        d3 = f3.getDenominator();
        System.out.println(f1+"-"+f2+"="+f3);

        f3.multiplication(f1,f2);
        n3= f3.getNumerator();
        d3 = f3.getDenominator();
        System.out.println(f1+"*"+f2+"="+f3);

        f3.division(f1,f2);
        n3= f3.getNumerator();
        d3 = f3.getDenominator();
        System.out.println(f1+"/"+f2+"="+f3);


    }
}
