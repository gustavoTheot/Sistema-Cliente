import java.util.ArrayList;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String dataPresString, ArrayList<Veiculo> veiculos, String cnpj){
        super(nome, dataPresString, veiculos);
        this.cnpj = cnpj;
    }

    public String getCpf(){
        return cnpj;
    }

    public void setCpf(String cpf){
        this.cnpj = cpf;
    }
}
