public class apoliceresidencial implements apolice {
    @Override
    public void criarApolice() {
        System.out.println("Enviando E-mail: " + mensagem);
    }

    @Override
    public double calcularPremioMensal(double premio) {
        double imovel = 500000;
        premio = (imovel/100)/12;
        System.out.println("Valor do prêmio: " + premio);
        return premio;
    }

    @Override
    public void imprimirResumo() {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}