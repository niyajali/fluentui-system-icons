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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.Table: ImageVector
    get() {
        if (_Table != null) {
            return _Table!!
        }
        _Table = ImageVector.Builder(
            name = "Colored.Table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFB0F098),
                        1f to Color(0xFF98F0B0)
                    ),
                    start = Offset(4.286f, 4.286f),
                    end = Offset(19.714f, 19.714f)
                )
            ) {
                moveTo(7f, 3f)
                lineTo(17f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7f)
                lineTo(21f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21f)
                lineTo(7f, 21f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                lineTo(3f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF42B870),
                        1f to Color(0xFF1A7F7C)
                    ),
                    start = Offset(3f, 3f),
                    end = Offset(21f, 21f)
                )
            ) {
                moveTo(9.5f, 21f)
                horizontalLineTo(14.5f)
                verticalLineTo(16f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 21f)
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
                lineTo(9.5f, 8f)
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
                moveTo(3f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                verticalLineTo(9.5f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 16f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(8f)
                lineTo(8f, 16f)
                horizontalLineTo(3f)
                close()
                moveTo(14.5f, 9.5f)
                lineTo(14.5f, 14.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _Table!!
    }

@Suppress("ObjectPropertyName")
private var _Table: ImageVector? = null

@Preview
@Composable
private fun TablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Table, contentDescription = null)
    }
}
