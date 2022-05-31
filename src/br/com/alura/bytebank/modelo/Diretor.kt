package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
     senha: Int,
    val plr: Double


) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 1234
) {

    override val bonificacao: Double
        get() {
            println("Bonificacao do diretor:")
            return  salario + plr
        }


}