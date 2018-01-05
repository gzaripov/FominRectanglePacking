package kt.elements

import kt.Canvas

interface Drawable {
    val canvas: Canvas
    val layer: Int
    fun draw()
}