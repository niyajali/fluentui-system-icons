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

public val FluentIcons.Filled.Backspace: ImageVector
    get() {
        if (_Backspace != null) {
            return _Backspace!!
        }
        _Backspace = ImageVector.Builder(
            name = "Filled.Backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.75f, 4f)
                curveTo(20.483f, 4f, 21.899f, 5.356f, 21.995f, 7.066f)
                lineTo(22f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22f, 18.483f, 20.643f, 19.899f, 18.934f, 19.995f)
                lineTo(18.75f, 20f)
                horizontalLineTo(10.249f)
                curveTo(9.485f, 20f, 8.747f, 19.731f, 8.164f, 19.244f)
                lineTo(8.009f, 19.105f)
                lineTo(3.014f, 14.355f)
                curveTo(1.713f, 13.118f, 1.661f, 11.061f, 2.898f, 9.761f)
                lineTo(3.014f, 9.645f)
                lineTo(8.009f, 4.895f)
                curveTo(8.563f, 4.368f, 9.283f, 4.055f, 10.041f, 4.007f)
                lineTo(10.249f, 4f)
                horizontalLineTo(18.75f)
                close()
                moveTo(11.446f, 8.397f)
                curveTo(11.153f, 8.179f, 10.736f, 8.203f, 10.47f, 8.47f)
                curveTo(10.203f, 8.736f, 10.179f, 9.153f, 10.397f, 9.446f)
                lineTo(10.47f, 9.53f)
                lineTo(12.939f, 12f)
                lineTo(10.47f, 14.47f)
                lineTo(10.397f, 14.554f)
                curveTo(10.179f, 14.847f, 10.203f, 15.264f, 10.47f, 15.53f)
                curveTo(10.736f, 15.797f, 11.153f, 15.821f, 11.446f, 15.603f)
                lineTo(11.53f, 15.53f)
                lineTo(14f, 13.061f)
                lineTo(16.47f, 15.53f)
                lineTo(16.554f, 15.603f)
                curveTo(16.847f, 15.821f, 17.264f, 15.797f, 17.53f, 15.53f)
                curveTo(17.797f, 15.264f, 17.821f, 14.847f, 17.603f, 14.554f)
                lineTo(17.53f, 14.47f)
                lineTo(15.061f, 12f)
                lineTo(17.53f, 9.53f)
                lineTo(17.603f, 9.446f)
                curveTo(17.821f, 9.153f, 17.797f, 8.736f, 17.53f, 8.47f)
                curveTo(17.264f, 8.203f, 16.847f, 8.179f, 16.554f, 8.397f)
                lineTo(16.47f, 8.47f)
                lineTo(14f, 10.939f)
                lineTo(11.53f, 8.47f)
                lineTo(11.446f, 8.397f)
                close()
            }
        }.build()

        return _Backspace!!
    }

@Suppress("ObjectPropertyName")
private var _Backspace: ImageVector? = null

@Preview
@Composable
private fun BackspacePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Backspace, contentDescription = null)
    }
}
