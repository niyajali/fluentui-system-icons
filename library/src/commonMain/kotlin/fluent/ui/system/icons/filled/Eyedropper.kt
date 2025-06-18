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

public val FluentUi.Filled.Eyedropper: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Eyedropper",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.03f, 2.97f)
            curveTo(19.633f, 1.573f, 17.367f, 1.573f, 15.97f, 2.97f)
            lineTo(14f, 4.94f)
            lineTo(13.987f, 4.927f)
            curveTo(13.304f, 4.244f, 12.196f, 4.244f, 11.512f, 4.927f)
            lineTo(10.927f, 5.513f)
            curveTo(10.243f, 6.196f, 10.243f, 7.304f, 10.927f, 7.988f)
            lineTo(10.939f, 8f)
            lineTo(4.159f, 14.781f)
            curveTo(3.737f, 15.203f, 3.5f, 15.775f, 3.5f, 16.372f)
            verticalLineTo(17.059f)
            lineTo(2.22f, 19.406f)
            curveTo(1.384f, 20.939f, 3.061f, 22.617f, 4.594f, 21.781f)
            lineTo(6.941f, 20.5f)
            horizontalLineTo(7.629f)
            curveTo(8.226f, 20.5f, 8.798f, 20.263f, 9.22f, 19.841f)
            lineTo(16f, 13.061f)
            lineTo(16.013f, 13.073f)
            curveTo(16.696f, 13.757f, 17.804f, 13.757f, 18.487f, 13.073f)
            lineTo(19.073f, 12.488f)
            curveTo(19.757f, 11.804f, 19.757f, 10.696f, 19.073f, 10.013f)
            lineTo(19.061f, 10f)
            lineTo(21.03f, 8.031f)
            curveTo(22.428f, 6.633f, 22.428f, 4.367f, 21.03f, 2.97f)
            close()
            moveTo(12f, 9.061f)
            lineTo(14.939f, 12f)
            lineTo(8.159f, 18.781f)
            curveTo(8.018f, 18.921f, 7.828f, 19f, 7.629f, 19f)
            horizontalLineTo(6.75f)
            curveTo(6.625f, 19f, 6.501f, 19.032f, 6.391f, 19.092f)
            lineTo(3.876f, 20.464f)
            curveTo(3.807f, 20.501f, 3.755f, 20.503f, 3.717f, 20.496f)
            curveTo(3.672f, 20.489f, 3.622f, 20.464f, 3.579f, 20.421f)
            curveTo(3.536f, 20.378f, 3.512f, 20.328f, 3.504f, 20.283f)
            curveTo(3.497f, 20.245f, 3.499f, 20.194f, 3.537f, 20.125f)
            lineTo(4.909f, 17.61f)
            curveTo(4.969f, 17.499f, 5f, 17.376f, 5f, 17.25f)
            verticalLineTo(16.372f)
            curveTo(5f, 16.173f, 5.079f, 15.982f, 5.22f, 15.841f)
            lineTo(12f, 9.061f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EyedropperPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Eyedropper, contentDescription = null)
    }
}
