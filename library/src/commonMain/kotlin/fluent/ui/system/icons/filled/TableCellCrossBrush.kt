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
 * TableCellCrossBrush Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used to represent a cell in a table with the ability to apply a brush.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_cell_cross_brush_24_filled.svg)
 * 
 * @return The [ImageVector] for the TableCellCrossBrush icon.
 */
public val FluentIcons.Filled.TableCellCrossBrush: ImageVector
    get() {
        if (_tableCellCrossBrush != null) {
            return _tableCellCrossBrush!!
        }
        _tableCellCrossBrush = Builder(name = "TableCellCrossBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.925f, 10.094f)
                curveTo(22.403f, 9.965f, 23.119f, 9.881f, 23.617f, 10.379f)
                curveTo(24.114f, 10.877f, 24.03f, 11.592f, 23.901f, 12.07f)
                curveTo(23.756f, 12.612f, 23.455f, 13.236f, 23.062f, 13.886f)
                curveTo(22.268f, 15.197f, 21.004f, 16.771f, 19.478f, 18.297f)
                curveTo(19.049f, 18.726f, 18.385f, 19.401f, 17.615f, 19.751f)
                curveTo(17.42f, 19.84f, 17.208f, 19.91f, 16.983f, 19.953f)
                curveTo(17.066f, 20.878f, 16.757f, 21.83f, 16.051f, 22.539f)
                lineTo(15.846f, 22.735f)
                curveTo(14.794f, 23.68f, 13.407f, 24.055f, 12.073f, 23.98f)
                curveTo(10.653f, 23.901f, 9.224f, 23.31f, 8.211f, 22.267f)
                curveTo(8.032f, 22.081f, 7.96f, 21.818f, 8.021f, 21.567f)
                curveTo(8.083f, 21.317f, 8.267f, 21.116f, 8.512f, 21.034f)
                curveTo(9.892f, 20.574f, 10.249f, 20.12f, 10.433f, 19.778f)
                curveTo(10.564f, 19.534f, 10.605f, 19.365f, 10.761f, 19.0f)
                curveTo(10.9f, 18.674f, 11.094f, 18.305f, 11.451f, 17.947f)
                curveTo(12.16f, 17.238f, 13.115f, 16.927f, 14.041f, 17.01f)
                curveTo(14.084f, 16.786f, 14.157f, 16.575f, 14.245f, 16.381f)
                curveTo(14.595f, 15.611f, 15.27f, 14.949f, 15.699f, 14.519f)
                curveTo(17.225f, 12.993f, 18.799f, 11.728f, 20.109f, 10.935f)
                curveTo(20.76f, 10.541f, 21.383f, 10.239f, 21.925f, 10.094f)
                close()
                moveTo(14.986f, 19.008f)
                curveTo(14.303f, 18.324f, 13.195f, 18.324f, 12.512f, 19.008f)
                curveTo(12.34f, 19.179f, 12.239f, 19.359f, 12.142f, 19.588f)
                curveTo(12.061f, 19.778f, 11.922f, 20.173f, 11.753f, 20.488f)
                curveTo(11.462f, 21.03f, 11.019f, 21.51f, 10.229f, 21.934f)
                curveTo(10.812f, 22.253f, 11.48f, 22.445f, 12.156f, 22.482f)
                curveTo(13.236f, 22.543f, 14.269f, 22.211f, 14.982f, 21.486f)
                lineTo(14.986f, 21.482f)
                curveTo(15.67f, 20.799f, 15.67f, 19.691f, 14.986f, 19.008f)
                close()
                moveTo(10.508f, 17.5f)
                curveTo(10.176f, 17.895f, 9.978f, 18.285f, 9.841f, 18.607f)
                curveTo(9.702f, 18.935f, 9.62f, 19.337f, 9.32f, 19.562f)
                curveTo(9.192f, 19.658f, 8.976f, 19.786f, 8.611f, 19.933f)
                curveTo(8.42f, 20.003f, 8.223f, 20.064f, 8.037f, 20.147f)
                curveTo(8.014f, 20.018f, 8.0f, 19.886f, 8.0f, 19.75f)
                verticalLineTo(17.5f)
                horizontalLineTo(10.508f)
                close()
                moveTo(6.5f, 16.0f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 16.0f, 2.0f, 14.993f, 2.0f, 13.75f)
                verticalLineTo(10.25f)
                curveTo(2.0f, 9.007f, 3.007f, 8.0f, 4.25f, 8.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(16.0f)
                close()
                moveTo(16.0f, 12.848f)
                curveTo(15.663f, 13.156f, 15.325f, 13.477f, 14.992f, 13.811f)
                curveTo(14.592f, 14.21f, 13.774f, 15.001f, 13.335f, 15.966f)
                curveTo(13.33f, 15.977f, 13.324f, 15.989f, 13.319f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.848f)
                close()
                moveTo(19.75f, 8.0f)
                curveTo(20.58f, 8.0f, 21.303f, 8.451f, 21.693f, 9.12f)
                lineTo(21.666f, 9.127f)
                curveTo(20.994f, 9.307f, 20.278f, 9.663f, 19.592f, 10.078f)
                curveTo(18.936f, 10.475f, 18.229f, 10.978f, 17.5f, 11.561f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(13.75f, 2.0f)
                curveTo(14.993f, 2.0f, 16.0f, 3.007f, 16.0f, 4.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.25f)
                curveTo(8.0f, 3.007f, 9.007f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
            }
        }
        .build()
        return _tableCellCrossBrush!!
    }

@Suppress("ObjectPropertyName")
private var _tableCellCrossBrush: ImageVector? = null

@Preview
@Composable
private fun TableCellCrossBrushPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableCellCrossBrush, contentDescription = "TableCellCrossBrush Icon")
    }
}

