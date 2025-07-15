package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
const val ZERO = 0

fun countTheMonkeys(count: Int): IntArray {
    if (count == ZERO) return IntArray(ZERO)
    var monkeys = IntArray(count) {ZERO}
    for (i in ZERO until count) {
        monkeys[i] = i + 1
    }
    return monkeys
}
