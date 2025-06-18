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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PhoneVibrate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneVibrate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.749f, 2f)
            curveTo(16.992f, 2f, 17.999f, 3.007f, 17.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(17.999f, 20.993f, 16.992f, 22f, 15.749f, 22f)
            horizontalLineTo(8.249f)
            curveTo(7.006f, 22f, 5.999f, 20.993f, 5.999f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(5.999f, 3.007f, 7.006f, 2f, 8.249f, 2f)
            horizontalLineTo(15.749f)
            close()
            moveTo(15.749f, 3.5f)
            horizontalLineTo(8.249f)
            curveTo(7.835f, 3.5f, 7.499f, 3.836f, 7.499f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(7.499f, 20.164f, 7.835f, 20.5f, 8.249f, 20.5f)
            horizontalLineTo(15.749f)
            curveTo(16.163f, 20.5f, 16.499f, 20.164f, 16.499f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(16.499f, 3.836f, 16.163f, 3.5f, 15.749f, 3.5f)
            close()
            moveTo(13.248f, 17.5f)
            curveTo(13.662f, 17.499f, 13.998f, 17.835f, 13.999f, 18.249f)
            curveTo(14f, 18.663f, 13.664f, 18.999f, 13.25f, 19f)
            lineTo(10.75f, 19.004f)
            curveTo(10.336f, 19.004f, 10f, 18.669f, 9.999f, 18.255f)
            curveTo(9.998f, 17.841f, 10.334f, 17.504f, 10.748f, 17.504f)
            lineTo(13.248f, 17.5f)
            close()
            moveTo(20.651f, 8.13f)
            lineTo(20.695f, 8.221f)
            lineTo(21.278f, 9.678f)
            curveTo(21.611f, 10.509f, 21.516f, 11.447f, 21.034f, 12.193f)
            lineTo(20.925f, 12.349f)
            lineTo(20.774f, 12.551f)
            curveTo(20.541f, 12.861f, 20.467f, 13.259f, 20.567f, 13.628f)
            lineTo(20.613f, 13.765f)
            lineTo(21.195f, 15.222f)
            curveTo(21.349f, 15.606f, 21.162f, 16.042f, 20.778f, 16.196f)
            curveTo(20.425f, 16.337f, 20.029f, 16.192f, 19.847f, 15.87f)
            lineTo(19.803f, 15.778f)
            lineTo(19.22f, 14.322f)
            curveTo(18.888f, 13.491f, 18.982f, 12.553f, 19.464f, 11.807f)
            lineTo(19.573f, 11.651f)
            lineTo(19.725f, 11.449f)
            curveTo(19.957f, 11.139f, 20.031f, 10.741f, 19.931f, 10.372f)
            lineTo(19.885f, 10.235f)
            lineTo(19.303f, 8.779f)
            curveTo(19.149f, 8.394f, 19.336f, 7.957f, 19.721f, 7.804f)
            curveTo(20.038f, 7.677f, 20.39f, 7.782f, 20.59f, 8.038f)
            lineTo(20.651f, 8.13f)
            close()
            moveTo(4.151f, 8.13f)
            lineTo(4.195f, 8.221f)
            lineTo(4.778f, 9.678f)
            curveTo(5.111f, 10.509f, 5.016f, 11.447f, 4.534f, 12.193f)
            lineTo(4.425f, 12.349f)
            lineTo(4.273f, 12.551f)
            curveTo(4.041f, 12.861f, 3.967f, 13.259f, 4.067f, 13.628f)
            lineTo(4.113f, 13.765f)
            lineTo(4.695f, 15.222f)
            curveTo(4.849f, 15.606f, 4.662f, 16.042f, 4.278f, 16.196f)
            curveTo(3.925f, 16.337f, 3.529f, 16.192f, 3.347f, 15.87f)
            lineTo(3.303f, 15.778f)
            lineTo(2.72f, 14.322f)
            curveTo(2.387f, 13.491f, 2.482f, 12.553f, 2.964f, 11.807f)
            lineTo(3.073f, 11.651f)
            lineTo(3.225f, 11.449f)
            curveTo(3.457f, 11.139f, 3.531f, 10.741f, 3.431f, 10.372f)
            lineTo(3.385f, 10.235f)
            lineTo(2.803f, 8.779f)
            curveTo(2.649f, 8.394f, 2.836f, 7.957f, 3.221f, 7.804f)
            curveTo(3.538f, 7.677f, 3.89f, 7.782f, 4.09f, 8.038f)
            lineTo(4.151f, 8.13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneVibratePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhoneVibrate, contentDescription = null)
    }
}
