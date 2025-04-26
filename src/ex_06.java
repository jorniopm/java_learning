public class ex_06 {
public static class NameFormatter {
    public static String formatName(String name) {

        // 将字符串按空格分割
        String[] words = name.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        // 处理每个单词
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                // 首字母大写，其余小写
                String formattedWord = words[i].substring(0, 1).toUpperCase() 
                                     + words[i].substring(1).toLowerCase();
                result.append(formattedWord);
                
                // 如果不是最后一个单词，添加空格
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String name1 = "noRtH CARolina";
        
        System.out.println("原始名字: " + name1);
        System.out.println("格式化后: " + formatName(name1));
    }
}
}
