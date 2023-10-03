package mod6_collections_and_maps

fun main() {
    //array
    val arr = arrayOf("Harry Potter", "Draco Malfoy")

    //List
    val studentsList = mutableListOf("Harry Potter", "Draco Malfoy")
    studentsList.add("Ron Weasley")

    val studentsArrList = arrayListOf("Harry Potter", "Draco Malfoy")
    studentsArrList.add("Ron Weasley")

    //set
    val setOfStudents = mutableSetOf("Harry Potter", "Draco Malfoy")
    setOfStudents.add("Ron Weasley")
    setOfStudents.add("Harry Potter")
    setOfStudents.add("Harry Potter")
    println(setOfStudents)

    val hashSetEx= hashSetOf("Harry Potter", "Draco Malfoy")
    val linkedSetEx= linkedSetOf("Harry Potter", "Draco Malfoy")
    val treeSetEx= sortedSetOf("Harry Potter", "Draco Malfoy")

    //map
    val someMap= mutableMapOf("Gryffindor" to 350, "Ravenclaw" to 100)

    val javaMap= hashMapOf("Gryffindor" to 350, "Ravenclaw" to 100)
    val javaMapWithSortdKeys= sortedMapOf("Gryffindor" to 350, "Ravenclaw" to 100)

    someMap.forEach { key, value ->
        println("Key: $key ; Value:  $value")

    }

}