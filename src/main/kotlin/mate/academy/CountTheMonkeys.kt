package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    return if (count == 0) IntArray(0) else IntArray(count) {it -> it + 1}
}
