public class learn04 {
    static int baggage (int n){
        int result = 0;
        result = n*n+n+41;
        return result;
    } 
    // public static void main(String[] args) {
    //     int n = baggage(5);
    //     System.out.println("素数为"+n);
    // }
    public static void main(String[] args) {
        int n = 0;
        System.out.print("n<=40时素数有：");
        for (int i = 0; i < 40; i++) {
            n = baggage(i);
            System.out.print("\t"+n);
        }
    }
    
}
