package ca.sheridancollege.week1.softwarefundamentals;

/**
 * This class +++Insert Description Here+++
 *
 * @author Svetlana Komarova
 *
 */
public class StudentList {

    public static void main(String[] args) {

        //1. Create an array of Students
        Student[] sList = new Student[5];

        //2. Put names in the array
        for (int i = 0; i < sList.length; i++) {

            sList[i] = new Student();
            sList[i].setName("Student" + (i + 1));
        }

        //3. Print the array
        for (Student s : sList) {
            System.out.println("The Student name is: " + s.getName());
        }

    }

}
