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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * StreamInput icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: stream, input
 * - Source: ic_fluent_stream_input_20_regular.svg
 * 
 * @return The [ImageVector] for the StreamInput icon.
 */
public val FluentIcons.Regular.StreamInput: ImageVector
    get() {
        if (_streamInput != null) {
            return _streamInput!!
        }
        _streamInput = Builder(name = "StreamInput", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                curveTo(7.0f, 5.686f, 9.686f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 3.0f, 14.0f, 2.776f, 14.0f, 2.5f)
                curveTo(14.0f, 2.224f, 13.776f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(9.134f, 2.0f, 6.0f, 5.134f, 6.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(6.0f, 10.552f, 5.552f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(4.1f)
                lineTo(5.097f, 11.998f)
                curveTo(6.157f, 11.947f, 7.0f, 11.072f, 7.0f, 10.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(0.5f, 14.0f)
                curveTo(0.224f, 14.0f, 0.0f, 14.224f, 0.0f, 14.5f)
                curveTo(0.0f, 14.776f, 0.224f, 15.0f, 0.5f, 15.0f)
                horizontalLineTo(4.184f)
                lineTo(2.037f, 17.146f)
                curveTo(1.842f, 17.342f, 1.842f, 17.658f, 2.037f, 17.854f)
                curveTo(2.232f, 18.049f, 2.549f, 18.049f, 2.744f, 17.854f)
                lineTo(5.733f, 14.865f)
                curveTo(5.83f, 14.774f, 5.891f, 14.644f, 5.891f, 14.5f)
                curveTo(5.891f, 14.356f, 5.83f, 14.226f, 5.733f, 14.135f)
                lineTo(2.744f, 11.146f)
                curveTo(2.549f, 10.951f, 2.232f, 10.951f, 2.037f, 11.146f)
                curveTo(1.842f, 11.342f, 1.842f, 11.658f, 2.037f, 11.854f)
                lineTo(4.184f, 14.0f)
                horizontalLineTo(0.5f)
                close()
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 12.514f, 8.677f, 14.219f, 6.852f, 14.793f)
                curveTo(6.905f, 14.452f, 6.864f, 14.091f, 6.73f, 13.778f)
                curveTo(8.056f, 13.28f, 9.0f, 12.0f, 9.0f, 10.5f)
                verticalLineTo(9.5f)
                curveTo(9.0f, 7.015f, 11.015f, 5.0f, 13.5f, 5.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 5.0f, 18.0f, 5.224f, 18.0f, 5.5f)
                curveTo(18.0f, 5.776f, 17.776f, 6.0f, 17.5f, 6.0f)
                horizontalLineTo(13.5f)
                curveTo(11.567f, 6.0f, 10.0f, 7.567f, 10.0f, 9.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(13.448f, 9.0f, 13.0f, 9.448f, 13.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(13.0f, 14.866f, 9.866f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 18.0f, 5.0f, 17.776f, 5.0f, 17.5f)
                curveTo(5.0f, 17.224f, 5.224f, 17.0f, 5.5f, 17.0f)
                horizontalLineTo(6.0f)
                curveTo(9.314f, 17.0f, 12.0f, 14.314f, 12.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(12.0f, 8.895f, 12.895f, 8.0f, 14.0f, 8.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 8.0f, 18.0f, 8.224f, 18.0f, 8.5f)
                curveTo(18.0f, 8.776f, 17.776f, 9.0f, 17.5f, 9.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _streamInput!!
    }

@Suppress("ObjectPropertyName")
private var _streamInput: ImageVector? = null

@Preview
@Composable
private fun StreamInputPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StreamInput, contentDescription = null)
    }
}

