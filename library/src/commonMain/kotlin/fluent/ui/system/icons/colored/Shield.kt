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

public val FluentIcons.Colored.Shield: ImageVector
    get() {
        if (_Shield != null) {
            return _Shield!!
        }
        _Shield = ImageVector.Builder(
            name = "Colored.Shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.338f to Color(0xFF0FAFFF),
                        0.529f to Color(0xFF367AF2),
                        0.682f to Color(0xFF5750E2),
                        0.861f to Color(0xFFCC23D1)
                    ),
                    center = Offset(-4.071f, -9.25f),
                    radius = 47.599f
                )
            ) {
                moveTo(3f, 5.75f)
                curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
                curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
                curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
                curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
                verticalLineTo(11f)
                curveTo(21f, 16.001f, 18.042f, 19.676f, 12.275f, 21.948f)
                curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
                curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
                verticalLineTo(5.75f)
                close()
            }
        }.build()

        return _Shield!!
    }

@Suppress("ObjectPropertyName")
private var _Shield: ImageVector? = null

@Preview
@Composable
private fun ShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Shield, contentDescription = null)
    }
}
