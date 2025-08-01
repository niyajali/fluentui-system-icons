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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ArrowCollapseAll: ImageVector
    get() {
        if (_ArrowCollapseAll != null) {
            return _ArrowCollapseAll!!
        }
        _ArrowCollapseAll = ImageVector.Builder(
            name = "Filled.ArrowCollapseAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 5f)
                curveTo(2f, 4.448f, 2.448f, 4f, 3f, 4f)
                horizontalLineTo(21f)
                curveTo(21.552f, 4f, 22f, 4.448f, 22f, 5f)
                curveTo(22f, 5.552f, 21.552f, 6f, 21f, 6f)
                horizontalLineTo(3f)
                curveTo(2.448f, 6f, 2f, 5.552f, 2f, 5f)
                close()
                moveTo(6.293f, 8.293f)
                curveTo(6.683f, 7.902f, 7.317f, 7.902f, 7.707f, 8.293f)
                lineTo(10.707f, 11.293f)
                curveTo(11.098f, 11.683f, 11.098f, 12.317f, 10.707f, 12.707f)
                curveTo(10.317f, 13.098f, 9.683f, 13.098f, 9.293f, 12.707f)
                lineTo(8f, 11.414f)
                verticalLineTo(19f)
                curveTo(8f, 19.552f, 7.552f, 20f, 7f, 20f)
                curveTo(6.448f, 20f, 6f, 19.552f, 6f, 19f)
                verticalLineTo(11.414f)
                lineTo(4.707f, 12.707f)
                curveTo(4.317f, 13.098f, 3.683f, 13.098f, 3.293f, 12.707f)
                curveTo(2.902f, 12.317f, 2.902f, 11.683f, 3.293f, 11.293f)
                lineTo(6.293f, 8.293f)
                close()
                moveTo(21f, 10f)
                horizontalLineTo(12f)
                curveTo(11.448f, 10f, 11f, 9.552f, 11f, 9f)
                curveTo(11f, 8.448f, 11.448f, 8f, 12f, 8f)
                horizontalLineTo(21f)
                curveTo(21.552f, 8f, 22f, 8.448f, 22f, 9f)
                curveTo(22f, 9.552f, 21.552f, 10f, 21f, 10f)
                close()
            }
        }.build()

        return _ArrowCollapseAll!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseAll: ImageVector? = null

@Preview
@Composable
private fun ArrowCollapseAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowCollapseAll, contentDescription = null)
    }
}
