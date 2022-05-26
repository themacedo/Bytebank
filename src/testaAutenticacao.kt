
fun testaAutenticacao() {

    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 123
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "222.222.222-65",
        salario = 2000.0,
        senha = 1234,
        plr = 100.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333.33",
        senha = 12345

    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 123)
    sistema.entra(diretor, senha = 1234)
    sistema.entra(cliente, senha = 12345)
}