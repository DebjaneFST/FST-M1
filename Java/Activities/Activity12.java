package activities;

//Functional interface
interface Addable {
 int add(int a, int b);
}

public class Activity12 {

 public static void main(String[] args) {

     // Lambda expression 1 → single-line
     Addable addition1 = (a, b) -> (a + b);

     // Lambda expression 2 → multi-line with return
     Addable addition2 = (int a, int b) -> {
         return (a + b);
     };

     // Test both lambda expressions
     System.out.println("Using addition1: 10 + 20 = " + addition1.add(10, 20));
     System.out.println("Using addition2: 100 + 200 = " + addition2.add(100, 200));
 }
}
