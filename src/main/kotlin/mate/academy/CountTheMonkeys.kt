package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    if (count == 0) {
        return intArrayOf()
    }
    var monkeys: IntArray = IntArray(count) {0}
    for (i in 0 until count) {
        monkeys[i] = i + 1
    }
    return monkeys
}
