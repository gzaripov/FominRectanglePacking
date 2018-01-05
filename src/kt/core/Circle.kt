package kt.core

import kotlin.math.abs
import kotlin.math.pow

class Circle(val center: Point, val radius: Double) {

    constructor(p1: Point, p2: Point)
            : this((p1 - p2).abs(), abs(p1.x - p2.x) / 2.0)

    operator fun contains(point: Point): Boolean {
        val dx = point.x - center.x
        val dy = point.y - center.y

        return dx * dx + dy * dy < radius.pow(2)
    }
}