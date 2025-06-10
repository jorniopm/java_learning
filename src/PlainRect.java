public class PlainRect extends Rectangle {
    // 私有属性
    private double startX;
    private double startY;
    
    // 无参构造方法
    public PlainRect() {
        super();
        this.startX = 0;
        this.startY = 0;
    }
    
    // 带参数构造方法
    public PlainRect(double startX, double startY, double width, double height) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }
    
    // getter和setter方法
    public double getStartX() {
        return startX;
    }
    
    public void setStartX(double startX) {
        this.startX = startX;
    }
    
    public double getStartY() {
        return startY;
    }
    
    public void setStartY(double startY) {
        this.startY = startY;
    }
    
    // 判断点是否在矩形内
    public boolean isInside(double x, double y) {
        return x >= startX && x <= startX + getWidth() &&
               y >= startY && y <= startY + getHeight();
    }
    
    // 重写toString方法
    @Override
    public String toString() {
        return "PlainRect[startX=" + startX + ", startY=" + startY + 
               ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}