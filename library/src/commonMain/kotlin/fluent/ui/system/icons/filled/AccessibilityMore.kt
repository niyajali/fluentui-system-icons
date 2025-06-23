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

public val FluentIcons.Filled.AccessibilityMore: ImageVector
    get() {
        if (_AccessibilityMore != null) {
            return _AccessibilityMore!!
        }
        _AccessibilityMore = ImageVector.Builder(
            name = "Filled.AccessibilityMore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.877f, 19.017f)
                curveTo(18.002f, 19.381f, 18.019f, 19.753f, 17.961f, 20.108f)
                curveTo(17.771f, 18.916f, 16.745f, 18f, 15.501f, 18f)
                curveTo(14.511f, 18f, 13.662f, 18.583f, 13.257f, 19.419f)
                lineTo(12.238f, 16.458f)
                curveTo(12.161f, 16.233f, 11.843f, 16.233f, 11.765f, 16.458f)
                lineTo(11.196f, 18.11f)
                curveTo(10.974f, 18.045f, 10.744f, 18f, 10.501f, 18f)
                curveTo(9.122f, 18f, 8.001f, 19.121f, 8.001f, 20.5f)
                curveTo(8.001f, 21.055f, 8.189f, 21.564f, 8.496f, 21.979f)
                curveTo(8.176f, 22.014f, 7.844f, 21.988f, 7.519f, 21.876f)
                curveTo(6.344f, 21.472f, 5.72f, 20.191f, 6.124f, 19.016f)
                lineTo(8.003f, 13.559f)
                verticalLineTo(10.52f)
                curveTo(8.003f, 10.119f, 7.763f, 9.756f, 7.394f, 9.599f)
                lineTo(4.37f, 8.316f)
                curveTo(3.223f, 7.829f, 2.694f, 6.505f, 3.189f, 5.362f)
                curveTo(3.683f, 4.222f, 5.007f, 3.693f, 6.15f, 4.178f)
                lineTo(7.756f, 4.86f)
                curveTo(8.097f, 5.005f, 8.334f, 5.283f, 8.451f, 5.591f)
                curveTo(8.993f, 7.025f, 10.379f, 8.043f, 12f, 8.043f)
                curveTo(13.621f, 8.043f, 15.007f, 7.025f, 15.549f, 5.591f)
                curveTo(15.666f, 5.283f, 15.903f, 5.005f, 16.244f, 4.86f)
                lineTo(17.85f, 4.178f)
                curveTo(18.993f, 3.693f, 20.318f, 4.222f, 20.811f, 5.362f)
                curveTo(21.306f, 6.505f, 20.777f, 7.829f, 19.63f, 8.316f)
                lineTo(16.611f, 9.597f)
                curveTo(16.242f, 9.754f, 16.002f, 10.116f, 16.002f, 10.517f)
                verticalLineTo(13.559f)
                lineTo(17.876f, 19.016f)
                lineTo(17.877f, 19.017f)
                close()
                moveTo(12f, 6.5f)
                curveTo(13.243f, 6.5f, 14.25f, 5.493f, 14.25f, 4.25f)
                curveTo(14.25f, 3.007f, 13.243f, 2f, 12f, 2f)
                curveTo(10.757f, 2f, 9.75f, 3.007f, 9.75f, 4.25f)
                curveTo(9.75f, 5.493f, 10.757f, 6.5f, 12f, 6.5f)
                close()
                moveTo(10.5f, 19f)
                curveTo(9.672f, 19f, 9f, 19.672f, 9f, 20.5f)
                curveTo(9f, 21.328f, 9.672f, 22f, 10.5f, 22f)
                curveTo(11.328f, 22f, 12f, 21.328f, 12f, 20.5f)
                curveTo(12f, 19.672f, 11.328f, 19f, 10.5f, 19f)
                close()
                moveTo(15.5f, 19f)
                curveTo(14.672f, 19f, 14f, 19.672f, 14f, 20.5f)
                curveTo(14f, 21.328f, 14.672f, 22f, 15.5f, 22f)
                curveTo(16.328f, 22f, 17f, 21.328f, 17f, 20.5f)
                curveTo(17f, 19.672f, 16.328f, 19f, 15.5f, 19f)
                close()
                moveTo(20.5f, 19f)
                curveTo(19.672f, 19f, 19f, 19.672f, 19f, 20.5f)
                curveTo(19f, 21.328f, 19.672f, 22f, 20.5f, 22f)
                curveTo(21.328f, 22f, 22f, 21.328f, 22f, 20.5f)
                curveTo(22f, 19.672f, 21.328f, 19f, 20.5f, 19f)
                close()
            }
        }.build()

        return _AccessibilityMore!!
    }

@Suppress("ObjectPropertyName")
private var _AccessibilityMore: ImageVector? = null

@Preview
@Composable
private fun AccessibilityMorePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AccessibilityMore, contentDescription = null)
    }
}
