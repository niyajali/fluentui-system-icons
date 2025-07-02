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
 * TableEdit icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, edit
 * - Source: ic_fluent_table_edit_24_regular.svg
 * 
 * @return The [ImageVector] for the TableEdit icon.
 */
public val FluentIcons.Regular.TableEdit: ImageVector
    get() {
        if (_tableEdit != null) {
            return _tableEdit!!
        }
        _tableEdit = Builder(name = "TableEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.749f)
                curveTo(19.544f, 3.0f, 20.998f, 4.455f, 20.998f, 6.25f)
                verticalLineTo(11.012f)
                curveTo(20.492f, 10.968f, 19.977f, 11.041f, 19.499f, 11.232f)
                verticalLineTo(9.999f)
                horizontalLineTo(15.499f)
                lineTo(15.499f, 13.999f)
                horizontalLineTo(16.354f)
                lineTo(13.999f, 16.354f)
                verticalLineTo(15.499f)
                horizontalLineTo(9.999f)
                verticalLineTo(19.499f)
                horizontalLineTo(11.54f)
                curveTo(11.533f, 19.524f, 11.527f, 19.55f, 11.52f, 19.575f)
                lineTo(11.164f, 20.998f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 20.998f, 3.0f, 19.544f, 3.0f, 17.749f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.283f, 4.5f, 4.5f, 5.283f, 4.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 9.999f)
                verticalLineTo(13.999f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 9.999f)
                horizontalLineTo(4.5f)
                close()
                moveTo(9.999f, 9.999f)
                lineTo(9.999f, 13.999f)
                horizontalLineTo(13.999f)
                lineTo(13.999f, 9.999f)
                horizontalLineTo(9.999f)
                close()
                moveTo(15.499f, 8.5f)
                horizontalLineTo(19.499f)
                verticalLineTo(6.25f)
                curveTo(19.499f, 5.283f, 18.715f, 4.5f, 17.749f, 4.5f)
                horizontalLineTo(15.499f)
                verticalLineTo(8.5f)
                close()
                moveTo(13.999f, 4.5f)
                horizontalLineTo(9.999f)
                verticalLineTo(8.5f)
                horizontalLineTo(13.999f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 15.499f)
                verticalLineTo(17.749f)
                curveTo(4.5f, 18.715f, 5.283f, 19.499f, 6.25f, 19.499f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.499f)
                horizontalLineTo(4.5f)
                close()
                moveTo(19.765f, 12.205f)
                curveTo(19.674f, 12.247f, 19.585f, 12.295f, 19.499f, 12.349f)
                curveTo(19.357f, 12.438f, 19.222f, 12.545f, 19.098f, 12.669f)
                lineTo(13.196f, 18.57f)
                curveTo(12.932f, 18.835f, 12.726f, 19.152f, 12.592f, 19.499f)
                curveTo(12.551f, 19.602f, 12.517f, 19.709f, 12.49f, 19.818f)
                lineTo(12.033f, 21.648f)
                curveTo(11.834f, 22.444f, 12.555f, 23.166f, 13.351f, 22.967f)
                lineTo(15.181f, 22.509f)
                curveTo(15.653f, 22.391f, 16.085f, 22.147f, 16.429f, 21.803f)
                lineTo(22.331f, 15.901f)
                curveTo(23.223f, 15.008f, 23.223f, 13.561f, 22.331f, 12.669f)
                curveTo(21.679f, 12.017f, 20.732f, 11.841f, 19.92f, 12.141f)
                curveTo(19.907f, 12.146f, 19.894f, 12.151f, 19.881f, 12.156f)
                curveTo(19.842f, 12.171f, 19.803f, 12.188f, 19.765f, 12.205f)
                close()
            }
        }
        .build()
        return _tableEdit!!
    }

@Suppress("ObjectPropertyName")
private var _tableEdit: ImageVector? = null

@Preview
@Composable
private fun TableEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableEdit, contentDescription = null)
    }
}

