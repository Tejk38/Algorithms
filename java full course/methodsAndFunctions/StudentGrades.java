package methodsAndFunctions;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        grade(n);

    }
    static void grade(int n){


          if(100>=n && n>=91){System.out.println("AA");};
          if(81>=n && n>=90){System.out.println("AB");};
          if(71>=n && n>=80) { System.out.println("BB");};

          if (61>=n && n>=70) {System.out.println("BC");};
          if (51>=n && n>=60)  {System.out.println("CC");};
          if (41>=n && n>=50) {System.out.println("CD");};

          if (n<40){
              System.out.println("fail") ;};



      }
    }

