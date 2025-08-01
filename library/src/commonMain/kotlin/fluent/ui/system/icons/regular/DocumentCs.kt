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
 * DocumentCs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a C# document.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_cs_16_regular.svg)
 * 
 * @return The [ImageVector] for the DocumentCs icon.
 */
public val FluentIcons.Regular.DocumentCs: ImageVector
    get() {
        if (_documentCs != null) {
            return _documentCs!!
        }
        _documentCs = Builder(name = "DocumentCs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.65f, 1.44f)
                lineTo(13.56f, 4.35f)
                curveTo(13.84f, 4.632f, 13.998f, 5.013f, 14.0f, 5.41f)
                verticalLineTo(13.0f)
                curveTo(13.998f, 13.53f, 13.787f, 14.038f, 13.413f, 14.413f)
                curveTo(13.038f, 14.787f, 12.53f, 14.998f, 12.0f, 15.0f)
                horizontalLineTo(10.4f)
                curveTo(10.774f, 14.774f, 11.052f, 14.418f, 11.18f, 14.0f)
                horizontalLineTo(12.0f)
                curveTo(12.265f, 14.0f, 12.52f, 13.895f, 12.707f, 13.707f)
                curveTo(12.895f, 13.52f, 13.0f, 13.265f, 13.0f, 13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                curveTo(10.102f, 6.0f, 9.721f, 5.842f, 9.439f, 5.561f)
                curveTo(9.158f, 5.279f, 9.0f, 4.898f, 9.0f, 4.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.735f, 2.0f, 5.48f, 2.105f, 5.293f, 2.293f)
                curveTo(5.105f, 2.48f, 5.0f, 2.735f, 5.0f, 3.0f)
                verticalLineTo(9.61f)
                curveTo(4.951f, 9.694f, 4.907f, 9.78f, 4.87f, 9.87f)
                curveTo(4.828f, 9.886f, 4.788f, 9.906f, 4.75f, 9.93f)
                curveTo(4.661f, 9.796f, 4.557f, 9.671f, 4.44f, 9.56f)
                curveTo(4.308f, 9.424f, 4.16f, 9.303f, 4.0f, 9.2f)
                verticalLineTo(3.0f)
                curveTo(4.002f, 2.47f, 4.213f, 1.962f, 4.588f, 1.588f)
                curveTo(4.962f, 1.213f, 5.47f, 1.002f, 6.0f, 1.0f)
                horizontalLineTo(9.59f)
                curveTo(9.987f, 1.002f, 10.368f, 1.16f, 10.65f, 1.44f)
                close()
                moveTo(10.146f, 4.854f)
                curveTo(10.24f, 4.947f, 10.367f, 5.0f, 10.5f, 5.0f)
                horizontalLineTo(12.79f)
                lineTo(10.0f, 2.21f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 4.633f, 10.053f, 4.76f, 10.146f, 4.854f)
                close()
                moveTo(2.5f, 15.0f)
                curveTo(2.102f, 15.0f, 1.721f, 14.842f, 1.439f, 14.561f)
                curveTo(1.158f, 14.279f, 1.0f, 13.898f, 1.0f, 13.5f)
                verticalLineTo(11.5f)
                curveTo(1.0f, 11.102f, 1.158f, 10.721f, 1.439f, 10.439f)
                curveTo(1.721f, 10.158f, 2.102f, 10.0f, 2.5f, 10.0f)
                curveTo(2.898f, 10.0f, 3.279f, 10.158f, 3.561f, 10.439f)
                curveTo(3.842f, 10.721f, 4.0f, 11.102f, 4.0f, 11.5f)
                curveTo(4.0f, 11.633f, 3.947f, 11.76f, 3.854f, 11.854f)
                curveTo(3.76f, 11.947f, 3.633f, 12.0f, 3.5f, 12.0f)
                curveTo(3.367f, 12.0f, 3.24f, 11.947f, 3.146f, 11.854f)
                curveTo(3.053f, 11.76f, 3.0f, 11.633f, 3.0f, 11.5f)
                curveTo(3.0f, 11.367f, 2.947f, 11.24f, 2.854f, 11.146f)
                curveTo(2.76f, 11.053f, 2.633f, 11.0f, 2.5f, 11.0f)
                curveTo(2.367f, 11.0f, 2.24f, 11.053f, 2.146f, 11.146f)
                curveTo(2.053f, 11.24f, 2.0f, 11.367f, 2.0f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(2.0f, 13.633f, 2.053f, 13.76f, 2.146f, 13.854f)
                curveTo(2.24f, 13.947f, 2.367f, 14.0f, 2.5f, 14.0f)
                curveTo(2.633f, 14.0f, 2.76f, 13.947f, 2.854f, 13.854f)
                curveTo(2.947f, 13.76f, 3.0f, 13.633f, 3.0f, 13.5f)
                curveTo(3.0f, 13.367f, 3.053f, 13.24f, 3.146f, 13.146f)
                curveTo(3.24f, 13.053f, 3.367f, 13.0f, 3.5f, 13.0f)
                curveTo(3.633f, 13.0f, 3.76f, 13.053f, 3.854f, 13.146f)
                curveTo(3.947f, 13.24f, 4.0f, 13.367f, 4.0f, 13.5f)
                curveTo(4.0f, 13.898f, 3.842f, 14.279f, 3.561f, 14.561f)
                curveTo(3.279f, 14.842f, 2.898f, 15.0f, 2.5f, 15.0f)
                close()
                moveTo(9.5f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 12.0f, 9.76f, 11.947f, 9.854f, 11.854f)
                curveTo(9.947f, 11.76f, 10.0f, 11.633f, 10.0f, 11.5f)
                curveTo(10.0f, 11.367f, 9.947f, 11.24f, 9.854f, 11.146f)
                curveTo(9.76f, 11.053f, 9.633f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 10.367f, 8.947f, 10.24f, 8.854f, 10.146f)
                curveTo(8.76f, 10.053f, 8.633f, 10.0f, 8.5f, 10.0f)
                curveTo(8.367f, 10.0f, 8.24f, 10.053f, 8.146f, 10.146f)
                curveTo(8.053f, 10.24f, 8.0f, 10.367f, 8.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 10.367f, 6.947f, 10.24f, 6.854f, 10.146f)
                curveTo(6.76f, 10.053f, 6.633f, 10.0f, 6.5f, 10.0f)
                curveTo(6.367f, 10.0f, 6.24f, 10.053f, 6.146f, 10.146f)
                curveTo(6.053f, 10.24f, 6.0f, 10.367f, 6.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 11.0f, 5.24f, 11.053f, 5.146f, 11.146f)
                curveTo(5.053f, 11.24f, 5.0f, 11.367f, 5.0f, 11.5f)
                curveTo(5.0f, 11.633f, 5.053f, 11.76f, 5.146f, 11.854f)
                curveTo(5.24f, 11.947f, 5.367f, 12.0f, 5.5f, 12.0f)
                horizontalLineTo(6.009f)
                lineTo(6.015f, 13.0f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 13.0f, 5.24f, 13.053f, 5.146f, 13.146f)
                curveTo(5.053f, 13.24f, 5.0f, 13.367f, 5.0f, 13.5f)
                curveTo(5.0f, 13.633f, 5.053f, 13.76f, 5.146f, 13.854f)
                curveTo(5.24f, 13.947f, 5.367f, 14.0f, 5.5f, 14.0f)
                horizontalLineTo(6.021f)
                verticalLineTo(14.5f)
                curveTo(6.021f, 14.633f, 6.074f, 14.76f, 6.167f, 14.854f)
                curveTo(6.261f, 14.947f, 6.388f, 15.0f, 6.521f, 15.0f)
                curveTo(6.654f, 15.0f, 6.781f, 14.947f, 6.875f, 14.854f)
                curveTo(6.968f, 14.76f, 7.021f, 14.633f, 7.021f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                curveTo(8.0f, 14.633f, 8.053f, 14.76f, 8.146f, 14.854f)
                curveTo(8.24f, 14.947f, 8.367f, 15.0f, 8.5f, 15.0f)
                curveTo(8.633f, 15.0f, 8.76f, 14.947f, 8.854f, 14.854f)
                curveTo(8.947f, 14.76f, 9.0f, 14.633f, 9.0f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 14.0f, 9.76f, 13.947f, 9.854f, 13.854f)
                curveTo(9.947f, 13.76f, 10.0f, 13.633f, 10.0f, 13.5f)
                curveTo(10.0f, 13.367f, 9.947f, 13.24f, 9.854f, 13.146f)
                curveTo(9.76f, 13.053f, 9.633f, 13.0f, 9.5f, 13.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(7.015f)
                lineTo(7.009f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _documentCs!!
    }

@Suppress("ObjectPropertyName")
private var _documentCs: ImageVector? = null

@Preview
@Composable
private fun DocumentCsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentCs, contentDescription = "DocumentCs Icon")
    }
}

