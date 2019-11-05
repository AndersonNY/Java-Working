package day4;

//inside your main method,
//        call Add(num1, num2);
//        call Multiply(num1, num2);
//        call Deduct(num1, num2);
//        call Divide(num1, num2);

//String name = "techno";
//String[] = "a","b","c","c"
public class TestWithPackages {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 899;

        TestComparingOperators(num1, num2);
        Add(num1, num2);
        Multiply(num1, num2);
        Deduct(num1, num2);
    }
    private static void Add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    private static void Deduct(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void Multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static void TestComparingOperators(int number1, int number2) {
        // * Comparing operators: ==, !=, <, <=, >, >=
        // = means assign number1 (34) = number2 (34)
        // == means equality number1 == number2 (34)
        // != means not equal number1 != number2 (34)
//        Comparing operators: ==, !=, <, <=, >, >=
        if (number1 == number2) {
            System.out.println("Numbers are equal");
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are NOT equal");
            System.out.println("Numbers are NOT equal");
        }


//
//        if (number1 == number2) {
//            System.out.println("Numbers are equal");
//        } else {
//            System.out.println("Numbers are NOT equal");
//        }

    }
}
