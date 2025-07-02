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
 * TableSimpleCheckmark icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, simple, checkmark
 * - Source: ic_fluent_table_simple_checkmark_24_regular.svg
 * 
 * @return The [ImageVector] for the TableSimpleCheckmark icon.
 */
public val FluentIcons.Regular.TableSimpleCheckmark: ImageVector
    get() {
        if (_tableSimpleCheckmark != null) {
            return _tableSimpleCheckmark!!
        }
        _tableSimpleCheckmark = Builder(name = "TableSimpleCheckmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21.0f, 21.0f, 19.545f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.75f, 11.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.75f)
                close()
                moveTo(4.5f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(12.75f)
                close()
                moveTo(18.283f, 14.717f)
                curveTo(18.576f, 15.01f, 18.576f, 15.484f, 18.283f, 15.777f)
                lineTo(16.28f, 17.78f)
                curveTo(15.987f, 18.073f, 15.513f, 18.073f, 15.22f, 17.78f)
                lineTo(14.22f, 16.78f)
                curveTo(13.927f, 16.487f, 13.927f, 16.013f, 14.22f, 15.72f)
                curveTo(14.513f, 15.427f, 14.987f, 15.427f, 15.28f, 15.72f)
                lineTo(15.75f, 16.189f)
                lineTo(17.223f, 14.717f)
                curveTo(17.515f, 14.424f, 17.99f, 14.424f, 18.283f, 14.717f)
                close()
            }
        }
        .build()
        return _tableSimpleCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _tableSimpleCheckmark: ImageVector? = null

@Preview
@Composable
private fun TableSimpleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSimpleCheckmark, contentDescription = null)
    }
}

