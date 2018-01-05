package kt.elements

import kt.Canvas
import kt.CanvasStyle
import kt.core.Point

class Rectangle: CanvasElement {
    private val p1 : Point
    private val p2 : Point
    private var style : CanvasStyle

    constructor(canvas: Canvas, point1 : Point, point2 : Point, canvasStyle: CanvasStyle) : super(canvas) {
        p1 = point1
        p2 = point2
        style = canvasStyle
    }

    override fun draw() {
        style.apply(ctx)

    }
}