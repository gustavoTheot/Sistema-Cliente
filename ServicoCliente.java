import java.util.ArrayList;

public class ServicoCliente {
    private String tipoServico;
    private double valorServico;
    private double minhaTaxa;
    private ArrayList<Pessoa> pessoas;

    public ServicoCliente(String tipoServico, double valorServico, double minhaTaxa, ArrayList<Pessoa> pessoas){
        this.tipoServico = tipoServico;
        this.valorServico = valorServico;
        this.minhaTaxa = minhaTaxa;
        this.pessoas = pessoas;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public double getMinhaTaxa() {
        return minhaTaxa;
    }

    public void setMinhaTaxa(double minhaTaxa) {
        this.minhaTaxa = minhaTaxa;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void addPessoas(Pessoa p){
        this.pessoas.add(p);
    }

    public ArrayList<Pessoa> pesquisarPeloNome(String nome){
        ArrayList<Pessoa> pessoasPeloNome = new ArrayList<>();

        for(Pessoa p: this.pessoas){
            if(p.getNome().equals(nome)){
                pessoasPeloNome.add(p);
            }
        }

        return pessoasPeloNome;
    }

    public ArrayList<Pessoa> pesquisarPeloCpf(String cpf){
        ArrayList<Pessoa> pessoasPeloCpf = new ArrayList<>();

        for(Pessoa p: this.pessoas){
            if(p.equals(cpf)){
                pessoasPeloCpf.add(p);
            }
        }

        return pessoasPeloCpf;
    }

    public String toString(){
        return "Tipo do serviço: " +this.tipoServico+ "\nValor do serviço: " +this.valorServico+ "\nMinha taxa: " +this.minhaTaxa+ "\n" + this.pessoas;
    }
    
}
