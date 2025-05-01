package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val numbers = IntArray(count) { 0 }
    var i = 0
    while (i < count) {
        numbers[i] = i+1
        i++
    }
    return numbers
}
