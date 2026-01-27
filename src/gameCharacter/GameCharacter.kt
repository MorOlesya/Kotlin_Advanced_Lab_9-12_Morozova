package gameCharacter

class GameCharacter(
    val name: String,
    var state: CharacterState = CharacterState.DoNothing,
){

    fun ChangeState(newState: CharacterState){
        state = newState
        ShowState()
    }

    fun ShowState(){
        when(state){
            is CharacterState.Attack -> println("$name атакует! Урон: ${(state as CharacterState.Attack).damage}")
            is CharacterState.Death -> println("$name умер! Причина: ${(state as CharacterState.Death).reason}")
            CharacterState.DoNothing -> println("$name бездействует")
            CharacterState.Run -> println("$name бежит!")
        }
    }
}