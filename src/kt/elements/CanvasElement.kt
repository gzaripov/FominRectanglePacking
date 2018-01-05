package kt.elements

import kt.Canvas
import kt.CanvasStyle
import org.w3c.dom.CanvasRenderingContext2D

abstract class CanvasElement(final override val canvas: Canvas) : Drawable {
    override val layer = 0
    var style = CanvasStyle()
    val ctx = canvas.ctx

    constructor(canvas: Canvas, style: CanvasStyle) : this(canvas) {
        this.style = style

    }
}