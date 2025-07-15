import java.util.*;
public class PascalTriangle {
    public static List<Integer> generateRows(int row){
        int ans=1;
        List<Integer> nrow=new ArrayList<>();
        nrow.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            nrow.add(ans);
        }
        return nrow;
    }
    public static List<List<Integer>> solution(int n){
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(generateRows(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans= solution(5);
        System.out.println(ans);
    }
}
