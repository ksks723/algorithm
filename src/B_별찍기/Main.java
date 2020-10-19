package B_별찍기;

public class Main {
    public void solution(int n) {
        for (int i = 0; i<n ; i++) {
            for (int j = n; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.solution(5);
    }
}