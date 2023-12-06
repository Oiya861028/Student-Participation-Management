import java.util.Scanner;
import java.util.Random;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();
    public static Student[] students = new Student[5];
    public static void main(String[] args){
        String[] names = {"Adam", "Bob", "Carl", "Derick", "Eric"};
        for(int i=0;i<students.length;i++){
            students[i] = new Student(names[i], (int) (Math.random() * 4) +9, (double) Math.random()*100+1, random.nextBoolean());
        }
        boolean quit = false;
        while(!quit){
            System.out.println("Enter 1-4(1. Random student. 2. add grade 3. print average 4. quit)");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    Student randomStudent = students[(int)Math.random()*students.length];
                    String name = randomStudent.getName();
                    int gradeLevel = randomStudent.getGradeLevel();
                    boolean like_CS = randomStudent.getLike_CS();
                    double gpa = randomStudent.getGPA();
                    System.out.println("Student name: "+name +". Grade Level: "+gradeLevel+". Like_CS: " + like_CS +". GPA: "+ gpa);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter the name of the student you want to add grade for:");
                    String inputName = sc.nextLine();
                    boolean nameFound = false;
                    for(int i=0;i<names.length && !nameFound;i++){
                        if(inputName.equals(names[i])){
                            System.out.println("Enter the grade you want to add:");
                            int grade = sc.nextInt();
                            students[i].add_participation(grade);
                            nameFound = true;
                        }
                    }
                    if(nameFound==false) System.out.println("Name not found");
                    break;
                case 3:
                    double sum = 0;
                    for (int i=0;i<students.length;i++){
                        sum += students[i].getAverage();
                    }
                    System.out.println("The average grade among all student is "+(sum/students.length));
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input. Try again:");
                    break;
            }

        }



    }

}
