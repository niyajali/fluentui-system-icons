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

public val FluentIcons.Light.DocumentSignature: ImageVector
    get() {
        if (_DocumentSignature != null) {
            return _DocumentSignature!!
        }
        _DocumentSignature = ImageVector.Builder(
            name = "Light.DocumentSignature",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 5f)
                curveTo(6f, 3.895f, 6.895f, 3f, 8f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                curveTo(16f, 11.657f, 17.343f, 13f, 19f, 13f)
                horizontalLineTo(22.316f)
                lineTo(23.307f, 12f)
                horizontalLineTo(19f)
                curveTo(17.895f, 12f, 17f, 11.105f, 17f, 10f)
                verticalLineTo(3.073f)
                curveTo(17.329f, 3.165f, 17.633f, 3.34f, 17.879f, 3.586f)
                lineTo(25.072f, 10.779f)
                curveTo(25.443f, 10.639f, 25.829f, 10.552f, 26.218f, 10.516f)
                curveTo(26.187f, 10.481f, 26.154f, 10.447f, 26.121f, 10.414f)
                lineTo(18.586f, 2.879f)
                curveTo(18.023f, 2.316f, 17.26f, 2f, 16.465f, 2f)
                horizontalLineTo(8f)
                curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
                verticalLineTo(27f)
                curveTo(5f, 28.657f, 6.343f, 30f, 8f, 30f)
                horizontalLineTo(24f)
                curveTo(25.657f, 30f, 27f, 28.657f, 27f, 27f)
                verticalLineTo(20.673f)
                lineTo(26f, 21.665f)
                verticalLineTo(27f)
                curveTo(26f, 28.105f, 25.105f, 29f, 24f, 29f)
                horizontalLineTo(8f)
                curveTo(6.895f, 29f, 6f, 28.105f, 6f, 27f)
                verticalLineTo(5f)
                close()
                moveTo(28.644f, 16.924f)
                lineTo(20.035f, 25.467f)
                curveTo(19.683f, 25.816f, 19.245f, 26.065f, 18.765f, 26.188f)
                lineTo(15.746f, 26.966f)
                curveTo(15.663f, 26.987f, 15.58f, 26.998f, 15.5f, 26.999f)
                verticalLineTo(27f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 27f, 8f, 26.776f, 8f, 26.5f)
                curveTo(8f, 26.224f, 8.224f, 26f, 8.5f, 26f)
                horizontalLineTo(14.496f)
                curveTo(14.496f, 25.917f, 14.507f, 25.833f, 14.529f, 25.747f)
                lineTo(15.319f, 22.695f)
                curveTo(15.437f, 22.24f, 15.674f, 21.824f, 16.005f, 21.49f)
                lineTo(24.572f, 12.85f)
                curveTo(25.72f, 11.691f, 27.6f, 11.717f, 28.716f, 12.907f)
                curveTo(29.783f, 14.045f, 29.751f, 15.825f, 28.644f, 16.924f)
                close()
            }
        }.build()

        return _DocumentSignature!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSignature: ImageVector? = null

@Preview
@Composable
private fun DocumentSignaturePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.DocumentSignature, contentDescription = null)
    }
}
