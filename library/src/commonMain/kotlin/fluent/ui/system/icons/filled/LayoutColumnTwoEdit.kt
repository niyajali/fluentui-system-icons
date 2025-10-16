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
 * LayoutColumnTwoEdit Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon, vscode
 * - Description: Used to represent UI layouts.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_layout_column_two_edit_24_filled.svg)
 * 
 * @return The [ImageVector] for the LayoutColumnTwoEdit icon.
 */
public val FluentIcons.Filled.LayoutColumnTwoEdit: ImageVector
    get() {
        if (_layoutColumnTwoEdit != null) {
            return _layoutColumnTwoEdit!!
        }
        _layoutColumnTwoEdit = Builder(name = "LayoutColumnTwoEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.1f, 12.67f)
                curveTo(19.992f, 11.777f, 21.439f, 11.777f, 22.332f, 12.67f)
                curveTo(23.225f, 13.563f, 23.225f, 15.01f, 22.332f, 15.902f)
                lineTo(16.43f, 21.805f)
                curveTo(16.086f, 22.149f, 15.655f, 22.393f, 15.183f, 22.511f)
                lineTo(13.352f, 22.969f)
                curveTo(12.556f, 23.168f, 11.835f, 22.446f, 12.033f, 21.65f)
                lineTo(12.491f, 19.819f)
                curveTo(12.609f, 19.347f, 12.853f, 18.916f, 13.197f, 18.572f)
                lineTo(19.1f, 12.67f)
                close()
                moveTo(11.25f, 20.664f)
                lineTo(11.166f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.664f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(11.012f)
                curveTo(20.068f, 10.932f, 19.107f, 11.248f, 18.394f, 11.962f)
                lineTo(12.75f, 17.605f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _layoutColumnTwoEdit!!
    }

@Suppress("ObjectPropertyName")
private var _layoutColumnTwoEdit: ImageVector? = null

@Preview
@Composable
private fun LayoutColumnTwoEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LayoutColumnTwoEdit, contentDescription = "LayoutColumnTwoEdit Icon")
    }
}

