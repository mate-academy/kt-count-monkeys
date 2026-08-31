package mate.academy

private const val ARRAY_START_INT = 0
private const val VALUE_INCREMENT = 1

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    return when (count) {
        0 -> intArrayOf()
        else -> {
            var intArray: IntArray = IntArray(count)
            for (i in ARRAY_START_INT until count) {
                intArray.set(i, i + VALUE_INCREMENT)
            }
            intArray
        }
    }
}
