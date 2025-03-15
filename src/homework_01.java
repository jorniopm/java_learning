import java.util.Scanner;
public class homework_01 {
    public static void main(String[] args) {
        //获取要求数字
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个10至20之间的数字: ");

        int n;
        int sum = 0;
        do {n = sc.nextInt();
            for (int i = 1; i <= n; i++){
                int j = 1;
                
                sum = i/j;

            }

        } while (n < 10 || n > 20);
        sc.close();
        System.out.println(sum);
    }
}
