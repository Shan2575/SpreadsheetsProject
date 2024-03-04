public class Test1{
    public static void generate() {
        int count = 0;
        int sum = 0;
        int n = (int)(Math.random() * 100 + 1);
        while(n % 2 == 0) {
            System.out.print(n + " ");
            count++;
            sum = sum + n;
            n = (int)(Math.random() * 100 + 1);
        }
        System.out.printf("%d count = %d sum = %d\n",n,count,sum);
    }

}
