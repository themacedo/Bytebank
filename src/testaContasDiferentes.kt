fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca: Conta = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)

    println("Saldo da conta corrente: ${contaCorrente.saldo}")
    println("Saldo da conta poupanca: ${contaPoupanca.saldo}")
    println()

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 100.0)

    println("Saldo apos saque da conta corrente: ${contaCorrente.saldo}")
    println("Saldo apos saque da conta poupanca: ${contaPoupanca.saldo}")
    println()

    contaCorrente.tranfere(valor = 100.0, destino = contaPoupanca)

    println("Saldo apos tranferir da conta corrente: ${contaCorrente.saldo}")
    println("Saldo apos tranferir para conta poupanca: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.tranfere(valor = 100.0, destino = contaCorrente)

    println("Saldo apos receber da conta poupanca: ${contaCorrente.saldo}")
    println("Saldo apos tranferir para conta corrente : ${contaPoupanca.saldo}")
    println()
}
