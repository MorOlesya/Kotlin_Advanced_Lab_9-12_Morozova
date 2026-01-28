

package example

fun main() {
//    val max = InstantMessenger("MAX")
//    //val photoCamera = PhotoCamera()
//    val yotaPhone = SmartPhone("YoutaPhone", max)
//    yotaPhone.SendTextMessage()
//    yotaPhone.SendVideoMessage()
//
//    counter = 1
//    counter = 5
//
//    val hero = User()
//    hero.name = "Oliver"
//    hero.name = "Mike"


    println("Создаём провиль пользователя...")
    val user = UserProfile("Kris", "kris@example.com")

    println("\nИмя: ${user.name}")
    println("Имя: ${user.email}")

    println("\nОбращаемся к аватару впервые:")
    println("Файл аватара: ${user.avatar}")

    println("\nОбращаемся к аватару снова (должен быть взят из кэша)")
    println("Файл аватар: ${user.avatar}")

    println("\nМеняем email:")
    user.email = "kris_new@example.com"

    println("\nМеняем имя:")
    user.name = "Kris K."
}