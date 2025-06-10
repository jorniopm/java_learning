public class People {
    // 私有属性
    private String pName;
    private String pSex;
    private String pBirth;
    
    // 默认构造方法
    public People() {
        this.pName = "";
        this.pSex = "";
        this.pBirth = "";
    }
    
    // 带参数构造方法
    public People(String pName, String pSex, String pBirth) {
        this.pName = pName;
        this.pSex = pSex;
        this.pBirth = pBirth;
    }
    
    // setter方法
    public void setName(String pName) {
        this.pName = pName;
    }
    
    public void setSex(String pSex) {
        this.pSex = pSex;
    }
    
    public void setBirth(String pBirth) {
        this.pBirth = pBirth;
    }
    
    // getter方法
    public String getName() {
        return pName;
    }
    
    public String getSex() {
        return pSex;
    }
    
    public String getBirth() {
        return pBirth;
    }
    
    // 计算年龄
    protected int calculateAge() {
        if (pBirth.length() < 4) return 0;
        int birthYear = Integer.parseInt(pBirth.substring(0, 4));
        return 2024 - birthYear;
    }
    
    // toString方法
    @Override
    public String toString() {
        return pName + "、" + pSex + "、年龄：" + calculateAge() + "岁";
    }
}