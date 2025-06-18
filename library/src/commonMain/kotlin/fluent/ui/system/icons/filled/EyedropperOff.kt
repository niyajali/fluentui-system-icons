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

public val FluentUi.Filled.EyedropperOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EyedropperOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.94f, 10.001f)
            lineTo(4.16f, 14.781f)
            curveTo(3.738f, 15.203f, 3.501f, 15.775f, 3.501f, 16.372f)
            verticalLineTo(17.059f)
            lineTo(2.221f, 19.406f)
            curveTo(1.385f, 20.939f, 3.062f, 22.617f, 4.595f, 21.781f)
            lineTo(6.942f, 20.5f)
            horizontalLineTo(7.63f)
            curveTo(8.227f, 20.5f, 8.799f, 20.263f, 9.221f, 19.841f)
            lineTo(14f, 15.062f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.074f, 21.487f, 22.074f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.988f, 2.22f, 3.281f)
            lineTo(8.94f, 10.001f)
            close()
            moveTo(12.94f, 14.001f)
            lineTo(8.16f, 18.781f)
            curveTo(8.019f, 18.921f, 7.829f, 19f, 7.63f, 19f)
            horizontalLineTo(6.751f)
            curveTo(6.626f, 19f, 6.502f, 19.032f, 6.392f, 19.092f)
            lineTo(3.877f, 20.464f)
            curveTo(3.808f, 20.501f, 3.756f, 20.503f, 3.718f, 20.496f)
            curveTo(3.673f, 20.489f, 3.623f, 20.464f, 3.58f, 20.421f)
            curveTo(3.537f, 20.378f, 3.513f, 20.328f, 3.505f, 20.283f)
            curveTo(3.498f, 20.245f, 3.5f, 20.194f, 3.538f, 20.125f)
            lineTo(4.91f, 17.61f)
            curveTo(4.97f, 17.499f, 5.001f, 17.376f, 5.001f, 17.25f)
            verticalLineTo(16.372f)
            curveTo(5.001f, 16.173f, 5.08f, 15.982f, 5.221f, 15.841f)
            lineTo(10f, 11.062f)
            lineTo(12.94f, 14.001f)
            close()
            moveTo(18.488f, 13.073f)
            curveTo(17.997f, 13.565f, 17.285f, 13.703f, 16.67f, 13.487f)
            lineTo(10.514f, 7.331f)
            curveTo(10.298f, 6.716f, 10.436f, 6.005f, 10.928f, 5.513f)
            lineTo(11.514f, 4.927f)
            curveTo(12.197f, 4.244f, 13.305f, 4.244f, 13.988f, 4.927f)
            lineTo(14.001f, 4.94f)
            lineTo(15.971f, 2.97f)
            curveTo(17.368f, 1.573f, 19.634f, 1.573f, 21.031f, 2.97f)
            curveTo(22.429f, 4.367f, 22.429f, 6.633f, 21.031f, 8.031f)
            lineTo(19.062f, 10f)
            lineTo(19.074f, 10.013f)
            curveTo(19.758f, 10.696f, 19.758f, 11.804f, 19.074f, 12.488f)
            lineTo(18.488f, 13.073f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EyedropperOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EyedropperOff, contentDescription = null)
    }
}
