package mate.academy

const val INDEX : Int = 1
const val ZERO : Int = 0
fun countTheMonkeys(count: Int): IntArray {
    val counts = IntArray(count)
    var j = ZERO
    for (i in INDEX..count) {
        counts[j++] = i
    }
    return counts
}
