package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    var result: IntArray = IntArray(count)
    for (i in 1 .. count) {
        result[i - 1] = i
    }
    return result
}
