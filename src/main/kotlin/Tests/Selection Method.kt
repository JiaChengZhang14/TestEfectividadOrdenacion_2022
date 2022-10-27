package Tests

import functions.selection

fun main() {

    var array = IntArray(size = 100_000) { (0..100000).random() }

    var timeIni = 0L
    var timeFinal = 0L

    val SelectionArray = array
    timeIni = System.currentTimeMillis()
    selection(SelectionArray)
    timeFinal = System.currentTimeMillis()

    println("El tiempo de ejecución ha sido de ${timeFinal - timeIni} ms")

}