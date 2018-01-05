package kt.elements

import kt.Canvas
import kt.CanvasStyle
import kt.core.Rectangle

class CanvasRectangle(
        private var rect: Rectangle,
        canvas: Canvas,
        style: CanvasStyle
) : CanvasElement(canvas, style) {

    init {
        if (canvas.scale != 1.0) {
            rect = rect.scale(canvas.scale)
        }
    }

    override fun draw() {
        style.apply(ctx)
        ctx.strokeRect(rect.left, rect.top, rect.width, rect.height)
        ctx.fillRect(rect.left, rect.top, rect.width, rect.height)
    }
}