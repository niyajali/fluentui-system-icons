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

public val FluentIcons.Filled.TableColumnTopBottomSearch: ImageVector
    get() {
        if (_TableColumnTopBottomSearch != null) {
            return _TableColumnTopBottomSearch!!
        }
        _TableColumnTopBottomSearch = ImageVector.Builder(
            name = "Filled.TableColumnTopBottomSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.5f, 14.5f)
                horizontalLineTo(10.625f)
                curveTo(10.366f, 13.836f, 9.981f, 13.234f, 9.5f, 12.725f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                lineTo(14.5f, 14.5f)
                close()
                moveTo(8f, 9.5f)
                verticalLineTo(11.6f)
                curveTo(7.25f, 11.216f, 6.4f, 11f, 5.5f, 11f)
                curveTo(4.6f, 11f, 3.75f, 11.216f, 3f, 11.6f)
                verticalLineTo(9.5f)
                horizontalLineTo(8f)
                close()
                moveTo(14.5f, 21f)
                horizontalLineTo(12.475f)
                lineTo(10.975f, 19.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(21f)
                close()
                moveTo(16f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                close()
                moveTo(21f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16f)
                lineTo(16f, 14.5f)
                horizontalLineTo(21f)
                close()
                moveTo(21f, 8f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                close()
                moveTo(14.5f, 3f)
                horizontalLineTo(9.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(3f)
                close()
                moveTo(8f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                lineTo(8f, 3f)
                close()
                moveTo(5.5f, 21f)
                curveTo(6.472f, 21f, 7.372f, 20.692f, 8.107f, 20.168f)
                lineTo(10.72f, 22.78f)
                curveTo(11.013f, 23.073f, 11.487f, 23.073f, 11.78f, 22.78f)
                curveTo(12.073f, 22.487f, 12.073f, 22.013f, 11.78f, 21.72f)
                lineTo(9.168f, 19.107f)
                curveTo(9.692f, 18.372f, 10f, 17.472f, 10f, 16.5f)
                curveTo(10f, 14.015f, 7.985f, 12f, 5.5f, 12f)
                curveTo(3.015f, 12f, 1f, 14.015f, 1f, 16.5f)
                curveTo(1f, 18.985f, 3.015f, 21f, 5.5f, 21f)
                close()
                moveTo(5.5f, 19.5f)
                curveTo(3.843f, 19.5f, 2.5f, 18.157f, 2.5f, 16.5f)
                curveTo(2.5f, 14.843f, 3.843f, 13.5f, 5.5f, 13.5f)
                curveTo(7.157f, 13.5f, 8.5f, 14.843f, 8.5f, 16.5f)
                curveTo(8.5f, 18.157f, 7.157f, 19.5f, 5.5f, 19.5f)
                close()
            }
        }.build()

        return _TableColumnTopBottomSearch!!
    }

@Suppress("ObjectPropertyName")
private var _TableColumnTopBottomSearch: ImageVector? = null

@Preview
@Composable
private fun TableColumnTopBottomSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableColumnTopBottomSearch, contentDescription = null)
    }
}
