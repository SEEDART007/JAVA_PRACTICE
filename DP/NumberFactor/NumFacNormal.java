package NumberFactor;

public class NumFacNormal {
    public static void main(String[] args) {
        System.out.println(numWays(5));
    }

    static int numWays(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 1;
        if(n==3) return 2;
        return numWays(n-1) + numWays(n-3) + numWays(n-4);
    }
}
