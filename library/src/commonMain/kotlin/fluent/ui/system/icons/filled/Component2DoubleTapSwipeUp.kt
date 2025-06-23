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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.Component2DoubleTapSwipeUp: ImageVector
    get() {
        if (_Component2DoubleTapSwipeUp != null) {
            return _Component2DoubleTapSwipeUp!!
        }
        _Component2DoubleTapSwipeUp = ImageVector.Builder(
            name = "Filled.Component2DoubleTapSwipeUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10f, 8.29f)
                lineTo(10f, 9.875f)
                curveTo(7.951f, 10.675f, 6.5f, 12.668f, 6.5f, 15f)
                curveTo(6.5f, 18.038f, 8.962f, 20.5f, 12f, 20.5f)
                curveTo(15.038f, 20.5f, 17.5f, 18.038f, 17.5f, 15f)
                curveTo(17.5f, 12.749f, 16.147f, 10.813f, 14.211f, 9.962f)
                lineTo(14.001f, 9.875f)
                lineTo(14.001f, 8.29f)
                curveTo(16.892f, 9.151f, 19f, 11.829f, 19f, 15f)
                curveTo(19f, 18.866f, 15.866f, 22f, 12f, 22f)
                curveTo(8.134f, 22f, 5f, 18.866f, 5f, 15f)
                curveTo(5f, 11.92f, 6.99f, 9.304f, 9.754f, 8.368f)
                lineTo(10f, 8.29f)
                close()
                moveTo(10f, 10.968f)
                lineTo(10f, 12.764f)
                curveTo(9.386f, 13.313f, 9f, 14.111f, 9f, 15f)
                curveTo(9f, 16.657f, 10.343f, 18f, 12f, 18f)
                curveTo(13.657f, 18f, 15f, 16.657f, 15f, 15f)
                curveTo(15f, 14.18f, 14.671f, 13.437f, 14.138f, 12.896f)
                lineTo(14.001f, 12.765f)
                lineTo(14.001f, 10.968f)
                curveTo(15.482f, 11.705f, 16.5f, 13.234f, 16.5f, 15f)
                curveTo(16.5f, 17.485f, 14.485f, 19.5f, 12f, 19.5f)
                curveTo(9.515f, 19.5f, 7.5f, 17.485f, 7.5f, 15f)
                curveTo(7.5f, 13.31f, 8.432f, 11.838f, 9.809f, 11.068f)
                lineTo(10f, 10.968f)
                close()
                moveTo(11.387f, 2.21f)
                curveTo(11.747f, 1.93f, 12.253f, 1.93f, 12.613f, 2.21f)
                lineTo(12.707f, 2.293f)
                lineTo(15.707f, 5.293f)
                lineTo(15.79f, 5.387f)
                curveTo(16.07f, 5.747f, 16.07f, 6.253f, 15.79f, 6.613f)
                lineTo(15.707f, 6.707f)
                lineTo(15.613f, 6.79f)
                curveTo(15.253f, 7.07f, 14.747f, 7.07f, 14.387f, 6.79f)
                lineTo(14.293f, 6.707f)
                lineTo(13f, 5.415f)
                verticalLineTo(15f)
                curveTo(13f, 15.552f, 12.552f, 16f, 12f, 16f)
                curveTo(11.487f, 16f, 11.064f, 15.614f, 11.007f, 15.117f)
                lineTo(11f, 15f)
                verticalLineTo(5.415f)
                lineTo(9.707f, 6.707f)
                lineTo(9.613f, 6.79f)
                curveTo(9.221f, 7.095f, 8.653f, 7.068f, 8.293f, 6.707f)
                curveTo(7.932f, 6.347f, 7.905f, 5.779f, 8.21f, 5.387f)
                lineTo(8.293f, 5.293f)
                lineTo(11.293f, 2.293f)
                lineTo(11.387f, 2.21f)
                close()
            }
        }.build()

        return _Component2DoubleTapSwipeUp!!
    }

@Suppress("ObjectPropertyName")
private var _Component2DoubleTapSwipeUp: ImageVector? = null

@Preview
@Composable
private fun Component2DoubleTapSwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Component2DoubleTapSwipeUp, contentDescription = null)
    }
}
