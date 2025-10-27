package HouseRobbery;

public class HouseRobTopDown {
    public static void main(String[] args) {
        int[] houseWorth = new int[7];
        int[] dp = new int[7];
        houseWorth[0] = 6;
        houseWorth[1] = 7;
        houseWorth[2] = 1;
        houseWorth[3] = 30;
        houseWorth[4] = 8;
        houseWorth[5] = 2;
        houseWorth[6] = 4;
        System.out.println(maxHouseRob(houseWorth, 0, dp));
       

    }
    static int maxHouseRob(int[] houseWorth , int currInx , int[] dp){
        if(currInx>=houseWorth.length) return 0;
        if(dp[currInx]==0){
            int stealCurr = houseWorth[currInx] + maxHouseRob(houseWorth, currInx+2, dp);
            int skipCurr = maxHouseRob(houseWorth, currInx+1, dp);
            dp[currInx] = Math.max(stealCurr,skipCurr);
        }
        return dp[currInx];
    }
}
