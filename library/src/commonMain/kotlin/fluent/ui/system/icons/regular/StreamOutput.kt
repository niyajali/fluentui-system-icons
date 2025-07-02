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
 * StreamOutput icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: stream, output
 * - Source: ic_fluent_stream_output_20_regular.svg
 * 
 * @return The [ImageVector] for the StreamOutput icon.
 */
public val FluentIcons.Regular.StreamOutput: ImageVector
    get() {
        if (_streamOutput != null) {
            return _streamOutput!!
        }
        _streamOutput = Builder(name = "StreamOutput", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.146f, 2.146f)
                curveTo(16.342f, 1.951f, 16.658f, 1.951f, 16.854f, 2.146f)
                lineTo(19.842f, 5.135f)
                curveTo(19.94f, 5.226f, 20.0f, 5.356f, 20.0f, 5.5f)
                curveTo(20.0f, 5.644f, 19.94f, 5.774f, 19.842f, 5.865f)
                lineTo(16.854f, 8.854f)
                curveTo(16.658f, 9.049f, 16.342f, 9.049f, 16.146f, 8.854f)
                curveTo(15.951f, 8.658f, 15.951f, 8.342f, 16.146f, 8.146f)
                lineTo(18.293f, 6.0f)
                horizontalLineTo(13.5f)
                curveTo(11.6f, 6.0f, 10.0f, 7.6f, 10.0f, 9.5f)
                verticalLineTo(10.5f)
                curveTo(10.0f, 13.0f, 8.0f, 15.0f, 5.5f, 15.0f)
                horizontalLineTo(2.5f)
                curveTo(2.2f, 15.0f, 2.0f, 14.8f, 2.0f, 14.5f)
                curveTo(2.0f, 14.2f, 2.2f, 14.0f, 2.5f, 14.0f)
                horizontalLineTo(5.5f)
                curveTo(7.4f, 14.0f, 9.0f, 12.4f, 9.0f, 10.5f)
                verticalLineTo(9.5f)
                curveTo(9.0f, 7.0f, 11.0f, 5.0f, 13.5f, 5.0f)
                horizontalLineTo(18.293f)
                lineTo(16.146f, 2.854f)
                curveTo(15.951f, 2.658f, 15.951f, 2.342f, 16.146f, 2.146f)
                close()
                moveTo(2.5f, 12.0f)
                horizontalLineTo(5.0f)
                curveTo(6.1f, 12.0f, 7.0f, 11.1f, 7.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 5.7f, 9.7f, 3.0f, 13.0f, 3.0f)
                horizontalLineTo(13.5f)
                curveTo(13.8f, 3.0f, 14.0f, 2.8f, 14.0f, 2.5f)
                curveTo(14.0f, 2.2f, 13.8f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(9.1f, 2.0f, 6.0f, 5.1f, 6.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(6.0f, 10.6f, 5.6f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(2.5f)
                curveTo(2.2f, 11.0f, 2.0f, 11.2f, 2.0f, 11.5f)
                curveTo(2.0f, 11.8f, 2.2f, 12.0f, 2.5f, 12.0f)
                close()
                moveTo(15.1f, 8.0f)
                horizontalLineTo(14.0f)
                curveTo(12.9f, 8.0f, 12.0f, 8.9f, 12.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(12.0f, 14.3f, 9.3f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(5.2f, 17.0f, 5.0f, 17.2f, 5.0f, 17.5f)
                curveTo(5.0f, 17.8f, 5.2f, 18.0f, 5.5f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(9.9f, 18.0f, 13.0f, 14.9f, 13.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(13.0f, 9.4f, 13.4f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(15.1f)
                curveTo(15.0f, 8.7f, 15.0f, 8.3f, 15.1f, 8.0f)
                close()
            }
        }
        .build()
        return _streamOutput!!
    }

@Suppress("ObjectPropertyName")
private var _streamOutput: ImageVector? = null

@Preview
@Composable
private fun StreamOutputPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StreamOutput, contentDescription = null)
    }
}

