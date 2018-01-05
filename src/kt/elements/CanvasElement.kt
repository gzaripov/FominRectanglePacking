package kt.elements

import kt.Canvas

abstract class CanvasElement(final override val canvas: Canvas) : Drawable {
    override val layer = 0
    val ctx = canvas.ctx
}