public class App {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();

        f1.setNome("Dalton");
        f1.setCpf("52352354534");
        f1.setDepartamento("T.I");
        f1.setSalario(4000.0);

        System.out.println("O nome do/a funcionário/a é " + f1.getNome());
        System.out.println("O CPF do/a " + f1.getNome() + " é: " + f1.getCpf());
        System.out.println("O Departamento do/a " + f1.getNome() + " é: " + f1.getDepartamento());
        System.out.println("O salario do/a " + f1.getNome() + " é: " + f1.getSalario() + " Reais");
        System.out.println("A bonificação é: " + f1.bonificacao() + " reais");
    }
}
