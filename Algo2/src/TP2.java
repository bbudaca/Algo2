public class TP2 {

    public static void main(String[] args) {

    }

    // @ pure
    // @ assignable \nothing;
    // requires true; // NOT MANDATORY
    // @ ensures \result == (x ><tt y ? x : y); TERNARY OPERATOR POSTCONDITION
    // OR
    // @ ensures \result == \max(x, y); JML MAX POSTCONDITION
    public static double maxExercise9(double x, double y) {
        return x > y ? x : y;
    }
}
