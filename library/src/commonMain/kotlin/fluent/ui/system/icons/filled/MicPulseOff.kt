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

public val FluentIcons.Filled.MicPulseOff: ImageVector
    get() {
        if (_MicPulseOff != null) {
            return _MicPulseOff!!
        }
        _MicPulseOff = ImageVector.Builder(
            name = "Filled.MicPulseOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 8.061f)
                verticalLineTo(12f)
                curveTo(7f, 14.209f, 8.791f, 16f, 11f, 16f)
                curveTo(11.059f, 16f, 11.117f, 15.999f, 11.175f, 15.996f)
                curveTo(11.397f, 15.057f, 11.823f, 14.197f, 12.404f, 13.465f)
                lineTo(13.117f, 14.177f)
                curveTo(12.416f, 15.101f, 12f, 16.252f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(18.753f, 23f, 19.909f, 22.581f, 20.834f, 21.875f)
                curveTo(21.125f, 22.069f, 21.523f, 22.038f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(7f, 8.061f)
                close()
                moveTo(18.145f, 19.205f)
                lineTo(17.968f, 19.676f)
                curveTo(17.894f, 19.874f, 17.702f, 20.004f, 17.491f, 20f)
                curveTo(17.279f, 19.996f, 17.093f, 19.859f, 17.026f, 19.658f)
                lineTo(16.24f, 17.301f)
                lineTo(18.145f, 19.205f)
                close()
                moveTo(15.796f, 16.857f)
                lineTo(15.464f, 17.686f)
                curveTo(15.388f, 17.875f, 15.205f, 18f, 15f, 18f)
                horizontalLineTo(14f)
                curveTo(13.724f, 18f, 13.5f, 17.776f, 13.5f, 17.5f)
                curveTo(13.5f, 17.224f, 13.724f, 17f, 14f, 17f)
                horizontalLineTo(14.661f)
                lineTo(15.026f, 16.087f)
                lineTo(15.796f, 16.857f)
                close()
                moveTo(15.541f, 12.359f)
                lineTo(22.641f, 19.459f)
                curveTo(22.873f, 18.851f, 23f, 18.19f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(16.81f, 12f, 16.149f, 12.127f, 15.541f, 12.359f)
                close()
                moveTo(7.412f, 4.23f)
                lineTo(14.777f, 11.596f)
                curveTo(14.851f, 11.562f, 14.925f, 11.529f, 15f, 11.498f)
                verticalLineTo(6f)
                curveTo(15f, 3.791f, 13.209f, 2f, 11f, 2f)
                curveTo(9.426f, 2f, 8.065f, 2.909f, 7.412f, 4.23f)
                close()
                moveTo(11f, 17.5f)
                curveTo(11f, 18.596f, 11.271f, 19.629f, 11.75f, 20.535f)
                lineTo(11.75f, 21.25f)
                curveTo(11.75f, 21.664f, 11.414f, 22f, 11f, 22f)
                curveTo(10.62f, 22f, 10.307f, 21.718f, 10.257f, 21.352f)
                lineTo(10.25f, 21.25f)
                lineTo(10.25f, 18.982f)
                curveTo(6.833f, 18.732f, 4.123f, 15.938f, 4.004f, 12.486f)
                lineTo(4f, 12.25f)
                verticalLineTo(11.75f)
                curveTo(4f, 11.336f, 4.336f, 11f, 4.75f, 11f)
                curveTo(5.13f, 11f, 5.443f, 11.282f, 5.493f, 11.648f)
                lineTo(5.5f, 11.75f)
                verticalLineTo(12.25f)
                curveTo(5.5f, 15.077f, 7.734f, 17.382f, 10.534f, 17.496f)
                lineTo(10.75f, 17.5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _MicPulseOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicPulseOff: ImageVector? = null

@Preview
@Composable
private fun MicPulseOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MicPulseOff, contentDescription = null)
    }
}
