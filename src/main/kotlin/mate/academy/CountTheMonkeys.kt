package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val numbers = IntArray(count)
    for (i in 0 until count) {
        numbers[i] = i + 1;
    }
    return numbers;
}
