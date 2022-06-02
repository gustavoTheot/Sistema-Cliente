import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String dataPresente;
    private ArrayList<Veiculo> veiculos;

    public Pessoa(String nome, String dataPresString, ArrayList<Veiculo>veiculos){
        this.nome = nome;
        this.dataPresente = dataPresString;
        this.veiculos = veiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDataPresente() {
        return dataPresente;
    }

    public void setDataPresente(String dataPresente){
        this.dataPresente = dataPresente;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos){
        this.veiculos = veiculos;
    }

    public String toString(){
        return "Nome do cliente: "+this.nome+ "\nData da presença: " +this.dataPresente+ "\nPlaca do veiculo:" +this.veiculos;
    }

    public void addVeiculo(Veiculo v){
        this.veiculos.add(v);
    }
}
