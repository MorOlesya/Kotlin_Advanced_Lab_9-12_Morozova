package modules

import resources.ResourceManager

fun handleModuleResult(result: ModuleResult){
    when(result) {
        is ModuleResult.Success -> println("УСПЕХ: ${result.messsage}")
        is ModuleResult.ResourceProduced -> println("Произведено: ${result.resourseName} + ${result.amount}")
        is ModuleResult.NotEnoughResources -> println(
            "Недостаточно ресурса: ${result.resourceName}. " +
            "Нужно: ${result.required}, есть: ${result.available}"
        )
        is ModuleResult.Error -> println("ОШИБКА: ${result.reason}")
    }
}

fun main() {
    val generator = EnergyGenerator()
    val lab = ResearchLab()
    val manager = ResourceManager()

    val generatorResult = generator.performAction(manager)
    val labResult = lab.performAction(manager)

    handleModuleResult(generatorResult)
    handleModuleResult(labResult)

    println()
    manager.printAll()
}