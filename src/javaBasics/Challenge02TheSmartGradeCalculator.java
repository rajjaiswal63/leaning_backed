package javaBasics;

public class Challenge02TheSmartGradeCalculator {
    private static double calculatePercentage(int maths, int science, int english){
        return (maths+science+english)*100.0 / 300;
    }
    private static char getGrade(double per){
        if(per>=90) return 'A';
        if(per>=75 && per<=89) return 'B';
        if(per>=60 && per<=74) return 'C';
        return 'F';
    }
    private static void printRemark(char grade){
        switch (grade){
            case 'A':
                System.out.println("Excellent work!");
                break;
            case 'B':
                System.out.println("Good job, keep improving");
                break;
            case 'C':
                System.out.println("You passed, but need more practice.");
                break;
            case 'F':
                System.out.println("Failed. Try again.");
                break;
            default:
                System.out.println("Invalid Grade");

        }
    }

    public static void main(String[] args) {
        int maths=75;
        int science=70;
        int english=80;
        double per=calculatePercentage(maths,science,english);
        char grade=getGrade(per);

        System.out.println(
                "Percentage : "+ per
                +"\n"+ "Grade : "+ grade
        );
        printRemark(grade);

    }


}
