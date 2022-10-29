import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
// import java.util.HashMap;
import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        List<Funcionario> novaListaFuncionarios;
        Stream<Funcionario> listaFuncionario;

        // 3.1 – Inserir todos os funcionários

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Maria", "18/10/2000", new BigDecimal("2009.44"), "Operador"),
                new Funcionario("João", "12/05/1990", new BigDecimal("2284.38"), "Operador"),
                new Funcionario("Caio", "02/05/1961", new BigDecimal("9836.14"), "Coordenador"),
                new Funcionario("Miguel", "14/10/1988", new BigDecimal("19119.88"), "Diretor"),
                new Funcionario("Alice", "05/01/1995", new BigDecimal("2234.68"), "Recepcionista"),
                new Funcionario("Heitor", "19/11/1999", new BigDecimal("1582.72"), "Operador"),
                new Funcionario("Arthur", "31/03/1993", new BigDecimal("4071.84"), "Contador"),
                new Funcionario("Laura", "08/07/1994", new BigDecimal("3017.45"), "Gerente"),
                new Funcionario("Heloísa", "24/05/2003", new BigDecimal("1606.85"), "Eletricista"),
                new Funcionario("Helena", "02/09/1996", new BigDecimal("2799.93"), "Gerente"));

        // 3.2 – Remover o funcionário “João” da lista.

        listaFuncionario = funcionarios.stream().filter(nomes -> nomes.getNome() != "João");
        novaListaFuncionarios = listaFuncionario.collect(Collectors.toList());

        // 3.3 – Imprimir todos os funcionários com todas suas informações
        novaListaFuncionarios.forEach(print -> System.out.println(print));

        // não consegui trabalhar com o BigDecimal para fazer o 3.4 – Os funcionários
        // receberam 10% de aumento de salário

        // 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função”
        // e o valor a “lista de funcionários”.
        // Também não consegui fazer o 3.5

        // Map<String, List<String>> mapFuncionario = new HashMap<>();

        // novaListaFuncionarios.stream().map(values -> {
        // if (values.getFuncao() == null) {
        // mapFuncionario.put(values.getFuncao(), values.getNome());
        // }
        // else {
        // mapFuncionario.put(values.getFuncao(), values.getNome());
        // }

        // }).forEach(print -> System.out.println(print));

        // 3.6 – Imprimir os funcionários, agrupados por função.
        // System.out.println("3.6 – Imprimir os funcionários, agrupados por função.");

        Collections.sort(novaListaFuncionarios, Comparator.comparing(Funcionario::getFuncao));
        novaListaFuncionarios.forEach(print -> System.out.println(print));

        // 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.

        // 3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e
        // idade.

        // 3.10 – Imprimir a lista de funcionários por ordem alfabética.
        // System.out.println(3.10 – Imprimir a lista de funcionários por ordem alfabética.);
        Collections.sort(novaListaFuncionarios, Comparator.comparing(Funcionario::getNome));
        novaListaFuncionarios.stream().map(nomeFuncionario -> nomeFuncionario.getNome())
                .forEach(print -> System.out.println((print)));

        // 3.11 – Imprimir o total dos salários dos funcionários.

        // 3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando
        // que o salário mínimo é R$1212.00.

    }
}
