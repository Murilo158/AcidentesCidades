package candicional;

public class AcidentesCidades {

    public static void main(String[] args) {
       

        String[] cidades = {"Maringá", "Londrina", "Cascavel", "Ponta Grossa", "Foz do Iguaçu"};
        int[] veiculos = {50000, 60000, 40000, 45000, 55000};
        int[] acidentes = {30, 20, 25, 15, 35};

        

        int indiceMaiorAcidentes = 0;
        int indiceMenorAcidentes = 0;

        for (int i = 1; i < acidentes.length; i++) {
            if (acidentes[i] > acidentes[indiceMaiorAcidentes]) {
                indiceMaiorAcidentes = i;
            }
            if (acidentes[i] < acidentes[indiceMenorAcidentes]) {
                indiceMenorAcidentes = i;
            }
        }

        String cidadeMaiorAcidentes = cidades[indiceMaiorAcidentes];
        String cidadeMenorAcidentes = cidades[indiceMenorAcidentes];

        System.out.println("Cidade com maior número de acidentes: " + cidadeMaiorAcidentes);
        System.out.println("Cidade com menor número de acidentes: " + cidadeMenorAcidentes);

        

        System.out.println("\nMédias anuais de acidentes por quantidade de veículos:");
        for (int i = 0; i < cidades.length; i++) {
            double media = (double) acidentes[i] / veiculos[i];
            System.out.printf("%s: %.2f%n", cidades[i], media);
        }

       

        double mediaTotal = 0.0;
        int totalAcidentes = 0;
        int totalVeiculos = 0;

        for (int i = 0; i < cidades.length; i++) {
            totalAcidentes += acidentes[i];
            totalVeiculos += veiculos[i];
        }

        if (totalVeiculos > 0) {
            mediaTotal = (double) totalAcidentes / totalVeiculos;
        }

        System.out.printf("\nMédia total de acidentes por quantidade de veículos das cidades: %.2f%n", mediaTotal);
    }
}
