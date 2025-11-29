package CathlanNum;
//recursive approach
public class Catalan {
    public static void main(String[] args) {
        System.out.println(catNum(6));
    }
    static int catNum(int n){
        if(n<=1) return 1;
        int res = 0;
        for(int i=0;i<n;i++){
            res+=catNum(i)*catNum(n-i-1);
        }
        return res;
    }
}
