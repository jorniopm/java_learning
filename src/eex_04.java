public class eex_04 {
    // 定义学生类
    static class Student {
        private String id;          // 学号
        private String name;        // 姓名
        private double score1;      // 第一门课成绩
        private double score2;      // 第二门课成绩
        private double score3;      // 第三门课成绩

        // 构造方法
        public Student(String id, String name, double score1, double score2, double score3) {
            this.id = id;
            this.name = name;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }

        // 计算平均分
        public double getAverage() {
            return (score1 + score2 + score3) / 3.0;
        }

        // 获取学生信息的字符串表示
        @Override
        public String toString() {
            return String.format("学号：%s, 姓名：%s, 课程1：%.1f, 课程2：%.1f, 课程3：%.1f, 平均分：%.1f",
                    id, name, score1, score2, score3, getAverage());
        }
    }

    public static void main(String[] args) {
        // 创建学生对象数组
        Student[] students = {
            new Student("001", "张三", 85, 90, 78),
            new Student("002", "李四", 92, 88, 76),
            new Student("003", "王五", 84, 95, 80)
        };

        // 找出平均分最高的学生
        Student bestStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > bestStudent.getAverage()) {
                bestStudent = students[i];
            }
        }

        // 输出所有学生信息
        System.out.println("所有学生信息：");
        for (Student student : students) {
            System.out.println(student);
        }

        // 输出平均分最高的学生信息
        System.out.println("\n平均分最高的学生：");
        System.out.println(bestStudent);
    }
}
