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
package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.SendPerson: ImageVector
    get() {
        if (_SendPerson != null) {
            return _SendPerson!!
        }
        _SendPerson = ImageVector.Builder(
            name = "Filled.SendPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.815f, 11.95f)
                lineTo(5.283f, 13.205f)
                curveTo(5.107f, 13.234f, 4.96f, 13.356f, 4.897f, 13.523f)
                lineTo(2.299f, 20.481f)
                curveTo(2.051f, 21.12f, 2.72f, 21.73f, 3.334f, 21.423f)
                lineTo(14.046f, 16.067f)
                curveTo(14.016f, 15.883f, 14f, 15.693f, 14f, 15.5f)
                curveTo(14f, 13.567f, 15.567f, 12f, 17.5f, 12f)
                curveTo(18.493f, 12f, 19.389f, 12.413f, 20.026f, 13.077f)
                lineTo(21.334f, 12.423f)
                curveTo(21.886f, 12.147f, 21.886f, 11.358f, 21.334f, 11.082f)
                lineTo(3.334f, 2.082f)
                curveTo(2.72f, 1.775f, 2.051f, 2.385f, 2.299f, 3.024f)
                lineTo(4.897f, 9.982f)
                curveTo(4.96f, 10.149f, 5.107f, 10.271f, 5.283f, 10.3f)
                lineTo(12.815f, 11.555f)
                curveTo(12.924f, 11.573f, 12.997f, 11.677f, 12.979f, 11.785f)
                curveTo(12.965f, 11.87f, 12.899f, 11.936f, 12.815f, 11.95f)
                close()
                moveTo(20f, 15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                curveTo(16.119f, 18f, 15f, 16.881f, 15f, 15.5f)
                curveTo(15f, 14.119f, 16.119f, 13f, 17.5f, 13f)
                curveTo(18.881f, 13f, 20f, 14.119f, 20f, 15.5f)
                close()
                moveTo(22f, 20.875f)
                curveTo(22f, 22.431f, 20.714f, 24f, 17.5f, 24f)
                curveTo(14.286f, 24f, 13f, 22.437f, 13f, 20.875f)
                verticalLineTo(20.772f)
                curveTo(13f, 19.793f, 13.794f, 19f, 14.773f, 19f)
                horizontalLineTo(20.227f)
                curveTo(21.206f, 19f, 22f, 19.793f, 22f, 20.772f)
                verticalLineTo(20.875f)
                close()
            }
        }.build()

        return _SendPerson!!
    }

@Suppress("ObjectPropertyName")
private var _SendPerson: ImageVector? = null

@Preview
@Composable
private fun SendPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SendPerson, contentDescription = null)
    }
}
