package mate.academy

fun countTheMonkeys(count: Int): IntArray = if (count > 0) IntArray(count) { it + 1 } else IntArray(0)
