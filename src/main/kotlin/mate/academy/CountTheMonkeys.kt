package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    return if (count == 0) {
        intArrayOf()
    } else {
        IntArray(count) { it + 1 }
    }
}
