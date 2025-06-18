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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ArrowSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.782f, 2.22f)
            lineTo(19.277f, 6.714f)
            curveTo(19.544f, 6.98f, 19.568f, 7.397f, 19.351f, 7.69f)
            lineTo(19.278f, 7.775f)
            lineTo(14.783f, 12.279f)
            curveTo(14.49f, 12.573f, 14.016f, 12.573f, 13.722f, 12.281f)
            curveTo(13.456f, 12.014f, 13.431f, 11.598f, 13.649f, 11.304f)
            lineTo(13.721f, 11.22f)
            lineTo(16.938f, 7.997f)
            lineTo(5.242f, 7.998f)
            curveTo(4.862f, 7.998f, 4.549f, 7.716f, 4.499f, 7.349f)
            lineTo(4.492f, 7.248f)
            curveTo(4.492f, 6.868f, 4.774f, 6.554f, 5.14f, 6.505f)
            lineTo(5.242f, 6.498f)
            lineTo(16.94f, 6.497f)
            lineTo(13.722f, 3.28f)
            curveTo(13.455f, 3.014f, 13.431f, 2.597f, 13.649f, 2.304f)
            lineTo(13.722f, 2.22f)
            curveTo(13.988f, 1.953f, 14.405f, 1.929f, 14.698f, 2.147f)
            lineTo(14.782f, 2.22f)
            lineTo(19.277f, 6.714f)
            lineTo(14.782f, 2.22f)
            close()
            moveTo(19.5f, 16.649f)
            lineTo(19.507f, 16.751f)
            curveTo(19.507f, 17.131f, 19.225f, 17.444f, 18.859f, 17.494f)
            lineTo(18.757f, 17.501f)
            lineTo(7.061f, 17.5f)
            lineTo(10.282f, 20.719f)
            curveTo(10.549f, 20.986f, 10.573f, 21.402f, 10.355f, 21.696f)
            lineTo(10.283f, 21.78f)
            curveTo(10.017f, 22.046f, 9.6f, 22.071f, 9.306f, 21.853f)
            lineTo(9.222f, 21.781f)
            lineTo(4.722f, 17.284f)
            curveTo(4.456f, 17.018f, 4.431f, 16.601f, 4.649f, 16.308f)
            lineTo(4.722f, 16.224f)
            lineTo(9.222f, 11.72f)
            curveTo(9.514f, 11.427f, 9.989f, 11.427f, 10.282f, 11.719f)
            curveTo(10.549f, 11.986f, 10.573f, 12.402f, 10.355f, 12.696f)
            lineTo(10.283f, 12.78f)
            lineTo(7.065f, 16f)
            lineTo(18.757f, 16.001f)
            curveTo(19.137f, 16.001f, 19.451f, 16.283f, 19.5f, 16.649f)
            lineTo(19.507f, 16.751f)
            lineTo(19.5f, 16.649f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowSwap, contentDescription = null)
    }
}
