public class ex_04 {
    public static int calculateCows(int year){
        if (year == 0) return 0;
        if (year == 1) return 1;
        if (year == 2) return 2;
        if (year == 3) return 3;
        return calculateCows(year - 1) + calculateCows(year - 3);
    }
    public static void main(String[] args) {
        System.out.println("前10年每年的母牛数量：");
        for (int i = 1; i <= 10; i++){
            System.out.printf("第%d年：%d头母牛\n", i, calculateCows(i));
        }
    }
}
