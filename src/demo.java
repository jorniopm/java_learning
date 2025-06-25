public class demo {
    class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person[name=" + name + ", age=" + age + "]";
        }
    }

    public static void main(String[] args) {
        demo d = new demo();
        Person p = d.new Person("Alice", 20);
        System.out.println(p);
        // 实际调用的是：p.toString()
    }
}
