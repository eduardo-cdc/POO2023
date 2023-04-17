public class ProdutoMain {
    public static void main(String[] args) {
        Produto p = new Produto(123, 2, 50.0, 1);
        double desconto = p.calculaDesconto();
        double valorFinal = p.valorFinal();
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}

class Produto {
    private int codigo;
    private int quantidade;
    private double valorUnitario;
    private int formaPagamento;

    public Produto(int codigo, int quantidade, double valorUnitario, int formaPagamento) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.formaPagamento = formaPagamento;
    }

    public double calculaDesconto() {
        double desconto = 0;
        switch (formaPagamento) {
            case 1: // Dinheiro
                desconto = valorUnitario * quantidade * 0.1;
                break;
            case 2: // Cheque
                desconto = valorUnitario * quantidade * 0.02;
                break;
            case 3: // Cartão débito
                desconto = valorUnitario * quantidade * 0.05;
                break;
            case 4: // Cartão crédito
                desconto = 0;
                break;
            default:
                System.out.println("Forma de pagamento inválida!");
        }
        return desconto;
    }

    public double valorFinal() {
        double valorComDesconto = valorUnitario * quantidade - calculaDesconto();
        return valorComDesconto;
    }
}
