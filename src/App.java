public class App {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();

        f1.setNome("Dalton");
        f1.setCpf("52352354534");
        f1.setDepartamento("T.I");
        f1.setSalario(4000.0);

        System.out.println();
        System.out.println("__________________________________________");
        System.out.println();

        System.out.println("O nome do/a funcionário/a é " + f1.getNome());
        System.out.println("O CPF do/a " + f1.getNome() + " é: " + f1.getCpf());
        System.out.println("O Departamento do/a " + f1.getNome() + " é: " + f1.getDepartamento());
        System.out.println("O salario do/a " + f1.getNome() + " é: " + f1.getSalario() + " Reais");
        System.out.println("A bonificação é: " + f1.bonificacao() + " reais");

        System.out.println();
        System.out.println("__________________________________________");
        System.out.println();

        Gerente g1 = new Gerente();

        g1.setSenha(1235);
        g1.setNome("Joeldison");
        g1.setCpf("4234235424");
        g1.setSalario(6000.00);
        g1.setDepartamento("Logistica");

        System.out.println(g1.getAutentificacao(1234));
        System.out.println("O nome do/a novo/a gerente é: " + g1.getNome());
        System.out.println("O CPF do/a " + g1.getNome() + " é: " + g1.getCpf());
        System.out.println("O salario do/a " + g1.getNome() +  " é: " + g1.getSalario() + " reais");
        System.out.println("O departamento do/a " + g1.getNome() + " é: " + g1.getDepartamento());
        System.out.println("A bonificação é: " + g1.bonificacao() + " reais");
    }
}
