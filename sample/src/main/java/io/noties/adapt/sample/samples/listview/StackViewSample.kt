package io.noties.adapt.sample.samples.listview

import android.view.View
import android.widget.StackView
import io.noties.adapt.listview.AdaptListView
import io.noties.adapt.sample.R
import io.noties.adapt.sample.SampleView
import io.noties.adapt.sample.annotation.AdaptSample

@AdaptSample(
    id = "20210126233614",
    title = "StackView",
    tags = ["listview"]
)
class StackViewSample : SampleView() {
    override val layoutResId: Int
        get() = R.layout.view_sample_stack_view

    override fun render(view: View) {
        val stackView: StackView = view.findViewById(R.id.stack_view)
        val adapt = AdaptListView.init(stackView)

        initSampleItems(adapt)
    }
}