package com.debdutta.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView : View {
    private val paint = Paint()
    constructor(context: Context?) : super(context) {init()}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {init()}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
    }

    private fun init() {
        paint.apply {
            color = Color.RED
            isAntiAlias = true
            style = Paint.Style.FILL
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val w = width
        val h = height

        val size = w.coerceAtMost(h)
        val radius = size/2f

        val cx = w/2f
        val cy = h/2f

        canvas?.drawCircle(cx,cy,radius,paint)
    }
}