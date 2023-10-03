package mod2_oop.lesson18_object


fun main() {

    val obj = SomeDataClass()
    val other="Some string"
    println(obj.hashCode())
    println(other.hashCode())

}

data class SomeDataClass(
    val name:String="Aslan"
)


class MainKt:Any() {

    val name: String = "Some value"

    override fun toString(): String {
        return "Main Class with name: $name"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}