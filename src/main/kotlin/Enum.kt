enum class Estado(val descricao: String) {
    SP("São Paulo"),
    RJ("Rio de Janeiro")
}

interface IMeioPagamento {
    fun pagar(): Unit
}

enum class MeioDePagamento {
    CARTAO_CREDITO {
        override fun strategy() = MeioPagamentoCredito()
    },
    CARTAO_DEBITO {
        override fun strategy() = MeioPagamentoDebito()
    },
    BOLETO {
        override fun strategy() = MeioPagamentoBoleto()
    };

    abstract fun strategy(): IMeioPagamento
}

class MeioPagamentoBoleto : IMeioPagamento {
    override fun pagar() {
        println("Pagamento por Boleto")
    }
}

class MeioPagamentoCredito : IMeioPagamento {
    override fun pagar() {
        println("Pagamento por Cartão de Crédito")
    }
}

class MeioPagamentoDebito : IMeioPagamento {
    override fun pagar() {
        println("Pagamento por Cartão de Débito")
    }
}

fun main() {
    println(Estado.SP)
    println(Estado.RJ)
    println(Estado.RJ.name)
    println(Estado.SP.ordinal)
    println(Estado.RJ.ordinal)
    println(Estado.valueOf("SP"))
    println("---")
    Estado.values().forEach(::println)
    println("---")
    println(Estado.SP.descricao)
    println("---")

    val meioDePagamento = MeioDePagamento.BOLETO
    val pagamentoStrategy: IMeioPagamento = meioDePagamento.strategy()
    pagamentoStrategy.pagar()
}