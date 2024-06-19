package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    return if (count == 0) {
        intArrayOf()
    } else {
        IntArray(count) { it + 1 }
    }
}
