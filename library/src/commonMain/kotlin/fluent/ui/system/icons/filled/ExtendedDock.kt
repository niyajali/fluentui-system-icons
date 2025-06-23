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

public val FluentIcons.Filled.ExtendedDock: ImageVector
    get() {
        if (_ExtendedDock != null) {
            return _ExtendedDock!!
        }
        _ExtendedDock = ImageVector.Builder(
            name = "Filled.ExtendedDock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 10.997f)
                curveTo(7.216f, 10.997f, 8f, 11.781f, 8f, 12.747f)
                verticalLineTo(15.247f)
                curveTo(8f, 16.214f, 7.216f, 16.997f, 6.25f, 16.997f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 16.997f, 2f, 16.214f, 2f, 15.247f)
                verticalLineTo(12.747f)
                curveTo(2f, 11.781f, 2.783f, 10.997f, 3.75f, 10.997f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.25f, 10.997f)
                curveTo(14.217f, 10.997f, 15f, 11.781f, 15f, 12.747f)
                verticalLineTo(15.247f)
                curveTo(15f, 16.214f, 14.217f, 16.997f, 13.25f, 16.997f)
                horizontalLineTo(10.75f)
                curveTo(9.783f, 16.997f, 9f, 16.214f, 9f, 15.247f)
                verticalLineTo(12.747f)
                curveTo(9f, 11.781f, 9.783f, 10.997f, 10.75f, 10.997f)
                horizontalLineTo(13.25f)
                close()
                moveTo(20.25f, 10.997f)
                curveTo(21.216f, 10.997f, 22f, 11.781f, 22f, 12.747f)
                verticalLineTo(15.247f)
                curveTo(22f, 16.214f, 21.216f, 16.997f, 20.25f, 16.997f)
                horizontalLineTo(17.75f)
                curveTo(16.784f, 16.997f, 16f, 16.214f, 16f, 15.247f)
                verticalLineTo(12.747f)
                curveTo(16f, 11.781f, 16.784f, 10.997f, 17.75f, 10.997f)
                horizontalLineTo(20.25f)
                close()
                moveTo(7.97f, 7.72f)
                lineTo(11.47f, 4.22f)
                curveTo(11.733f, 3.956f, 12.145f, 3.929f, 12.438f, 4.141f)
                lineTo(12.523f, 4.212f)
                lineTo(16.125f, 7.712f)
                curveTo(16.422f, 8.001f, 16.429f, 8.476f, 16.141f, 8.773f)
                curveTo(15.878f, 9.043f, 15.462f, 9.073f, 15.165f, 8.859f)
                lineTo(15.08f, 8.788f)
                lineTo(12.008f, 5.803f)
                lineTo(9.03f, 8.78f)
                curveTo(8.737f, 9.073f, 8.263f, 9.073f, 7.97f, 8.78f)
                curveTo(7.703f, 8.514f, 7.679f, 8.097f, 7.897f, 7.804f)
                lineTo(7.97f, 7.72f)
                lineTo(11.47f, 4.22f)
                lineTo(7.97f, 7.72f)
                close()
            }
        }.build()

        return _ExtendedDock!!
    }

@Suppress("ObjectPropertyName")
private var _ExtendedDock: ImageVector? = null

@Preview
@Composable
private fun ExtendedDockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ExtendedDock, contentDescription = null)
    }
}
