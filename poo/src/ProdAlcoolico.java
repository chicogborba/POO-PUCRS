public class ProdAlcoolico extends Product {

    private static double taxaAlcool;

    public ProdAlcoolico(int umCodigo, String umNome, double umPreco) {
        super(umCodigo, umNome, umPreco);
    }

    public static void setTaxaAlcoolica(double novaTaxa) {
        taxaAlcool = novaTaxa;
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + (super.getPrice() * taxaAlcool / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " taxa alcool: " + taxaAlcool;
    }

}