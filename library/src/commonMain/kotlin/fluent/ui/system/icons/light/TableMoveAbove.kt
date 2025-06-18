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

public val FluentUi.Light.TableMoveAbove: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TableMoveAbove",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 3f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            curveTo(3f, 3.776f, 3.224f, 4f, 3.5f, 4f)
            horizontalLineTo(28.5f)
            curveTo(28.776f, 4f, 29f, 3.776f, 29f, 3.5f)
            curveTo(29f, 3.224f, 28.776f, 3f, 28.5f, 3f)
            horizontalLineTo(3.5f)
            close()
            moveTo(15.646f, 6.146f)
            curveTo(15.842f, 5.951f, 16.158f, 5.951f, 16.354f, 6.146f)
            lineTo(19.354f, 9.146f)
            curveTo(19.549f, 9.342f, 19.549f, 9.658f, 19.354f, 9.854f)
            curveTo(19.158f, 10.049f, 18.842f, 10.049f, 18.646f, 9.854f)
            lineTo(16.5f, 7.707f)
            verticalLineTo(14.5f)
            curveTo(16.5f, 14.776f, 16.276f, 15f, 16f, 15f)
            curveTo(15.724f, 15f, 15.5f, 14.776f, 15.5f, 14.5f)
            verticalLineTo(7.707f)
            lineTo(13.354f, 9.854f)
            curveTo(13.158f, 10.049f, 12.842f, 10.049f, 12.646f, 9.854f)
            curveTo(12.451f, 9.658f, 12.451f, 9.342f, 12.646f, 9.146f)
            lineTo(15.646f, 6.146f)
            close()
            moveTo(3.5f, 11f)
            curveTo(3.224f, 11f, 3f, 11.224f, 3f, 11.5f)
            verticalLineTo(24.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 29f, 29f, 26.985f, 29f, 24.5f)
            verticalLineTo(11.5f)
            curveTo(29f, 11.224f, 28.776f, 11f, 28.5f, 11f)
            horizontalLineTo(20.5f)
            curveTo(20.224f, 11f, 20f, 11.224f, 20f, 11.5f)
            verticalLineTo(20f)
            lineTo(12f, 20f)
            verticalLineTo(11.5f)
            curveTo(12f, 11.224f, 11.776f, 11f, 11.5f, 11f)
            horizontalLineTo(3.5f)
            close()
            moveTo(11f, 20f)
            horizontalLineTo(4f)
            verticalLineTo(12f)
            horizontalLineTo(11f)
            verticalLineTo(20f)
            close()
            moveTo(4f, 21f)
            horizontalLineTo(11f)
            verticalLineTo(28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            verticalLineTo(21f)
            close()
            moveTo(21f, 28f)
            verticalLineTo(21f)
            horizontalLineTo(28f)
            verticalLineTo(24.5f)
            curveTo(28f, 26.433f, 26.433f, 28f, 24.5f, 28f)
            horizontalLineTo(21f)
            close()
            moveTo(28f, 20f)
            horizontalLineTo(21f)
            verticalLineTo(12f)
            horizontalLineTo(28f)
            verticalLineTo(20f)
            close()
            moveTo(12f, 28f)
            verticalLineTo(21f)
            lineTo(20f, 21f)
            verticalLineTo(28f)
            horizontalLineTo(12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableMoveAbovePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TableMoveAbove, contentDescription = null)
    }
}
