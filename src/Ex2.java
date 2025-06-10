public class Ex2 {
    public static void main(String[] args) {
        // 创建Student对象
        Student student = new Student("B17010101", "张三", "男", "1999年9月9日", "软件工程");
        
        // 输出学生信息
        System.out.println("学生信息：" + student.toString());
    }
}