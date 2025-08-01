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
 * TableMoveLeft Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used in moving column and row scenarios. Contains directional variants.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_move_left_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableMoveLeft icon.
 */
public val FluentIcons.Regular.TableMoveLeft: ImageVector
    get() {
        if (_tableMoveLeft != null) {
            return _tableMoveLeft!!
        }
        _tableMoveLeft = Builder(name = "TableMoveLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 3.75f)
                curveTo(4.5f, 3.336f, 4.164f, 3.0f, 3.75f, 3.0f)
                curveTo(3.336f, 3.0f, 3.0f, 3.336f, 3.0f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(3.0f, 20.664f, 3.336f, 21.0f, 3.75f, 21.0f)
                curveTo(4.164f, 21.0f, 4.5f, 20.664f, 4.5f, 20.25f)
                lineTo(4.5f, 3.75f)
                close()
                moveTo(8.5f, 3.75f)
                curveTo(8.5f, 3.336f, 8.836f, 3.0f, 9.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(9.25f)
                curveTo(8.836f, 21.0f, 8.5f, 20.664f, 8.5f, 20.25f)
                verticalLineTo(15.982f)
                curveTo(8.992f, 16.053f, 9.512f, 15.914f, 9.913f, 15.558f)
                curveTo(10.369f, 15.153f, 10.563f, 14.562f, 10.482f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.482f)
                curveTo(10.563f, 9.438f, 10.369f, 8.847f, 9.913f, 8.442f)
                curveTo(9.512f, 8.086f, 8.992f, 7.947f, 8.5f, 8.018f)
                verticalLineTo(3.75f)
                close()
                moveTo(10.0f, 19.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.5f)
                close()
                moveTo(15.5f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(19.5f, 10.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(10.0f)
                close()
                moveTo(19.5f, 8.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                close()
                moveTo(10.0f, 4.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(10.0f)
                close()
                moveTo(9.248f, 9.189f)
                curveTo(9.558f, 9.465f, 9.586f, 9.939f, 9.311f, 10.248f)
                lineTo(8.42f, 11.25f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 11.25f, 12.0f, 11.586f, 12.0f, 12.0f)
                curveTo(12.0f, 12.414f, 11.664f, 12.75f, 11.25f, 12.75f)
                horizontalLineTo(8.42f)
                lineTo(9.311f, 13.752f)
                curveTo(9.586f, 14.061f, 9.558f, 14.535f, 9.248f, 14.811f)
                curveTo(8.939f, 15.086f, 8.465f, 15.058f, 8.189f, 14.748f)
                lineTo(6.189f, 12.498f)
                curveTo(5.937f, 12.214f, 5.937f, 11.786f, 6.189f, 11.502f)
                lineTo(8.189f, 9.252f)
                curveTo(8.465f, 8.942f, 8.939f, 8.914f, 9.248f, 9.189f)
                close()
            }
        }
        .build()
        return _tableMoveLeft!!
    }

@Suppress("ObjectPropertyName")
private var _tableMoveLeft: ImageVector? = null

@Preview
@Composable
private fun TableMoveLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableMoveLeft, contentDescription = "TableMoveLeft Icon")
    }
}

