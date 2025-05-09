package mate.academy

fun countTheMonkeys(count: Int) = if (count < 1) IntArray(0) else IntArray(count) {it + 1}
