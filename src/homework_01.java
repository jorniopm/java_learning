import java.util.Scanner;
public class homework_01 {
    public static void main(String[] args) {
        
//以下为第一题
        //获取要求数字
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个10至20之间的数字: ");

        //定义初始变量
        double i = 1;
        double sum1 = 0;
        double sum2 = 1;
        double result = 0;
        int n = sc.nextInt();

        //确保n在10到20之间
        if (n >= 10 && n <= 20) {
            do {
                sum1 = sum1 + i;
                sum2 = sum2 * i;
                i++;
                result = result + sum2 / sum1;
            } while (i <= n);
            System.out.println(result);
        } else {
            System.out.println("输入的数字不在10到20之间");
        }

//以下为第二题
        sc.nextLine(); //清空缓冲区
        System.out.print("输入一个字符串: ");
        String s1 = sc.nextLine().toUpperCase();
        System.out.println(s1);

//以下为第三题
        // sc.nextLine(); //清空缓冲区
        System.out.print("输入第一个数字: ");
        long x = sc.nextLong();
        sc.nextLine(); //清空缓冲区
        System.out.print("输入第二个数字: ");
        long y = sc.nextLong();
        System.out.println("最大公约数是: " + gcd(x, y));
        sc.close();
    }
        
//以下为第三题的方法
    static long gcd(long m, long n){
            if (m < n) {
                long temp = m;
                m = n;
                n = temp;
            }//确保m>n
            while(n != 0){
                long a = m % n;
                m = n;
                n = a;
            }
            return m;
        }
}
