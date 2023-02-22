import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("!! Bem vindo a Adega !!");

        LocalDate today = LocalDate.now();

        Vinho cabernet = new Vinho("Vinho Chileno Reservado Cabernet Sauvignon","Tinto","Concha y Toro", 750,today,30.90);

        Vinho Rose = new Vinho("Vinho Reservado Rosé", "Branco", "Concha y Toro",750);
        Rose.setData(LocalDate.of(2022,1,1));

        Vinho vinhoAleatorio = new Vinho();

        Adega minha = new Adega();
        minha.setVinho(0,0,cabernet);
        minha.setVinho(Rose);

        minha.getQtdeVinhoPorTipo();
        System.out.println("Possui " + minha.getQuantidadeGarrafasCadastradas() + " garrafas cadastradas");
        System.out.println("Valor total dos vinhos da adega: R$ " + minha.getSomatorioValoresAdega());
        System.out.println("Vinho mais antigo: " + minha.getVinhoMaisAntigo());

        minha.setVinho(0,1,vinhoAleatorio);
        System.out.println("Possui " + minha.getQuantidadeGarrafasCadastradas() + " garrafas cadastradas");
        minha.removeVinho(0,1);

        System.out.println("Possui " + minha.getQuantidadeGarrafasCadastradas() + " garrafas cadastradas");
    }

}

