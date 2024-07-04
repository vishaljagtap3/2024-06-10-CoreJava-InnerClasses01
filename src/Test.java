public class Test {
    private int id;
    private String title;
    private Student student;
    private Subject subject;

    public Test(int testId, String testTitle, int roll, String studName, int subId, String subTitle, int subMarks) {
        this.id = testId;
        this.title = testTitle;
        this.student = this.new Student(roll, studName);
        this.subject = new Subject(subTitle, subMarks, subId);
    }

    //not useful
   /* public Test(int id, String title, Student student, Subject subject) {
        this.id = id;
        this.title = title;
        this.student = student;
        this.subject = subject;
    }*/

    public void display() {
        System.out.println(id + " " + title);
        student.display();
        subject.display();
    }

    class Subject {
        private String subTitle;
        private int subMarks;
        private int subId;

        public Subject(String subTitle, int subMarks, int subId) {
            this.subTitle = subTitle;
            this.subMarks = subMarks;
            this.subId = subId;
        }

        public void display() {
            System.out.println(subTitle + " " + subMarks + " " + subId);
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public int getSubMarks() {
            return subMarks;
        }

        public void setSubMarks(int subMarks) {
            this.subMarks = subMarks;
        }

        public int getSubId() {
            return subId;
        }

        public void setSubId(int subId) {
            this.subId = subId;
        }
    }

    class Student {
        private int roll;
        private String studentName;

        public Student(int roll, String studentName) {
            this.roll = roll;
            this.studentName = studentName;
        }

        public void display() {
            System.out.println(roll + " " + studentName);
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }
    }
}




