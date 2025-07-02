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
 * CodeRbRectangle icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: code, rb, rectangle
 * - Source: ic_fluent_code_rb_rectangle_16_regular.svg
 * 
 * @return The [ImageVector] for the CodeRbRectangle icon.
 */
public val FluentIcons.Regular.CodeRbRectangle: ImageVector
    get() {
        if (_codeRbRectangle != null) {
            return _codeRbRectangle!!
        }
        _codeRbRectangle = Builder(name = "CodeRbRectangle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.996f, 7.6f)
                curveTo(10.978f, 7.874f, 10.885f, 8.137f, 10.727f, 8.362f)
                curveTo(10.959f, 8.562f, 11.125f, 8.828f, 11.202f, 9.124f)
                curveTo(11.279f, 9.421f, 11.263f, 9.734f, 11.156f, 10.021f)
                curveTo(11.05f, 10.308f, 10.858f, 10.556f, 10.607f, 10.731f)
                curveTo(10.355f, 10.906f, 10.056f, 11.0f, 9.75f, 11.0f)
                horizontalLineTo(8.5f)
                curveTo(8.367f, 11.0f, 8.24f, 10.947f, 8.146f, 10.854f)
                curveTo(8.053f, 10.76f, 8.0f, 10.633f, 8.0f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(8.0f, 6.367f, 8.053f, 6.24f, 8.146f, 6.146f)
                curveTo(8.24f, 6.053f, 8.367f, 6.0f, 8.5f, 6.0f)
                horizontalLineTo(9.5f)
                curveTo(9.775f, 6.0f, 10.044f, 6.076f, 10.278f, 6.218f)
                curveTo(10.513f, 6.361f, 10.704f, 6.565f, 10.83f, 6.809f)
                curveTo(10.957f, 7.052f, 11.014f, 7.326f, 10.996f, 7.6f)
                close()
                moveTo(9.5f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 8.0f, 9.76f, 7.947f, 9.854f, 7.854f)
                curveTo(9.947f, 7.76f, 10.0f, 7.633f, 10.0f, 7.5f)
                curveTo(10.0f, 7.367f, 9.947f, 7.24f, 9.854f, 7.146f)
                curveTo(9.76f, 7.053f, 9.633f, 7.0f, 9.5f, 7.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineTo(9.75f)
                curveTo(9.883f, 10.0f, 10.01f, 9.947f, 10.104f, 9.854f)
                curveTo(10.197f, 9.76f, 10.25f, 9.633f, 10.25f, 9.5f)
                curveTo(10.25f, 9.367f, 10.197f, 9.24f, 10.104f, 9.146f)
                curveTo(10.01f, 9.053f, 9.883f, 9.0f, 9.75f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(6.522f, 8.588f)
                curveTo(6.759f, 8.981f, 6.928f, 9.411f, 7.022f, 9.86f)
                curveTo(7.029f, 9.886f, 7.035f, 9.912f, 7.041f, 9.937f)
                curveTo(7.059f, 10.013f, 7.076f, 10.082f, 7.095f, 10.137f)
                curveTo(7.168f, 10.206f, 7.218f, 10.295f, 7.239f, 10.392f)
                curveTo(7.261f, 10.49f, 7.253f, 10.592f, 7.216f, 10.685f)
                curveTo(7.179f, 10.778f, 7.115f, 10.857f, 7.032f, 10.913f)
                curveTo(6.95f, 10.97f, 6.852f, 11.0f, 6.752f, 11.0f)
                curveTo(6.276f, 11.0f, 6.162f, 10.542f, 6.052f, 10.101f)
                lineTo(6.052f, 10.1f)
                lineTo(6.049f, 10.089f)
                curveTo(5.958f, 9.73f, 5.773f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 10.633f, 4.947f, 10.76f, 4.854f, 10.854f)
                curveTo(4.76f, 10.947f, 4.633f, 11.0f, 4.5f, 11.0f)
                curveTo(4.367f, 11.0f, 4.24f, 10.947f, 4.146f, 10.854f)
                curveTo(4.053f, 10.76f, 4.0f, 10.633f, 4.0f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(4.0f, 6.367f, 4.053f, 6.24f, 4.146f, 6.146f)
                curveTo(4.24f, 6.053f, 4.367f, 6.0f, 4.5f, 6.0f)
                horizontalLineTo(5.5f)
                curveTo(5.799f, 6.002f, 6.091f, 6.094f, 6.337f, 6.263f)
                curveTo(6.584f, 6.432f, 6.775f, 6.671f, 6.885f, 6.949f)
                curveTo(6.994f, 7.227f, 7.019f, 7.532f, 6.954f, 7.824f)
                curveTo(6.889f, 8.116f, 6.739f, 8.382f, 6.522f, 8.588f)
                close()
                moveTo(5.5f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.5f)
                curveTo(5.633f, 8.0f, 5.76f, 7.947f, 5.854f, 7.854f)
                curveTo(5.947f, 7.76f, 6.0f, 7.633f, 6.0f, 7.5f)
                curveTo(6.0f, 7.367f, 5.947f, 7.24f, 5.854f, 7.146f)
                curveTo(5.76f, 7.053f, 5.633f, 7.0f, 5.5f, 7.0f)
                close()
                moveTo(2.75f, 3.0f)
                curveTo(1.783f, 3.0f, 1.0f, 3.783f, 1.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(1.0f, 13.217f, 1.783f, 14.0f, 2.75f, 14.0f)
                horizontalLineTo(12.25f)
                curveTo(13.217f, 14.0f, 14.0f, 13.217f, 14.0f, 12.25f)
                verticalLineTo(4.75f)
                curveTo(14.0f, 3.783f, 13.217f, 3.0f, 12.25f, 3.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 4.336f, 2.336f, 4.0f, 2.75f, 4.0f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 4.0f, 13.0f, 4.336f, 13.0f, 4.75f)
                verticalLineTo(12.25f)
                curveTo(13.0f, 12.664f, 12.664f, 13.0f, 12.25f, 13.0f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 13.0f, 2.0f, 12.664f, 2.0f, 12.25f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _codeRbRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _codeRbRectangle: ImageVector? = null

@Preview
@Composable
private fun CodeRbRectanglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CodeRbRectangle, contentDescription = null)
    }
}

