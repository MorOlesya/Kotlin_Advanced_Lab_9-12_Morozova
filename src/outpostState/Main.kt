package outpostState


fun main() {
    val manager = Manager()
    println()

    manager.listOfResourсes[0].amount = 10
    manager.listOfResourсes[1].amount = 10

    println("\nСохранение")
    StateStorage.Save(manager.listOfResourсes)

    println("\nЗагрузка")
    val loaded = StateStorage.Load()
    loaded.forEach { resource -> println("${resource.name} - ${resource.amount}") }

}