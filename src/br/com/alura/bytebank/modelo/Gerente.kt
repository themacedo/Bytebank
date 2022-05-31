package br.com.alura.bytebank.modelo

class Gerente(
    nome: String,
     cpf: String,
    salario: Double,
     senha: Int


) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 123
) {

    override val bonificacao: Double
    get(){
        println("Bonificacao do br.com.alura.bytebank.modelo.Gerente:")
        return  salario
    }





}