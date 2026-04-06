public class Triangle {
    public static void main(String[] args) {
        
        // Loop for 3 rows
        for (int i = 1; i <= 3; i++) {
            
            // Number of stars = 2*i - 1
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            
            System.out.println(); // move to next line
        }
    }
}
