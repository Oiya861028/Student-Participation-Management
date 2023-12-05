public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private boolean like_CS;
    private int[] participation_grade = new int[10];
    private int gradeCounter = 0;

    public Student(){
        name = "Pokemon";
        gradeLevel = 9;
        gpa = 75;
        like_CS = true;

    }
    public Student(String name, int gradeLevel, double gpa, boolean like_CS){
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.like_CS = like_CS;
    }
    public String getName(){
        return name;
    }
    public double getGPA(){
        return gpa;
    }
    public void add_participation(int grades){
        participation_grade[gradeCounter] = grades;
    }
}
