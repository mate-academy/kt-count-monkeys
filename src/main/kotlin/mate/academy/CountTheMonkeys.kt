package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    val result = IntArray(count) {0}
    for (i in 0 until count) {
        result[i] = i + 1
    }
    return result
}
