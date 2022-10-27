import functions.bubble
import functions.clone
import kotlin.system.measureTimeMillis

/**
 * Nos encontramos ante una función que testea el tiempo que tarda el método de ordenación de Burbuja
 * Se irá incrementando el valor del tamaño del array hasta que llegue a 100_000
 * los datos de tiempo se han registrado en una hoja de excel y se hará un gráfico
 * @author JiaCheng Zhang
 */

fun main() {
    var array = IntArray(size = 100_000) { (0..100000).random() }

    var timeIni = 0L
    var timeFinal = 0L

    // Se prueba el método de burbuja
    val arrayBurbuja = array
    timeIni = System.currentTimeMillis()
    bubble(array)
    timeFinal = System.currentTimeMillis()

    println("Se ha realizado la ordenación en ${timeFinal - timeIni} ms ")
    //println(array.joinToString())
}

