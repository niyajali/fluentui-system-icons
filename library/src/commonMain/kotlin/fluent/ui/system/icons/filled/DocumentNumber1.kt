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
 * DocumentNumber1 icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: document, number1
 * - Source: ic_fluent_document_number_1_16_filled.svg
 * 
 * @return The [ImageVector] for the DocumentNumber1 icon.
 */
public val FluentIcons.Filled.DocumentNumber1: ImageVector
    get() {
        if (_documentNumber1 != null) {
            return _documentNumber1!!
        }
        _documentNumber1 = Builder(name = "DocumentNumber1", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 4.5f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 1.0f, 3.0f, 1.672f, 3.0f, 2.5f)
                verticalLineTo(9.05f)
                curveTo(3.632f, 9.178f, 4.177f, 9.544f, 4.537f, 10.051f)
                curveTo(4.734f, 9.932f, 4.875f, 9.787f, 4.972f, 9.657f)
                curveTo(5.561f, 8.879f, 6.445f, 8.986f, 6.756f, 9.07f)
                curveTo(6.977f, 9.13f, 7.245f, 9.25f, 7.485f, 9.474f)
                curveTo(7.735f, 9.708f, 8.0f, 10.111f, 8.0f, 10.654f)
                verticalLineTo(14.5f)
                curveTo(8.0f, 14.675f, 7.97f, 14.844f, 7.915f, 15.0f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 15.0f, 13.0f, 14.328f, 13.0f, 13.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 6.0f, 8.0f, 5.328f, 8.0f, 4.5f)
                close()
                moveTo(9.0f, 4.5f)
                verticalLineTo(1.25f)
                lineTo(12.75f, 5.0f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 5.0f, 9.0f, 4.776f, 9.0f, 4.5f)
                close()
                moveTo(1.0f, 11.5f)
                curveTo(1.0f, 10.672f, 1.672f, 10.0f, 2.5f, 10.0f)
                curveTo(3.328f, 10.0f, 4.0f, 10.672f, 4.0f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(4.0f, 14.328f, 3.328f, 15.0f, 2.5f, 15.0f)
                curveTo(1.672f, 15.0f, 1.0f, 14.328f, 1.0f, 13.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(2.5f, 11.0f)
                curveTo(2.224f, 11.0f, 2.0f, 11.224f, 2.0f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(2.0f, 13.776f, 2.224f, 14.0f, 2.5f, 14.0f)
                curveTo(2.776f, 14.0f, 3.0f, 13.776f, 3.0f, 13.5f)
                verticalLineTo(11.5f)
                curveTo(3.0f, 11.224f, 2.776f, 11.0f, 2.5f, 11.0f)
                close()
                moveTo(7.0f, 10.654f)
                curveTo(7.0f, 10.451f, 6.901f, 10.297f, 6.801f, 10.204f)
                curveTo(6.705f, 10.113f, 6.593f, 10.062f, 6.495f, 10.036f)
                curveTo(6.343f, 9.995f, 5.993f, 9.966f, 5.77f, 10.261f)
                curveTo(5.573f, 10.521f, 5.26f, 10.832f, 4.793f, 11.045f)
                curveTo(4.542f, 11.159f, 4.431f, 11.456f, 4.545f, 11.707f)
                curveTo(4.659f, 11.958f, 4.956f, 12.069f, 5.207f, 11.955f)
                curveTo(5.519f, 11.813f, 5.781f, 11.64f, 6.0f, 11.458f)
                verticalLineTo(14.5f)
                curveTo(6.0f, 14.776f, 6.224f, 15.0f, 6.5f, 15.0f)
                curveTo(6.776f, 15.0f, 7.0f, 14.776f, 7.0f, 14.5f)
                verticalLineTo(10.654f)
                close()
            }
        }
        .build()
        return _documentNumber1!!
    }

@Suppress("ObjectPropertyName")
private var _documentNumber1: ImageVector? = null

@Preview
@Composable
private fun DocumentNumber1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentNumber1, contentDescription = null)
    }
}

