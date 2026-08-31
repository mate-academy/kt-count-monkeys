package mate.academy

const val ZERO = 0
const val ONE = 1

fun countTheMonkeys(count: Int): IntArray {
    val result = IntArray(count)
    for (i in ZERO until count) {
        result[i] = i+ONE
    }
    return result
}
