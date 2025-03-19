class Teatro (val nome: String = "Teatro Londrinense", var capacidade: Int, var localizacao: String, var precoIngresso: Double) {
    fun calcularFaturamento(ingressosVendidos: Int ): Double {
        return precoIngresso * ingressosVendidos
    }

}