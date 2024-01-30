package pack_inheritance;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Student\n2.Faculty");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
            {
                Student student = new Student();
                System.out.println("enter your age ");
                int age = scanner.nextInt();
                System.out.println("entre your name");
                String name = scanner.next();
                System.out.println("enter the department ");
                String dept = scanner.next();
                System.out.println("enter the roll no");
                int rno = scanner.nextInt();
                System.out.println("enter the semester ");
                int sem = scanner.nextInt();
                System.out.println("enter the persentage ");
                float persent = scanner.nextFloat();
                student.setAge(age);
                student.setName(name);
                student.setDname(dept);
                student.setRno(rno);
                student.setSem(sem);
                student.setPer(persent);
                System.out.println("your age is " + student.getAge());
                System.out.println("your name is " + student.getName());
                System.out.println("your branch is " + student.getDname());
                System.out.println("your roll is " + student.getRno());
                System.out.println("your semester is " + student.getSem());
                System.out.println(" your percentage is " + student.getPer());
            }
            break;
            case 2:
            {
                Faculty faculty = new Faculty();
                System.out.println("enter the experience ");
                int exp = scanner.nextInt();
                System.out.println("enter the salary you want");
                int sal = scanner.nextInt();
                faculty.setExperience(exp);
                faculty.setSalary(sal);
                System.out.println("you have experience " + faculty.getExperience());
                System.out.println("your is salary is " + faculty.getSalary());
            }
            break;
            default:
                System.out.println("INVALID CHOICE YOU ENTER");
        }


    }
}
