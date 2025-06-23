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

public val FluentIcons.Regular.NavigationPerson: ImageVector
    get() {
        if (_NavigationPerson != null) {
            return _NavigationPerson!!
        }
        _NavigationPerson = ImageVector.Builder(
            name = "Regular.NavigationPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.751f, 18f)
                horizontalLineTo(17.05f)
                lineTo(16.773f, 18f)
                curveTo(15.7f, 18f, 14.77f, 18.609f, 14.309f, 19.5f)
                horizontalLineTo(2.751f)
                curveTo(2.337f, 19.5f, 2.001f, 19.164f, 2.001f, 18.75f)
                curveTo(2.001f, 18.37f, 2.283f, 18.056f, 2.649f, 18.007f)
                lineTo(2.751f, 18f)
                close()
                moveTo(2.751f, 13.003f)
                horizontalLineTo(17.048f)
                curveTo(17.679f, 12.382f, 18.545f, 12f, 19.5f, 12f)
                curveTo(20.355f, 12f, 21.138f, 12.307f, 21.746f, 12.816f)
                curveTo(21.902f, 12.678f, 22.001f, 12.477f, 22.001f, 12.253f)
                curveTo(22.001f, 11.839f, 21.665f, 11.503f, 21.251f, 11.503f)
                horizontalLineTo(2.751f)
                lineTo(2.649f, 11.509f)
                curveTo(2.283f, 11.559f, 2.001f, 11.873f, 2.001f, 12.253f)
                curveTo(2.001f, 12.667f, 2.337f, 13.003f, 2.751f, 13.003f)
                close()
                moveTo(2.75f, 5.003f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5.003f, 22f, 5.339f, 22f, 5.753f)
                curveTo(22f, 6.133f, 21.718f, 6.446f, 21.352f, 6.496f)
                lineTo(21.25f, 6.503f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 6.503f, 2f, 6.167f, 2f, 5.753f)
                curveTo(2f, 5.373f, 2.282f, 5.059f, 2.648f, 5.01f)
                lineTo(2.75f, 5.003f)
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
        Image(imageVector = FluentIcons.Regular.NavigationPerson, contentDescription = null)
    }
}
