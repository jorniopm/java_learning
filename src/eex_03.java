import java.util.Scanner;

public class eex_03 {
    // 计算单个长方体的体积
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    // 计算单个长方体的表面积
    public static double calculateSurfaceArea(double length, double width, double height) {
        return 2 * (length * width + length * height + width * height);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVolume = 0;
        double totalSurfaceArea = 0;
        
        System.out.println("欢迎使用长方体计算程序！");
        

        System.out.println("\n请输入长方体的三边长度：");
            
        System.out.print("长度：");
        double length = scanner.nextDouble();
            
        System.out.print("宽度：");
        double width = scanner.nextDouble();
            
        System.out.print("高度：");
        double height = scanner.nextDouble();
            
        // 计算当前长方体的体积和表面积
        double volume = calculateVolume(length, width, height);
        double surfaceArea = calculateSurfaceArea(length, width, height);
            
        // 累加到总量中
        totalVolume += volume;
        totalSurfaceArea += surfaceArea;
            
        // 显示当前长方体的计算结果
        System.out.printf("当前长方体 - 体积：%.2f, 表面积：%.2f\n", volume, surfaceArea);

        
        // 显示最终结果
        System.out.printf("\n最终结果：\n");
        System.out.printf("总体积：%.2f\n", totalVolume);
        System.out.printf("总表面积：%.2f\n", totalSurfaceArea);
        
        scanner.close();
    }
}
