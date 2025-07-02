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
 * StreamInputOutput icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: stream, input, output
 * - Source: ic_fluent_stream_input_output_20_regular.svg
 * 
 * @return The [ImageVector] for the StreamInputOutput icon.
 */
public val FluentIcons.Regular.StreamInputOutput: ImageVector
    get() {
        if (_streamInputOutput != null) {
            return _streamInputOutput!!
        }
        _streamInputOutput = Builder(name = "StreamInputOutput", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.686f, 3.0f, 7.0f, 5.686f, 7.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 11.105f, 6.105f, 12.0f, 5.0f, 12.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 12.0f, 2.0f, 11.776f, 2.0f, 11.5f)
                curveTo(2.0f, 11.224f, 2.224f, 11.0f, 2.5f, 11.0f)
                horizontalLineTo(5.0f)
                curveTo(5.552f, 11.0f, 6.0f, 10.552f, 6.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 5.134f, 9.134f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 2.0f, 14.0f, 2.224f, 14.0f, 2.5f)
                curveTo(14.0f, 2.776f, 13.776f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(10.0f, 9.5f)
                curveTo(10.0f, 7.567f, 11.567f, 6.0f, 13.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 6.0f, 18.0f, 5.776f, 18.0f, 5.5f)
                curveTo(18.0f, 5.224f, 17.776f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(13.5f)
                curveTo(11.015f, 5.0f, 9.0f, 7.015f, 9.0f, 9.5f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 12.433f, 7.433f, 14.0f, 5.5f, 14.0f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 14.0f, 2.0f, 14.224f, 2.0f, 14.5f)
                curveTo(2.0f, 14.776f, 2.224f, 15.0f, 2.5f, 15.0f)
                horizontalLineTo(5.5f)
                curveTo(7.985f, 15.0f, 10.0f, 12.985f, 10.0f, 10.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(13.0f, 10.0f)
                curveTo(13.0f, 9.4f, 13.4f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(17.8f, 9.0f, 18.0f, 8.8f, 18.0f, 8.5f)
                curveTo(18.0f, 8.2f, 17.8f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(14.0f)
                curveTo(12.9f, 8.0f, 12.0f, 8.9f, 12.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(12.0f, 11.9f, 11.8f, 12.7f, 11.5f, 13.4f)
                curveTo(11.8f, 13.2f, 12.1f, 13.0f, 12.5f, 13.0f)
                horizontalLineTo(12.7f)
                curveTo(12.9f, 12.4f, 13.0f, 11.7f, 13.0f, 11.0f)
                verticalLineTo(10.0f)
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
        Image(imageVector = FluentIcons.Regular.StreamInputOutput, contentDescription = null)
    }
}

