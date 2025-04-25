public class ex_03 {
    public static int fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void printFibonacci() {
        int i = 1;
        int result;
        while(true) {
            result = fibonacci(i);
            if (result > 100){
                break;
            }
            System.out.print(result + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("100以内的斐波那契数列为：");
                printFibonacci();
    }
}
