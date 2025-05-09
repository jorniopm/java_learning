public class eex_05 {
    // 抽象灯泡类
    abstract static class Bulb {
        abstract void light();  // 发光的抽象方法
    }
    
    // 红灯泡类
    static class RedBulb extends Bulb {
        @Override
        void light() {
            System.out.println("发出红色的光");
        }
    }
    
    // 绿灯泡类
    static class GreenBulb extends Bulb {
        @Override
        void light() {
            System.out.println("发出绿色的光");
        }
    }
    
    // 台灯类
    static class Lamp {
        private Bulb bulb;  // 台灯包含一个灯泡
        
        // 构造方法，设置灯泡
        public Lamp(Bulb bulb) {
            this.bulb = bulb;
        }
        
        // 更换灯泡方法
        public void changeBulb(Bulb newBulb) {
            this.bulb = newBulb;
            System.out.println("灯泡已更换");
        }
        
        // 开灯方法
        public void on() {
            if (bulb != null) {
                System.out.println("台灯打开，");
                bulb.light();
            } else {
                System.out.println("台灯没有灯泡！");
            }
        }
    }
    
    public static void main(String[] args) {
        // 创建红灯泡和绿灯泡
        Bulb redBulb = new RedBulb();
        Bulb greenBulb = new GreenBulb();
        
        // 创建台灯并安装红灯泡
        Lamp lamp = new Lamp(redBulb);
        
        // 测试开灯
        System.out.println("=== 使用红灯泡 ===");
        lamp.on();
        
        // 更换为绿灯泡
        System.out.println("\n=== 更换为绿灯泡 ===");
        lamp.changeBulb(greenBulb);
        lamp.on();
    }
}
