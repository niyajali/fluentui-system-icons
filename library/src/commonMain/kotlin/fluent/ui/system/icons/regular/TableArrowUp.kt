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
 * TableArrowUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, arrow, up
 * - Source: ic_fluent_table_arrow_up_24_regular.svg
 * 
 * @return The [ImageVector] for the TableArrowUp icon.
 */
public val FluentIcons.Regular.TableArrowUp: ImageVector
    get() {
        if (_tableArrowUp != null) {
            return _tableArrowUp!!
        }
        _tableArrowUp = Builder(name = "TableArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(11.314f)
                curveTo(11.486f, 14.967f, 11.725f, 14.463f, 12.022f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                lineTo(14.0f, 12.022f)
                curveTo(14.463f, 11.725f, 14.967f, 11.486f, 15.5f, 11.314f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.314f)
                curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21.0f, 12.022f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.5f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(19.5f, 8.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(8.5f)
                close()
                moveTo(10.0f, 4.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 17.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                close()
                moveTo(17.427f, 14.005f)
                lineTo(17.511f, 14.0f)
                curveTo(17.532f, 14.001f, 17.553f, 14.002f, 17.574f, 14.005f)
                lineTo(17.628f, 14.017f)
                lineTo(17.691f, 14.038f)
                lineTo(17.758f, 14.072f)
                lineTo(17.806f, 14.104f)
                lineTo(20.354f, 16.646f)
                lineTo(20.411f, 16.716f)
                curveTo(20.546f, 16.911f, 20.527f, 17.18f, 20.354f, 17.354f)
                curveTo(20.18f, 17.527f, 19.911f, 17.546f, 19.716f, 17.411f)
                lineTo(19.646f, 17.354f)
                lineTo(17.999f, 15.706f)
                lineTo(18.0f, 21.0f)
                lineTo(17.992f, 21.09f)
                curveTo(17.955f, 21.294f, 17.794f, 21.455f, 17.59f, 21.492f)
                lineTo(17.5f, 21.5f)
                lineTo(17.41f, 21.492f)
                curveTo(17.206f, 21.455f, 17.045f, 21.294f, 17.008f, 21.09f)
                lineTo(17.0f, 21.0f)
                lineTo(16.999f, 15.708f)
                lineTo(15.354f, 17.354f)
                lineTo(15.284f, 17.411f)
                curveTo(15.114f, 17.529f, 14.886f, 17.529f, 14.716f, 17.411f)
                lineTo(14.646f, 17.354f)
                lineTo(14.589f, 17.284f)
                curveTo(14.47f, 17.114f, 14.47f, 16.886f, 14.589f, 16.716f)
                lineTo(14.646f, 16.646f)
                lineTo(17.159f, 14.134f)
                lineTo(17.215f, 14.089f)
                lineTo(17.289f, 14.047f)
                lineTo(17.372f, 14.017f)
                lineTo(17.427f, 14.005f)
                close()
            }
        }
        .build()
        return _tableArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _tableArrowUp: ImageVector? = null

@Preview
@Composable
private fun TableArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableArrowUp, contentDescription = null)
    }
}

