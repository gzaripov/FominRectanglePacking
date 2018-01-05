package kt.core

import kotlin.math.abs

class Point(val x: Double, val y: Double) {
    fun move(dx: Double, dy: Double): Point {
        return this + Point(dx, dy)
    }

    operator fun unaryMinus() = Point(-x, -y)

    operator fun plus(point: Point) = Point(this.x + point.x, this.y + point.y)

    operator fun minus(point: Point) = Point(this.x - point.x, this.y - point.y)

    fun abs() = Point(abs(x), abs(y))
}