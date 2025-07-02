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
 * TextDirectionRotate45Right icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: text, direction, rotate45right
 * - Source: ic_fluent_text_direction_rotate_45_right_24_filled.svg
 * 
 * @return The [ImageVector] for the TextDirectionRotate45Right icon.
 */
public val FluentIcons.Filled.TextDirectionRotate45Right: ImageVector
    get() {
        if (_textDirectionRotate45Right != null) {
            return _textDirectionRotate45Right!!
        }
        _textDirectionRotate45Right = Builder(name = "TextDirectionRotate45Right", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.5f)
                curveTo(22.0f, 10.948f, 21.552f, 10.5f, 21.0f, 10.5f)
                curveTo(20.448f, 10.5f, 20.0f, 10.948f, 20.0f, 11.5f)
                verticalLineTo(11.586f)
                lineTo(16.957f, 8.543f)
                curveTo(16.567f, 8.152f, 15.933f, 8.152f, 15.543f, 8.543f)
                curveTo(15.152f, 8.933f, 15.152f, 9.567f, 15.543f, 9.957f)
                lineTo(18.586f, 13.0f)
                horizontalLineTo(18.5f)
                curveTo(17.948f, 13.0f, 17.5f, 13.448f, 17.5f, 14.0f)
                curveTo(17.5f, 14.552f, 17.948f, 15.0f, 18.5f, 15.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 15.0f, 22.0f, 14.552f, 22.0f, 14.0f)
                verticalLineTo(11.5f)
                close()
                moveTo(16.404f, 3.428f)
                curveTo(16.585f, 3.046f, 16.506f, 2.592f, 16.207f, 2.293f)
                curveTo(15.908f, 1.994f, 15.454f, 1.915f, 15.072f, 2.096f)
                lineTo(5.572f, 6.596f)
                curveTo(5.073f, 6.833f, 4.86f, 7.429f, 5.096f, 7.928f)
                curveTo(5.333f, 8.427f, 5.929f, 8.64f, 6.428f, 8.404f)
                lineTo(8.845f, 7.259f)
                lineTo(11.241f, 9.655f)
                lineTo(10.096f, 12.072f)
                curveTo(9.86f, 12.571f, 10.073f, 13.167f, 10.572f, 13.404f)
                curveTo(11.071f, 13.64f, 11.667f, 13.427f, 11.904f, 12.928f)
                lineTo(16.404f, 3.428f)
                close()
                moveTo(12.15f, 7.736f)
                lineTo(10.764f, 6.35f)
                lineTo(13.398f, 5.102f)
                lineTo(12.15f, 7.736f)
                close()
                moveTo(15.0f, 18.5f)
                curveTo(15.0f, 17.948f, 14.552f, 17.5f, 14.0f, 17.5f)
                curveTo(13.448f, 17.5f, 13.0f, 17.948f, 13.0f, 18.5f)
                verticalLineTo(18.586f)
                lineTo(3.707f, 9.293f)
                curveTo(3.317f, 8.902f, 2.683f, 8.902f, 2.293f, 9.293f)
                curveTo(1.902f, 9.683f, 1.902f, 10.317f, 2.293f, 10.707f)
                lineTo(11.586f, 20.0f)
                horizontalLineTo(11.5f)
                curveTo(10.948f, 20.0f, 10.5f, 20.448f, 10.5f, 21.0f)
                curveTo(10.5f, 21.552f, 10.948f, 22.0f, 11.5f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 22.0f, 15.0f, 21.552f, 15.0f, 21.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _textDirectionRotate45Right!!
    }

@Suppress("ObjectPropertyName")
private var _textDirectionRotate45Right: ImageVector? = null

@Preview
@Composable
private fun TextDirectionRotate45RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDirectionRotate45Right, contentDescription = null)
    }
}

