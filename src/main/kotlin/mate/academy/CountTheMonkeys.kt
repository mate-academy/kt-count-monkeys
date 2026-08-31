package mate.academy

private const val ZERO = 0

private const val ONE = 1

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val arrayOfIntegers: IntArray = IntArray(count)

    var index = ZERO;
    for (i in ONE..count) {
        arrayOfIntegers[index] = i
        index++
    }

    return arrayOfIntegers
}
