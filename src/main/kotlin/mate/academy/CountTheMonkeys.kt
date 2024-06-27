package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    val result = IntArray(count)
    if (count == 0) return result
    for(i in 1..count) {
        result[i - 1] = i
    }
    return result
}
