package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuniconario() {

    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome: ${alex.nome}")
    println("Cpf: ${alex.cpf}")
    println("Salario: ${alex.salario}")
    println("Bonificacao: ${alex.bonificacao}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("Cpf: ${fran.cpf}")
    println("Salario: ${fran.salario}")
    println("Bonificacao: ${fran.bonificacao}")
    println()
    if (fran.autentica(senha = 1234)) {

        println("Autenticado com sucesso.")
        println()
    } else {

        println("Falha na autenticacao.")
        println()

    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 12345,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("Cpf: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificacao: ${gui.bonificacao}")
    println("Plr: ${gui.plr}")
    println()
    if (gui.autentica(senha = 12345)) {

        println("Autenticado com sucesso.")
        println()
    } else {

        println("Falha na autenticacao.")
        println()

    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de Bonificacao: ${calculadora.total}")
    println()
}