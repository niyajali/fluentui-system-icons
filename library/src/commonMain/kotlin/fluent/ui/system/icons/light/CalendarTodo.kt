/**
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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.CalendarTodo: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.CalendarTodo",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 28f)
            horizontalLineTo(13.468f)
            lineTo(14.468f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(14.466f)
            curveTo(28.697f, 14.188f, 28.358f, 13.969f, 28f, 13.811f)
            verticalLineTo(11f)
            horizontalLineTo(4f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            close()
            moveTo(7.5f, 4f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(10f)
            horizontalLineTo(28f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineTo(7.5f)
            close()
            moveTo(15.641f, 24.941f)
            curveTo(15.594f, 24.988f, 15.548f, 25.038f, 15.506f, 25.089f)
            lineTo(14.059f, 23.641f)
            curveTo(13.981f, 23.563f, 13.981f, 23.437f, 14.059f, 23.359f)
            lineTo(15.361f, 22.056f)
            curveTo(15.439f, 21.978f, 15.566f, 21.978f, 15.644f, 22.056f)
            lineTo(17.085f, 23.497f)
            lineTo(15.641f, 24.941f)
            close()
            moveTo(19.794f, 26.793f)
            lineTo(18.644f, 27.944f)
            curveTo(18.59f, 27.998f, 18.513f, 28.014f, 18.445f, 27.994f)
            curveTo(18.415f, 27.985f, 18.386f, 27.968f, 18.362f, 27.944f)
            lineTo(17.056f, 26.638f)
            curveTo(16.978f, 26.559f, 16.978f, 26.433f, 17.056f, 26.355f)
            lineTo(26.358f, 17.052f)
            curveTo(26.436f, 16.974f, 26.563f, 16.974f, 26.641f, 17.052f)
            lineTo(27.945f, 18.358f)
            curveTo(28.023f, 18.436f, 28.023f, 18.563f, 27.945f, 18.641f)
            lineTo(19.795f, 26.794f)
            lineTo(19.794f, 26.793f)
            close()
            moveTo(16.947f, 29.358f)
            curveTo(17.214f, 29.625f, 17.532f, 29.809f, 17.871f, 29.91f)
            curveTo(18.621f, 30.135f, 19.467f, 29.951f, 20.06f, 29.358f)
            lineTo(29.36f, 20.055f)
            curveTo(30.218f, 19.196f, 30.218f, 17.804f, 29.36f, 16.945f)
            lineTo(28.056f, 15.639f)
            curveTo(27.197f, 14.779f, 25.803f, 14.778f, 24.944f, 15.638f)
            lineTo(18.499f, 22.083f)
            lineTo(17.059f, 20.642f)
            curveTo(16.2f, 19.783f, 14.806f, 19.782f, 13.947f, 20.642f)
            lineTo(12.644f, 21.944f)
            curveTo(11.785f, 22.803f, 11.785f, 24.197f, 12.644f, 25.056f)
            lineTo(16.947f, 29.358f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarTodoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.CalendarTodo, contentDescription = null)
    }
}
