import csstype.Color
import csstype.px
import csstype.rgb
import react.FC
import react.Props
import react.css.css
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.useState

external interface PaymentsProps : Props {
    var name: String
}

val Payments = FC<PaymentsProps> { props ->
    var cardNo by useState("")

    div {
        css {
            padding = 5.px
            backgroundColor = Color("gray")
            color = rgb(56, 246, 137)
        }
        +"Component :: ${props.name}"
    }

    input {
        css {
            marginTop = 5.px
            marginBottom = 5.px
            fontSize = 14.px
        }
        type = InputType.text
        value = cardNo
        onChange = { event ->
            cardNo = event.target.value
        }
    }

    input {
        css {
            marginLeft = 20.px
        }
        type = InputType.button
        value = "Reset"
        onClick = {
            cardNo = ""
        }
    }

    div {
        +"Card no $cardNo is"
    }
}