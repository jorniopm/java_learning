public class FinalEx {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 30);
        Box myBox2 = new Box(3, 6, 9);
        double vol;
        vol = myBox1.volume();
        System.out.println("myBox1 Volume is "+vol);
        vol = myBox2.volume();
        System.out.println("myBox2 Volume is "+vol);
    }

}

class Box{
    double width, height, depth;
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}
