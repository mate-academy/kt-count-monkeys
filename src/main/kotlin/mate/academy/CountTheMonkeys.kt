package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val arr = IntArray(count) {0}
    for (i in 0 until count) {
        arr[i] = i + 1
    }
    return arr
}
