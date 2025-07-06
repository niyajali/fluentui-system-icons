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
 * DocumentFs Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent a F# document.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_document_fs_16_filled.svg)
 * 
 * @return The [ImageVector] for the DocumentFs icon.
 */
public val FluentIcons.Filled.DocumentFs: ImageVector
    get() {
        if (_documentFs != null) {
            return _documentFs!!
        }
        _documentFs = Builder(name = "DocumentFs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 5.0f)
                horizontalLineTo(13.75f)
                lineTo(10.0f, 1.25f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 4.776f, 10.224f, 5.0f, 10.5f, 5.0f)
                close()
                moveTo(10.5f, 6.0f)
                curveTo(9.672f, 6.0f, 9.0f, 5.328f, 9.0f, 4.5f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 1.0f, 4.0f, 1.672f, 4.0f, 2.5f)
                verticalLineTo(9.091f)
                curveTo(4.208f, 9.165f, 4.4f, 9.279f, 4.561f, 9.439f)
                curveTo(4.751f, 9.629f, 4.878f, 9.863f, 4.945f, 10.117f)
                curveTo(4.962f, 10.11f, 4.978f, 10.102f, 4.995f, 10.094f)
                curveTo(5.017f, 10.083f, 5.04f, 10.072f, 5.064f, 10.064f)
                curveTo(5.135f, 9.831f, 5.262f, 9.617f, 5.439f, 9.439f)
                curveTo(5.722f, 9.156f, 6.099f, 9.0f, 6.5f, 9.0f)
                curveTo(6.873f, 9.0f, 7.225f, 9.135f, 7.5f, 9.382f)
                curveTo(7.775f, 9.135f, 8.127f, 9.0f, 8.5f, 9.0f)
                curveTo(8.9f, 9.0f, 9.277f, 9.156f, 9.561f, 9.439f)
                curveTo(9.738f, 9.617f, 9.866f, 9.831f, 9.936f, 10.064f)
                curveTo(10.169f, 10.134f, 10.383f, 10.261f, 10.561f, 10.439f)
                curveTo(10.844f, 10.722f, 11.0f, 11.099f, 11.0f, 11.5f)
                curveTo(11.0f, 11.873f, 10.865f, 12.225f, 10.618f, 12.5f)
                curveTo(10.865f, 12.775f, 11.0f, 13.127f, 11.0f, 13.5f)
                curveTo(11.0f, 13.9f, 10.844f, 14.277f, 10.561f, 14.561f)
                curveTo(10.384f, 14.739f, 10.17f, 14.866f, 9.936f, 14.936f)
                curveTo(9.932f, 14.949f, 9.926f, 14.96f, 9.92f, 14.971f)
                curveTo(9.916f, 14.981f, 9.911f, 14.99f, 9.907f, 15.0f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 15.0f, 14.0f, 14.328f, 14.0f, 13.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(9.5f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 12.0f, 9.76f, 11.947f, 9.854f, 11.854f)
                curveTo(9.948f, 11.76f, 10.0f, 11.633f, 10.0f, 11.5f)
                curveTo(10.0f, 11.367f, 9.947f, 11.24f, 9.854f, 11.146f)
                curveTo(9.76f, 11.052f, 9.633f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 10.367f, 8.947f, 10.24f, 8.854f, 10.146f)
                curveTo(8.76f, 10.052f, 8.633f, 10.0f, 8.5f, 10.0f)
                curveTo(8.367f, 10.0f, 8.24f, 10.053f, 8.146f, 10.146f)
                curveTo(8.052f, 10.24f, 8.0f, 10.367f, 8.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 10.367f, 6.947f, 10.24f, 6.854f, 10.146f)
                curveTo(6.76f, 10.052f, 6.633f, 10.0f, 6.5f, 10.0f)
                curveTo(6.367f, 10.0f, 6.24f, 10.053f, 6.146f, 10.146f)
                curveTo(6.052f, 10.24f, 6.0f, 10.367f, 6.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 11.0f, 5.24f, 11.053f, 5.146f, 11.146f)
                curveTo(5.052f, 11.24f, 5.0f, 11.367f, 5.0f, 11.5f)
                curveTo(5.0f, 11.633f, 5.053f, 11.76f, 5.146f, 11.854f)
                curveTo(5.24f, 11.948f, 5.367f, 12.0f, 5.5f, 12.0f)
                horizontalLineTo(6.009f)
                lineTo(6.015f, 13.0f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 13.0f, 5.24f, 13.053f, 5.146f, 13.146f)
                curveTo(5.052f, 13.24f, 5.0f, 13.367f, 5.0f, 13.5f)
                curveTo(5.0f, 13.633f, 5.053f, 13.76f, 5.146f, 13.854f)
                curveTo(5.24f, 13.948f, 5.367f, 14.0f, 5.5f, 14.0f)
                horizontalLineTo(6.021f)
                verticalLineTo(14.5f)
                curveTo(6.021f, 14.633f, 6.074f, 14.76f, 6.167f, 14.854f)
                curveTo(6.261f, 14.948f, 6.388f, 15.0f, 6.521f, 15.0f)
                curveTo(6.654f, 15.0f, 6.781f, 14.947f, 6.875f, 14.854f)
                curveTo(6.969f, 14.76f, 7.021f, 14.633f, 7.021f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                curveTo(8.0f, 14.633f, 8.053f, 14.76f, 8.146f, 14.854f)
                curveTo(8.24f, 14.948f, 8.367f, 15.0f, 8.5f, 15.0f)
                curveTo(8.633f, 15.0f, 8.76f, 14.947f, 8.854f, 14.854f)
                curveTo(8.948f, 14.76f, 9.0f, 14.633f, 9.0f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 14.0f, 9.76f, 13.947f, 9.854f, 13.854f)
                curveTo(9.948f, 13.76f, 10.0f, 13.633f, 10.0f, 13.5f)
                curveTo(10.0f, 13.367f, 9.947f, 13.24f, 9.854f, 13.146f)
                curveTo(9.76f, 13.052f, 9.633f, 13.0f, 9.5f, 13.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineTo(7.015f)
                lineTo(7.009f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(3.854f, 10.854f)
                curveTo(3.947f, 10.76f, 4.0f, 10.633f, 4.0f, 10.5f)
                curveTo(4.0f, 10.367f, 3.948f, 10.24f, 3.854f, 10.146f)
                curveTo(3.76f, 10.053f, 3.633f, 10.0f, 3.5f, 10.0f)
                horizontalLineTo(1.5f)
                curveTo(1.367f, 10.0f, 1.24f, 10.052f, 1.146f, 10.146f)
                curveTo(1.053f, 10.24f, 1.0f, 10.367f, 1.0f, 10.5f)
                verticalLineTo(14.5f)
                curveTo(1.0f, 14.633f, 1.052f, 14.76f, 1.146f, 14.854f)
                curveTo(1.24f, 14.947f, 1.367f, 15.0f, 1.5f, 15.0f)
                curveTo(1.633f, 15.0f, 1.76f, 14.948f, 1.854f, 14.854f)
                curveTo(1.947f, 14.76f, 2.0f, 14.633f, 2.0f, 14.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                curveTo(3.133f, 13.0f, 3.26f, 12.948f, 3.354f, 12.854f)
                curveTo(3.447f, 12.76f, 3.5f, 12.633f, 3.5f, 12.5f)
                curveTo(3.5f, 12.367f, 3.448f, 12.24f, 3.354f, 12.146f)
                curveTo(3.26f, 12.053f, 3.133f, 12.0f, 3.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.5f)
                curveTo(3.633f, 11.0f, 3.76f, 10.948f, 3.854f, 10.854f)
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
        Image(imageVector = FluentIcons.Filled.DocumentFs, contentDescription = "DocumentFs Icon")
    }
}

