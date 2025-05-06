package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    if (count == 0) return IntArray(0)
    val array = IntArray(count)
    for (i in 0 until count) {
        array[i] = i + 1
    }
    return array
}
