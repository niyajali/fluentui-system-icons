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

public val FluentIcons.Filled.Component2DoubleTapSwipeDown: ImageVector
    get() {
        if (_Component2DoubleTapSwipeDown != null) {
            return _Component2DoubleTapSwipeDown!!
        }
        _Component2DoubleTapSwipeDown = ImageVector.Builder(
            name = "Filled.Component2DoubleTapSwipeDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10f, 15.71f)
                lineTo(10f, 14.125f)
                curveTo(7.951f, 13.325f, 6.5f, 11.332f, 6.5f, 9f)
                curveTo(6.5f, 5.962f, 8.962f, 3.5f, 12f, 3.5f)
                curveTo(15.038f, 3.5f, 17.5f, 5.962f, 17.5f, 9f)
                curveTo(17.5f, 11.251f, 16.147f, 13.187f, 14.211f, 14.038f)
                lineTo(14.001f, 14.125f)
                lineTo(14.001f, 15.71f)
                curveTo(16.892f, 14.849f, 19f, 12.171f, 19f, 9f)
                curveTo(19f, 5.134f, 15.866f, 2f, 12f, 2f)
                curveTo(8.134f, 2f, 5f, 5.134f, 5f, 9f)
                curveTo(5f, 12.08f, 6.99f, 14.696f, 9.754f, 15.632f)
                lineTo(10f, 15.71f)
                close()
                moveTo(10f, 13.032f)
                lineTo(10f, 11.236f)
                curveTo(9.386f, 10.687f, 9f, 9.889f, 9f, 9f)
                curveTo(9f, 7.343f, 10.343f, 6f, 12f, 6f)
                curveTo(13.657f, 6f, 15f, 7.343f, 15f, 9f)
                curveTo(15f, 9.82f, 14.671f, 10.563f, 14.138f, 11.104f)
                lineTo(14.001f, 11.235f)
                lineTo(14.001f, 13.032f)
                curveTo(15.482f, 12.295f, 16.5f, 10.766f, 16.5f, 9f)
                curveTo(16.5f, 6.515f, 14.485f, 4.5f, 12f, 4.5f)
                curveTo(9.515f, 4.5f, 7.5f, 6.515f, 7.5f, 9f)
                curveTo(7.5f, 10.69f, 8.432f, 12.162f, 9.809f, 12.932f)
                lineTo(10f, 13.032f)
                close()
                moveTo(11.387f, 21.79f)
                curveTo(11.747f, 22.07f, 12.253f, 22.07f, 12.613f, 21.79f)
                lineTo(12.707f, 21.707f)
                lineTo(15.707f, 18.707f)
                lineTo(15.79f, 18.613f)
                curveTo(16.07f, 18.253f, 16.07f, 17.747f, 15.79f, 17.387f)
                lineTo(15.707f, 17.293f)
                lineTo(15.613f, 17.21f)
                curveTo(15.253f, 16.93f, 14.747f, 16.93f, 14.387f, 17.21f)
                lineTo(14.293f, 17.293f)
                lineTo(13f, 18.585f)
                verticalLineTo(9f)
                curveTo(13f, 8.448f, 12.552f, 8f, 12f, 8f)
                curveTo(11.487f, 8f, 11.064f, 8.386f, 11.007f, 8.883f)
                lineTo(11f, 9f)
                verticalLineTo(18.585f)
                lineTo(9.707f, 17.293f)
                lineTo(9.613f, 17.21f)
                curveTo(9.221f, 16.905f, 8.653f, 16.932f, 8.293f, 17.293f)
                curveTo(7.932f, 17.653f, 7.905f, 18.221f, 8.21f, 18.613f)
                lineTo(8.293f, 18.707f)
                lineTo(11.293f, 21.707f)
                lineTo(11.387f, 21.79f)
                close()
            }
        }.build()

        return _Component2DoubleTapSwipeDown!!
    }

@Suppress("ObjectPropertyName")
private var _Component2DoubleTapSwipeDown: ImageVector? = null

@Preview
@Composable
private fun Component2DoubleTapSwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Component2DoubleTapSwipeDown, contentDescription = null)
    }
}
