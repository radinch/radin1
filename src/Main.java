public class Main {
    public static void main(String[] args) {
        String ANSI_RED = "\u001B[41m";
        String ANSI_RESET = "\u001B[0m";
        for (int j=0;j<15;j++) {
            if(j%3==0) {
                for (int i = 0; i < 43; i++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            for (int i = 0; i < 35; i++) {
                if (i % 5 == 0)
                    System.out.print("|");
                System.out.print(ANSI_RED + "#" + ANSI_RESET);
            }
            System.out.print("|\n");
        }
        for (int i = 0; i < 43; i++) {

        }
        System.out.println();
    }
}