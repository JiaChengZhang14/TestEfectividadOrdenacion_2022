package functions

// clone function

fun clone(array: IntArray): IntArray {
    val ClonedArray = IntArray(array.size)
    for (i: Int in array.indices) {
        ClonedArray[i] = array[1]

    }
    return ClonedArray
}


// Bubble method

fun bubble(array: IntArray) {
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
}


// Selection Method

fun selection(array: IntArray) {
    var aux: Int
    var min: Int
    for (i in 0 until array.size) {
        min = i
        for (j in i + 1 until array.size) {
            if (array[j] > array[i]) {
                min = j
            }
        }
        aux = array[1]
        array[1] = array[min]
        array[min] = aux
    }
}


fun insercion(array: IntArray) {
    var aux: Int
    var j: Int
    for (i in 1 until array.size) {
        aux = array[i]
        j = i - 1
        while (j >= 0 && array[j] > aux) {
            array[j + 1] = array[j]
            j--
        }
        array[j + 1] = aux
    }
}

fun shell(array: IntArray) {
    var aux: Int
    var j: Int
    var intervalo = 1
    while (intervalo < array.size) {
        intervalo = intervalo * 3 + 1
    }
    while (intervalo > 0) {
        for (i in intervalo until array.size) {
            aux = array[i]
            j = i
            while (j > intervalo - 1 && array[j - intervalo] >= aux) {
                array[j] = array[j - intervalo]
                j -= intervalo
            }
            array[j] = aux
        }
        intervalo = (intervalo - 1) / 3
    }
}