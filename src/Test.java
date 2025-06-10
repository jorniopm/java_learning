public class Test {
    public static void main(String[] args) {
        // 创建PlainRect对象
        PlainRect rect = new PlainRect(10, 10, 20, 10);
        
        // 输出矩形信息
        System.out.println("矩形信息：" + rect);
        
        // 计算并输出面积和周长
        System.out.println("面积：" + rect.area());
        System.out.println("周长：" + rect.perimeter());
        
        // 判断点是否在矩形内
        double x = 25.5, y = 13;
        if (rect.isInside(x, y)) {
            System.out.println("点[" + x + ", " + y + "]在矩形内");
        } else {
            System.out.println("点[" + x + ", " + y + "]不在矩形内");
        }
    }
}