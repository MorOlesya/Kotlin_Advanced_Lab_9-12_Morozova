package gameCharacter

fun main() {
    val hero = GameCharacter("Oliver")

    hero.ChangeState(CharacterState.Run)
    hero.ChangeState(CharacterState.Attack(50))
    hero.ChangeState(CharacterState.Death("Заколот до смерти"))

}