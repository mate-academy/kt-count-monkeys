package mate.academy

private const val ONE = 1

private const val TWO = 2

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val arr = IntArray(count) { ONE }
    for (i in TWO..count) {
        arr[i - ONE] = i
    }
    return arr
}
