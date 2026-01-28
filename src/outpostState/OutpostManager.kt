package outpostState

class Manager{
    val listOfResourсes: List<ObservableResource> by lazy {
        println("Менеджере создан. Создаём список ресурсов...")
        listOf(
            ObservableResource("Minerals", 100),
            ObservableResource("Gas", 5)
        )
    }
}