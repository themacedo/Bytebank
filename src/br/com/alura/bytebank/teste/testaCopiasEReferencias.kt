package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(titular = "Joao", numero = 100)
    contaJoao.titular = "Joao"
    var contaMaria = ContaPoupanca(titular = "Maria", numero = 101)
    contaMaria.titular = "Maria"
    contaJoao.titular = "Joao"

    println("Titular conta joao = ${contaJoao.titular}")
    println("Titular conta Maria = ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)


}