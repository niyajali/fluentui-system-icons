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
 * TextDensity Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to select text density in UI scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_density_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextDensity icon.
 */
public val FluentIcons.Regular.TextDensity: ImageVector
    get() {
        if (_textDensity != null) {
            return _textDensity!!
        }
        _textDensity = Builder(name = "TextDensity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 2.0f)
                curveTo(12.664f, 2.0f, 13.0f, 2.336f, 13.0f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(13.0f, 21.664f, 12.664f, 22.0f, 12.25f, 22.0f)
                curveTo(11.836f, 22.0f, 11.5f, 21.664f, 11.5f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(11.5f, 2.336f, 11.836f, 2.0f, 12.25f, 2.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 5.0f, 2.0f, 5.336f, 2.0f, 5.75f)
                curveTo(2.0f, 6.164f, 2.336f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(10.0f, 9.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 9.0f, 2.0f, 9.336f, 2.0f, 9.75f)
                curveTo(2.0f, 10.164f, 2.336f, 10.5f, 2.75f, 10.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(10.0f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 13.336f, 2.0f, 13.75f)
                curveTo(2.0f, 14.164f, 2.336f, 14.5f, 2.75f, 14.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 17.0f, 2.0f, 17.336f, 2.0f, 17.75f)
                curveTo(2.0f, 18.164f, 2.336f, 18.5f, 2.75f, 18.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(19.75f, 18.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 16.5f, 20.5f, 16.164f, 20.5f, 15.75f)
                curveTo(20.5f, 15.336f, 20.164f, 15.0f, 19.75f, 15.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 13.5f, 22.0f, 14.507f, 22.0f, 15.75f)
                curveTo(22.0f, 16.993f, 20.993f, 18.0f, 19.75f, 18.0f)
                close()
                moveTo(19.75f, 10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 9.0f, 20.5f, 8.664f, 20.5f, 8.25f)
                curveTo(20.5f, 7.836f, 20.164f, 7.5f, 19.75f, 7.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.75f)
                curveTo(20.993f, 6.0f, 22.0f, 7.007f, 22.0f, 8.25f)
                curveTo(22.0f, 9.493f, 20.993f, 10.5f, 19.75f, 10.5f)
                close()
            }
        }
        .build()
        return _textDensity!!
    }

@Suppress("ObjectPropertyName")
private var _textDensity: ImageVector? = null

@Preview
@Composable
private fun TextDensityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextDensity, contentDescription = "TextDensity Icon")
    }
}

