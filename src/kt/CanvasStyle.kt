package kt

import org.w3c.dom.CanvasRenderingContext2D

open class CanvasStyle(
        private val fillStyle: String = Transparent,
        private val strokeStyle: String = Transparent,
        private val lineWidth: Double = 0.0
) {

    fun apply(ctx: CanvasRenderingContext2D) {
        ctx.fillStyle = fillStyle
        ctx.strokeStyle = strokeStyle
        ctx.lineWidth = lineWidth
    }

    companion object {
        val Transparent = Color.Transparent.value
    }
}