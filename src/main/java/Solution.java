
public class Solution {
    public String init(int n) {
        int slides = 2*n;
        int hops = n*n;
        int total_mov= slides+ hops;
        return printer(solver(n), slides, hops, total_mov, n);
    }
}
