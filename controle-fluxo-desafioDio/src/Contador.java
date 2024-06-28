import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println(e.getMessage());
            
        } finally {
            scanner.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois ) {
            throw new ParametrosInvalidosException("O parâmetro um é maior que o parâmetro dois");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println(parametroUm + i);
        }
    }

}
