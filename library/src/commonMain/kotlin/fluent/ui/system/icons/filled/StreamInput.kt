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
 * StreamInput Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent process flows in work streams.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_stream_input_20_filled.svg)
 * 
 * @return The [ImageVector] for the StreamInput icon.
 */
public val FluentIcons.Filled.StreamInput: ImageVector
    get() {
        if (_streamInput != null) {
            return _streamInput!!
        }
        _streamInput = Builder(name = "StreamInput", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, fillAlpha = 0.79f, strokeAlpha = 0.79f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 9.25f)
                curveTo(7.5f, 6.074f, 10.074f, 3.5f, 13.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 3.5f, 14.5f, 3.164f, 14.5f, 2.75f)
                curveTo(14.5f, 2.336f, 14.164f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(13.25f)
                curveTo(9.246f, 2.0f, 6.0f, 5.246f, 6.0f, 9.25f)
                verticalLineTo(10.25f)
                curveTo(6.0f, 10.664f, 5.664f, 11.0f, 5.25f, 11.0f)
                horizontalLineTo(4.901f)
                lineTo(6.194f, 12.293f)
                curveTo(6.965f, 11.936f, 7.5f, 11.156f, 7.5f, 10.25f)
                verticalLineTo(9.25f)
                close()
                moveTo(6.403f, 16.498f)
                lineTo(5.172f, 17.729f)
                curveTo(5.31f, 17.894f, 5.518f, 18.0f, 5.75f, 18.0f)
                horizontalLineTo(6.25f)
                curveTo(10.254f, 18.0f, 13.5f, 14.754f, 13.5f, 10.75f)
                verticalLineTo(9.75f)
                curveTo(13.5f, 9.336f, 13.836f, 9.0f, 14.25f, 9.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 9.0f, 18.0f, 8.664f, 18.0f, 8.25f)
                curveTo(18.0f, 7.836f, 17.664f, 7.5f, 17.25f, 7.5f)
                horizontalLineTo(14.25f)
                curveTo(13.007f, 7.5f, 12.0f, 8.507f, 12.0f, 9.75f)
                verticalLineTo(10.75f)
                curveTo(12.0f, 13.875f, 9.508f, 16.417f, 6.403f, 16.498f)
                close()
                moveTo(7.191f, 13.414f)
                curveTo(7.456f, 13.888f, 7.536f, 14.429f, 7.431f, 14.944f)
                curveTo(9.225f, 14.265f, 10.5f, 12.532f, 10.5f, 10.5f)
                verticalLineTo(9.5f)
                curveTo(10.5f, 7.705f, 11.955f, 6.25f, 13.75f, 6.25f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 6.25f, 18.0f, 5.914f, 18.0f, 5.5f)
                curveTo(18.0f, 5.086f, 17.664f, 4.75f, 17.25f, 4.75f)
                horizontalLineTo(13.75f)
                curveTo(11.127f, 4.75f, 9.0f, 6.877f, 9.0f, 9.5f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 11.778f, 8.263f, 12.883f, 7.191f, 13.414f)
                close()
                moveTo(1.72f, 10.97f)
                curveTo(2.013f, 10.677f, 2.487f, 10.677f, 2.78f, 10.97f)
                lineTo(5.78f, 13.97f)
                curveTo(6.073f, 14.263f, 6.073f, 14.737f, 5.78f, 15.03f)
                lineTo(2.78f, 18.03f)
                curveTo(2.487f, 18.323f, 2.013f, 18.323f, 1.72f, 18.03f)
                curveTo(1.427f, 17.737f, 1.427f, 17.263f, 1.72f, 16.97f)
                lineTo(3.439f, 15.25f)
                horizontalLineTo(0.75f)
                curveTo(0.336f, 15.25f, 0.0f, 14.914f, 0.0f, 14.5f)
                curveTo(0.0f, 14.086f, 0.336f, 13.75f, 0.75f, 13.75f)
                horizontalLineTo(3.439f)
                lineTo(1.72f, 12.03f)
                curveTo(1.427f, 11.737f, 1.427f, 11.263f, 1.72f, 10.97f)
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
        Image(imageVector = FluentIcons.Filled.StreamInput, contentDescription = "StreamInput Icon")
    }
}

