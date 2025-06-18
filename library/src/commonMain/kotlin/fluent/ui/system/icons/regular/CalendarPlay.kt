/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.CalendarPlay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarPlay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(12.022f)
            curveTo(20.537f, 11.725f, 20.034f, 11.486f, 19.5f, 11.314f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(11.314f)
            curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            close()
            moveTo(16.596f, 15f)
            curveTo(16.712f, 15f, 16.818f, 15.032f, 16.913f, 15.097f)
            lineTo(19.72f, 16.937f)
            curveTo(19.807f, 16.993f, 19.875f, 17.068f, 19.925f, 17.16f)
            curveTo(19.975f, 17.251f, 20f, 17.35f, 20f, 17.458f)
            curveTo(20f, 17.562f, 19.976f, 17.66f, 19.928f, 17.755f)
            curveTo(19.916f, 17.78f, 19.903f, 17.803f, 19.888f, 17.825f)
            curveTo(19.845f, 17.888f, 19.792f, 17.94f, 19.729f, 17.982f)
            lineTo(16.923f, 19.897f)
            curveTo(16.885f, 19.921f, 16.847f, 19.942f, 16.809f, 19.958f)
            curveTo(16.794f, 19.964f, 16.779f, 19.969f, 16.764f, 19.974f)
            curveTo(16.712f, 19.991f, 16.656f, 20f, 16.596f, 20f)
            curveTo(16.518f, 20f, 16.442f, 19.984f, 16.369f, 19.952f)
            curveTo(16.297f, 19.917f, 16.233f, 19.872f, 16.177f, 19.816f)
            curveTo(16.123f, 19.757f, 16.08f, 19.691f, 16.046f, 19.615f)
            curveTo(16.015f, 19.54f, 16f, 19.461f, 16f, 19.379f)
            verticalLineTo(15.621f)
            curveTo(16f, 15.537f, 16.015f, 15.457f, 16.046f, 15.382f)
            curveTo(16.08f, 15.306f, 16.123f, 15.241f, 16.177f, 15.184f)
            curveTo(16.231f, 15.128f, 16.294f, 15.084f, 16.366f, 15.052f)
            curveTo(16.439f, 15.017f, 16.516f, 15f, 16.596f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarPlay, contentDescription = null)
    }
}
