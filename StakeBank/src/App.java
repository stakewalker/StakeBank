public class App {
        // Gerando clientes
        Cliente conta1 = new Cliente("Thomas Anderson", 4321);
        Cliente conta2 = new Cliente("Lara Croft", 4322);

        // Alterando e exibindo os atributos dos clientes
        conta1.setNome("Luke Skywalker");
        conta1.setCodigo(1000);
        conta2.setNome("Ada Lovelace");
        conta2.setCodigo(1001);

        System.out.println("Cliente 1 - Nome: " + conta1.getNome() + ", Código: " + conta1.getCodigo());
        System.out.println("Cliente 2 - Nome: " + conta2.getNome() + ", Código: " + conta2.getCodigo());

        // Criando dois cartões de crédito
        CartaoCredito cartao1 = new CartaoCredito("1111-2222-3333-4444", "10/29");
        CartaoCredito cartao2 = new CartaoCredito("5555-6666-7777-8888", "01/27");

        // Alterando e exibindo os valoresdo cartão de crédito
        cartao1.setNumero("4444-1111-2222-3333");
        cartao1.setDataValidade("07/31");
        cartao2.setNumero("7777-5555-8888-6666");
        cartao2.setDataValidade("11/28");

        System.out.println("Cartão 1 - Número: " + cartao1.getNumero() + ", Data de Validade: " + cartao1.getDataValidade());
        System.out.println("Cartão 2 - Número: " + cartao2.getNumero() + ", Data de Validade: " + cartao2.getDataValidade());

        // Gerando uma agência e exibindo atributos
        Agencia agencia = new Agencia(123);
        System.out.println("Agência - Número: " + agencia.getNumero());
}