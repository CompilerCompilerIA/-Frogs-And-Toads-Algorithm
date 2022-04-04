import java.util.Stack;

public class Solution {
    public String init(int n) {
        int slides = 2*n;
        int hops = n*n;
        int total_mov= slides+ hops;
        return printer(solver(n), slides, hops, total_mov, n);
    }

    public String solver(int n) {
        String answ = "";
        String element;
        Stack<String> stack = new Stack<>();
        stack.push("S");
        for(int i = 0 ; i < n; i++){
            answ = answ + "S ";
            element = "S ";
            for(int j = 0 ; j <= i; j++){
                answ = answ +"H ";
                if(j != 0){
                    element = element + "H ";
                }
            }
            stack.push(element);
        }
        String st;
        for(int i = 0 ; i < n; i++){
            st = stack.pop();
            answ = answ + st;
        }
        return answ;
    }

    public String printer(String ans,int slides,int hops, int total_mov, int n){
        String print_format="";
        print_format = "******FROGS AND TOADS ALGORITHM******" + "\n";
        print_format = print_format + "n         : " + n + "\n";
        print_format = print_format + "Solution  : " + ans + "\n";
        print_format = print_format + "Slides    : " + slides + "\n";
        print_format = print_format + "Hops      : " + hops + "\n";
        print_format = print_format + "Total Mov.: " + total_mov + "\n";
        return print_format;
    }
}
