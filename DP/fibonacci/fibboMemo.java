package fibonacci;
import java.util.HashMap;

public class fibboMemo{
    public static void main(String args[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println(fiboMemo(4, map));
    }

    static int fiboMemo(int n , HashMap<Integer,Integer> map){
        if(n<2) return n;
        map.put(n,fiboMemo(n-1, map)+fiboMemo(n-2, map));

        return map.get(n);
    }
}