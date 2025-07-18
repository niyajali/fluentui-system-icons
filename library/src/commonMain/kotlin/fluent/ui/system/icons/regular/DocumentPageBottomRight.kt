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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DocumentPageBottomRight: ImageVector
    get() {
        if (_DocumentPageBottomRight != null) {
            return _DocumentPageBottomRight!!
        }
        _DocumentPageBottomRight = ImageVector.Builder(
            name = "Regular.DocumentPageBottomRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.744f, 1.996f)
                curveTo(18.935f, 1.996f, 19.91f, 2.921f, 19.989f, 4.092f)
                lineTo(19.994f, 4.246f)
                verticalLineTo(19.744f)
                curveTo(19.994f, 20.935f, 19.069f, 21.91f, 17.898f, 21.989f)
                lineTo(17.744f, 21.994f)
                horizontalLineTo(6.244f)
                curveTo(5.053f, 21.994f, 4.078f, 21.069f, 3.999f, 19.898f)
                lineTo(3.994f, 19.744f)
                verticalLineTo(4.246f)
                curveTo(3.994f, 3.055f, 4.919f, 2.08f, 6.09f, 2.001f)
                lineTo(6.244f, 1.996f)
                horizontalLineTo(17.744f)
                close()
                moveTo(17.744f, 3.496f)
                horizontalLineTo(6.244f)
                curveTo(5.864f, 3.496f, 5.551f, 3.778f, 5.501f, 4.144f)
                lineTo(5.494f, 4.246f)
                verticalLineTo(19.744f)
                curveTo(5.494f, 20.124f, 5.776f, 20.438f, 6.142f, 20.487f)
                lineTo(6.244f, 20.494f)
                horizontalLineTo(17.744f)
                curveTo(18.124f, 20.494f, 18.438f, 20.212f, 18.487f, 19.846f)
                lineTo(18.494f, 19.744f)
                verticalLineTo(4.246f)
                curveTo(18.494f, 3.866f, 18.212f, 3.553f, 17.846f, 3.503f)
                lineTo(17.744f, 3.496f)
                close()
                moveTo(15.018f, 19.902f)
                curveTo(14.609f, 19.837f, 14.33f, 19.453f, 14.395f, 19.044f)
                lineTo(14.499f, 18.383f)
                horizontalLineTo(13.018f)
                lineTo(12.876f, 19.278f)
                curveTo(12.811f, 19.688f, 12.427f, 19.967f, 12.018f, 19.902f)
                curveTo(11.609f, 19.837f, 11.33f, 19.453f, 11.395f, 19.044f)
                lineTo(11.499f, 18.383f)
                horizontalLineTo(10.749f)
                curveTo(10.335f, 18.383f, 9.999f, 18.047f, 9.999f, 17.633f)
                curveTo(9.999f, 17.219f, 10.335f, 16.883f, 10.749f, 16.883f)
                horizontalLineTo(11.737f)
                lineTo(11.974f, 15.383f)
                horizontalLineTo(11.249f)
                curveTo(10.835f, 15.383f, 10.499f, 15.047f, 10.499f, 14.633f)
                curveTo(10.499f, 14.219f, 10.835f, 13.883f, 11.249f, 13.883f)
                horizontalLineTo(12.212f)
                lineTo(12.411f, 12.624f)
                curveTo(12.476f, 12.215f, 12.86f, 11.936f, 13.269f, 12f)
                curveTo(13.678f, 12.065f, 13.958f, 12.449f, 13.893f, 12.858f)
                lineTo(13.731f, 13.883f)
                horizontalLineTo(15.212f)
                lineTo(15.411f, 12.624f)
                curveTo(15.476f, 12.215f, 15.86f, 11.936f, 16.269f, 12f)
                curveTo(16.678f, 12.065f, 16.958f, 12.449f, 16.893f, 12.858f)
                lineTo(16.731f, 13.883f)
                horizontalLineTo(17.249f)
                curveTo(17.664f, 13.883f, 17.999f, 14.219f, 17.999f, 14.633f)
                curveTo(17.999f, 15.047f, 17.664f, 15.383f, 17.249f, 15.383f)
                horizontalLineTo(16.493f)
                lineTo(16.256f, 16.883f)
                horizontalLineTo(16.749f)
                curveTo(17.164f, 16.883f, 17.499f, 17.219f, 17.499f, 17.633f)
                curveTo(17.499f, 18.047f, 17.164f, 18.383f, 16.749f, 18.383f)
                horizontalLineTo(16.018f)
                lineTo(15.876f, 19.278f)
                curveTo(15.811f, 19.688f, 15.427f, 19.967f, 15.018f, 19.902f)
                close()
                moveTo(13.493f, 15.383f)
                lineTo(13.256f, 16.883f)
                horizontalLineTo(14.737f)
                lineTo(14.974f, 15.383f)
                horizontalLineTo(13.493f)
                close()
            }
        }.build()

        return _DocumentPageBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPageBottomRight: ImageVector? = null

@Preview
@Composable
private fun DocumentPageBottomRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentPageBottomRight, contentDescription = null)
    }
}
