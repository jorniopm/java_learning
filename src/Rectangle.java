public class Rectangle {
    // 私有属性
    private double width;
    private double height;
    
    // 无参构造方法
    // public Rectangle() {
    //     this.width = 0;
    //     this.height = 0;
    // }
    
    // 带参数构造方法
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // getter和setter方法
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    // 计算面积
    public double area() {
        return width * height;
    }
    
    // 计算周长
    public double perimeter() {
        return 2 * (width + height);
    }
    
    // toString方法
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}