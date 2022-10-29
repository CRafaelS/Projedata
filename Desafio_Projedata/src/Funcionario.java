import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String _nome, CharSequence _data, BigDecimal salario, String funcao) {
        super(_nome, _data);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    @Override
    public String toString() {
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        return "[Nome: " + getNome() + ", Nascimento: "
                + getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/uuuu")) + ", Salario: " 
                + dinheiro.format(this.salario) + ", Função: " + this.funcao + "]";
    }
}
