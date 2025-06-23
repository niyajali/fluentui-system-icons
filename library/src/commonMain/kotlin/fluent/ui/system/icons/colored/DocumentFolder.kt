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

public val FluentIcons.Colored.DocumentFolder: ImageVector
    get() {
        if (_DocumentFolder != null) {
            return _DocumentFolder!!
        }
        _DocumentFolder = ImageVector.Builder(
            name = "Colored.DocumentFolder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFBB45EA),
                        1f to Color(0xFF9C6CFE)
                    ),
                    start = Offset(21.8f, 19.5f),
                    end = Offset(23.639f, 5.773f)
                )
            ) {
                moveTo(8f, 6.25f)
                curveTo(8f, 5.007f, 9.007f, 4f, 10.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(20f, 15.993f, 18.993f, 17f, 17.75f, 17f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 17f, 8f, 15.993f, 8f, 14.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.338f to Color(0x005750E2),
                        1f to Color(0xFF5750E2)
                    ),
                    start = Offset(20f, 8.5f),
                    end = Offset(17f, 8.5f)
                )
            ) {
                moveTo(8f, 6.25f)
                curveTo(8f, 5.007f, 9.007f, 4f, 10.25f, 4f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(20f, 15.993f, 18.993f, 17f, 17.75f, 17f)
                horizontalLineTo(10.25f)
                curveTo(9.007f, 17f, 8f, 15.993f, 8f, 14.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.228f to Color(0xFF2764E7),
                        0.685f to Color(0xFF5CD1FF),
                        1f to Color(0xFF6CE0FF)
                    ),
                    center = Offset(8.05f, 14f),
                    radius = 14.465f
                )
            ) {
                moveTo(4f, 4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(15.25f)
                curveTo(16.493f, 2f, 17.5f, 3.007f, 17.5f, 4.25f)
                verticalLineTo(14.75f)
                curveTo(17.5f, 15.993f, 16.493f, 17f, 15.25f, 17f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 17f, 4f, 15.993f, 4f, 14.75f)
                verticalLineTo(4.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.241f to Color(0xFFFFD638),
                        0.637f to Color(0xFFFAB500),
                        0.985f to Color(0xFFCA6407)
                    ),
                    start = Offset(6.857f, 8f),
                    end = Offset(6.857f, 27.091f)
                )
            ) {
                moveTo(5.25f, 8f)
                curveTo(4.007f, 8f, 3f, 9.007f, 3f, 10.25f)
                verticalLineTo(18.75f)
                curveTo(3f, 20.545f, 4.455f, 22f, 6.25f, 22f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 22f, 21f, 20.545f, 21f, 18.75f)
                verticalLineTo(17.25f)
                curveTo(21f, 16.007f, 19.993f, 15f, 18.75f, 15f)
                horizontalLineTo(15.904f)
                curveTo(15.696f, 15f, 15.496f, 14.913f, 15.354f, 14.76f)
                lineTo(9.745f, 8.719f)
                curveTo(9.319f, 8.261f, 8.722f, 8f, 8.096f, 8f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _DocumentFolder!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFolder: ImageVector? = null

@Preview
@Composable
private fun DocumentFolderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.DocumentFolder, contentDescription = null)
    }
}
