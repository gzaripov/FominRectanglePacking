package kt

import kt.core.Rectangle
import kt.elements.CanvasRectangle
import org.w3c.dom.HTMLElement
import kotlin.browser.document
import kotlin.browser.window
import kotlin.dom.addClass
import kotlin.math.max
import kotlin.math.min


fun main(args: Array<String>) {
    val w = getWidth()
    val canvas = Canvas(w, w)
    canvas.element.addClass("unselectable")
    val container = document.getElementById("canvas-container") as HTMLElement
    container.appendChild(canvas.element)

    val rectStyle = CanvasStyle(Color.Black.value)
    val rectangle = Rectangle(0.0, 0.0, w, w)
    val canvasRectangle = CanvasRectangle(rectangle, canvas, rectStyle)

    canvas.addDrawables(canvasRectangle)
    canvas.invalidate()
}

fun getWidth(): Double {
    val w = max(document.documentElement!!.clientWidth, window.innerWidth)
    val h = max(document.documentElement!!.clientHeight, window.innerHeight)

    val width = w * 0.8
    val height = h * 0.8

    return min(width, height)
}