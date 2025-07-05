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
 * ColumnSingle Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon
 * - Description: Used to represent a single column in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_column_single_16_filled.svg)
 * 
 * @return The [ImageVector] for the ColumnSingle icon.
 */
public val FluentIcons.Filled.ColumnSingle: ImageVector
    get() {
        if (_columnSingle != null) {
            return _columnSingle!!
        }
        _columnSingle = Builder(name = "ColumnSingle", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 3.75f)
                curveTo(4.0f, 2.783f, 4.784f, 2.0f, 5.75f, 2.0f)
                horizontalLineTo(9.25f)
                curveTo(9.727f, 2.0f, 10.159f, 2.191f, 10.475f, 2.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(2.525f)
                curveTo(10.809f, 2.841f, 11.0f, 3.273f, 11.0f, 3.75f)
                verticalLineTo(12.25f)
                curveTo(11.0f, 13.217f, 10.217f, 14.0f, 9.25f, 14.0f)
                horizontalLineTo(5.75f)
                curveTo(4.784f, 14.0f, 4.0f, 13.217f, 4.0f, 12.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(5.0f, 12.25f)
                curveTo(5.0f, 12.664f, 5.336f, 13.0f, 5.75f, 13.0f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 13.0f, 10.0f, 12.664f, 10.0f, 12.25f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.25f)
                close()
            }
        }
        .build()
        return _columnSingle!!
    }

@Suppress("ObjectPropertyName")
private var _columnSingle: ImageVector? = null

@Preview
@Composable
private fun ColumnSinglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ColumnSingle, contentDescription = "ColumnSingle Icon")
    }
}

