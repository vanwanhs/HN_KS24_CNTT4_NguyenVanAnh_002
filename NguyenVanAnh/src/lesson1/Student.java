import java.util.Objects;
public class Student {

    public class Student002 {
        private int id;
        public int count = 0;
        public Student002(int id) {
            this.id = id;
            count ++;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student002)) return false;
            Student002 student = (Student002) o;
            return id == student.id;
        }
        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
        public String toString(){
            return "MSV đạt học bổng "
                    +id;
        }
        public String totalStudent(){
            return "tổng số sinh viên "+count ;
        }
    }

}
