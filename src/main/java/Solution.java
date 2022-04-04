
public class Solution {
    public String init(int n) {
        int slides = 2*n;
        int hops = n*n;
        int total_mov= slides+ hops;
        return printer(solver(n), slides, hops, total_mov, n);
    }

    public String solver(int n) {
        String answ = "";
        for(int i = 0 ; i < n; i++){
            answ = answ + "S ";
            for(int j = 0 ; j <= i; j++){
                answ = answ +"H ";

            }
        }
        return answ;
    }
}
