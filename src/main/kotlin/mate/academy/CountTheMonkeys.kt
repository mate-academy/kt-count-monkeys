package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    return if (count > 0) Array<Int>(count) {i -> i + 1} else Array<Int>(0) {0}
}
