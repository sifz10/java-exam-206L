public class UserDefined {
    static void checkEligibility(int age, int student_weight) {
        if (age < 5 || age > 8) {
            throw new ArithmeticException("Student's age too low or high ");
        } else if (student_weight < 15 || student_weight > 35) {
            throw new ArithmeticException("Student's weight too low or high");
        } else {
            System.out.println("Student Entry Valid");
        }
    }

    public static void main(String args[])
    {
        System.out.println("Welcome to Registration...");
        checkEligibility(6, 16);
        System.out.println("Well Done");
    }
}
