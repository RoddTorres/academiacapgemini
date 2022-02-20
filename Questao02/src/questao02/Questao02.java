package questao02;

import java.util.Scanner;

/**
 * @author Rodrigo Torres de Souza Academia Capgemini
 */
public class Questao02 {

    /**
     * Débora se inscreveu em uma rede social para se manter em contato com seus
     * amigos. A página de cadastro exigia o preenchimento dos campos de nome e
     * senha, porém a senha precisa ser forte. O site considera uma senha forte
     * quando ela satisfaz os seguintes critérios: Possui no mínimo 6
     * caracteres. Contém no mínimo 1 digito. Contém no mínimo 1 letra em
     * minúsculo. Contém no mínimo 1 letra em maiúsculo. Contém no mínimo 1
     * caractere especial. Os caracteres especiais são: !@#$%^&*()-+
     *
     * Débora digitou uma string aleatória no campo de senha, porém ela não tem
     * certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo
     * que informe qual é o número mínimo de caracteres que devem ser adiciona-
     * dos para uma string qualquer ser considerada segura.
     */
    public static void main(String[] args) {

        int senhaComprimento = 6;
        int digitos = 0;
        int maiusculas = 0;
        int minusculas = 0;
        int caracEspeciais = 0;
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Sua senha deverá conter:\n "
                + "(a) - Mínimo de 6 caracteres\n"
                + "(b) - Mínimo de 1 dígito\n"
                + "(c) - Mínimo de 1 letra maiúscula\n"
                + "(d) - Mínimo de 1 caractere especial (!, @, #, $, %,"
                + " ^, &, *, (, ), -, +)\n");

        System.out.println("Digite sua senha: ");
        String senhaDigitada = sc.nextLine();

        int senhaDigitadaComprimento = senhaDigitada.length();

        if (senhaDigitadaComprimento < senhaComprimento) {
            System.out.println("Sua senha deve conter 6 caracteres ou mais");
            int diferenca = senhaComprimento - senhaDigitadaComprimento;
            System.out.printf("Para sua senha ser válida faltam %d caracteres.", diferenca);
            return;
        } else {
            for (int i = 0; i < senhaDigitadaComprimento; i++) {
                ch = senhaDigitada.charAt(i);
                if (Character.isDigit(ch)) {
                    digitos++;
                } else if (Character.isUpperCase(ch)) {
                    maiusculas++;
                } else if (Character.isLowerCase(ch)) {
                    minusculas++;
                } else {
                    if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+') {
                        caracEspeciais++;
                    }
                }
            }
        }
        if (senhaDigitadaComprimento >= 6 && digitos != 0 && maiusculas != 0 && minusculas != 0 && caracEspeciais != 0) {
            System.out.println("SENHA VÁLIDA.");
        } else {
            System.out.println("Sua senha não é válida.");
        }

    }

}
