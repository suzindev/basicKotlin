open class Base(val name: String) {
    open val state: String = "SP"

    open fun print() {
        println("name: ${this.name}, state: ${this.state}")
    }
}

class Derived(name: String, val cpf: String) : Base(name) {
    override val state: String = "RJ"

    init {
        println("Init: ${super.name}")
    }

    override fun print() {
        super.print()
        println("name: ${this.name}, cpf: ${this.cpf}, state: ${this.state}")
    }
}

interface MeioPagamento {
    fun pagar()
}

class PagamentoBoleto : MeioPagamento {
    override fun pagar() {
        println("Pagamento por Boleto!!!")
    }
}

class PagamentoDebito : MeioPagamento {
    override fun pagar() {
        println("Pagamento Débito!!!")
    }
}

class PagamentoCredito : MeioPagamento {
    override fun pagar() {
        println("Pagamento Crédito!!!")
    }
}

fun main() {
    val xxx: Base = Derived("Dev", "123")
    xxx.print()

    var meioPagamento: MeioPagamento = PagamentoBoleto()
    meioPagamento.pagar()
    meioPagamento = PagamentoDebito()
    meioPagamento.pagar()
    meioPagamento = PagamentoCredito()
    meioPagamento.pagar()
}