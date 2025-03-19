fun main() {

    // Ex5:

    val teatro = Teatro(
        capacidade = 400,
        localizacao = "Avenida Juscelino Kubitschek",
        precoIngresso = 50.0
    )

    val faturamento = teatro.calcularFaturamento(200)
    println("O faturamento da noite no teatro foi de: R$${faturamento})")
    println("---------------------------")


    // Ex6:

    val teatros = listOf(
        Teatro(capacidade = 500, localizacao = "Zona Sul", precoIngresso = 25.0),
        Teatro(capacidade = 100, localizacao = "Zona Norte", precoIngresso = 15.0),
        Teatro(capacidade = 600, localizacao = "Zona Leste", precoIngresso = 45.0),
    )

    for (teatro in teatros) {
        println("Nome: ${teatro.nome}")
        println("Capacidade: ${teatro.capacidade}")
        println("Localização: ${teatro.localizacao}")
        println("Preço do Ingresso: R$ ${teatro.precoIngresso}")
        println("---------------------------")
    }

    Ex1()
    Ex2()
    Ex3(2,4)
    Ex4(3,5)
    Ex4(2,3)
    Ex4(3,6)
}

fun Ex1() {
    val n = 10
    for (i in 0 until n) {
        println("Índice: ${i}")
    }
}

fun Ex2() {
    val n = 10;
    for (i in 0 until n) {
        if (i % 2 != 0) {
            println("Índices ímpares: ${i}")
        }
    }
}

fun Ex3(a : Int, b : Int): Int {
    return if ( a % 2 == 0 && b % 2 == 0) {
        a + b
    } else {
        a * b
    }
}

fun Ex4(a: Int, b: Int): Int {
    if (a in 10..99) {
        return a + b
    } else if (a in 100..999) {
        return a / b
    } else if (a in 1000..99999) {
        return a - b
    } else if (a in 1..9) {
        return a * b
    } else {
        return 0
    }
}
