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

public val FluentIcons.Filled.ArrowSortDownLines: ImageVector
    get() {
        if (_ArrowSortDownLines != null) {
            return _ArrowSortDownLines!!
        }
        _ArrowSortDownLines = ImageVector.Builder(
            name = "Filled.ArrowSortDownLines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 3f)
                curveTo(18f, 2.448f, 17.552f, 2f, 17f, 2f)
                curveTo(16.448f, 2f, 16f, 2.448f, 16f, 3f)
                verticalLineTo(18.586f)
                lineTo(14.207f, 16.793f)
                curveTo(13.817f, 16.402f, 13.183f, 16.402f, 12.793f, 16.793f)
                curveTo(12.402f, 17.183f, 12.402f, 17.817f, 12.793f, 18.207f)
                lineTo(16.293f, 21.707f)
                curveTo(16.683f, 22.098f, 17.317f, 22.098f, 17.707f, 21.707f)
                lineTo(21.207f, 18.207f)
                curveTo(21.598f, 17.817f, 21.598f, 17.183f, 21.207f, 16.793f)
                curveTo(20.817f, 16.402f, 20.183f, 16.402f, 19.793f, 16.793f)
                lineTo(18f, 18.586f)
                verticalLineTo(3f)
                close()
                moveTo(3f, 4f)
                curveTo(2.448f, 4f, 2f, 4.448f, 2f, 5f)
                curveTo(2f, 5.552f, 2.448f, 6f, 3f, 6f)
                horizontalLineTo(13f)
                curveTo(13.552f, 6f, 14f, 5.552f, 14f, 5f)
                curveTo(14f, 4.448f, 13.552f, 4f, 13f, 4f)
                horizontalLineTo(3f)
                close()
                moveTo(6f, 9f)
                curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
                horizontalLineTo(13f)
                curveTo(13.552f, 8f, 14f, 8.448f, 14f, 9f)
                curveTo(14f, 9.552f, 13.552f, 10f, 13f, 10f)
                horizontalLineTo(7f)
                curveTo(6.448f, 10f, 6f, 9.552f, 6f, 9f)
                close()
                moveTo(11f, 12f)
                curveTo(10.448f, 12f, 10f, 12.448f, 10f, 13f)
                curveTo(10f, 13.552f, 10.448f, 14f, 11f, 14f)
                horizontalLineTo(13f)
                curveTo(13.552f, 14f, 14f, 13.552f, 14f, 13f)
                curveTo(14f, 12.448f, 13.552f, 12f, 13f, 12f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _ArrowSortDownLines!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSortDownLines: ImageVector? = null

@Preview
@Composable
private fun ArrowSortDownLinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowSortDownLines, contentDescription = null)
    }
}
