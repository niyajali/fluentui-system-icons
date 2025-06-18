/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.TagAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.75f, 2f)
            curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
            verticalLineTo(9.712f)
            curveTo(22f, 10.574f, 21.657f, 11.4f, 21.048f, 12.01f)
            lineTo(21.022f, 12.036f)
            curveTo(20.007f, 11.38f, 18.798f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 18.77f, 11.364f, 19.955f, 11.994f, 20.956f)
            curveTo(10.737f, 21.757f, 9.05f, 21.61f, 7.951f, 20.514f)
            lineTo(3.489f, 16.059f)
            curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
            lineTo(11.985f, 2.953f)
            curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
            horizontalLineTo(19.75f)
            close()
            moveTo(17f, 5.502f)
            curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
            curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17f, 8.502f)
            curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
            curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17f, 5.502f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TagAdd, contentDescription = null)
    }
}
