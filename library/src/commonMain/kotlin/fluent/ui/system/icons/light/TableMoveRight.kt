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
package fluent.ui.system.icons.light

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.TableMoveRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TableMoveRight",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(29f, 3.5f)
            curveTo(29f, 3.224f, 28.776f, 3f, 28.5f, 3f)
            curveTo(28.224f, 3f, 28f, 3.224f, 28f, 3.5f)
            verticalLineTo(28.5f)
            curveTo(28f, 28.776f, 28.224f, 29f, 28.5f, 29f)
            curveTo(28.776f, 29f, 29f, 28.776f, 29f, 28.5f)
            verticalLineTo(3.5f)
            close()
            moveTo(25.854f, 15.646f)
            curveTo(26.049f, 15.842f, 26.049f, 16.158f, 25.854f, 16.354f)
            lineTo(22.854f, 19.354f)
            curveTo(22.658f, 19.549f, 22.342f, 19.549f, 22.146f, 19.354f)
            curveTo(21.951f, 19.158f, 21.951f, 18.842f, 22.146f, 18.646f)
            lineTo(24.293f, 16.5f)
            horizontalLineTo(17.5f)
            curveTo(17.224f, 16.5f, 17f, 16.276f, 17f, 16f)
            curveTo(17f, 15.724f, 17.224f, 15.5f, 17.5f, 15.5f)
            horizontalLineTo(24.293f)
            lineTo(22.146f, 13.354f)
            curveTo(21.951f, 13.158f, 21.951f, 12.842f, 22.146f, 12.646f)
            curveTo(22.342f, 12.451f, 22.658f, 12.451f, 22.854f, 12.646f)
            lineTo(25.854f, 15.646f)
            close()
            moveTo(21f, 3.5f)
            curveTo(21f, 3.224f, 20.776f, 3f, 20.5f, 3f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 29f, 21f, 28.776f, 21f, 28.5f)
            verticalLineTo(20.5f)
            curveTo(21f, 20.224f, 20.776f, 20f, 20.5f, 20f)
            horizontalLineTo(12f)
            lineTo(12f, 12f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 12f, 21f, 11.776f, 21f, 11.5f)
            verticalLineTo(3.5f)
            close()
            moveTo(12f, 11f)
            verticalLineTo(4f)
            horizontalLineTo(20f)
            verticalLineTo(11f)
            horizontalLineTo(12f)
            close()
            moveTo(11f, 4f)
            verticalLineTo(11f)
            horizontalLineTo(4f)
            verticalLineTo(7.5f)
            curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
            horizontalLineTo(11f)
            close()
            moveTo(4f, 21f)
            horizontalLineTo(11f)
            verticalLineTo(28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            verticalLineTo(21f)
            close()
            moveTo(12f, 28f)
            verticalLineTo(21f)
            horizontalLineTo(20f)
            verticalLineTo(28f)
            horizontalLineTo(12f)
            close()
            moveTo(4f, 12f)
            horizontalLineTo(11f)
            lineTo(11f, 20f)
            horizontalLineTo(4f)
            verticalLineTo(12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableMoveRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TableMoveRight, contentDescription = null)
    }
}
