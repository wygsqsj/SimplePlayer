package com.wish.simpleplayer

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.annotation.ColorInt


/**
 * 类名称：RoundView
 * 类描述：
 *
 * @author: Xuweihong
 * @since: 2021/10/19 11:04
 */
class RoundView(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    FrameLayout(context, attrs, defStyleAttr) {

    private val mPaint: Paint = Paint()

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }


    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mPaint.color = Color.GREEN
        mPaint.style = Paint.Style.STROKE//空心
        mPaint.textSize = 24f
        mPaint.color = Color.BLUE
        canvas?.drawText("画圆：", 10f, 40f, mPaint)
        canvas?.drawCircle(100f, 60f, 30f, mPaint)
        mPaint.isAntiAlias = true
        canvas?.drawCircle(200f, 60f, 30f, mPaint)
    }
}