class factorial {
    int fact(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * fact(number - 1);
    }

    public static void main(String[] args) {
        int number = 3;
        factorial f1 = new factorial();
        int result = f1.fact(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}