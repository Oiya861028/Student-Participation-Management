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
    public int getGradeLevel(){return gradeLevel;}
    public boolean getLike_CS(){return like_CS;}
    public void add_participation(int grades){
        if(gradeCounter<10){
            participation_grade[gradeCounter] = grades;
            gradeCounter++;
        }
        if(gradeCounter==10) gradeCounter=0;
    }
    public double getAverage(){
        int sum =0;
        for(int i=0;i<participation_grade.length;i++){
            sum+= participation_grade[i];
        }
        return sum/participation_grade.length;
    }
}
