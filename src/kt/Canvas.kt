package kt

import kt.Color.White
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import kotlin.browser.document
import kotlin.browser.window

class Canvas(width: Number, height: Number) {
    private val width : Int
    private val height : Int
    private val ratio = window.devicePixelRatio
    val element : HTMLCanvasElement
        val ctx : CanvasRenderingContext2D

    init {
        this.width = (width.toDouble() * ratio).toInt()
        this.height = (height.toDouble() * ratio).toInt()

        element = document.createElement("canvas") as HTMLCanvasElement
        element.style.width = "${width}px"
        element.style.height = "${height}px"
        element.width = this.width
        element.height = this.height
        ctx = element.getContext("2d") as CanvasRenderingContext2D

        clear()
    }

    private fun clear() {
        ctx.fillStyle = White
        ctx.fillRect(.0, .0, width.toDouble(), height.toDouble())
    }
}