public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lancamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô  que vale apena assistir!");
        }

        if(incluidoNoPlano || tipoPlano.equals("Plus")){
            System.out.println("Filme liberado!");
        }else {
            System.out.println("Deve pagar a locação");
        }



    }
}
