public class Gerente extends Funcionario{

    /*private String nome;
    private String cpf;
    private double salario;
    private String departamento;*/
    private int senha;

    /*public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }*/

    public int getSenha(){
        return senha;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }


    //public double getBonificacao(){
    //    return this.salario*0.15;
    //}

    public boolean getAutentificacao(int senha){
        if(this.senha == senha){
            System.out.println("Acesso liberado");
            return true;
        }else{
            System.out.println("Acesso negado!!!");
            return false;
        }
    }
    
    // tudo que está comentado não precisa por causa da linguagem orientada a objeto,
    // já que a maioria das coisas já estava em uma classe, extentendendo esse alcance
    // (extends) pode-se pegar informações uteis para essa classe
}
