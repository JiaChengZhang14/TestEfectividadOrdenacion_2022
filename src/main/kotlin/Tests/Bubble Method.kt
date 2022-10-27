import kotlin.system.measureTimeMillis

fun main() {
    var array = IntArray(size = 1_000_000) { (0..100000000).random() }




}

fun bubble(array: IntArray) {
    var finalTime = System.currentTimeMillis()
    var aux: Int
    for (i in 0 until array.size) {
        for (j in 0 until array.size - 1) {
            if (array[j] > array[i]) {
                aux = array[j]
                array[j] = array[j + 1]
                array[j + 1] = aux
            }
        }
    }
    println("Se he ejecutado en $finalTime ns")
}