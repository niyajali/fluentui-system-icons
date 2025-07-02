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
 * TableLightning icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, lightning
 * - Source: ic_fluent_table_lightning_24_regular.svg
 * 
 * @return The [ImageVector] for the TableLightning icon.
 */
public val FluentIcons.Regular.TableLightning: ImageVector
    get() {
        if (_tableLightning != null) {
            return _tableLightning!!
        }
        _tableLightning = Builder(name = "TableLightning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.243f)
                curveTo(15.27f, 11.392f, 15.082f, 11.604f, 14.96f, 11.862f)
                lineTo(14.0f, 13.905f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineTo(13.955f)
                lineTo(13.25f, 15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(12.379f)
                curveTo(12.648f, 19.802f, 13.041f, 20.0f, 13.498f, 20.0f)
                horizontalLineTo(15.221f)
                lineTo(14.972f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 10.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.5f, 8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(14.0f, 4.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 15.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(16.317f, 12.0f)
                horizontalLineTo(21.144f)
                curveTo(21.527f, 12.0f, 21.768f, 12.412f, 21.58f, 12.745f)
                lineTo(19.749f, 16.0f)
                horizontalLineTo(21.245f)
                curveTo(21.89f, 16.0f, 22.234f, 16.759f, 21.81f, 17.244f)
                lineTo(16.986f, 22.752f)
                curveTo(16.481f, 23.328f, 15.543f, 22.837f, 15.728f, 22.094f)
                lineTo(16.499f, 19.0f)
                horizontalLineTo(13.497f)
                curveTo(13.13f, 19.0f, 12.888f, 18.619f, 13.044f, 18.287f)
                lineTo(15.864f, 12.287f)
                curveTo(15.947f, 12.112f, 16.123f, 12.0f, 16.317f, 12.0f)
                close()
            }
        }
        .build()
        return _tableLightning!!
    }

@Suppress("ObjectPropertyName")
private var _tableLightning: ImageVector? = null

@Preview
@Composable
private fun TableLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableLightning, contentDescription = null)
    }
}

