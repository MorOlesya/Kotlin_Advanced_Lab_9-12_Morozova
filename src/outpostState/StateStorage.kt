package outpostState

import resources.OutpostResource
import java.io.File

object StateStorage {
    private const val File_Name = "resources_state.txt"

    fun Save(resource: List<ObservableResource>){
        val file = File(StateStorage.File_Name)
        file.writeText(
            resource.joinToString("\n") { resource ->
                "${resource.name} | ${resource.amount}"
            }
        )
        println("Состояние базы сохранено в файл")
    }

    fun Load() : List<ObservableResource> {
        val file = File(StateStorage.File_Name)
        if (!file.exists()) return emptyList()
        println("Загрузка состояния базы из файла")
        return file.readLines().map {
            val (name, amount) = it.split(" | ")
            ObservableResource(name, amount.toInt())
        }
    }
}