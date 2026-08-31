package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val array = IntArray(count)
    for (i in 1..count) {
        array[i - 1] = i
    }
    return array
}
