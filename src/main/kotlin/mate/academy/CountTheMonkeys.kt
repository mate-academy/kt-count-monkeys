package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    return if (count == 0) {
        IntArray(0)
    } else {
        IntArray(count) { it + 1 }
    }
}
