package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    if (count == 0) return intArrayOf()
    val result = IntArray(count)
    for (i in result.indices) {
        result[i] = i + 1
    }
    return result
}
