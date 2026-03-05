import java.util.*;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Integer> studentList = new ArrayList<>();
            System.out.println("Nhập số lượng điểm tuyệt đối: ");
            int n = sc.nextInt();
            if(n == 0 ){
                System.out.println(" số lượng không hợp lệ");
                return;
            }
            for(int i = 0; i<n; i++){
                System.out.println("Mã số sinh viên thứ " + (i + 1));
                studentList.add(sc.nextInt());
            }
            Set<Integer> studentSet = new HashSet<>(studentList);
            for(Integer student : studentSet){
                System.out.println(student);
            }
            System.out.println("Tổng số học sinh đạt học bổng: "+ studentSet.size());
        }
}
