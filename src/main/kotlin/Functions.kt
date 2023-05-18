class Calculadora() {
    fun calcular(x: Int, y: Int, operador: String = "+"): Int {
        var result = 0
        when (operador) {
            "+" -> result = somar(x, y)
            "-" -> result = subtrair(x, y)
            "*" -> result = multiplicar(x, y)
            "/" -> result = dividir(x, y)
        }

        return result
    }

    private fun somar(x: Int, y: Int) = x + y
    private fun subtrair(x: Int, y: Int) = x - y
    private fun multiplicar(x: Int, y: Int) = x * y
    private fun dividir(x: Int, y: Int) = x / y
}

fun main() {
    val calculadora = Calculadora()
    println(calculadora.calcular(10, 10))
    println(calculadora.calcular(20, 10, "-"))
    println(calculadora.calcular(30, 10, "*"))
    println(calculadora.calcular(40, 10, "/"))
}