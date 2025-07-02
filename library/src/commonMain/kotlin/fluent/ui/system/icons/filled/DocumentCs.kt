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
 * DocumentCs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: document, cs
 * - Source: ic_fluent_document_cs_16_filled.svg
 * 
 * @return The [ImageVector] for the DocumentCs icon.
 */
public val FluentIcons.Filled.DocumentCs: ImageVector
    get() {
        if (_documentCs != null) {
            return _documentCs!!
        }
        _documentCs = Builder(name = "DocumentCs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
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
                verticalLineTo(9.512f)
                lineTo(4.038f, 9.541f)
                curveTo(4.117f, 9.601f, 4.196f, 9.66f, 4.268f, 9.732f)
                curveTo(4.426f, 9.89f, 4.551f, 10.074f, 4.661f, 10.266f)
                curveTo(4.787f, 10.18f, 4.92f, 10.107f, 5.065f, 10.064f)
                curveTo(5.136f, 9.831f, 5.263f, 9.617f, 5.44f, 9.439f)
                curveTo(5.723f, 9.156f, 6.1f, 9.0f, 6.501f, 9.0f)
                curveTo(6.874f, 9.0f, 7.226f, 9.135f, 7.501f, 9.382f)
                curveTo(7.776f, 9.135f, 8.128f, 9.0f, 8.501f, 9.0f)
                curveTo(8.901f, 9.0f, 9.278f, 9.156f, 9.562f, 9.439f)
                curveTo(9.739f, 9.617f, 9.867f, 9.831f, 9.937f, 10.064f)
                curveTo(10.17f, 10.134f, 10.384f, 10.261f, 10.562f, 10.439f)
                curveTo(10.845f, 10.722f, 11.001f, 11.099f, 11.001f, 11.5f)
                curveTo(11.001f, 11.873f, 10.866f, 12.225f, 10.619f, 12.5f)
                curveTo(10.866f, 12.775f, 11.001f, 13.127f, 11.001f, 13.5f)
                curveTo(11.001f, 13.9f, 10.845f, 14.277f, 10.562f, 14.561f)
                curveTo(10.385f, 14.739f, 10.171f, 14.866f, 9.937f, 14.936f)
                curveTo(9.933f, 14.949f, 9.927f, 14.96f, 9.921f, 14.971f)
                curveTo(9.917f, 14.981f, 9.912f, 14.99f, 9.908f, 15.0f)
                horizontalLineTo(12.501f)
                curveTo(13.329f, 15.0f, 14.001f, 14.328f, 14.001f, 13.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(2.5f, 15.0f)
                curveTo(2.102f, 15.0f, 1.721f, 14.842f, 1.439f, 14.561f)
                curveTo(1.158f, 14.28f, 1.0f, 13.898f, 1.0f, 13.5f)
                verticalLineTo(11.5f)
                curveTo(1.0f, 11.102f, 1.158f, 10.721f, 1.439f, 10.439f)
                curveTo(1.72f, 10.158f, 2.102f, 10.0f, 2.5f, 10.0f)
                curveTo(2.898f, 10.0f, 3.279f, 10.158f, 3.561f, 10.439f)
                curveTo(3.842f, 10.72f, 4.0f, 11.102f, 4.0f, 11.5f)
                curveTo(4.0f, 11.633f, 3.947f, 11.76f, 3.854f, 11.854f)
                curveTo(3.76f, 11.948f, 3.633f, 12.0f, 3.5f, 12.0f)
                curveTo(3.367f, 12.0f, 3.24f, 11.947f, 3.146f, 11.854f)
                curveTo(3.052f, 11.76f, 3.0f, 11.633f, 3.0f, 11.5f)
                curveTo(3.0f, 11.367f, 2.947f, 11.24f, 2.854f, 11.146f)
                curveTo(2.76f, 11.052f, 2.633f, 11.0f, 2.5f, 11.0f)
                curveTo(2.367f, 11.0f, 2.24f, 11.053f, 2.146f, 11.146f)
                curveTo(2.052f, 11.24f, 2.0f, 11.367f, 2.0f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(2.0f, 13.633f, 2.053f, 13.76f, 2.146f, 13.854f)
                curveTo(2.24f, 13.948f, 2.367f, 14.0f, 2.5f, 14.0f)
                curveTo(2.633f, 14.0f, 2.76f, 13.947f, 2.854f, 13.854f)
                curveTo(2.948f, 13.76f, 3.0f, 13.633f, 3.0f, 13.5f)
                curveTo(3.0f, 13.367f, 3.053f, 13.24f, 3.146f, 13.146f)
                curveTo(3.24f, 13.052f, 3.367f, 13.0f, 3.5f, 13.0f)
                curveTo(3.633f, 13.0f, 3.76f, 13.053f, 3.854f, 13.146f)
                curveTo(3.948f, 13.24f, 4.0f, 13.367f, 4.0f, 13.5f)
                curveTo(4.0f, 13.898f, 3.842f, 14.279f, 3.561f, 14.561f)
                curveTo(3.28f, 14.842f, 2.898f, 15.0f, 2.5f, 15.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 13.0f, 9.76f, 13.052f, 9.854f, 13.146f)
                curveTo(9.947f, 13.24f, 10.0f, 13.367f, 10.0f, 13.5f)
                curveTo(10.0f, 13.633f, 9.948f, 13.76f, 9.854f, 13.854f)
                curveTo(9.76f, 13.947f, 9.633f, 14.0f, 9.5f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.5f)
                curveTo(9.0f, 14.633f, 8.948f, 14.76f, 8.854f, 14.854f)
                curveTo(8.76f, 14.947f, 8.633f, 15.0f, 8.5f, 15.0f)
                curveTo(8.367f, 15.0f, 8.24f, 14.948f, 8.146f, 14.854f)
                curveTo(8.053f, 14.76f, 8.0f, 14.633f, 8.0f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.021f)
                verticalLineTo(14.5f)
                curveTo(7.021f, 14.633f, 6.969f, 14.76f, 6.875f, 14.854f)
                curveTo(6.781f, 14.947f, 6.654f, 15.0f, 6.521f, 15.0f)
                curveTo(6.388f, 15.0f, 6.261f, 14.948f, 6.167f, 14.854f)
                curveTo(6.074f, 14.76f, 6.021f, 14.633f, 6.021f, 14.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 14.0f, 5.24f, 13.948f, 5.146f, 13.854f)
                curveTo(5.053f, 13.76f, 5.0f, 13.633f, 5.0f, 13.5f)
                curveTo(5.0f, 13.367f, 5.052f, 13.24f, 5.146f, 13.146f)
                curveTo(5.24f, 13.053f, 5.367f, 13.0f, 5.5f, 13.0f)
                horizontalLineTo(6.015f)
                lineTo(6.009f, 12.0f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 12.0f, 5.24f, 11.948f, 5.146f, 11.854f)
                curveTo(5.053f, 11.76f, 5.0f, 11.633f, 5.0f, 11.5f)
                curveTo(5.0f, 11.367f, 5.052f, 11.24f, 5.146f, 11.146f)
                curveTo(5.24f, 11.053f, 5.367f, 11.0f, 5.5f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.5f)
                curveTo(6.0f, 10.367f, 6.052f, 10.24f, 6.146f, 10.146f)
                curveTo(6.24f, 10.053f, 6.367f, 10.0f, 6.5f, 10.0f)
                curveTo(6.633f, 10.0f, 6.76f, 10.052f, 6.854f, 10.146f)
                curveTo(6.947f, 10.24f, 7.0f, 10.367f, 7.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.5f)
                curveTo(8.0f, 10.367f, 8.052f, 10.24f, 8.146f, 10.146f)
                curveTo(8.24f, 10.053f, 8.367f, 10.0f, 8.5f, 10.0f)
                curveTo(8.633f, 10.0f, 8.76f, 10.052f, 8.854f, 10.146f)
                curveTo(8.947f, 10.24f, 9.0f, 10.367f, 9.0f, 10.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.5f)
                curveTo(9.633f, 11.0f, 9.76f, 11.052f, 9.854f, 11.146f)
                curveTo(9.947f, 11.24f, 10.0f, 11.367f, 10.0f, 11.5f)
                curveTo(10.0f, 11.633f, 9.948f, 11.76f, 9.854f, 11.854f)
                curveTo(9.76f, 11.947f, 9.633f, 12.0f, 9.5f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(7.015f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.009f)
                lineTo(7.015f, 13.0f)
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
        Image(imageVector = FluentIcons.Filled.DocumentCs, contentDescription = null)
    }
}

