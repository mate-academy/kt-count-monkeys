package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val resultArray = IntArray(count)
    for (i in 0 until count) {
        resultArray[i] = i + 1
    }
    return resultArray
}
