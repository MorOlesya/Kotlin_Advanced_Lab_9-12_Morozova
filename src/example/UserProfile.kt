package example
import kotlin.properties.Delegates

class UserProfile(initialName: String, initialGmail: String) {
    var name: String by Delegates.observable(initialName) { _, old, new -> println("Имя изменено: `$old` -> `$new`")
    }
    var email: String by Delegates.observable(initialGmail) { _, old, new -> println("Почта изменена: `$old` -> `$new`")
    }
    val avatar: String by lazy {
        println("Загружан аватар для $name...")
        "avatar_of_$name.png"
    }
}
