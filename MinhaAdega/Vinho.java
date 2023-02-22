import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vinho {
    private String nome;
    private String tipo;
    private String marca;
    private int volumeEmMl;
    private LocalDate data;
    private double valor;

    Vinho(String nome,String tipo, String marca, int volumeEmMl, LocalDate data, double valor){
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
        this.volumeEmMl = volumeEmMl;
        this.data = data;
        this.valor = valor;
    }

    Vinho(String nome,String tipo, String marca, int volumeEmMl) {
        this.nome = nome;
        this.tipo = tipo;
        this.marca = marca;
        this.volumeEmMl = volumeEmMl;
        this.data = null;
        this.valor = 0;
    }

    Vinho(){
        this.nome = "";
        this.tipo = "";
        this.marca = "";
        this.volumeEmMl = 0;
        this.data = null;
        this.valor = 0;
    }

    public void setNome(String nome){this.nome = nome;}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVolumeEmMl(int volumeEmMl) {
        this.volumeEmMl = volumeEmMl;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome(){return this.nome;}
    public String getTipo() {
        return this.tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getVolumeEmMl() {
        return this.volumeEmMl;
    }

    public LocalDate getData() {
        return this.data;
    }

    public double getValor() {
        return this.valor;
    }
}