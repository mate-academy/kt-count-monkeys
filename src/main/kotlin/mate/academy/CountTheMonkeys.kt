package mate.academy

fun countTheMonkeys(count: Int): IntArray {

    if (count <= 0) return IntArray(0)

    return IntArray(count) { it + 1 }
}
