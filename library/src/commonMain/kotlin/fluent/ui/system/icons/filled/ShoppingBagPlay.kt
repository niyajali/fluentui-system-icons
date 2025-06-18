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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ShoppingBagPlay: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShoppingBagPlay",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(5.5f)
            curveTo(4.672f, 7f, 4f, 7.672f, 4f, 8.5f)
            verticalLineTo(18f)
            curveTo(4f, 20.209f, 5.791f, 22f, 8f, 22f)
            horizontalLineTo(12.81f)
            curveTo(11.689f, 20.832f, 11f, 19.247f, 11f, 17.5f)
            curveTo(11f, 15.657f, 11.767f, 13.993f, 13f, 12.81f)
            verticalLineTo(5f)
            curveTo(13f, 4.666f, 12.945f, 4.344f, 12.844f, 4.044f)
            curveTo(13.12f, 3.712f, 13.535f, 3.5f, 14f, 3.5f)
            curveTo(14.828f, 3.5f, 15.5f, 4.172f, 15.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(14.5f)
            verticalLineTo(11.732f)
            curveTo(15.398f, 11.264f, 16.418f, 11f, 17.5f, 11f)
            curveTo(18.386f, 11f, 19.23f, 11.177f, 20f, 11.498f)
            verticalLineTo(8.5f)
            curveTo(20f, 7.672f, 19.328f, 7f, 18.5f, 7f)
            horizontalLineTo(17f)
            verticalLineTo(5f)
            curveTo(17f, 3.343f, 15.657f, 2f, 14f, 2f)
            curveTo(13.232f, 2f, 12.531f, 2.289f, 12f, 2.764f)
            curveTo(11.469f, 2.289f, 10.768f, 2f, 10f, 2f)
            curveTo(8.343f, 2f, 7f, 3.343f, 7f, 5f)
            close()
            moveTo(10f, 3.5f)
            curveTo(10.828f, 3.5f, 11.5f, 4.172f, 11.5f, 5f)
            verticalLineTo(7f)
            horizontalLineTo(8.5f)
            verticalLineTo(5f)
            curveTo(8.5f, 4.172f, 9.172f, 3.5f, 10f, 3.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(16.913f, 15.097f)
            curveTo(16.818f, 15.032f, 16.712f, 15f, 16.596f, 15f)
            curveTo(16.516f, 15f, 16.439f, 15.017f, 16.366f, 15.052f)
            curveTo(16.294f, 15.084f, 16.231f, 15.128f, 16.177f, 15.184f)
            curveTo(16.123f, 15.241f, 16.08f, 15.306f, 16.046f, 15.382f)
            curveTo(16.015f, 15.457f, 16f, 15.537f, 16f, 15.621f)
            verticalLineTo(19.379f)
            curveTo(16f, 19.461f, 16.015f, 19.54f, 16.046f, 19.615f)
            curveTo(16.08f, 19.691f, 16.123f, 19.757f, 16.177f, 19.816f)
            curveTo(16.233f, 19.872f, 16.297f, 19.917f, 16.369f, 19.952f)
            curveTo(16.442f, 19.984f, 16.518f, 20f, 16.596f, 20f)
            curveTo(16.656f, 20f, 16.712f, 19.991f, 16.764f, 19.974f)
            curveTo(16.779f, 19.969f, 16.794f, 19.964f, 16.809f, 19.958f)
            curveTo(16.847f, 19.942f, 16.885f, 19.921f, 16.923f, 19.897f)
            lineTo(19.729f, 17.982f)
            curveTo(19.792f, 17.94f, 19.845f, 17.888f, 19.888f, 17.825f)
            curveTo(19.903f, 17.803f, 19.916f, 17.78f, 19.928f, 17.755f)
            curveTo(19.976f, 17.66f, 20f, 17.562f, 20f, 17.458f)
            curveTo(20f, 17.35f, 19.975f, 17.251f, 19.925f, 17.16f)
            curveTo(19.875f, 17.068f, 19.807f, 16.993f, 19.72f, 16.937f)
            lineTo(16.913f, 15.097f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShoppingBagPlayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShoppingBagPlay, contentDescription = null)
    }
}
