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
 * TableResizeRow icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, resize, row
 * - Source: ic_fluent_table_resize_row_24_regular.svg
 * 
 * @return The [ImageVector] for the TableResizeRow icon.
 */
public val FluentIcons.Regular.TableResizeRow: ImageVector
    get() {
        if (_tableResizeRow != null) {
            return _tableResizeRow!!
        }
        _tableResizeRow = Builder(name = "TableResizeRow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 15.58f)
                verticalLineTo(8.42f)
                lineTo(13.752f, 9.311f)
                curveTo(14.061f, 9.586f, 14.535f, 9.558f, 14.811f, 9.248f)
                curveTo(15.086f, 8.939f, 15.058f, 8.465f, 14.748f, 8.189f)
                lineTo(12.498f, 6.189f)
                curveTo(12.214f, 5.937f, 11.786f, 5.937f, 11.502f, 6.189f)
                lineTo(9.252f, 8.189f)
                curveTo(8.942f, 8.465f, 8.914f, 8.939f, 9.189f, 9.248f)
                curveTo(9.465f, 9.558f, 9.939f, 9.586f, 10.248f, 9.311f)
                lineTo(11.25f, 8.42f)
                verticalLineTo(15.58f)
                lineTo(10.248f, 14.689f)
                curveTo(9.939f, 14.414f, 9.465f, 14.442f, 9.189f, 14.752f)
                curveTo(8.914f, 15.061f, 8.942f, 15.535f, 9.252f, 15.811f)
                lineTo(11.502f, 17.811f)
                curveTo(11.506f, 17.814f, 11.51f, 17.818f, 11.514f, 17.821f)
                curveTo(11.638f, 17.927f, 11.797f, 17.993f, 11.971f, 18.0f)
                curveTo(11.99f, 18.0f, 12.008f, 18.0f, 12.027f, 18.0f)
                curveTo(12.209f, 17.993f, 12.374f, 17.922f, 12.501f, 17.808f)
                lineTo(14.748f, 15.811f)
                curveTo(15.058f, 15.535f, 15.086f, 15.061f, 14.811f, 14.752f)
                curveTo(14.535f, 14.442f, 14.061f, 14.414f, 13.752f, 14.689f)
                lineTo(12.75f, 15.58f)
                close()
                moveTo(17.75f, 21.0f)
                curveTo(19.545f, 21.0f, 21.0f, 19.545f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(19.5f, 17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(17.5f)
                horizontalLineTo(9.647f)
                lineTo(8.587f, 16.558f)
                curveTo(8.406f, 16.397f, 8.266f, 16.206f, 8.168f, 16.0f)
                horizontalLineTo(4.5f)
                lineTo(4.5f, 8.0f)
                horizontalLineTo(8.168f)
                curveTo(8.266f, 7.794f, 8.406f, 7.603f, 8.587f, 7.442f)
                lineTo(9.647f, 6.5f)
                lineTo(4.5f, 6.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                lineTo(17.75f, 4.5f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(6.5f)
                lineTo(14.353f, 6.5f)
                lineTo(15.413f, 7.442f)
                curveTo(15.594f, 7.603f, 15.734f, 7.794f, 15.832f, 8.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.832f)
                curveTo(15.734f, 16.206f, 15.594f, 16.397f, 15.413f, 16.558f)
                lineTo(14.353f, 17.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _tableResizeRow!!
    }

@Suppress("ObjectPropertyName")
private var _tableResizeRow: ImageVector? = null

@Preview
@Composable
private fun TableResizeRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableResizeRow, contentDescription = null)
    }
}

