public class Student extends People {
    private String sNo;
    private String sMajor;

    public Student() {
        super();
        this.sNo = "";
        this.sMajor = "";
    }
    
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