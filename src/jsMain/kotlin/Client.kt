import kotlinx.browser.document
import react.create
import react.dom.render

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val paymentComponent = Payments.create {
        name = "Payments"
    }

    render(paymentComponent, container)
}