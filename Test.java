import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // new serviço cliente
        ServicoCliente s1 = new ServicoCliente("Renovação", 120, 100, new ArrayList<Pessoa>());

        // new pessoa física
        PessoaFisica pf1 = new PessoaFisica("Gustavo", "29-05", new ArrayList<Veiculo>(), "15535948780");
        Veiculo fordK = new Veiculo("OJM-2346");

        PessoaFisica pf2 = new PessoaFisica("Eduarda", "09-05", new ArrayList<Veiculo>(), "19992883771");
        Veiculo bmw = new Veiculo("OGF-2246");

        // add veiculo pessoa física
        pf1.addVeiculo(fordK);
        pf2.addVeiculo(bmw);

        // new pessoa jurídica
        PessoaJuridica pj1 = new PessoaJuridica("Dr. Junior", "29-05", new ArrayList<Veiculo>(), "8823-122.33");
        Veiculo forKEmpresario = new Veiculo("OJM-2346");

        // add veiculo pessoa jurídica
        pj1.addVeiculo(forKEmpresario);

        // add pessoa em servioCliente
        s1.addPessoas(pf1);
    

        // prints
        System.out.println(pf1);
        System.out.println("===============================");
        System.out.println(pf2);
        System.out.println("===============================");
        System.out.println(pj1);

        // print serviços
        System.out.println("===============================");
        System.out.println(s1);
    }
}
