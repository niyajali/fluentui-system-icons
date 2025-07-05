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
 * DocumentFs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a F# document.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_fs_16_regular.svg)
 * 
 * @return The [ImageVector] for the DocumentFs icon.
 */
public val FluentIcons.Regular.DocumentFs: ImageVector
    get() {
        if (_documentFs != null) {
            return _documentFs!!
        }
        _documentFs = Builder(name = "DocumentFs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.561f, 4.354f)
                lineTo(10.646f, 1.439f)
                curveTo(10.365f, 1.158f, 9.984f, 1.0f, 9.586f, 1.0f)
                horizontalLineTo(6.0f)
                curveTo(5.47f, 1.0f, 4.961f, 1.211f, 4.586f, 1.586f)
                curveTo(4.211f, 1.961f, 4.0f, 2.47f, 4.0f, 3.0f)
                verticalLineTo(8.829f)
                curveTo(4.42f, 8.958f, 4.777f, 9.239f, 5.0f, 9.617f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.735f, 5.105f, 2.48f, 5.293f, 2.293f)
                curveTo(5.48f, 2.105f, 5.735f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.5f)
                curveTo(9.0f, 4.898f, 9.158f, 5.279f, 9.439f, 5.561f)
                curveTo(9.721f, 5.842f, 10.102f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 13.265f, 12.895f, 13.52f, 12.707f, 13.707f)
                curveTo(12.52f, 13.895f, 12.265f, 14.0f, 12.0f, 14.0f)
                horizontalLineTo(11.172f)
                curveTo(11.04f, 14.425f, 10.75f, 14.783f, 10.362f, 15.0f)
                horizontalLineTo(12.0f)
                curveTo(12.53f, 15.0f, 13.039f, 14.789f, 13.414f, 14.414f)
                curveTo(13.789f, 14.039f, 14.0f, 13.53f, 14.0f, 13.0f)
                verticalLineTo(5.414f)
                curveTo(14.0f, 5.016f, 13.842f, 4.635f, 13.561f, 4.354f)
                close()
                moveTo(10.5f, 5.0f)
                curveTo(10.367f, 5.0f, 10.24f, 4.947f, 10.146f, 4.854f)
                curveTo(10.053f, 4.76f, 10.0f, 4.633f, 10.0f, 4.5f)
                verticalLineTo(2.207f)
                lineTo(12.793f, 5.0f)
                horizontalLineTo(10.5f)
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
                moveTo(3.854f, 10.854f)
                curveTo(3.947f, 10.76f, 4.0f, 10.633f, 4.0f, 10.5f)
                curveTo(4.0f, 10.367f, 3.947f, 10.24f, 3.854f, 10.146f)
                curveTo(3.76f, 10.053f, 3.633f, 10.0f, 3.5f, 10.0f)
                horizontalLineTo(1.5f)
                curveTo(1.367f, 10.0f, 1.24f, 10.053f, 1.146f, 10.146f)
                curveTo(1.053f, 10.24f, 1.0f, 10.367f, 1.0f, 10.5f)
                verticalLineTo(14.5f)
                curveTo(1.0f, 14.633f, 1.053f, 14.76f, 1.146f, 14.854f)
                curveTo(1.24f, 14.947f, 1.367f, 15.0f, 1.5f, 15.0f)
                curveTo(1.633f, 15.0f, 1.76f, 14.947f, 1.854f, 14.854f)
                curveTo(1.947f, 14.76f, 2.0f, 14.633f, 2.0f, 14.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                curveTo(3.133f, 13.0f, 3.26f, 12.947f, 3.354f, 12.854f)
                curveTo(3.447f, 12.76f, 3.5f, 12.633f, 3.5f, 12.5f)
                curveTo(3.5f, 12.367f, 3.447f, 12.24f, 3.354f, 12.146f)
                curveTo(3.26f, 12.053f, 3.133f, 12.0f, 3.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.5f)
                curveTo(3.633f, 11.0f, 3.76f, 10.947f, 3.854f, 10.854f)
                close()
            }
        }
        .build()
        return _documentFs!!
    }

@Suppress("ObjectPropertyName")
private var _documentFs: ImageVector? = null

@Preview
@Composable
private fun DocumentFsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentFs, contentDescription = "DocumentFs Icon")
    }
}

