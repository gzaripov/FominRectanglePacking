package kt.core

import kotlin.math.max
import kotlin.math.min

class Rectangle(
        val left: Double,
        val top: Double,
        val right: Double,
        val bottom: Double
) {

    constructor(p1: Point, p2: Point)
            : this(min(p1.x, p2.x), min(p1.y, p2.y), max(p1.x, p2.x), max(p1.y, p2.y))

    constructor(point: Point, width: Double, height: Double)
            : this(point, point.move(width, height))

    operator fun contains(point: Point): Boolean {
        return point.x in left..right
                && point.y in top..bottom
    }

    fun width() = right - left

    fun height() = bottom - top
}