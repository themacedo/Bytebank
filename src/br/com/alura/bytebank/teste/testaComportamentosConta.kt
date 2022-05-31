package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)
    contaFran.deposita(200.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do alex")
    contaAlex.deposita(valor = 50.0)
    println(contaAlex.saldo)

    println("Depositando na conta do Fra")
    contaFran.deposita(valor = 70.0)
    println(contaFran.saldo)

    println("Sacando na conta do alex")
    contaAlex.saca(valor = 250.0)
    println(contaAlex.saldo)

    println("Sacando na conta do Fra")
    contaFran.saca(valor = 100.0)
    println(contaFran.saldo)

    println("Saqaue em excesso Alex")
    contaAlex.saca(valor = 50.0)
    println(contaAlex.saldo)

    println("Saqaue em excesso Fran")
    contaFran.saca(valor = 70.0)
    println(contaFran.saldo)

    println("Tranferencia da conta da Fran para a br.com.alura.bytebank.modelo.Conta do Alex")

    if (contaFran.tranfere(valor = 50.0, destino = contaAlex)) {
        println("Transferencia Sucedida")

    } else {
        println("Falha na tranferencia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}