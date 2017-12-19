class Fatorial {
    public static void main(String[] args) {
        long fatorial = 1;

        for (int i=1; i<=50; i++) {
            fatorial *= i;
            System.out.println("O fatorial de " + i + " é " + fatorial);
        }
    }
}