import java.time.LocalDate;

public class Adega {
    private Vinho matrixVinho[][];

    Adega(){
        matrixVinho = new Vinho[20][10];
    }

    public boolean ehPosicaoValida(int x, int y){
        if (matrixVinho[x][y] == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void setVinho(int x, int y, Vinho vinho){
        if (ehPosicaoValida(x, y)){
            matrixVinho[x][y] = vinho;
        }
    }

    public void setVinho(Vinho vinho){

        int x = (int) (Math.random()*20);
        int y = (int) (Math.random()*10);

        if (ehPosicaoValida(x, y)){
            matrixVinho[x][y] = vinho;
        }
    }

    public void getQtdeVinhoPorTipo(){
        int totalBranco=0,totalTinto=0;

        for(int i=0 ; i<20 ; i++){
            for(int j=0; j<10 ; j++){

                if(matrixVinho[i][j] != null){

                    if(matrixVinho[i][j].getTipo().toLowerCase().equals("branco")){
                        totalBranco++;
                    }
                    else{
                        totalTinto++;
                    }
                }
            }
        }
        System.out.println("Branco: "+ totalBranco);
        System.out.println("Tinto: "+ totalTinto);
    }

    public int getQuantidadeGarrafasCadastradas(){
        int total = 0;

        for(int i = 0 ; i < 20 ; i++){
            for(int j = 0; j < 10 ; j++) {

                if (matrixVinho[i][j] != null) {
                    total++;
                }
            }
        }

        return total;
    }

    public double getSomatorioValoresAdega(){
        double total = 0.0;

        for(int i=0 ; i<20 ; i++){
            for(int j=0; j<10 ; j++){

                if(matrixVinho[i][j] != null) {
                    total += matrixVinho[i][j].getValor();
                }
            }
        }

        return total;
    }

    public String getVinhoMaisAntigo(){

        LocalDate menor = LocalDate.now();
        String vinhoAntigo = "";

        for(int i = 0 ; i < 20 ; i++){
            for(int j = 0; j < 10 ; j++){

                if(this.matrixVinho[i][j] != null && this.matrixVinho[i][j].getData() != null){
                    if(menor.isAfter(this.matrixVinho[i][j].getData())){
                        menor = this.matrixVinho[i][j].getData();
                        vinhoAntigo = this.matrixVinho[i][j].getNome();
                    }
                }
            }
        }

        return vinhoAntigo;
    }

    public void removeVinho(int x, int y){

        if(matrixVinho[x][y] != null){

            matrixVinho[x][y] = null;
        }
    }
}