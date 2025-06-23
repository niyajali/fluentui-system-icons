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

public val FluentIcons.Filled.DesktopFlow: ImageVector
    get() {
        if (_DesktopFlow != null) {
            return _DesktopFlow!!
        }
        _DesktopFlow = ImageVector.Builder(
            name = "Filled.DesktopFlow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.5f, 3.75f)
                curveTo(16.5f, 3.482f, 16.56f, 3.227f, 16.668f, 3f)
                horizontalLineTo(4.25f)
                lineTo(4.096f, 3.005f)
                curveTo(2.925f, 3.084f, 2f, 4.059f, 2f, 5.25f)
                verticalLineTo(15.752f)
                lineTo(2.005f, 15.906f)
                curveTo(2.084f, 17.077f, 3.059f, 18.002f, 4.25f, 18.002f)
                lineTo(8.499f, 18.002f)
                verticalLineTo(20.5f)
                lineTo(6.75f, 20.5f)
                lineTo(6.648f, 20.507f)
                curveTo(6.282f, 20.557f, 6f, 20.871f, 6f, 21.25f)
                curveTo(6f, 21.665f, 6.336f, 22f, 6.75f, 22f)
                horizontalLineTo(17.25f)
                lineTo(17.352f, 21.994f)
                curveTo(17.718f, 21.944f, 18f, 21.63f, 18f, 21.25f)
                curveTo(18f, 20.836f, 17.664f, 20.5f, 17.25f, 20.5f)
                lineTo(15.499f, 20.5f)
                verticalLineTo(18.002f)
                lineTo(19.749f, 18.002f)
                lineTo(19.903f, 17.997f)
                curveTo(21.074f, 17.918f, 21.999f, 16.943f, 21.999f, 15.752f)
                verticalLineTo(9.5f)
                horizontalLineTo(18.25f)
                curveTo(17.83f, 9.5f, 17.444f, 9.353f, 17.143f, 9.106f)
                lineTo(16.703f, 10.425f)
                curveTo(16.309f, 11.608f, 15.233f, 12.424f, 14f, 12.495f)
                verticalLineTo(13.25f)
                curveTo(14f, 14.217f, 13.216f, 15f, 12.25f, 15f)
                horizontalLineTo(8.25f)
                curveTo(7.284f, 15f, 6.5f, 14.217f, 6.5f, 13.25f)
                verticalLineTo(9.25f)
                curveTo(6.5f, 8.284f, 7.284f, 7.5f, 8.25f, 7.5f)
                horizontalLineTo(12.25f)
                curveTo(12.867f, 7.5f, 13.41f, 7.82f, 13.721f, 8.303f)
                lineTo(14.297f, 6.576f)
                curveTo(14.637f, 5.556f, 15.483f, 4.809f, 16.5f, 4.577f)
                verticalLineTo(3.75f)
                close()
                moveTo(13.998f, 18.002f)
                lineTo(13.999f, 20.5f)
                horizontalLineTo(9.999f)
                lineTo(9.998f, 18.002f)
                horizontalLineTo(13.998f)
                close()
                moveTo(18.25f, 3f)
                curveTo(17.836f, 3f, 17.5f, 3.336f, 17.5f, 3.75f)
                verticalLineTo(5.5f)
                horizontalLineTo(17.177f)
                curveTo(16.301f, 5.5f, 15.523f, 6.061f, 15.245f, 6.892f)
                lineTo(14.332f, 9.634f)
                curveTo(14.259f, 9.852f, 14.054f, 10f, 13.823f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(9.25f)
                curveTo(13f, 8.836f, 12.664f, 8.5f, 12.25f, 8.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 8.5f, 7.5f, 8.836f, 7.5f, 9.25f)
                verticalLineTo(13.25f)
                curveTo(7.5f, 13.664f, 7.836f, 14f, 8.25f, 14f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 14f, 13f, 13.664f, 13f, 13.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(13.823f)
                curveTo(14.7f, 11.5f, 15.477f, 10.939f, 15.755f, 10.108f)
                lineTo(16.669f, 7.366f)
                curveTo(16.741f, 7.148f, 16.946f, 7f, 17.177f, 7f)
                horizontalLineTo(17.5f)
                verticalLineTo(7.75f)
                curveTo(17.5f, 8.164f, 17.836f, 8.5f, 18.25f, 8.5f)
                horizontalLineTo(22.25f)
                curveTo(22.664f, 8.5f, 23f, 8.164f, 23f, 7.75f)
                verticalLineTo(3.75f)
                curveTo(23f, 3.336f, 22.664f, 3f, 22.25f, 3f)
                horizontalLineTo(18.25f)
                close()
            }
        }.build()

        return _DesktopFlow!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopFlow: ImageVector? = null

@Preview
@Composable
private fun DesktopFlowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DesktopFlow, contentDescription = null)
    }
}
