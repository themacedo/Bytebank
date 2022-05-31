package br.com.alura.bytebank.modelo

class Analista(
    nome: String,
     cpf: String,
    salario: Double



) : Funcionario(nome = nome, cpf = cpf, salario = salario){

    override val bonificacao: Double

        get() {
            println("Bonificacao do br.com.alura.bytebank.modelo.Analista:")
            return  salario *0.1
        }




}