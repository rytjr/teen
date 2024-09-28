import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int Num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < Num; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int number = Integer.parseInt(st.nextToken());

            if(number == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            if(number == 2) {
                if(stack.empty()) {
                    bw.write(-1 + "\n");
                }
                else {
                    bw.write(stack.pop() + "\n");
                }
            }
            if(number == 3) {
                bw.write(stack.size() + "\n");
            }
            if(number == 4) {
                if(stack.empty()) {
                    bw.write(1 + "\n");
                }
                else {
                    bw.write(0 + "\n");
                }
            }
            if(number == 5) {
                if(stack.empty()) {
                    bw.write(-1 + "\n");
                }
                else {
                    bw.write(stack.peek() + "\n");

                }
            }

        }
        bw.flush();
        bw.close();
    }

}