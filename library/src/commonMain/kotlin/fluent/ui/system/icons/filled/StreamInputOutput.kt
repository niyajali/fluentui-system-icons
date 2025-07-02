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
 * StreamInputOutput icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: stream, input, output
 * - Source: ic_fluent_stream_input_output_20_filled.svg
 * 
 * @return The [ImageVector] for the StreamInputOutput icon.
 */
public val FluentIcons.Filled.StreamInputOutput: ImageVector
    get() {
        if (_streamInputOutput != null) {
            return _streamInputOutput!!
        }
        _streamInputOutput = Builder(name = "StreamInputOutput", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.25f, 3.5f)
                curveTo(10.074f, 3.5f, 7.5f, 6.074f, 7.5f, 9.25f)
                verticalLineTo(10.25f)
                curveTo(7.5f, 11.493f, 6.493f, 12.5f, 5.25f, 12.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 12.5f, 2.0f, 12.164f, 2.0f, 11.75f)
                curveTo(2.0f, 11.336f, 2.336f, 11.0f, 2.75f, 11.0f)
                horizontalLineTo(5.25f)
                curveTo(5.664f, 11.0f, 6.0f, 10.664f, 6.0f, 10.25f)
                verticalLineTo(9.25f)
                curveTo(6.0f, 5.246f, 9.246f, 2.0f, 13.25f, 2.0f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 2.0f, 14.5f, 2.336f, 14.5f, 2.75f)
                curveTo(14.5f, 3.164f, 14.164f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(13.25f)
                close()
                moveTo(10.5f, 9.5f)
                curveTo(10.5f, 7.705f, 11.955f, 6.25f, 13.75f, 6.25f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 6.25f, 18.0f, 5.914f, 18.0f, 5.5f)
                curveTo(18.0f, 5.086f, 17.664f, 4.75f, 17.25f, 4.75f)
                horizontalLineTo(13.75f)
                curveTo(11.127f, 4.75f, 9.0f, 6.877f, 9.0f, 9.5f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 12.295f, 7.545f, 13.75f, 5.75f, 13.75f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.75f, 2.0f, 14.086f, 2.0f, 14.5f)
                curveTo(2.0f, 14.914f, 2.336f, 15.25f, 2.75f, 15.25f)
                horizontalLineTo(5.75f)
                curveTo(8.373f, 15.25f, 10.5f, 13.123f, 10.5f, 10.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(14.25f, 9.0f)
                curveTo(13.836f, 9.0f, 13.5f, 9.336f, 13.5f, 9.75f)
                verticalLineTo(10.75f)
                curveTo(13.5f, 11.409f, 13.412f, 12.047f, 13.247f, 12.654f)
                curveTo(13.007f, 12.551f, 12.753f, 12.5f, 12.5f, 12.5f)
                curveTo(12.215f, 12.5f, 11.929f, 12.565f, 11.663f, 12.695f)
                curveTo(11.881f, 12.088f, 12.0f, 11.433f, 12.0f, 10.75f)
                verticalLineTo(9.75f)
                curveTo(12.0f, 8.507f, 13.007f, 7.5f, 14.25f, 7.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 7.5f, 18.0f, 7.836f, 18.0f, 8.25f)
                curveTo(18.0f, 8.664f, 17.664f, 9.0f, 17.25f, 9.0f)
                horizontalLineTo(14.25f)
                close()
                moveTo(12.854f, 18.162f)
                curveTo(13.049f, 18.357f, 13.049f, 18.674f, 12.854f, 18.869f)
                curveTo(12.658f, 19.064f, 12.342f, 19.064f, 12.146f, 18.869f)
                lineTo(10.146f, 16.869f)
                curveTo(9.951f, 16.674f, 9.951f, 16.357f, 10.146f, 16.162f)
                lineTo(12.146f, 14.162f)
                curveTo(12.342f, 13.967f, 12.658f, 13.967f, 12.854f, 14.162f)
                curveTo(13.049f, 14.357f, 13.049f, 14.674f, 12.854f, 14.869f)
                lineTo(11.707f, 16.016f)
                horizontalLineTo(17.293f)
                lineTo(16.146f, 14.869f)
                curveTo(15.951f, 14.674f, 15.951f, 14.357f, 16.146f, 14.162f)
                curveTo(16.342f, 13.967f, 16.658f, 13.967f, 16.854f, 14.162f)
                lineTo(18.854f, 16.162f)
                curveTo(19.049f, 16.357f, 19.049f, 16.674f, 18.854f, 16.869f)
                lineTo(16.854f, 18.869f)
                curveTo(16.658f, 19.064f, 16.342f, 19.064f, 16.146f, 18.869f)
                curveTo(15.951f, 18.674f, 15.951f, 18.357f, 16.146f, 18.162f)
                lineTo(17.293f, 17.016f)
                horizontalLineTo(11.707f)
                lineTo(12.854f, 18.162f)
                close()
            }
        }
        .build()
        return _streamInputOutput!!
    }

@Suppress("ObjectPropertyName")
private var _streamInputOutput: ImageVector? = null

@Preview
@Composable
private fun StreamInputOutputPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StreamInputOutput, contentDescription = null)
    }
}

