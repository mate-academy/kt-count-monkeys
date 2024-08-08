package mate.academy

// Implement the `countTheMonkeys()` function so that it returns an IntArray
// with elements from `1` to `count`.
fun countTheMonkeys(count: Int): IntArray {
 return if (count > 0) {
     IntArray(count) {it + 1}
 } else {
     IntArray(0)
 }
}
