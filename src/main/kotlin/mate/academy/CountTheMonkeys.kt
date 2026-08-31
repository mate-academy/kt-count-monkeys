package mate.academy

fun countTheMonkeys(count: Int): IntArray {
    if (count <= 0) {
        return intArrayOf()
    }
    return IntArray(count) { it + 1 }
}
