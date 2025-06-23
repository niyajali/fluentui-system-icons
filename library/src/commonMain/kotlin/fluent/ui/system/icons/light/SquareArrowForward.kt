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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Light.SquareArrowForward: ImageVector
    get() {
        if (_SquareArrowForward != null) {
            return _SquareArrowForward!!
        }
        _SquareArrowForward = ImageVector.Builder(
            name = "Light.SquareArrowForward",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 7.5f)
                curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
                horizontalLineTo(24.5f)
                curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
                verticalLineTo(16.275f)
                curveTo(28.69f, 15.951f, 28.355f, 15.65f, 28f, 15.375f)
                verticalLineTo(7.5f)
                curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
                horizontalLineTo(15.375f)
                curveTo(15.65f, 28.355f, 15.951f, 28.69f, 16.275f, 29f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(22.5f, 30f)
                curveTo(18.358f, 30f, 15f, 26.642f, 15f, 22.5f)
                curveTo(15f, 18.358f, 18.358f, 15f, 22.5f, 15f)
                curveTo(26.642f, 15f, 30f, 18.358f, 30f, 22.5f)
                curveTo(30f, 26.642f, 26.642f, 30f, 22.5f, 30f)
                close()
                moveTo(23.72f, 19.78f)
                lineTo(24.939f, 21f)
                horizontalLineTo(22.25f)
                curveTo(19.903f, 21f, 18f, 22.903f, 18f, 25.25f)
                verticalLineTo(25.75f)
                curveTo(18f, 26.164f, 18.336f, 26.5f, 18.75f, 26.5f)
                curveTo(19.164f, 26.5f, 19.5f, 26.164f, 19.5f, 25.75f)
                verticalLineTo(25.25f)
                curveTo(19.5f, 23.731f, 20.731f, 22.5f, 22.25f, 22.5f)
                horizontalLineTo(24.939f)
                lineTo(23.72f, 23.72f)
                curveTo(23.427f, 24.013f, 23.427f, 24.487f, 23.72f, 24.78f)
                curveTo(24.013f, 25.073f, 24.487f, 25.073f, 24.78f, 24.78f)
                lineTo(27.28f, 22.28f)
                curveTo(27.573f, 21.987f, 27.573f, 21.513f, 27.28f, 21.22f)
                lineTo(24.78f, 18.72f)
                curveTo(24.487f, 18.427f, 24.013f, 18.427f, 23.72f, 18.72f)
                curveTo(23.427f, 19.013f, 23.427f, 19.487f, 23.72f, 19.78f)
                close()
            }
        }.build()

        return _SquareArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _SquareArrowForward: ImageVector? = null

@Preview
@Composable
private fun SquareArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.SquareArrowForward, contentDescription = null)
    }
}
