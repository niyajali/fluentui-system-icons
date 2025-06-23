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

public val FluentIcons.Filled.NavigationPerson: ImageVector
    get() {
        if (_NavigationPerson != null) {
            return _NavigationPerson!!
        }
        _NavigationPerson = ImageVector.Builder(
            name = "Filled.NavigationPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 17f)
                horizontalLineTo(16.337f)
                curveTo(16.515f, 17.375f, 16.758f, 17.713f, 17.051f, 18f)
                horizontalLineTo(16.773f)
                curveTo(15.916f, 18f, 15.149f, 18.389f, 14.64f, 19f)
                horizontalLineTo(3f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                curveTo(2f, 17.487f, 2.386f, 17.065f, 2.883f, 17.007f)
                lineTo(3f, 17f)
                close()
                moveTo(3f, 13f)
                lineTo(17.052f, 12.998f)
                curveTo(17.683f, 12.381f, 18.547f, 12f, 19.5f, 12f)
                curveTo(20.316f, 12f, 21.067f, 12.279f, 21.662f, 12.747f)
                curveTo(21.869f, 12.564f, 22f, 12.296f, 22f, 11.998f)
                curveTo(22f, 11.445f, 21.552f, 10.998f, 21f, 10.998f)
                lineTo(3f, 11f)
                lineTo(2.883f, 11.007f)
                curveTo(2.386f, 11.065f, 2f, 11.487f, 2f, 12f)
                curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
                close()
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 5f, 22f, 5.448f, 22f, 6f)
                curveTo(22f, 6.513f, 21.614f, 6.936f, 21.117f, 6.993f)
                lineTo(21f, 7f)
                horizontalLineTo(3f)
                curveTo(2.448f, 7f, 2f, 6.552f, 2f, 6f)
                curveTo(2f, 5.487f, 2.386f, 5.064f, 2.883f, 5.007f)
                lineTo(3f, 5f)
                close()
                moveTo(22f, 15.5f)
                curveTo(22f, 16.881f, 20.881f, 18f, 19.5f, 18f)
                curveTo(18.119f, 18f, 17f, 16.881f, 17f, 15.5f)
                curveTo(17f, 14.119f, 18.119f, 13f, 19.5f, 13f)
                curveTo(20.881f, 13f, 22f, 14.119f, 22f, 15.5f)
                close()
                moveTo(24f, 20.875f)
                curveTo(24f, 22.431f, 22.714f, 24f, 19.5f, 24f)
                curveTo(16.286f, 24f, 15f, 22.437f, 15f, 20.875f)
                verticalLineTo(20.772f)
                curveTo(15f, 19.793f, 15.794f, 19f, 16.773f, 19f)
                horizontalLineTo(22.227f)
                curveTo(23.206f, 19f, 24f, 19.793f, 24f, 20.772f)
                verticalLineTo(20.875f)
                close()
            }
        }.build()

        return _NavigationPerson!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationPerson: ImageVector? = null

@Preview
@Composable
private fun NavigationPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NavigationPerson, contentDescription = null)
    }
}
