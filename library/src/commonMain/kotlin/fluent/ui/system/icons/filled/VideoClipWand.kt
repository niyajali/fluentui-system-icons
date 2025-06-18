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

public val FluentUi.Filled.VideoClipWand: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClipWand",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(1f, 5.25f)
            curveTo(1f, 3.455f, 2.455f, 2f, 4.25f, 2f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 2f, 21f, 3.455f, 21f, 5.25f)
            verticalLineTo(12.964f)
            curveTo(20.664f, 12.62f, 20.438f, 12.169f, 20.376f, 11.666f)
            lineTo(20.237f, 10.536f)
            curveTo(20.129f, 9.659f, 19.384f, 9f, 18.5f, 9f)
            curveTo(17.616f, 9f, 16.871f, 9.659f, 16.763f, 10.536f)
            lineTo(16.624f, 11.666f)
            curveTo(16.498f, 12.691f, 15.691f, 13.498f, 14.666f, 13.624f)
            lineTo(13.536f, 13.763f)
            curveTo(12.659f, 13.871f, 12f, 14.616f, 12f, 15.5f)
            curveTo(12f, 16.384f, 12.659f, 17.129f, 13.536f, 17.237f)
            lineTo(14.236f, 17.323f)
            curveTo(14.158f, 17.379f, 14.083f, 17.442f, 14.013f, 17.513f)
            lineTo(11.525f, 20f)
            horizontalLineTo(4.25f)
            curveTo(2.455f, 20f, 1f, 18.545f, 1f, 16.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(9.482f, 7.374f)
            curveTo(8.815f, 7.008f, 8f, 7.49f, 8f, 8.251f)
            verticalLineTo(13.75f)
            curveTo(8f, 14.511f, 8.815f, 14.993f, 9.482f, 14.626f)
            lineTo(14.481f, 11.877f)
            curveTo(15.172f, 11.497f, 15.172f, 10.504f, 14.481f, 10.124f)
            lineTo(9.482f, 7.374f)
            close()
            moveTo(15f, 18.043f)
            curveTo(15.264f, 17.95f, 15.569f, 18.009f, 15.78f, 18.22f)
            curveTo(16.073f, 18.513f, 16.073f, 18.987f, 15.78f, 19.28f)
            lineTo(11.28f, 23.78f)
            curveTo(10.987f, 24.073f, 10.513f, 24.073f, 10.22f, 23.78f)
            curveTo(9.927f, 23.487f, 9.927f, 23.013f, 10.22f, 22.72f)
            lineTo(14.72f, 18.22f)
            curveTo(14.802f, 18.138f, 14.898f, 18.079f, 15f, 18.043f)
            close()
            moveTo(19.383f, 11.788f)
            curveTo(19.495f, 12.694f, 19.976f, 13.483f, 20.671f, 14f)
            curveTo(21.111f, 14.327f, 21.638f, 14.546f, 22.212f, 14.617f)
            lineTo(23.342f, 14.756f)
            curveTo(23.718f, 14.802f, 24f, 15.121f, 24f, 15.5f)
            curveTo(24f, 15.879f, 23.718f, 16.198f, 23.342f, 16.244f)
            lineTo(22.212f, 16.383f)
            curveTo(20.732f, 16.566f, 19.566f, 17.732f, 19.383f, 19.212f)
            lineTo(19.244f, 20.342f)
            curveTo(19.198f, 20.718f, 18.879f, 21f, 18.5f, 21f)
            curveTo(18.121f, 21f, 17.802f, 20.718f, 17.756f, 20.342f)
            lineTo(17.617f, 19.212f)
            curveTo(17.443f, 17.803f, 16.378f, 16.679f, 15f, 16.417f)
            curveTo(14.93f, 16.403f, 14.859f, 16.392f, 14.788f, 16.383f)
            lineTo(13.658f, 16.244f)
            curveTo(13.282f, 16.198f, 13f, 15.879f, 13f, 15.5f)
            curveTo(13f, 15.121f, 13.282f, 14.802f, 13.658f, 14.756f)
            lineTo(14.788f, 14.617f)
            curveTo(14.859f, 14.608f, 14.93f, 14.597f, 15f, 14.583f)
            curveTo(15.492f, 14.49f, 15.943f, 14.287f, 16.329f, 14f)
            curveTo(17.024f, 13.483f, 17.505f, 12.694f, 17.617f, 11.788f)
            lineTo(17.756f, 10.658f)
            curveTo(17.802f, 10.282f, 18.121f, 10f, 18.5f, 10f)
            curveTo(18.879f, 10f, 19.198f, 10.282f, 19.244f, 10.658f)
            lineTo(19.383f, 11.788f)
            close()
            moveTo(18.361f, 14f)
            curveTo(17.956f, 14.615f, 17.413f, 15.13f, 16.774f, 15.5f)
            curveTo(17.489f, 15.915f, 18.085f, 16.511f, 18.5f, 17.226f)
            curveTo(18.915f, 16.511f, 19.511f, 15.915f, 20.226f, 15.5f)
            curveTo(19.587f, 15.13f, 19.044f, 14.615f, 18.639f, 14f)
            curveTo(18.591f, 13.926f, 18.545f, 13.851f, 18.5f, 13.774f)
            curveTo(18.455f, 13.851f, 18.409f, 13.926f, 18.361f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoClipWandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoClipWand, contentDescription = null)
    }
}
