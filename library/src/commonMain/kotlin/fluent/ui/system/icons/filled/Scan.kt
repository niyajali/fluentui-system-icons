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

public val FluentIcons.Filled.Scan: ImageVector
    get() {
        if (_Scan != null) {
            return _Scan!!
        }
        _Scan = ImageVector.Builder(
            name = "Filled.Scan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(15.328f, 14.221f)
                curveTo(15.248f, 14.34f, 15.162f, 14.455f, 15.07f, 14.564f)
                lineTo(14.928f, 14.725f)
                lineTo(10.984f, 19.936f)
                curveTo(11.317f, 19.978f, 11.656f, 20f, 12f, 20f)
                curveTo(13.997f, 20f, 15.823f, 19.268f, 17.225f, 18.058f)
                lineTo(15.328f, 14.221f)
                close()
                moveTo(11.439f, 16.018f)
                lineTo(5.081f, 16.019f)
                curveTo(5.951f, 17.513f, 7.291f, 18.7f, 8.898f, 19.376f)
                lineTo(11.439f, 16.018f)
                close()
                moveTo(19.746f, 9.992f)
                lineTo(15.466f, 9.991f)
                lineTo(15.532f, 10.121f)
                curveTo(15.572f, 10.196f, 15.61f, 10.273f, 15.646f, 10.351f)
                lineTo(18.656f, 16.44f)
                curveTo(19.505f, 15.17f, 20f, 13.643f, 20f, 12f)
                curveTo(20f, 11.306f, 19.912f, 10.633f, 19.746f, 9.992f)
                close()
                moveTo(5.042f, 8.05f)
                curveTo(4.379f, 9.215f, 4f, 10.563f, 4f, 12f)
                curveTo(4f, 12.697f, 4.089f, 13.374f, 4.257f, 14.018f)
                lineTo(8.539f, 14.018f)
                lineTo(8.481f, 13.93f)
                lineTo(5.042f, 8.05f)
                close()
                moveTo(12f, 10f)
                curveTo(11.36f, 10f, 10.79f, 10.301f, 10.424f, 10.769f)
                lineTo(10.323f, 10.94f)
                curveTo(10.296f, 10.984f, 10.267f, 11.026f, 10.234f, 11.065f)
                curveTo(10.084f, 11.342f, 10f, 11.661f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                curveTo(12.545f, 14f, 13.039f, 13.782f, 13.4f, 13.429f)
                lineTo(13.562f, 13.215f)
                curveTo(13.597f, 13.168f, 13.636f, 13.125f, 13.678f, 13.086f)
                curveTo(13.882f, 12.775f, 14f, 12.401f, 14f, 12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                close()
                moveTo(12f, 4f)
                curveTo(9.796f, 4f, 7.8f, 4.891f, 6.353f, 6.333f)
                lineTo(8.517f, 10.032f)
                curveTo(8.594f, 9.896f, 8.678f, 9.766f, 8.769f, 9.641f)
                lineTo(12.148f, 4.001f)
                lineTo(12f, 4f)
                close()
                moveTo(14.283f, 4.331f)
                lineTo(12.09f, 7.991f)
                lineTo(18.924f, 7.991f)
                curveTo(17.911f, 6.245f, 16.257f, 4.917f, 14.283f, 4.331f)
                close()
            }
        }.build()

        return _Scan!!
    }

@Suppress("ObjectPropertyName")
private var _Scan: ImageVector? = null

@Preview
@Composable
private fun ScanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Scan, contentDescription = null)
    }
}
