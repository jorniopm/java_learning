import java.util.Random;
import java.util.Scanner;

public class eex_02 {
    public static void playGuessingGame() {
        // 创建Random对象生成随机数
        Random random = new Random();
        // 生成1到100之间的随机数
        int targetNumber = random.nextInt(100) + 1;
        
        // 创建Scanner对象读取用户输入
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean guessed = false;
        
        System.out.println("我想了一个1到100之间的数字，请猜猜看！");
        
        // 循环直到猜对为止
        while (!guessed) {
            System.out.print("请输入你的猜测: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == targetNumber) {
                System.out.println("恭喜你猜对了！答案就是 " + targetNumber);
                System.out.println("你总共猜了 " + attempts + " 次");
                guessed = true;
            } else {
                System.out.println("No: that's too " + (guess < targetNumber ? "low." : "high."));
            }
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        playGuessingGame();
    }
}
