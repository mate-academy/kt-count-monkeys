package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    val array = IntArray(count) {0}

    if (count == 0) {
        return array
    } else {
        for (i in 0..count - 1 ) {
            array[i] = i + 1
        }
    }
    return array
}
