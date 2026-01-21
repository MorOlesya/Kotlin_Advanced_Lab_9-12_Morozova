package modules

sealed class ModuleResult {
    data class Success(val messsage: String) : ModuleResult()
    data class ResourceProduced(
        val resourseName: String, val amount: Int
    ) : ModuleResult()
    data class NotEnoughResources(
        val resourceName: String,
        val required: Int,
        val available: Int
    ) : ModuleResult()
    data class Error(val reason: String) : ModuleResult()
}