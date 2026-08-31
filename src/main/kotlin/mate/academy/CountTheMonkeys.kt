package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    var count1 = 1;
    val array = IntArray(count)
    repeat(count) {
        array[it] = count1++
    }
    return array
}
