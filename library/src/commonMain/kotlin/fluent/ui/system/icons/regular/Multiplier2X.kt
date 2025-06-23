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

public val FluentIcons.Regular.Multiplier2X: ImageVector
    get() {
        if (_Multiplier2X != null) {
            return _Multiplier2X!!
        }
        _Multiplier2X = ImageVector.Builder(
            name = "Regular.Multiplier2X",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.161f, 10.245f)
                curveTo(6.569f, 10.293f, 6.94f, 10.005f, 6.993f, 9.598f)
                curveTo(6.994f, 9.596f, 6.995f, 9.588f, 6.997f, 9.577f)
                curveTo(7.002f, 9.552f, 7.012f, 9.511f, 7.029f, 9.458f)
                curveTo(7.064f, 9.351f, 7.125f, 9.209f, 7.228f, 9.069f)
                curveTo(7.409f, 8.823f, 7.778f, 8.5f, 8.616f, 8.5f)
                curveTo(9.392f, 8.5f, 9.902f, 8.739f, 10.189f, 9.058f)
                curveTo(10.468f, 9.368f, 10.64f, 9.869f, 10.51f, 10.623f)
                curveTo(10.438f, 11.048f, 10.228f, 11.298f, 9.873f, 11.52f)
                curveTo(9.574f, 11.707f, 9.241f, 11.837f, 8.83f, 11.997f)
                curveTo(8.662f, 12.063f, 8.482f, 12.133f, 8.286f, 12.214f)
                curveTo(7.667f, 12.471f, 6.947f, 12.822f, 6.395f, 13.466f)
                curveTo(5.824f, 14.132f, 5.5f, 15.03f, 5.5f, 16.25f)
                curveTo(5.5f, 16.449f, 5.579f, 16.64f, 5.719f, 16.78f)
                curveTo(5.86f, 16.921f, 6.051f, 17f, 6.25f, 17f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 17f, 12f, 16.664f, 12f, 16.25f)
                curveTo(12f, 15.836f, 11.664f, 15.5f, 11.25f, 15.5f)
                horizontalLineTo(7.062f)
                curveTo(7.152f, 15.007f, 7.331f, 14.68f, 7.534f, 14.442f)
                curveTo(7.846f, 14.078f, 8.289f, 13.837f, 8.861f, 13.6f)
                curveTo(8.982f, 13.549f, 9.116f, 13.497f, 9.258f, 13.442f)
                curveTo(9.712f, 13.265f, 10.24f, 13.06f, 10.668f, 12.792f)
                curveTo(11.294f, 12.401f, 11.827f, 11.819f, 11.989f, 10.877f)
                curveTo(12.177f, 9.781f, 11.958f, 8.782f, 11.304f, 8.055f)
                curveTo(10.657f, 7.336f, 9.691f, 7f, 8.616f, 7f)
                curveTo(7.297f, 7f, 6.482f, 7.552f, 6.02f, 8.181f)
                curveTo(5.8f, 8.479f, 5.674f, 8.774f, 5.603f, 8.995f)
                curveTo(5.566f, 9.106f, 5.543f, 9.201f, 5.528f, 9.273f)
                curveTo(5.521f, 9.308f, 5.516f, 9.338f, 5.512f, 9.362f)
                curveTo(5.51f, 9.373f, 5.509f, 9.383f, 5.508f, 9.392f)
                lineTo(5.506f, 9.403f)
                lineTo(5.505f, 9.407f)
                lineTo(5.505f, 9.41f)
                curveTo(5.505f, 9.412f, 5.459f, 9.798f, 5.505f, 9.411f)
                curveTo(5.456f, 9.823f, 5.75f, 10.196f, 6.161f, 10.245f)
                close()
                moveTo(14.28f, 12.22f)
                curveTo(13.987f, 11.927f, 13.512f, 11.927f, 13.219f, 12.22f)
                curveTo(12.926f, 12.512f, 12.926f, 12.987f, 13.219f, 13.28f)
                lineTo(14.439f, 14.5f)
                lineTo(13.219f, 15.72f)
                curveTo(12.926f, 16.013f, 12.926f, 16.487f, 13.219f, 16.78f)
                curveTo(13.512f, 17.073f, 13.987f, 17.073f, 14.28f, 16.78f)
                lineTo(15.5f, 15.561f)
                lineTo(16.719f, 16.78f)
                curveTo(17.012f, 17.073f, 17.487f, 17.073f, 17.78f, 16.78f)
                curveTo(18.073f, 16.487f, 18.073f, 16.013f, 17.78f, 15.72f)
                lineTo(16.56f, 14.5f)
                lineTo(17.78f, 13.28f)
                curveTo(18.073f, 12.987f, 18.073f, 12.512f, 17.78f, 12.22f)
                curveTo(17.487f, 11.927f, 17.012f, 11.927f, 16.719f, 12.22f)
                lineTo(15.5f, 13.439f)
                lineTo(14.28f, 12.22f)
                close()
            }
        }.build()

        return _Multiplier2X!!
    }

@Suppress("ObjectPropertyName")
private var _Multiplier2X: ImageVector? = null

@Preview
@Composable
private fun Multiplier2XPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Multiplier2X, contentDescription = null)
    }
}
