package outpostState
import kotlin.properties.Delegates

class ObservableResource (
    val name: String,
    val amountInit: Int
){
//    var amount: Int by Delegates.observable(amountInit){
//        _, old, new, -> println("Ресурс $name изменён: $old -> $new")
//    }
    var amount: Int by Delegates.observable(amountInit){
            _, old, new, -> ShowChange(name, old, new)
    }
}

