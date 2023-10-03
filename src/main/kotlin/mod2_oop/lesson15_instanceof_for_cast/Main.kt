package mod2_oop.lesson15_instanceof_for_cast

fun main() {

    val harry=Character("Harry Potter")
    if (harry is Character){
        println(harry)
    }
}