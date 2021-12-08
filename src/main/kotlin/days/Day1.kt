package days

class Day1 : Day(1) {
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/windowed.html
    private fun withStep (size: Int): List<List<Int>> {
        return inputList.map{ it.toInt() }.windowed(size)
    }


    override fun partOne(): Any {
        return withStep(2).count { (first, second) -> first < second}
    }

    override fun partTwo(): Any {
        return withStep(4).count { it[0] < it[3] }
    }
}
