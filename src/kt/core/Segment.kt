package kt.core

import kotlin.math.max
import kotlin.math.min

class Segment(val p1: Point, val p2 : Point) {

    operator fun contains(point: Point): Boolean {
        val minX = min(p1.x, p2.x) - EPS
        val maxX = max(p1.x, p2.x) + EPS
        val minY = min(p1.y, p2.y) - EPS
        val maxY = max(p1.y, p2.y) + EPS
        return point.x in minX..maxX && point.y in minY..maxY
    }

}