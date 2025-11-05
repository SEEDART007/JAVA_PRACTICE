package climbingStairs;

public class climbingStairs {
    public static void main(String[] args) {
        System.out.println(noOfways(2));
        System.out.println(noOfways(3));
        System.out.println(noOfways(5));

    }
    static int noOfways(int n){
        int[] dp = new int[n+1];
        if(n==1||n==2) return n;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]; 
        }

        return dp[n];

    }
}
