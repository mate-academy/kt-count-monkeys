package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
    val list : MutableList<Int> = mutableListOf()
    if (count == 0) return intArrayOf() else
    for (i in 1..count) {
        list.add(i)
    }
    return list.toIntArray()
}

