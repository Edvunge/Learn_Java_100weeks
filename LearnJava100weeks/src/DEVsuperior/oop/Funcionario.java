package DEVsuperior.oop;

public class Funcionario {

    // atributos (dados)
    public String nome;
    public double valorPorHora;
    public int horas;

    // metodos -> é só um outro nome para funções (comportamentos)
    public double total (){
        return valorPorHora * horas;
    }

}
