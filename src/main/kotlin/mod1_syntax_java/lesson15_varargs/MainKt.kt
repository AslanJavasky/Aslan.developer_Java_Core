package mod1_syntax_java.lesson15_varargs

fun main() {


    varargsMethod("one","2", "three", "4")

}

fun varargsMethod(vararg strings: String) {
    println(strings.joinToString(","))
}
