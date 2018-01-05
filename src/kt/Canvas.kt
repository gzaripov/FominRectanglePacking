package kt

import kt.Color.White
import kt.elements.Drawable
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import kotlin.browser.document
import kotlin.browser.window

class Canvas(width: Number, height: Number) {
    private val width: Int
    private val height: Int
    private val drawables = mutableListOf<Drawable>()

    val scale = window.devicePixelRatio
    val element: HTMLCanvasElement
    val ctx: CanvasRenderingContext2D

    init {
        this.width = (width.toDouble() * scale).toInt()
        this.height = (height.toDouble() * scale).toInt()

        element = document.createElement("canvas") as HTMLCanvasElement
        element.style.width = "${width}px"
        element.style.height = "${height}px"
        element.width = this.width
        element.height = this.height
        ctx = element.getContext("2d") as CanvasRenderingContext2D

        clear()
    }

    /**
     * Adds a [drawables] to canvas.
     * @return the new size of the group.
     */
    fun addDrawables(vararg drawables: Drawable): Int {
        val ind = this.drawables.size
        this.drawables.addAll(drawables)
        return ind
    }

    fun invalidate() {
        drawables
                .sortedBy { it.layer }
                .forEach { it.draw() }
    }

    private fun clear() {
        ctx.fillStyle = White
        ctx.fillRect(.0, .0, width.toDouble(), height.toDouble())
    }
}