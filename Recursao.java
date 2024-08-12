public class Recursao {
    public static void main(String[] args) {
        System.out.println(funcaoRecursiva(10));
    }

    public static int funcaoRecursiva(int n) {
        if (n <= 0) {
            return 0;
        }
        return funcaoRecursiva(n - 1) + 1;
    }
}