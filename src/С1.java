public class С1 {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int sum = 0;

        Boolean[] inputs  = {a, b, c, d};

        for (boolean i: inputs) {
            if (i == true) {
                sum++;
            }
        }

        if (sum == 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        boolean A = false;
        boolean B = true;
        boolean C = true;
        boolean D = true;

        System.out.println(booleanExpression(A,B,C,D));
    }
}
