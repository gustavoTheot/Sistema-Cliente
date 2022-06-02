import java.util.ArrayList;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String dataPresString, ArrayList<Veiculo>veiculos, String cpf){
        super(nome, dataPresString, veiculos);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
