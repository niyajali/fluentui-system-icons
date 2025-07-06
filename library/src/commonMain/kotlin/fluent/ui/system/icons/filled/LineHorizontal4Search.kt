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
 * LineHorizontal4Search Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: line, horizontal4search
 * - Description: No description provided.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_line_horizontal_4_search_20_filled.svg)
 * 
 * @return The [ImageVector] for the LineHorizontal4Search icon.
 */
public val FluentIcons.Filled.LineHorizontal4Search: ImageVector
    get() {
        if (_lineHorizontal4Search != null) {
            return _lineHorizontal4Search!!
        }
        _lineHorizontal4Search = Builder(name = "LineHorizontal4Search", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 10.0f)
                curveTo(13.472f, 10.0f, 14.372f, 9.692f, 15.107f, 9.168f)
                lineTo(18.72f, 12.78f)
                curveTo(19.013f, 13.073f, 19.487f, 13.073f, 19.78f, 12.78f)
                curveTo(20.073f, 12.487f, 20.073f, 12.013f, 19.78f, 11.72f)
                lineTo(16.168f, 8.107f)
                curveTo(16.692f, 7.372f, 17.0f, 6.472f, 17.0f, 5.5f)
                curveTo(17.0f, 3.015f, 14.985f, 1.0f, 12.5f, 1.0f)
                curveTo(10.94f, 1.0f, 9.565f, 1.794f, 8.758f, 3.0f)
                curveTo(8.721f, 3.055f, 8.686f, 3.11f, 8.651f, 3.167f)
                curveTo(8.404f, 3.573f, 8.22f, 4.022f, 8.112f, 4.5f)
                curveTo(8.039f, 4.822f, 8.0f, 5.156f, 8.0f, 5.5f)
                curveTo(8.0f, 6.044f, 8.096f, 6.565f, 8.273f, 7.047f)
                curveTo(8.471f, 7.588f, 8.769f, 8.079f, 9.146f, 8.5f)
                curveTo(9.97f, 9.421f, 11.167f, 10.0f, 12.5f, 10.0f)
                close()
                moveTo(12.5f, 2.5f)
                curveTo(14.157f, 2.5f, 15.5f, 3.843f, 15.5f, 5.5f)
                curveTo(15.5f, 7.157f, 14.157f, 8.5f, 12.5f, 8.5f)
                curveTo(10.843f, 8.5f, 9.5f, 7.157f, 9.5f, 5.5f)
                curveTo(9.5f, 3.843f, 10.843f, 2.5f, 12.5f, 2.5f)
                close()
                moveTo(15.525f, 11.0f)
                lineTo(17.025f, 12.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 12.5f, 2.0f, 12.164f, 2.0f, 11.75f)
                curveTo(2.0f, 11.336f, 2.336f, 11.0f, 2.75f, 11.0f)
                lineTo(12.5f, 11.0f)
                lineTo(15.525f, 11.0f)
                close()
                moveTo(2.75f, 3.0f)
                horizontalLineTo(7.6f)
                curveTo(7.362f, 3.466f, 7.188f, 3.969f, 7.091f, 4.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 4.5f, 2.0f, 4.164f, 2.0f, 3.75f)
                curveTo(2.0f, 3.336f, 2.336f, 3.0f, 2.75f, 3.0f)
                close()
                moveTo(2.75f, 7.0f)
                horizontalLineTo(7.207f)
                curveTo(7.359f, 7.538f, 7.591f, 8.043f, 7.889f, 8.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 8.5f, 2.0f, 8.164f, 2.0f, 7.75f)
                curveTo(2.0f, 7.336f, 2.336f, 7.0f, 2.75f, 7.0f)
                close()
                moveTo(2.0f, 15.75f)
                curveTo(2.0f, 15.336f, 2.336f, 15.0f, 2.75f, 15.0f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 15.0f, 18.0f, 15.336f, 18.0f, 15.75f)
                curveTo(18.0f, 16.164f, 17.664f, 16.5f, 17.25f, 16.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 16.5f, 2.0f, 16.164f, 2.0f, 15.75f)
                close()
            }
        }
        .build()
        return _lineHorizontal4Search!!
    }

@Suppress("ObjectPropertyName")
private var _lineHorizontal4Search: ImageVector? = null

@Preview
@Composable
private fun LineHorizontal4SearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LineHorizontal4Search, contentDescription = "LineHorizontal4Search Icon")
    }
}

