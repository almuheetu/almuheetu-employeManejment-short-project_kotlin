open class Employ(
    val name: String,
    val age: Int,
    val location: String? = null
) {
    open fun salary(): Int = 0
}