package exercicio4;

public class Cliente {
    double faturamento;

    public Cliente(double faturamento) {
        this.faturamento = faturamento;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "faturamento=" + faturamento +
                '}';
    }
}
