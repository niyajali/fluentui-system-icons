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
 * CodeTextOff icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: code, text, off
 * - Source: ic_fluent_code_text_off_16_filled.svg
 * 
 * @return The [ImageVector] for the CodeTextOff icon.
 */
public val FluentIcons.Filled.CodeTextOff: ImageVector
    get() {
        if (_codeTextOff != null) {
            return _codeTextOff!!
        }
        _codeTextOff = Builder(name = "CodeTextOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.25f, 6.999f)
                horizontalLineTo(10.25f)
                curveTo(9.836f, 6.999f, 9.5f, 6.663f, 9.5f, 6.249f)
                curveTo(9.5f, 5.835f, 9.836f, 5.499f, 10.25f, 5.499f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 5.499f, 14.0f, 5.835f, 14.0f, 6.249f)
                curveTo(14.0f, 6.663f, 13.664f, 6.999f, 13.25f, 6.999f)
                close()
                moveTo(9.75f, 3.999f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 3.999f, 15.0f, 3.663f, 15.0f, 3.249f)
                curveTo(15.0f, 2.835f, 14.664f, 2.499f, 14.25f, 2.499f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 2.499f, 9.0f, 2.835f, 9.0f, 3.249f)
                curveTo(9.0f, 3.663f, 9.336f, 3.999f, 9.75f, 3.999f)
                close()
                moveTo(8.75f, 11.499f)
                horizontalLineTo(1.75f)
                curveTo(1.336f, 11.499f, 1.0f, 11.835f, 1.0f, 12.249f)
                curveTo(1.0f, 12.663f, 1.336f, 12.999f, 1.75f, 12.999f)
                horizontalLineTo(8.75f)
                curveTo(9.164f, 12.999f, 9.5f, 12.663f, 9.5f, 12.249f)
                curveTo(9.5f, 11.835f, 9.164f, 11.499f, 8.75f, 11.499f)
                close()
                moveTo(6.75f, 3.999f)
                curveTo(7.164f, 3.999f, 7.5f, 3.663f, 7.5f, 3.249f)
                curveTo(7.5f, 2.835f, 7.164f, 2.499f, 6.75f, 2.499f)
                horizontalLineTo(4.622f)
                lineTo(6.122f, 3.999f)
                horizontalLineTo(6.75f)
                close()
                moveTo(14.854f, 14.145f)
                lineTo(1.853f, 1.146f)
                curveTo(1.658f, 0.951f, 1.341f, 0.951f, 1.146f, 1.146f)
                curveTo(0.951f, 1.341f, 0.951f, 1.658f, 1.146f, 1.853f)
                lineTo(1.792f, 2.499f)
                horizontalLineTo(1.75f)
                curveTo(1.336f, 2.499f, 1.0f, 2.835f, 1.0f, 3.249f)
                curveTo(1.0f, 3.663f, 1.336f, 3.999f, 1.75f, 3.999f)
                horizontalLineTo(3.292f)
                lineTo(4.792f, 5.499f)
                horizontalLineTo(4.75f)
                curveTo(4.336f, 5.499f, 4.0f, 5.835f, 4.0f, 6.249f)
                curveTo(4.0f, 6.663f, 4.336f, 6.999f, 4.75f, 6.999f)
                horizontalLineTo(6.292f)
                lineTo(7.792f, 8.499f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 8.499f, 3.0f, 8.835f, 3.0f, 9.249f)
                curveTo(3.0f, 9.663f, 3.336f, 9.999f, 3.75f, 9.999f)
                horizontalLineTo(9.292f)
                lineTo(14.146f, 14.853f)
                curveTo(14.244f, 14.95f, 14.372f, 14.999f, 14.5f, 14.999f)
                curveTo(14.628f, 14.998f, 14.756f, 14.95f, 14.854f, 14.852f)
                curveTo(15.049f, 14.657f, 15.049f, 14.34f, 14.854f, 14.145f)
                close()
            }
        }
        .build()
        return _codeTextOff!!
    }

@Suppress("ObjectPropertyName")
private var _codeTextOff: ImageVector? = null

@Preview
@Composable
private fun CodeTextOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeTextOff, contentDescription = null)
    }
}

