package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val array = IntArray(count)
    var index = 0;
    if (count == 0) return array
    for(i in 1 .. count) {
        array[index] = i
        index++
    }
    return array
}
