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

public val FluentIcons.Filled.AirplaneLanding: ImageVector
    get() {
        if (_AirplaneLanding != null) {
            return _AirplaneLanding!!
        }
        _AirplaneLanding = ImageVector.Builder(
            name = "Filled.AirplaneLanding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10f, 5.039f)
                verticalLineTo(5.817f)
                lineTo(13.027f, 7.019f)
                horizontalLineTo(15.146f)
                lineTo(13.896f, 4.211f)
                curveTo(13.002f, 2.202f, 10f, 2.84f, 10f, 5.039f)
                close()
                moveTo(12.721f, 7.974f)
                lineTo(8.5f, 6.297f)
                verticalLineTo(4.756f)
                curveTo(8.5f, 3.019f, 6.241f, 2.343f, 5.287f, 3.796f)
                lineTo(3.378f, 6.704f)
                curveTo(2.586f, 7.91f, 3.085f, 9.538f, 4.416f, 10.094f)
                lineTo(7.919f, 11.558f)
                lineTo(5.874f, 13.456f)
                curveTo(4.247f, 14.967f, 5.87f, 17.621f, 7.956f, 16.861f)
                lineTo(14.717f, 14.397f)
                lineTo(18.18f, 15.843f)
                curveTo(19.521f, 16.404f, 21f, 15.418f, 21f, 13.965f)
                verticalLineTo(12.735f)
                curveTo(21f, 10.13f, 18.889f, 8.019f, 16.285f, 8.019f)
                lineTo(12.958f, 8.019f)
                curveTo(12.877f, 8.019f, 12.797f, 8.004f, 12.721f, 7.974f)
                close()
                moveTo(3f, 20.25f)
                curveTo(3f, 19.836f, 3.336f, 19.5f, 3.75f, 19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 19.5f, 21f, 19.836f, 21f, 20.25f)
                curveTo(21f, 20.664f, 20.664f, 21f, 20.25f, 21f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
                close()
            }
        }.build()

        return _AirplaneLanding!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneLanding: ImageVector? = null

@Preview
@Composable
private fun AirplaneLandingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AirplaneLanding, contentDescription = null)
    }
}
