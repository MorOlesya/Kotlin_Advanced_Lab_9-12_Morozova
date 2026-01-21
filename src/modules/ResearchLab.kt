package modules

import resources.ResourceManager
import kotlin.math.min

class ResearchLab : OutpostModule("Исследовательская лабаратория") {
    override fun performAction(manager: ResourceManager) : ModuleResult {
        val minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            println("Недостаточно минералов для исследования")
            return ModuleResult.NotEnoughResources(
                resourceName = "Miinerals",
                required = 30,
                available = minerals?.amount ?: 0
            )
        }
        minerals.amount -= 30
        return ModuleResult.Success("Исследование завершено")
    }
}