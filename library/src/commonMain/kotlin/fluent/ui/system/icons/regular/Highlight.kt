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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.Highlight: ImageVector
    get() {
        if (_Highlight != null) {
            return _Highlight!!
        }
        _Highlight = ImageVector.Builder(
            name = "Regular.Highlight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.259f, 2.004f)
                curveTo(20.638f, 2.004f, 20.952f, 2.287f, 21.001f, 2.653f)
                lineTo(21.008f, 2.755f)
                lineTo(21.004f, 7.252f)
                curveTo(21.001f, 8.409f, 20.127f, 9.36f, 19.003f, 9.486f)
                lineTo(19.003f, 11.746f)
                curveTo(19.003f, 12.937f, 18.077f, 13.912f, 16.906f, 13.991f)
                lineTo(16.753f, 13.996f)
                lineTo(16.501f, 13.996f)
                lineTo(16.502f, 16.788f)
                curveTo(16.502f, 17.603f, 16.062f, 18.349f, 15.36f, 18.746f)
                lineTo(15.206f, 18.825f)
                lineTo(8.571f, 21.932f)
                curveTo(8.105f, 22.15f, 7.574f, 21.845f, 7.51f, 21.353f)
                lineTo(7.503f, 21.252f)
                lineTo(7.503f, 13.996f)
                lineTo(7.25f, 13.996f)
                curveTo(6.059f, 13.996f, 5.084f, 13.071f, 5.005f, 11.9f)
                lineTo(5f, 11.746f)
                lineTo(5f, 9.487f)
                curveTo(3.929f, 9.368f, 3.084f, 8.498f, 3.006f, 7.414f)
                lineTo(3f, 7.25f)
                verticalLineTo(2.754f)
                curveTo(3f, 2.34f, 3.336f, 2.004f, 3.75f, 2.004f)
                curveTo(4.13f, 2.004f, 4.443f, 2.286f, 4.493f, 2.652f)
                lineTo(4.5f, 2.754f)
                verticalLineTo(7.25f)
                curveTo(4.5f, 7.63f, 4.782f, 7.944f, 5.148f, 7.994f)
                lineTo(5.25f, 8f)
                lineTo(18.751f, 8f)
                curveTo(19.132f, 8f, 19.446f, 7.717f, 19.497f, 7.351f)
                lineTo(19.504f, 7.25f)
                lineTo(19.508f, 2.753f)
                curveTo(19.508f, 2.339f, 19.844f, 2.004f, 20.259f, 2.004f)
                close()
                moveTo(15.001f, 13.996f)
                horizontalLineTo(9.003f)
                lineTo(9.003f, 20.073f)
                lineTo(14.57f, 17.467f)
                curveTo(14.8f, 17.359f, 14.958f, 17.143f, 14.994f, 16.895f)
                lineTo(15.002f, 16.788f)
                lineTo(15.001f, 13.996f)
                close()
                moveTo(17.502f, 9.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(11.746f)
                curveTo(6.5f, 12.126f, 6.782f, 12.439f, 7.148f, 12.489f)
                lineTo(7.25f, 12.496f)
                horizontalLineTo(16.753f)
                curveTo(17.132f, 12.496f, 17.446f, 12.214f, 17.496f, 11.848f)
                lineTo(17.503f, 11.746f)
                lineTo(17.502f, 9.5f)
                close()
            }
        }.build()

        return _Highlight!!
    }

@Suppress("ObjectPropertyName")
private var _Highlight: ImageVector? = null

@Preview
@Composable
private fun HighlightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Highlight, contentDescription = null)
    }
}
