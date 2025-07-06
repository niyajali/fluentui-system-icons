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
 * StreamOutput Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent process flows in work streams.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_stream_output_20_filled.svg)
 * 
 * @return The [ImageVector] for the StreamOutput icon.
 */
public val FluentIcons.Filled.StreamOutput: ImageVector
    get() {
        if (_streamOutput != null) {
            return _streamOutput!!
        }
        _streamOutput = Builder(name = "StreamOutput", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.78f, 1.97f)
                curveTo(16.487f, 1.677f, 16.013f, 1.677f, 15.72f, 1.97f)
                curveTo(15.427f, 2.263f, 15.427f, 2.737f, 15.72f, 3.03f)
                lineTo(17.439f, 4.75f)
                lineTo(13.75f, 4.75f)
                curveTo(11.127f, 4.75f, 9.0f, 6.877f, 9.0f, 9.5f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 12.295f, 7.545f, 13.75f, 5.75f, 13.75f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.75f, 2.0f, 14.086f, 2.0f, 14.5f)
                curveTo(2.0f, 14.914f, 2.336f, 15.25f, 2.75f, 15.25f)
                horizontalLineTo(5.75f)
                curveTo(8.373f, 15.25f, 10.5f, 13.123f, 10.5f, 10.5f)
                verticalLineTo(9.5f)
                curveTo(10.5f, 7.705f, 11.955f, 6.25f, 13.75f, 6.25f)
                lineTo(17.439f, 6.25f)
                lineTo(15.72f, 7.97f)
                curveTo(15.427f, 8.263f, 15.427f, 8.737f, 15.72f, 9.03f)
                curveTo(16.013f, 9.323f, 16.487f, 9.323f, 16.78f, 9.03f)
                lineTo(19.78f, 6.03f)
                curveTo(20.073f, 5.737f, 20.073f, 5.263f, 19.78f, 4.97f)
                lineTo(16.78f, 1.97f)
                close()
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
                moveTo(14.164f, 7.501f)
                curveTo(13.92f, 7.986f, 13.863f, 8.532f, 13.994f, 9.045f)
                curveTo(13.706f, 9.149f, 13.5f, 9.426f, 13.5f, 9.75f)
                verticalLineTo(10.75f)
                curveTo(13.5f, 14.754f, 10.254f, 18.0f, 6.25f, 18.0f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 18.0f, 5.0f, 17.664f, 5.0f, 17.25f)
                curveTo(5.0f, 16.836f, 5.336f, 16.5f, 5.75f, 16.5f)
                horizontalLineTo(6.25f)
                curveTo(9.426f, 16.5f, 12.0f, 13.925f, 12.0f, 10.75f)
                verticalLineTo(9.75f)
                curveTo(12.0f, 8.536f, 12.961f, 7.547f, 14.164f, 7.501f)
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
        Image(imageVector = FluentIcons.Filled.StreamOutput, contentDescription = "StreamOutput Icon")
    }
}

