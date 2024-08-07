package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val outArray : IntArray = IntArray(count)
    repeat(count) {
        outArray[it] = it + 1
    }
    return outArray
}
