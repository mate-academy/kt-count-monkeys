package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    if (count == 0) return IntArray(0)
    val result = IntArray(count)
    for (i in 0 until count) {
        result[i] = i + 1
    }
    return result
}
