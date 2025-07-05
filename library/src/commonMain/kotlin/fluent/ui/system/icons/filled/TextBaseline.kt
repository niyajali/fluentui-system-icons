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
 * TextBaseline Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_baseline_20_filled.svg)
 * 
 * @return The [ImageVector] for the TextBaseline icon.
 */
public val FluentIcons.Filled.TextBaseline: ImageVector
    get() {
        if (_textBaseline != null) {
            return _textBaseline!!
        }
        _textBaseline = Builder(name = "TextBaseline", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.698f, 3.475f)
                curveTo(10.585f, 3.188f, 10.309f, 3.0f, 10.0f, 3.0f)
                curveTo(9.693f, 3.0f, 9.416f, 3.188f, 9.303f, 3.475f)
                lineTo(5.553f, 12.975f)
                curveTo(5.4f, 13.36f, 5.59f, 13.795f, 5.975f, 13.948f)
                curveTo(6.36f, 14.1f, 6.796f, 13.911f, 6.948f, 13.525f)
                lineTo(8.142f, 10.5f)
                horizontalLineTo(11.858f)
                lineTo(13.053f, 13.525f)
                curveTo(13.205f, 13.911f, 13.64f, 14.1f, 14.026f, 13.948f)
                curveTo(14.411f, 13.796f, 14.6f, 13.36f, 14.448f, 12.975f)
                lineTo(10.698f, 3.475f)
                close()
                moveTo(11.266f, 9.0f)
                horizontalLineTo(8.734f)
                lineTo(10.0f, 5.793f)
                lineTo(11.266f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5f, 16.0f)
                curveTo(2.224f, 16.0f, 2.0f, 16.224f, 2.0f, 16.5f)
                curveTo(2.0f, 16.776f, 2.224f, 17.0f, 2.5f, 17.0f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 17.0f, 18.0f, 16.776f, 18.0f, 16.5f)
                curveTo(18.0f, 16.224f, 17.776f, 16.0f, 17.5f, 16.0f)
                horizontalLineTo(2.5f)
                close()
            }
        }
        .build()
        return _textBaseline!!
    }

@Suppress("ObjectPropertyName")
private var _textBaseline: ImageVector? = null

@Preview
@Composable
private fun TextBaselinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBaseline, contentDescription = "TextBaseline Icon")
    }
}

