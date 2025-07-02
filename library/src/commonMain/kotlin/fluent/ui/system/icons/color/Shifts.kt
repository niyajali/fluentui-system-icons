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
package fluent.ui.system.icons.color

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

public val FluentIcons.Color.Shifts: ImageVector
    get() {
        if (_Shifts != null) {
            return _Shifts!!
        }
        _Shifts = ImageVector.Builder(
            name = "Colored.Shifts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF1EC8B0),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(6f, 2f),
                    end = Offset(15f, 22f)
                )
            ) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFDEDEFF)
                    ),
                    start = Offset(10.906f, 6.563f),
                    end = Offset(8.694f, 13.988f)
                )
            ) {
                moveTo(11.75f, 6f)
                curveTo(11.336f, 6f, 11f, 6.336f, 11f, 6.75f)
                verticalLineTo(12.75f)
                curveTo(11f, 13.164f, 11.336f, 13.5f, 11.75f, 13.5f)
                horizontalLineTo(16.248f)
                curveTo(16.663f, 13.5f, 16.998f, 13.164f, 16.998f, 12.75f)
                curveTo(16.998f, 12.336f, 16.663f, 12f, 16.248f, 12f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                curveTo(12.5f, 6.336f, 12.164f, 6f, 11.75f, 6f)
                close()
            }
        }.build()

        return _Shifts!!
    }

@Suppress("ObjectPropertyName")
private var _Shifts: ImageVector? = null

@Preview
@Composable
private fun ShiftsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Shifts, contentDescription = null)
    }
}
