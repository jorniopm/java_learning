import java.util.*;

public class ex_05 {
    public static String expandYear(String date){
        String[] parts = date.split("/");
        String month = parts[0];
        String day = parts[1];
        String year = parts[2];
        String fullYear = "19" + year;
        return String.format("%s/%s/%s", month, day, fullYear);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期 (格式: mm/dd/yy)：");
        String inputDate = sc.nextLine();

        String expandedDate = expandYear(inputDate);
        System.out.println("扩展后的日期: " + expandedDate);

        sc.close();
    }
}
