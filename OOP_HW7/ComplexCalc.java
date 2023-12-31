package OOP_HW7;
import java.util.Scanner;

public class ComplexCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вещественную часть первого числа: ");
        double real = sc.nextDouble();
        System.out.println("Введите мнимую часть первого числа: ");
        double img = sc.nextDouble();
        ComplexNum num = new ComplexNum(real, img);
        ComplexNum num2 = new ComplexNum(0, 0);
        ComplexCalc sravn=new ComplexCalc();
        System.out.println("Выберите действие: ");
        System.out.println("1 - прибавить комплексное число;");
        System.out.println("2 - отнять комплексное число;");
        System.out.println("3 - умножить на комплексное число;");
        System.out.println("4 - делить на комплексное число;");
        int swtc = sc.nextInt();

        if (swtc == 1 || swtc == 2 || swtc ==3 || swtc == 4) {
            System.out.println("Введите вещественную и мнимую часть комплексного числа: ");
            num2 = new ComplexNum(sc.nextDouble(), sc.nextDouble());
        }
        switch (swtc) {
            case 1: {
                num.printResult(num.complexAdd(num2));
                break;
            }
            case 2: {
                num.printResult(num.complexReduce(num2));
                break;
            }
            case 3: {
                num.printResult(num.complexMultiply(num2));
                break;
            }
            case 4: {
                num.printResult(num.complexDivide(num2));
                break;
            }
            default: {
                System.out.println("Ошибка.");
            }
        }

    }

	public double getFirstNumber_a() {
		return 0;
	}

    public double getSecondNumber_a() {
        return 0;
    }

    public double getSecondNumber_b() {
        return 0;
    }

    public double performOperation(double firstNumber_a, double firstNumber_b, double secondNumber_a,
            double secondNumber_b, char operation) {
        return 0;
    }

    public char getOperation() {
        return 0;
    }

}

class ComplexNum {

    private double a;
    private double b;
    private ComplexNum result;

    ComplexNum(double a1, double b1) {
        a = a1;
        b = b1;
    }

    ComplexNum complexMultiplyByNumber(double multiplier) {
        a = a * multiplier;
        b = b * multiplier;
        return this;
    }

    ComplexNum complexAdd(ComplexNum additive) {
        a = a + additive.a;
        b = b + additive.b;
        return this;
    }
    ComplexNum complexReduce(ComplexNum reduction){
        a=a-reduction.a;
        b=b-reduction.b;
        return this;
    }

    ComplexNum complexMultiply(ComplexNum multiplier) {
        double buf = a;
        a = a * multiplier.a - b * multiplier.b;
        b = buf * multiplier.b + b * multiplier.a;
        return this;
    }

    ComplexNum conjugated() {
        b = -1 * b;
        return this;
    }

    double module() {
        return Math.sqrt(a * a + b * b);
    }

    ComplexNum complexDivide(ComplexNum divident) {
        double m = (a * divident.a + b * divident.b)/(divident.a*divident.a+divident.b*divident.b);//вещественная часть нового числа
        b = (b*divident.a - a * divident.b)/(divident.a*divident.a+divident.b*divident.b);//мнимая часть нового числа
        a=m;
        return this;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public ComplexNum getResult() {
        return result;

    }

    void printResult(ComplexNum arg) {
        System.out.println(arg.getB() + "i " + "+ (" + arg.getA() + ")");
    }

}