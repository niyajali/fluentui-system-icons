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
 * TextCaseUppercase icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: text, case, uppercase
 * - Source: ic_fluent_text_case_uppercase_24_regular.svg
 * 
 * @return The [ImageVector] for the TextCaseUppercase icon.
 */
public val FluentIcons.Regular.TextCaseUppercase: ImageVector
    get() {
        if (_textCaseUppercase != null) {
            return _textCaseUppercase!!
        }
        _textCaseUppercase = Builder(name = "TextCaseUppercase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.707f, 3.499f)
                curveTo(7.602f, 3.204f, 7.324f, 3.005f, 7.011f, 3.0f)
                curveTo(6.697f, 2.996f, 6.414f, 3.187f, 6.301f, 3.479f)
                lineTo(0.301f, 18.979f)
                curveTo(0.151f, 19.365f, 0.343f, 19.8f, 0.729f, 19.949f)
                curveTo(1.116f, 20.099f, 1.55f, 19.907f, 1.7f, 19.521f)
                lineTo(3.256f, 15.5f)
                lineTo(10.374f, 15.5f)
                lineTo(11.793f, 19.501f)
                curveTo(11.932f, 19.891f, 12.361f, 20.095f, 12.751f, 19.957f)
                curveTo(13.141f, 19.818f, 13.345f, 19.39f, 13.207f, 18.999f)
                lineTo(7.707f, 3.499f)
                close()
                moveTo(3.837f, 14.0f)
                lineTo(6.97f, 5.907f)
                lineTo(9.841f, 14.0f)
                lineTo(3.837f, 14.0f)
                close()
                moveTo(14.75f, 3.25f)
                curveTo(14.336f, 3.25f, 14.0f, 3.586f, 14.0f, 4.0f)
                verticalLineTo(19.25f)
                curveTo(14.0f, 19.664f, 14.336f, 20.0f, 14.75f, 20.0f)
                horizontalLineTo(18.875f)
                curveTo(21.429f, 20.0f, 23.5f, 17.929f, 23.5f, 15.375f)
                curveTo(23.5f, 13.54f, 22.431f, 11.954f, 20.881f, 11.207f)
                curveTo(21.871f, 10.381f, 22.5f, 9.139f, 22.5f, 7.75f)
                curveTo(22.5f, 5.265f, 20.485f, 3.25f, 18.0f, 3.25f)
                horizontalLineTo(14.75f)
                close()
                moveTo(21.0f, 7.75f)
                curveTo(21.0f, 9.407f, 19.657f, 10.75f, 18.0f, 10.75f)
                horizontalLineTo(15.5f)
                verticalLineTo(4.75f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 4.75f, 21.0f, 6.093f, 21.0f, 7.75f)
                close()
                moveTo(18.875f, 18.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.25f)
                horizontalLineTo(18.875f)
                curveTo(20.601f, 12.25f, 22.0f, 13.649f, 22.0f, 15.375f)
                curveTo(22.0f, 17.101f, 20.601f, 18.5f, 18.875f, 18.5f)
                close()
            }
        }
        .build()
        return _textCaseUppercase!!
    }

@Suppress("ObjectPropertyName")
private var _textCaseUppercase: ImageVector? = null

@Preview
@Composable
private fun TextCaseUppercasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextCaseUppercase, contentDescription = null)
    }
}

