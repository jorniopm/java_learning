public class learn03 {
    static long Factorial(int n) {
        int cont = 1;
        for (int i = 1; i <= n; i++) {
            cont = cont * i;
        }
        return cont;
    }
    public static void main(String[] args) {
        int n = learn02.cube(5);
        System.out.println(n);
        long m = learn03.Factorial(6);
        System.out.println(m);
    }

    
}
