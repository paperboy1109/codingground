
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        
        System.out.println("Hello, Daniel\n");
     
        int myNumber;
        myNumber = 1;
        
        char myChar;
        myChar = 'y';
        
        boolean myBoolean = false;
        
        
        System.out.println(myNumber);
        System.out.println(myChar);
        System.out.println("\u00a5 123");
        
        
        // Working with arrays
        System.out.println("Working with arrays \n");
        int[] values;
        values = new int[3];
        System.out.println(values[0]);
        values[0] = 10;
        System.out.println(values[0]);
        
        int[] numbers = {1, 2, 3};
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        
        //List<String> object
        System.out.println(" === Practice with the list interface === \n");
        List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");
        System.out.println(supplierNames.get(1));
        
        //Create a course object
        System.out.println("Working with Course objects \n");
        String crn = "123";
        String subj = "Java";
        String[] courseNotes = {"Note1", "Note2"};
        Course myCourse = new Course(crn, subj, courseNotes);
        
        System.out.println(myCourse.getCrn());
        
        //Create another course object (to add to a list)
        String crn2 = "456";
        String subj2 = "Java";
        String[] courseNotes2 = {"Note1", "Note2"};
        Course yourCourse = new Course(crn2, subj2, courseNotes2);
        
        System.out.println(yourCourse.getCrn());
        
        // Create a list of Courses
        // List<String> crunchifyList = new ArrayList<String>();
        List<Course> myList = new ArrayList<Course>();
        myList.add(myCourse);
        
        
        for(int i=0; i < 5; i++){
            System.out.println("The value of i is" + i);
        }
        
        for (Course element : myList) {
        // 1 - can call methods of element
        
        if(1 < 5){
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }
        
        System.out.println(element.getCrn());

        // ...
        }
        
        
        // Add another course to the list
        myList.add(yourCourse);
        
        for (Course element : myList) {
        // 1 - can call methods of element
        System.out.println("\nIterating through myList ...");
        if(element.getCrn() == "123"){
            System.out.println("Found myCourse!");
        } else {
            System.out.println("This is not myCourse");
        }
        
        System.out.println("The CRN is: " + element.getCrn());

        // ...
        }
        
        
        
        
        
     }
     
     
     
}
