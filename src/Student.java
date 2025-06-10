public class Student extends People {
    // 私有属性
    private String sNo;
    private String sMajor;
    
    // 默认构造方法
    public Student() {
        super();
        this.sNo = "";
        this.sMajor = "";
    }
    
    // 带参数构造方法
    public Student(String sNo, String name, String sex, String birth, String major) {
        super(name, sex, birth);
        this.sNo = sNo;
        this.sMajor = major;
    }
    
    // setter方法
    public void setNo(String sNo) {
        this.sNo = sNo;
    }
    
    public void setMajor(String sMajor) {
        this.sMajor = sMajor;
    }
    
    // getter方法
    public String getNo() {
        return sNo;
    }
    
    public String getMajor() {
        return sMajor;
    }
    
    // 重写toString方法
    @Override
    public String toString() {
        return sNo + "、" + super.toString() + "、" + sMajor;
    }
}