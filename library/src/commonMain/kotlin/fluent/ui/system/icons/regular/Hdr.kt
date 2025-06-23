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

public val FluentIcons.Regular.Hdr: ImageVector
    get() {
        if (_Hdr != null) {
            return _Hdr!!
        }
        _Hdr = ImageVector.Builder(
            name = "Regular.Hdr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.75f, 3.5f)
                curveTo(20.545f, 3.5f, 22f, 4.955f, 22f, 6.75f)
                verticalLineTo(17.253f)
                curveTo(22f, 19.048f, 20.545f, 20.503f, 18.75f, 20.503f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20.503f, 2f, 19.048f, 2f, 17.253f)
                verticalLineTo(6.75f)
                curveTo(2f, 4.955f, 3.455f, 3.5f, 5.25f, 3.5f)
                horizontalLineTo(18.75f)
                close()
                moveTo(18.75f, 5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 5f, 3.5f, 5.784f, 3.5f, 6.75f)
                verticalLineTo(17.253f)
                curveTo(3.5f, 18.219f, 4.284f, 19.003f, 5.25f, 19.003f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 19.003f, 20.5f, 18.219f, 20.5f, 17.253f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 5.784f, 19.716f, 5f, 18.75f, 5f)
                close()
                moveTo(8.378f, 8.993f)
                curveTo(8.692f, 8.993f, 8.952f, 9.224f, 8.997f, 9.525f)
                lineTo(9.003f, 9.618f)
                verticalLineTo(14.37f)
                curveTo(9.003f, 14.715f, 8.724f, 14.995f, 8.378f, 14.995f)
                curveTo(8.065f, 14.995f, 7.805f, 14.763f, 7.76f, 14.462f)
                lineTo(7.753f, 14.37f)
                lineTo(7.753f, 12.636f)
                horizontalLineTo(6.272f)
                verticalLineTo(14.387f)
                curveTo(6.272f, 14.732f, 5.992f, 15.012f, 5.647f, 15.012f)
                curveTo(5.333f, 15.012f, 5.073f, 14.781f, 5.029f, 14.479f)
                lineTo(5.022f, 14.387f)
                verticalLineTo(9.635f)
                curveTo(5.022f, 9.29f, 5.302f, 9.01f, 5.647f, 9.01f)
                curveTo(5.961f, 9.01f, 6.22f, 9.241f, 6.265f, 9.542f)
                lineTo(6.272f, 9.635f)
                verticalLineTo(11.386f)
                horizontalLineTo(7.753f)
                lineTo(7.753f, 9.618f)
                curveTo(7.753f, 9.272f, 8.033f, 8.993f, 8.378f, 8.993f)
                close()
                moveTo(17.201f, 9.015f)
                curveTo(18.198f, 9.015f, 19.006f, 9.823f, 19.006f, 10.819f)
                curveTo(19.006f, 11.437f, 18.695f, 11.983f, 18.222f, 12.308f)
                lineTo(18.96f, 14.141f)
                curveTo(19.089f, 14.461f, 18.934f, 14.825f, 18.614f, 14.955f)
                curveTo(18.326f, 15.071f, 18.002f, 14.957f, 17.846f, 14.699f)
                lineTo(17.801f, 14.608f)
                lineTo(17.001f, 12.623f)
                lineTo(16.258f, 12.623f)
                lineTo(16.259f, 14.375f)
                curveTo(16.259f, 15.13f, 15.232f, 15.201f, 15.04f, 14.587f)
                lineTo(15.017f, 14.484f)
                lineTo(15.009f, 14.375f)
                lineTo(15.004f, 9.641f)
                curveTo(15.003f, 9.327f, 15.235f, 9.067f, 15.536f, 9.022f)
                lineTo(15.629f, 9.015f)
                horizontalLineTo(17.201f)
                close()
                moveTo(11.375f, 9.005f)
                curveTo(12.769f, 9.005f, 13.91f, 10.092f, 13.995f, 11.465f)
                lineTo(14f, 11.63f)
                verticalLineTo(12.372f)
                curveTo(14f, 13.766f, 12.914f, 14.906f, 11.541f, 14.992f)
                lineTo(11.375f, 14.997f)
                horizontalLineTo(10.625f)
                curveTo(10.311f, 14.997f, 10.051f, 14.766f, 10.006f, 14.465f)
                lineTo(10f, 14.372f)
                verticalLineTo(9.63f)
                curveTo(10f, 9.317f, 10.231f, 9.057f, 10.532f, 9.012f)
                lineTo(10.625f, 9.005f)
                horizontalLineTo(11.375f)
                close()
                moveTo(11.375f, 10.255f)
                horizontalLineTo(11.249f)
                verticalLineTo(13.747f)
                lineTo(11.375f, 13.747f)
                curveTo(12.09f, 13.747f, 12.677f, 13.202f, 12.744f, 12.505f)
                lineTo(12.75f, 12.372f)
                verticalLineTo(11.63f)
                curveTo(12.75f, 10.916f, 12.205f, 10.328f, 11.508f, 10.262f)
                lineTo(11.375f, 10.255f)
                close()
                moveTo(16.254f, 10.264f)
                lineTo(16.256f, 11.373f)
                lineTo(17.201f, 11.374f)
                curveTo(17.507f, 11.374f, 17.756f, 11.126f, 17.756f, 10.819f)
                curveTo(17.756f, 10.544f, 17.555f, 10.315f, 17.291f, 10.272f)
                lineTo(17.201f, 10.265f)
                lineTo(16.254f, 10.264f)
                close()
            }
        }.build()

        return _Hdr!!
    }

@Suppress("ObjectPropertyName")
private var _Hdr: ImageVector? = null

@Preview
@Composable
private fun HdrPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Hdr, contentDescription = null)
    }
}
