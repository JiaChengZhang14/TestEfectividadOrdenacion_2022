package Tests

import functions.insercion

fun main() {
    var array = IntArray(size = 100_000){(0..100_000).random()}

    var timeIni = 0L
    var timeFinal = 0L

    timeIni = System.currentTimeMillis()
    insercion(array)
    timeFinal = System.currentTimeMillis()

    println("Se ha ejecutado el método de ordenacion en ${timeFinal - timeIni} ms ")
}