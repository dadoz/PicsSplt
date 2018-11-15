package com.application.sample.david.picssplt.views

import android.content.Context
import android.support.design.card.MaterialCardView
import android.util.AttributeSet
import android.view.View
import com.application.sample.david.picssplt.R

class PicCardView: MaterialCardView {
    constructor(context: Context) : this(context, null) {
        initView()
    }
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initView()
    }

    private fun initView() {
        inflate(context, R.layout.pic_cardview_layout, this)
    }
}
