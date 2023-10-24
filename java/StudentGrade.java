import java.util.Scanner;

public class StudentGrade {

  String name;
  int marathi, hindi, english, science, history, math, finall, count, id;

  void inputStud() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the rollno : ");
    id = scanner.nextInt();
    System.out.print("Enter the Name : ");
    name = scanner.next();
    System.out.print(" Marathi markas ");
    marathi = scanner.nextInt();
    System.out.print(" hindi markas ");
    hindi = scanner.nextInt();
    count = marathi + hindi;
    System.out.print(" english markas ");
    english = scanner.nextInt();
    count = count + english;
    System.out.print(" math markas ");
    math = scanner.nextInt();
    count = count + math;
    System.out.print(" science markas ");
    science = scanner.nextInt();
    count = count + science;
    System.out.print(" history markas ");
    history = scanner.nextInt();
    count = count + history;
    int per = (count / 6) * 100;
    finall = per / 100;
    scanner.close();
  }

  void display() {
    System.out.println("Student id is : " + id);
    System.out.println("Student Name is : " + name);
    System.out.println("Marathi marks is : " + marathi);
    System.out.println("Hindi marks is : " + hindi);
    System.out.println("English marks is : " + english);
    System.out.println("Math marks is : " + math);
    System.out.println("Science marks is : " + science);
    System.out.println("History marks is : " + history);
  }

  void studGrade() {
    if (finall > 90 && finall <= 100) {
      System.out.println(
        " roll no is : " + id + " and Name is " + name + " they have 'A' grade"
      );
    } else if (finall > 80 && finall <= 90) {
      System.out.println(
        " roll no is : " +
        id +
        " and Name is " +
        name +
        " they have a 'B' grade"
      );
    } else if (finall > 70 && finall <= 80) {
      System.out.println(
        " roll no is : " +
        id +
        " and Name is " +
        name +
        " they have a 'C' grade"
      );
    } else if (finall > 60 && finall <= 70) {
      System.out.println(
        " roll no is : " +
        id +
        " and Name is " +
        name +
        " they have a 'D' grade"
      );
    } else if (finall > 50 && finall <= 60) {
      System.out.println(
        " roll no is : " +
        id +
        " and Name is " +
        name +
        " they have a 'F' grade"
      );
    }
  }

  public static void main(String[] args) {
    StudentGrade sg = new StudentGrade();
    sg.inputStud();
    sg.display();
    sg.studGrade();
  }
}
