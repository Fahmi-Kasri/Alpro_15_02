import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Euclidean {
static final int EXTEUCLID_RET_ARRAY_SIZE = 3;
static final int INDEX_GCD = 0;


static int gcd(int a, int b){
    int A = a;
    int q = 0;
    int B = b;
    int r = 0;
    
    while (B!=0){
        q = A/B;
        r = A-q*B;
        A = B;
        B = r;
    }
    return A;
}
    public static void main(String[] args) {
        int a = 45;
        int b = 36;
        System.out.println("gcd("+a +","+b +")="+ Euclidean.gcd(a, b));
    }
}
