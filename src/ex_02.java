public class ex_02 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");

        while (true) {
            fn = f1 + f2;
            if (fn <= 100){
                System.out.print(fn + " ");
            }else{
                break;
            }
            f1 = f2;
            f2 = fn;
        }
    }
}