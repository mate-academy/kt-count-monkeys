package mate.academy

const val START_LOOP = 1
const val INDEX_MINUS = 1
// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.

fun countTheMonkeys(count: Int): IntArray {
    val arrayMonkeys = IntArray(count)
    if (count == 0) {
        return intArrayOf()
    }
    for (i in START_LOOP..count) {
        arrayMonkeys[i - INDEX_MINUS] = i
    }
    return arrayMonkeys
}
}
