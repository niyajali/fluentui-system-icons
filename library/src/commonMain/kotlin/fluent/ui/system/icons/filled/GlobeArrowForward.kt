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

public val FluentIcons.Filled.GlobeArrowForward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlobeArrowForward",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(13.318f, 2f, 14.645f, 4.542f, 15.214f, 8.183f)
            lineTo(15.26f, 8.498f)
            horizontalLineTo(8.739f)
            curveTo(9.278f, 4.689f, 10.643f, 2f, 12f, 2f)
            close()
            moveTo(14.944f, 2.575f)
            lineTo(14.836f, 2.405f)
            curveTo(17.854f, 3.296f, 20.278f, 5.572f, 21.372f, 8.498f)
            lineTo(16.781f, 8.498f)
            curveTo(16.465f, 6.082f, 15.824f, 4.006f, 14.944f, 2.575f)
            close()
            moveTo(7.068f, 9.999f)
            lineTo(2.198f, 9.998f)
            curveTo(2.067f, 10.645f, 1.998f, 11.314f, 1.998f, 11.998f)
            curveTo(1.998f, 13.044f, 2.158f, 14.052f, 2.456f, 14.999f)
            horizontalLineTo(7.159f)
            lineTo(7.101f, 14.419f)
            curveTo(7.033f, 13.638f, 6.998f, 12.828f, 6.998f, 11.998f)
            curveTo(6.998f, 11.317f, 7.022f, 10.649f, 7.068f, 9.999f)
            close()
            moveTo(21.971f, 12.782f)
            curveTo(20.806f, 11.678f, 19.232f, 11f, 17.5f, 11f)
            curveTo(17.326f, 11f, 17.154f, 11.007f, 16.985f, 11.02f)
            curveTo(16.98f, 10.898f, 16.976f, 10.776f, 16.97f, 10.655f)
            lineTo(16.931f, 9.999f)
            lineTo(21.801f, 9.998f)
            curveTo(21.932f, 10.645f, 22.001f, 11.314f, 22.001f, 11.998f)
            curveTo(22.001f, 12.262f, 21.991f, 12.524f, 21.971f, 12.782f)
            close()
            moveTo(8.674f, 14.999f)
            horizontalLineTo(11.498f)
            curveTo(12.224f, 13.259f, 13.685f, 11.902f, 15.492f, 11.316f)
            curveTo(15.481f, 10.868f, 15.458f, 10.428f, 15.424f, 9.998f)
            horizontalLineTo(8.575f)
            lineTo(8.542f, 10.487f)
            curveTo(8.513f, 10.979f, 8.498f, 11.484f, 8.498f, 11.998f)
            curveTo(8.498f, 13.046f, 8.561f, 14.053f, 8.674f, 14.999f)
            close()
            moveTo(8.904f, 16.499f)
            horizontalLineTo(11.076f)
            curveTo(11.026f, 16.825f, 11f, 17.16f, 11f, 17.5f)
            curveTo(11f, 19.152f, 11.616f, 20.66f, 12.631f, 21.807f)
            curveTo(12.423f, 21.932f, 12.211f, 21.997f, 12f, 21.997f)
            curveTo(10.803f, 21.997f, 9.599f, 19.903f, 8.962f, 16.793f)
            lineTo(8.904f, 16.499f)
            close()
            moveTo(3.065f, 16.499f)
            lineTo(7.371f, 16.499f)
            curveTo(7.736f, 18.581f, 8.354f, 20.353f, 9.163f, 21.592f)
            curveTo(6.6f, 20.835f, 4.467f, 19.081f, 3.212f, 16.778f)
            lineTo(3.065f, 16.499f)
            close()
            moveTo(9.163f, 2.405f)
            lineTo(9.041f, 2.442f)
            curveTo(6.08f, 3.357f, 3.706f, 5.612f, 2.628f, 8.498f)
            lineTo(7.219f, 8.498f)
            lineTo(7.28f, 8.059f)
            curveTo(7.628f, 5.734f, 8.282f, 3.754f, 9.163f, 2.405f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.537f, 23f, 23f, 20.538f, 23f, 17.5f)
            curveTo(23f, 14.462f, 20.537f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(18.646f, 15.354f)
            curveTo(18.451f, 15.158f, 18.451f, 14.842f, 18.646f, 14.646f)
            curveTo(18.841f, 14.451f, 19.158f, 14.451f, 19.353f, 14.646f)
            lineTo(20.853f, 16.146f)
            curveTo(21.048f, 16.342f, 21.048f, 16.658f, 20.853f, 16.854f)
            lineTo(19.353f, 18.354f)
            curveTo(19.158f, 18.549f, 18.841f, 18.549f, 18.646f, 18.354f)
            curveTo(18.451f, 18.158f, 18.451f, 17.842f, 18.646f, 17.646f)
            lineTo(19.292f, 17f)
            horizontalLineTo(17.25f)
            curveTo(16.007f, 17f, 15f, 18.007f, 15f, 19.25f)
            verticalLineTo(19.5f)
            curveTo(15f, 19.776f, 14.776f, 20f, 14.5f, 20f)
            curveTo(14.223f, 20f, 14f, 19.776f, 14f, 19.5f)
            verticalLineTo(19.25f)
            curveTo(14f, 17.455f, 15.455f, 16f, 17.25f, 16f)
            horizontalLineTo(19.292f)
            lineTo(18.646f, 15.354f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GlobeArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlobeArrowForward, contentDescription = null)
    }
}
