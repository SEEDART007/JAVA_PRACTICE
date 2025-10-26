package NumberFactor;
public class NumFacTopDown {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(facTopDown(n, dp));

    }
    static int facTopDown(int n,int[] dp){
        if(n==0||n==1||n==2){
            return 1;
        }
        if(n==3) return 2;
         if(dp[n]==0){
            int sp1 = facTopDown(n-1,dp);
            int sp2 = facTopDown(n-3, dp);
            int sp3 = facTopDown(n-4, dp);
            dp[n] = sp1+sp2+sp3;
         }
         return dp[n];
    }
}
