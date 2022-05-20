package io.noties.adapt.ui.element

import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.GravityInt
import io.noties.adapt.ui.ViewElement
import io.noties.adapt.ui.ViewFactory
import io.noties.adapt.ui.addChildren

@Suppress("FunctionName", "unused")
fun <LP : ViewGroup.LayoutParams> ViewFactory<LP>.VStack(
    @GravityInt gravity: Int = Gravity.CENTER_HORIZONTAL,
    children: ViewFactory<LinearLayout.LayoutParams>.() -> Unit
): ViewElement<LinearLayout, LP> {
    return ViewElement<LinearLayout, LP> {
        LinearLayout(it).also { ll ->
            ll.orientation = LinearLayout.VERTICAL
            ll.gravity = gravity
            ViewFactory.addChildren(ll, children)
        }
    }.also(elements::add)
}