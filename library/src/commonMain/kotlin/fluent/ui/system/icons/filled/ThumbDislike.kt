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
package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ThumbDislike: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ThumbDislike",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.056f, 14.183f)
            curveTo(15.516f, 15.61f, 15.749f, 16.859f, 15.749f, 17.936f)
            curveTo(15.749f, 20.334f, 14.81f, 22.183f, 13.249f, 22.183f)
            curveTo(12.449f, 22.183f, 12.171f, 21.733f, 11.866f, 20.637f)
            lineTo(11.597f, 19.615f)
            curveTo(11.496f, 19.257f, 11.32f, 18.646f, 11.07f, 17.784f)
            curveTo(11.063f, 17.761f, 11.053f, 17.739f, 11.04f, 17.719f)
            lineTo(8.174f, 13.234f)
            curveTo(7.496f, 12.173f, 6.495f, 11.357f, 5.319f, 10.907f)
            lineTo(4.062f, 10.426f)
            curveTo(3.269f, 10.122f, 2.808f, 9.292f, 2.97f, 8.458f)
            lineTo(3.656f, 4.919f)
            curveTo(3.823f, 4.058f, 4.476f, 3.372f, 5.329f, 3.162f)
            lineTo(13.579f, 1.141f)
            curveTo(16.11f, 0.52f, 18.668f, 2.055f, 19.312f, 4.58f)
            lineTo(20.886f, 10.753f)
            curveTo(21.261f, 12.225f, 20.372f, 13.722f, 18.901f, 14.097f)
            curveTo(18.679f, 14.154f, 18.45f, 14.183f, 18.221f, 14.183f)
            horizontalLineTo(15.056f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ThumbDislikePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ThumbDislike, contentDescription = null)
    }
}
