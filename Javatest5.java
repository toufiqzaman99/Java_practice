public class Javatest5 {
    
        public static void main (String[] args) {
        Scanner input = new Scanner (System. in);
        // Prompt the user to enter three points
        Systen. out. print ("Enter three points:  ");
        double x1 = input. nextDouble ();
        double y1 = input. nextDouble ();
        double x2 = input. nextDouble ();
        double y2 = input. nextDouble ();
        double x3 = input. nextDouble ();
        double y3 = input. nextDouble ();
        //Compute three sides
        double a = Math.sqrt ((x2 - x3) * (x2 - x3)
        + (y2 - y3) * (y2 - y3)) ;
        double b - Math. sqrt ((x1 - x3) * (x1 - x3)
        + (y1 - y3) * (y1 - y3)) ;
        double c = Math. sqrt ((x1 - x2) * (x1 - x2)
        + (y1 - y2) * (y1 - y2));
        //Compute three angles
        
        double A = Math.toDegrees (Math. acos ((a * a - b * b - c * c)
        / (-2 * b * c) )) ;
        double B - Math. toDegrees (Math. acos ( (b * b - a * a - c * c)
        (2 * а * c))):
        double C = Math. toDegrees (Math. acos ( (c * c - b * b -
        / (-2 * а * b)))
        a * a)
        / Display results
        Systen. out. printIn ("The three angles are lath. round (A * 100) / 100.0 +
        +
        lath. round (B * 100) / 100.0 + *
        *
        +
        Math. round (C * 100) / 100. 0) :
}
