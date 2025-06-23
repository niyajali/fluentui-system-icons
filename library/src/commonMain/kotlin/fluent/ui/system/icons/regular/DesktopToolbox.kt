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

public val FluentIcons.Regular.DesktopToolbox: ImageVector
    get() {
        if (_DesktopToolbox != null) {
            return _DesktopToolbox!!
        }
        _DesktopToolbox = ImageVector.Builder(
            name = "Regular.DesktopToolbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 22f)
                curveTo(6.336f, 22f, 6f, 21.665f, 6f, 21.25f)
                curveTo(6f, 20.871f, 6.282f, 20.557f, 6.648f, 20.507f)
                lineTo(6.75f, 20.5f)
                lineTo(8.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(4.25f, 18.002f)
                curveTo(3.059f, 18.002f, 2.084f, 17.077f, 2.005f, 15.906f)
                lineTo(2f, 15.752f)
                verticalLineTo(5.25f)
                curveTo(2f, 4.059f, 2.925f, 3.084f, 4.096f, 3.005f)
                lineTo(4.25f, 3f)
                horizontalLineTo(19.749f)
                curveTo(20.94f, 3f, 21.914f, 3.925f, 21.994f, 5.096f)
                lineTo(21.999f, 5.25f)
                verticalLineTo(13.919f)
                curveTo(21.969f, 12.884f, 21.367f, 11.993f, 20.499f, 11.55f)
                verticalLineTo(5.25f)
                curveTo(20.499f, 4.87f, 20.217f, 4.557f, 19.851f, 4.507f)
                lineTo(19.749f, 4.5f)
                horizontalLineTo(4.25f)
                curveTo(3.87f, 4.5f, 3.557f, 4.782f, 3.507f, 5.148f)
                lineTo(3.5f, 5.25f)
                verticalLineTo(15.752f)
                curveTo(3.5f, 16.132f, 3.782f, 16.446f, 4.148f, 16.495f)
                lineTo(4.25f, 16.502f)
                horizontalLineTo(11f)
                verticalLineTo(18.002f)
                horizontalLineTo(9.998f)
                lineTo(9.999f, 20.5f)
                horizontalLineTo(11f)
                verticalLineTo(21.5f)
                curveTo(11f, 21.672f, 11.017f, 21.839f, 11.05f, 22f)
                horizontalLineTo(6.75f)
                close()
                moveTo(14f, 15f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 15f, 12f, 15.672f, 12f, 16.5f)
                verticalLineTo(18f)
                horizontalLineTo(14.5f)
                verticalLineTo(17.75f)
                curveTo(14.5f, 17.336f, 14.836f, 17f, 15.25f, 17f)
                curveTo(15.664f, 17f, 16f, 17.336f, 16f, 17.75f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(17.75f)
                curveTo(19f, 17.336f, 19.336f, 17f, 19.75f, 17f)
                curveTo(20.164f, 17f, 20.5f, 17.336f, 20.5f, 17.75f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(16.5f)
                curveTo(23f, 15.672f, 22.328f, 15f, 21.5f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                curveTo(21f, 13.034f, 20.216f, 12.25f, 19.25f, 12.25f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 12.25f, 14f, 13.034f, 14f, 14f)
                verticalLineTo(15f)
                close()
                moveTo(15.5f, 14f)
                curveTo(15.5f, 13.862f, 15.612f, 13.75f, 15.75f, 13.75f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 13.75f, 19.5f, 13.862f, 19.5f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(15.5f)
                verticalLineTo(14f)
                close()
                moveTo(12f, 21.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.25f)
                curveTo(14.5f, 20.665f, 14.836f, 21f, 15.25f, 21f)
                curveTo(15.664f, 21f, 16f, 20.665f, 16f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(19f)
                verticalLineTo(20.25f)
                curveTo(19f, 20.665f, 19.336f, 21f, 19.75f, 21f)
                curveTo(20.164f, 21f, 20.5f, 20.665f, 20.5f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(23f)
                verticalLineTo(21.5f)
                curveTo(23f, 22.329f, 22.328f, 23f, 21.5f, 23f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 23f, 12f, 22.329f, 12f, 21.5f)
                close()
            }
        }.build()

        return _DesktopToolbox!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopToolbox: ImageVector? = null

@Preview
@Composable
private fun DesktopToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DesktopToolbox, contentDescription = null)
    }
}
