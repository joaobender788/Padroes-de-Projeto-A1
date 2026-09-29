public class apoliceauto implements apolice {
    @Override
    public void criarApolice() {
        apolice apoliceauto = new apoliceauto();
    }

    @Override
    public double calcularPremioMensal(double premio) {
        double veiculo = 5000;
        double parcialpremio = (veiculo/100)*8;
        premio = parcialpremio/12;
        System.out.println("Valor do prêmio: " + premio);
        return premio;
    }

    @Override
    public void imprimirResumo() {
        
    }

}