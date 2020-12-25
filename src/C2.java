public class C2 {
    public static void main(String[] args) {
        int year = 2020;
        System.out.println(leapYearCount(year));
    }

    public static int leapYearCount(int year) {
        int count = 0;

        for (int i = 1; i <= year; i++) {
            if ( i%4 == 0 ) {
                count++;
                if ( i%100 == 0 && i%400 != 0 ) {
                    count--;
                }
            }
        }

        return count;
    }
}
