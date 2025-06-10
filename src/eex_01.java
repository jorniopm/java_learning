import java.util.Random;

public class eex_01 {
    public static void checkDivisibility(int number) {
        System.out.println("生成的随机数是：" + number);
        
        // 检查是否能被2整除
        if (number % 2 == 0) {
            System.out.println(number + " 能被2整除");
        } else {
            System.out.println(number + " 不能被2整除");
        }
        
        // 检查是否能被3整除
        if (number % 3 == 0) {
            System.out.println(number + " 能被3整除");
        } else {
            System.out.println(number + " 不能被3整除");
        }
        
        // 检查是否能被5整除
        if (number % 5 == 0) {
            System.out.println(number + " 能被5整除");
        } else {
            System.out.println(number + " 不能被5整除");
        }
    }
    
    public static void main(String[] args) {
        // 创建Random对象生成随机数
        Random random = new Random();
        // 生成1到100之间的随机整数
        int randomNumber = random.nextInt(100) + 1;
        // 检查数字的整除性
        checkDivisibility(randomNumber);
    }
}
