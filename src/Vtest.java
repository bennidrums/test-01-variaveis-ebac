public class V {
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo(a)! Para darmos início, qual é o seu nome completo?");
        String  nome = scanner.nextLine();

        System.out.println("Agora digite o seu CPF:");
        String CPF = scanner.nextLine();

        System.out.println("A sua idade:");
        int idade = scanner.nextInt();

        System.out.println("O seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("A sua altura:");
        double altura = scanner.nextDouble();

        scanner.close();

        System.out.println(
                "O seu nome é: " + nome +
                        ", o seu CPF: " + CPF +
                        ", a sua idade é: " + idade +
                        ", o seu peso: " + peso +
                        ", a sua altura: " + altura
        );

}