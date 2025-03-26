package Ex_Caixa_Supermercado;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto loja:
        Loja loja = new Loja(223.1, "Vendas e CIA", "111111/01", "Rua Antonio Carlos, 181");

        // Criando o objeto cliente:
        Cliente cliente = new Cliente(1, "Pedro Dilly", "13/09/1999", "111111111-11");

        // Criando o objeto compra:
        Compra compra = new Compra(cliente, loja);

        // Criando os objetos item e enviando para o metodo adicionarItem();
        Item item1 = new Item(1, "Arroz Noturno", 5, 32.53);
        compra.adicionarItem(item1);
        Item item2 = new Item(2, "Feijão Amigo", 3, 52.45);
        compra.adicionarItem(item2);
        Item item3 = new Item(3, "Batata Corada", 2, 18.75);
        compra.adicionarItem(item3);

        // Chamando o metodo gerarCupomFiscal();
        compra.gerarCupomFiscal();
    }
}
