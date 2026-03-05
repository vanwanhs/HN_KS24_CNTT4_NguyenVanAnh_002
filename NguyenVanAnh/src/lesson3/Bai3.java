import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.trim().isEmpty()){
            System.out.println("Lỗi chuỗi không được để trống");
            return;
        }
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c =='[' || c =='{'){
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}'){
                if(stack.isEmpty()){
                    System.out.println("Khoong hợp lệ!");
                    return;
                }
                char top =stack.pop();
                if((c==')' && top != '(') ||
                        (c==']' && top != '[')||
                        (c=='}' && top != '{')

                ){
                    System.out.println("Khoong hopwj lej");
                    return;
                }
            }

        }
        if(stack.isEmpty()){
            System.out.println("Hợp lệ");
        } else{
            System.out.println("KHông hợp lệ");
        }
    }
}
