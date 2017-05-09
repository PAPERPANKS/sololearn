/**
 * error
 */
//package java;
class error {

    public static void main(String[] args) {
        int ans,a=10;
        int b,c;
        b=c=5;
        try {
            ans=a/(b-c+1);
            System.out.println(ans);
        } catch (ArithmeticException  e) {
            System.out.println("divided by zero");
        }
        System.out.println("exited");
    }
}