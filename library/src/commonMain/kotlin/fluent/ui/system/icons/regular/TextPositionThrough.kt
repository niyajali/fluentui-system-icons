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
 * TextPositionThrough Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_position_through_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextPositionThrough icon.
 */
public val FluentIcons.Regular.TextPositionThrough: ImageVector
    get() {
        if (_textPositionThrough != null) {
            return _textPositionThrough!!
        }
        _textPositionThrough = Builder(name = "TextPositionThrough", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.75f, 4.0f)
                curveTo(3.336f, 4.0f, 3.0f, 4.336f, 3.0f, 4.75f)
                curveTo(3.0f, 5.164f, 3.336f, 5.5f, 3.75f, 5.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 5.5f, 21.0f, 5.164f, 21.0f, 4.75f)
                curveTo(21.0f, 4.336f, 20.664f, 4.0f, 20.25f, 4.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3.0f, 8.25f)
                curveTo(3.0f, 7.836f, 3.336f, 7.5f, 3.75f, 7.5f)
                horizontalLineTo(8.429f)
                curveTo(8.007f, 7.931f, 7.661f, 8.439f, 7.416f, 9.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 9.0f, 3.0f, 8.664f, 3.0f, 8.25f)
                close()
                moveTo(15.465f, 9.0f)
                curveTo(15.102f, 8.372f, 14.573f, 7.852f, 13.938f, 7.5f)
                curveTo(13.364f, 7.181f, 12.703f, 7.0f, 12.0f, 7.0f)
                curveTo(11.297f, 7.0f, 10.636f, 7.181f, 10.062f, 7.5f)
                curveTo(9.427f, 7.852f, 8.898f, 8.372f, 8.535f, 9.0f)
                curveTo(8.195f, 9.588f, 8.0f, 10.271f, 8.0f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(8.0f, 15.838f, 8.015f, 15.922f, 8.043f, 16.0f)
                curveTo(8.146f, 16.291f, 8.423f, 16.5f, 8.75f, 16.5f)
                curveTo(9.077f, 16.5f, 9.354f, 16.291f, 9.457f, 16.0f)
                curveTo(9.485f, 15.922f, 9.5f, 15.838f, 9.5f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(9.5f, 10.182f, 9.893f, 9.456f, 10.5f, 9.0f)
                curveTo(10.918f, 8.686f, 11.437f, 8.5f, 12.0f, 8.5f)
                curveTo(12.563f, 8.5f, 13.082f, 8.686f, 13.5f, 9.0f)
                curveTo(14.107f, 9.456f, 14.5f, 10.182f, 14.5f, 11.0f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 15.838f, 14.515f, 15.922f, 14.543f, 16.0f)
                curveTo(14.646f, 16.291f, 14.923f, 16.5f, 15.25f, 16.5f)
                curveTo(15.577f, 16.5f, 15.854f, 16.291f, 15.957f, 16.0f)
                curveTo(15.985f, 15.922f, 16.0f, 15.838f, 16.0f, 15.75f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 10.271f, 15.805f, 9.588f, 15.465f, 9.0f)
                close()
                moveTo(3.75f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 12.5f, 3.0f, 12.164f, 3.0f, 11.75f)
                curveTo(3.0f, 11.336f, 3.336f, 11.0f, 3.75f, 11.0f)
                close()
                moveTo(3.75f, 14.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.75f)
                curveTo(7.0f, 15.835f, 7.006f, 15.918f, 7.018f, 16.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 16.0f, 3.0f, 15.664f, 3.0f, 15.25f)
                curveTo(3.0f, 14.836f, 3.336f, 14.5f, 3.75f, 14.5f)
                close()
                moveTo(13.5f, 15.75f)
                curveTo(13.5f, 15.835f, 13.506f, 15.918f, 13.518f, 16.0f)
                horizontalLineTo(10.482f)
                curveTo(10.494f, 15.918f, 10.5f, 15.835f, 10.5f, 15.75f)
                verticalLineTo(14.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.75f)
                close()
                moveTo(20.25f, 12.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 11.0f, 21.0f, 11.336f, 21.0f, 11.75f)
                curveTo(21.0f, 12.164f, 20.664f, 12.5f, 20.25f, 12.5f)
                close()
                moveTo(17.0f, 15.75f)
                curveTo(17.0f, 15.835f, 16.994f, 15.918f, 16.982f, 16.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 16.0f, 21.0f, 15.664f, 21.0f, 15.25f)
                curveTo(21.0f, 14.836f, 20.664f, 14.5f, 20.25f, 14.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.75f)
                close()
                moveTo(13.5f, 12.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(15.571f, 7.5f)
                curveTo(15.993f, 7.931f, 16.339f, 8.439f, 16.584f, 9.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 9.0f, 21.0f, 8.664f, 21.0f, 8.25f)
                curveTo(21.0f, 7.836f, 20.664f, 7.5f, 20.25f, 7.5f)
                horizontalLineTo(15.571f)
                close()
                moveTo(3.75f, 18.0f)
                curveTo(3.336f, 18.0f, 3.0f, 18.336f, 3.0f, 18.75f)
                curveTo(3.0f, 19.164f, 3.336f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 19.5f, 21.0f, 19.164f, 21.0f, 18.75f)
                curveTo(21.0f, 18.336f, 20.664f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(3.75f)
                close()
            }
        }
        .build()
        return _textPositionThrough!!
    }

@Suppress("ObjectPropertyName")
private var _textPositionThrough: ImageVector? = null

@Preview
@Composable
private fun TextPositionThroughPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextPositionThrough, contentDescription = "TextPositionThrough Icon")
    }
}

