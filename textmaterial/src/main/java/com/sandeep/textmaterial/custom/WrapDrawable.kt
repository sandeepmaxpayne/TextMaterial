package com.sandeep.textmaterial.custom

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable

class WrapDrawable (private val drawable: Drawable): Drawable(){

    override fun setBounds(left: Int, top: Int, right: Int, bottom: Int) {
        super.setBounds(left, top, right, bottom)
        val drawable = drawable
        drawable.setBounds(left, top, right, bottom)
    }

    override fun setAlpha(alpha: Int) {
        drawable.alpha = alpha
    }

    override fun getOpacity(): Int {
        return drawable.alpha
    }

    override fun draw(canvas: Canvas) {
        val drawable = drawable
        drawable.draw(canvas)
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        drawable.colorFilter = colorFilter
    }

    override fun getIntrinsicHeight(): Int {
        return super.getIntrinsicHeight()
    }

    override fun getIntrinsicWidth(): Int {
        return super.getIntrinsicWidth()
    }
}