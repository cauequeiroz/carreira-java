class Somatorio {
    public static void main(String[] args) {
        int soma = 0;

        for (int i=1; i<=1000; i++) {
            soma += i;
        }

        System.out.println("O somatório de 1 até 1000 é " + soma);
    }
}