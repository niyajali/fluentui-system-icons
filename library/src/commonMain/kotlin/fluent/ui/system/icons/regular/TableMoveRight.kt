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
 * TableMoveRight Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used in moving column and row scenarios. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_move_right_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableMoveRight icon.
 */
public val FluentIcons.Regular.TableMoveRight: ImageVector
    get() {
        if (_tableMoveRight != null) {
            return _tableMoveRight!!
        }
        _tableMoveRight = Builder(name = "TableMoveRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 3.75f)
                curveTo(15.5f, 3.336f, 15.164f, 3.0f, 14.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(14.75f)
                curveTo(15.164f, 21.0f, 15.5f, 20.664f, 15.5f, 20.25f)
                verticalLineTo(15.982f)
                curveTo(15.007f, 16.053f, 14.488f, 15.914f, 14.087f, 15.558f)
                curveTo(13.631f, 15.153f, 13.437f, 14.562f, 13.518f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.518f)
                curveTo(13.437f, 9.438f, 13.631f, 8.847f, 14.087f, 8.442f)
                curveTo(14.488f, 8.086f, 15.007f, 7.947f, 15.5f, 8.018f)
                verticalLineTo(3.75f)
                close()
                moveTo(4.5f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(14.0f, 8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.5f)
                close()
                moveTo(8.5f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(8.5f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(19.5f)
                close()
                moveTo(10.0f, 15.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                close()
                moveTo(19.5f, 3.75f)
                curveTo(19.5f, 3.336f, 19.836f, 3.0f, 20.25f, 3.0f)
                curveTo(20.664f, 3.0f, 21.0f, 3.336f, 21.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(21.0f, 20.664f, 20.664f, 21.0f, 20.25f, 21.0f)
                curveTo(19.836f, 21.0f, 19.5f, 20.664f, 19.5f, 20.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(14.752f, 9.189f)
                curveTo(14.442f, 9.465f, 14.414f, 9.939f, 14.689f, 10.248f)
                lineTo(15.58f, 11.25f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 11.25f, 12.0f, 11.586f, 12.0f, 12.0f)
                curveTo(12.0f, 12.414f, 12.336f, 12.75f, 12.75f, 12.75f)
                horizontalLineTo(15.58f)
                lineTo(14.689f, 13.752f)
                curveTo(14.414f, 14.061f, 14.442f, 14.535f, 14.752f, 14.811f)
                curveTo(15.061f, 15.086f, 15.535f, 15.058f, 15.811f, 14.748f)
                lineTo(17.811f, 12.498f)
                curveTo(18.063f, 12.214f, 18.063f, 11.786f, 17.811f, 11.502f)
                lineTo(15.811f, 9.252f)
                curveTo(15.535f, 8.942f, 15.061f, 8.914f, 14.752f, 9.189f)
                close()
            }
        }
        .build()
        return _tableMoveRight!!
    }

@Suppress("ObjectPropertyName")
private var _tableMoveRight: ImageVector? = null

@Preview
@Composable
private fun TableMoveRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableMoveRight, contentDescription = "TableMoveRight Icon")
    }
}

