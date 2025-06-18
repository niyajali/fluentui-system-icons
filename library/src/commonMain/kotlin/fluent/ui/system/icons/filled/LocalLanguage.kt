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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.LocalLanguage: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocalLanguage",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.562f, 7.505f)
            lineTo(9.618f, 7.622f)
            lineTo(14.926f, 20.627f)
            curveTo(15.134f, 21.138f, 14.889f, 21.722f, 14.378f, 21.93f)
            curveTo(13.903f, 22.124f, 13.366f, 21.927f, 13.124f, 21.488f)
            lineTo(13.074f, 21.382f)
            lineTo(11.693f, 17.999f)
            horizontalLineTo(5.407f)
            lineTo(3.916f, 21.406f)
            curveTo(3.71f, 21.875f, 3.187f, 22.108f, 2.708f, 21.961f)
            lineTo(2.599f, 21.921f)
            curveTo(2.129f, 21.715f, 1.897f, 21.192f, 2.043f, 20.713f)
            lineTo(2.084f, 20.604f)
            lineTo(7.776f, 7.599f)
            curveTo(8.113f, 6.83f, 9.171f, 6.804f, 9.562f, 7.505f)
            close()
            moveTo(19f, 2f)
            curveTo(19.513f, 2f, 19.935f, 2.386f, 19.993f, 2.883f)
            lineTo(20f, 3f)
            lineTo(20f, 7f)
            horizontalLineTo(21f)
            curveTo(21.513f, 7f, 21.935f, 7.386f, 21.993f, 7.883f)
            lineTo(22f, 8f)
            curveTo(22f, 8.513f, 21.614f, 8.936f, 21.116f, 8.993f)
            lineTo(21f, 9f)
            horizontalLineTo(20f)
            lineTo(20f, 16f)
            curveTo(20f, 16.513f, 19.614f, 16.935f, 19.116f, 16.993f)
            lineTo(19f, 17f)
            curveTo(18.487f, 17f, 18.064f, 16.614f, 18.007f, 16.117f)
            lineTo(18f, 16f)
            verticalLineTo(3f)
            curveTo(18f, 2.448f, 18.448f, 2f, 19f, 2f)
            close()
            moveTo(8.66f, 10.567f)
            lineTo(6.282f, 15.999f)
            horizontalLineTo(10.877f)
            lineTo(8.66f, 10.567f)
            close()
            moveTo(11f, 2f)
            horizontalLineTo(16f)
            curveTo(16.513f, 2f, 16.935f, 2.386f, 16.993f, 2.883f)
            lineTo(17f, 3f)
            verticalLineTo(5.975f)
            curveTo(17f, 8.184f, 15.209f, 9.975f, 13f, 9.975f)
            curveTo(12.448f, 9.975f, 12f, 9.527f, 12f, 8.975f)
            curveTo(12f, 8.423f, 12.448f, 7.975f, 13f, 7.975f)
            curveTo(14.054f, 7.975f, 14.918f, 7.159f, 14.994f, 6.124f)
            lineTo(15f, 5.975f)
            verticalLineTo(4f)
            horizontalLineTo(11f)
            curveTo(10.448f, 4f, 10f, 3.552f, 10f, 3f)
            curveTo(10f, 2.487f, 10.386f, 2.064f, 10.883f, 2.007f)
            lineTo(11f, 2f)
            horizontalLineTo(16f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocalLanguagePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LocalLanguage, contentDescription = null)
    }
}
