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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Colored.DataBarVerticalAscending: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Colored.DataBarVerticalAscending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF16BBDA),
                        1f to Color(0xFF0067BF),
                    ),
                    start = Offset(19.908f, -2.529f),
                    end = Offset(31.994f, 3.112f),
                ),
            ) {
                moveTo(20.5f, 5.25f)
                curveTo(20.5f, 4.007f, 19.493f, 3f, 18.25f, 3f)
                curveTo(17.007f, 3f, 16f, 4.007f, 16f, 5.25f)
                lineTo(16f, 18.75f)
                curveTo(16f, 19.993f, 17.007f, 21f, 18.25f, 21f)
                curveTo(19.493f, 21f, 20.5f, 19.993f, 20.5f, 18.75f)
                verticalLineTo(5.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF16BBDA),
                        1f to Color(0xFF0067BF),
                    ),
                    start = Offset(9.934f, 3.58f),
                    end = Offset(20.859f, 10.018f),
                ),
            ) {
                moveTo(14f, 9.25f)
                curveTo(14f, 8.007f, 12.993f, 7f, 11.75f, 7f)
                curveTo(10.507f, 7f, 9.5f, 8.007f, 9.5f, 9.25f)
                verticalLineTo(18.75f)
                curveTo(9.5f, 19.993f, 10.507f, 21f, 11.75f, 21f)
                curveTo(12.993f, 21f, 14f, 19.993f, 14f, 18.75f)
                verticalLineTo(9.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF16BBDA),
                        1f to Color(0xFF0067BF),
                    ),
                    start = Offset(2.719f, 5.375f),
                    end = Offset(11.477f, 12.6f),
                ),
            ) {
                moveTo(7.5f, 13.25f)
                curveTo(7.5f, 12.007f, 6.493f, 11f, 5.25f, 11f)
                curveTo(4.007f, 11f, 3f, 12.007f, 3f, 13.25f)
                verticalLineTo(18.75f)
                curveTo(3f, 19.993f, 4.007f, 21f, 5.25f, 21f)
                curveTo(6.493f, 21f, 7.5f, 19.993f, 7.5f, 18.75f)
                verticalLineTo(13.25f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun DataBarVerticalAscendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DataBarVerticalAscending, contentDescription = null)
    }
}
