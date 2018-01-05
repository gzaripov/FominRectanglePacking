package kt

import kt.core.Rectangle

class RectanglePacker(width : Double, height : Double) {
    private val freeAreas = mutableListOf<Rectangle>()
    private val busyAreas = mutableListOf<Rectangle>()

    init {
        freeAreas.add(Rectangle(width = width, height = height))
    }

    fun allocateRectangle(rect: Rectangle) {
        //TODO
    }
}