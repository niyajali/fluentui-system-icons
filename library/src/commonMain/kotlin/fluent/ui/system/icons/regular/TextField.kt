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
 * TextField icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, field
 * - Source: ic_fluent_text_field_24_regular.svg
 * 
 * @return The [ImageVector] for the TextField icon.
 */
public val FluentIcons.Regular.TextField: ImageVector
    get() {
        if (_textField != null) {
            return _textField!!
        }
        _textField = Builder(name = "TextField", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 7.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 16.5f, 14.0f, 16.836f, 14.0f, 17.25f)
                curveTo(14.0f, 17.664f, 13.664f, 18.0f, 13.25f, 18.0f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 18.0f, 10.0f, 17.664f, 10.0f, 17.25f)
                curveTo(10.0f, 16.836f, 10.336f, 16.5f, 10.75f, 16.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.25f)
                curveTo(8.5f, 8.664f, 8.164f, 9.0f, 7.75f, 9.0f)
                curveTo(7.336f, 9.0f, 7.0f, 8.664f, 7.0f, 8.25f)
                verticalLineTo(6.75f)
                curveTo(7.0f, 6.336f, 7.336f, 6.0f, 7.75f, 6.0f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 6.0f, 17.0f, 6.336f, 17.0f, 6.75f)
                verticalLineTo(8.25f)
                curveTo(17.0f, 8.664f, 16.664f, 9.0f, 16.25f, 9.0f)
                curveTo(15.836f, 9.0f, 15.5f, 8.664f, 15.5f, 8.25f)
                verticalLineTo(7.5f)
                close()
                moveTo(5.75f, 3.0f)
                curveTo(3.679f, 3.0f, 2.0f, 4.679f, 2.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2.0f, 19.321f, 3.679f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(20.321f, 21.0f, 22.0f, 19.321f, 22.0f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(22.0f, 4.679f, 20.321f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(3.5f, 6.75f)
                curveTo(3.5f, 5.507f, 4.507f, 4.5f, 5.75f, 4.5f)
                horizontalLineTo(18.25f)
                curveTo(19.493f, 4.5f, 20.5f, 5.507f, 20.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(20.5f, 18.493f, 19.493f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(5.75f)
                curveTo(4.507f, 19.5f, 3.5f, 18.493f, 3.5f, 17.25f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _textField!!
    }

@Suppress("ObjectPropertyName")
private var _textField: ImageVector? = null

@Preview
@Composable
private fun TextFieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextField, contentDescription = null)
    }
}

