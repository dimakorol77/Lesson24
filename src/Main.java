
    interface Calculator {
        double calculate(double x, double y);
    }

    public class Main {
        public static void main(String[] args) {
            Calculator add = (x, y) -> x + y;
            Calculator subtract = (x, y) -> x - y;
            Calculator multiply = (x, y) -> x * y;
            Calculator divide = (x, y) -> x / y;

            double x = 10;
            double y = 5;

            System.out.println("Суммирование: " + add.calculate(x, y));
            System.out.println("Вычитание: " + subtract.calculate(x, y));
            System.out.println("Умножение: " + multiply.calculate(x, y));
            System.out.println("Деление: " + divide.calculate(x, y));
        }
    }



