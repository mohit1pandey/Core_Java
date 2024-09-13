package learn.java;

public class J_08BreakContinue {
    public static void main(String[] args) {

        int i;
        for (i=1;i<=10;i++){

            if(i==4){ //4 is skipped so wont print
                continue;
            }
            if(i==8) break; // break at 8 so next line wont execute.
            System.out.println(i);
        }
    }
}
