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

public val FluentUi.Filled.DocumentCss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(14.035f)
            curveTo(4.983f, 14.176f, 5.835f, 14.726f, 6.377f, 15.506f)
            curveTo(6.882f, 14.607f, 7.845f, 14f, 8.95f, 14f)
            horizontalLineTo(9.05f)
            curveTo(10.071f, 14f, 10.97f, 14.518f, 11.5f, 15.306f)
            curveTo(12.03f, 14.518f, 12.929f, 14f, 13.95f, 14f)
            horizontalLineTo(14.05f)
            curveTo(15.679f, 14f, 17f, 15.321f, 17f, 16.95f)
            verticalLineTo(17f)
            curveTo(17f, 17.45f, 16.83f, 17.861f, 16.551f, 18.171f)
            curveTo(16.838f, 18.609f, 17f, 19.13f, 17f, 19.677f)
            verticalLineTo(20.05f)
            curveTo(17f, 20.798f, 16.722f, 21.48f, 16.264f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            close()
            moveTo(14.05f, 22f)
            curveTo(15.127f, 22f, 16f, 21.127f, 16f, 20.05f)
            verticalLineTo(19.677f)
            curveTo(16f, 19.318f, 15.89f, 18.977f, 15.697f, 18.692f)
            curveTo(15.578f, 18.517f, 15.427f, 18.364f, 15.25f, 18.241f)
            curveTo(15.142f, 18.166f, 15.025f, 18.102f, 14.9f, 18.052f)
            lineTo(14.334f, 17.826f)
            lineTo(13.621f, 17.398f)
            curveTo(13.546f, 17.353f, 13.5f, 17.272f, 13.5f, 17.184f)
            verticalLineTo(16.95f)
            curveTo(13.5f, 16.701f, 13.701f, 16.5f, 13.95f, 16.5f)
            horizontalLineTo(14.05f)
            curveTo(14.248f, 16.5f, 14.416f, 16.628f, 14.476f, 16.806f)
            curveTo(14.492f, 16.851f, 14.5f, 16.899f, 14.5f, 16.95f)
            verticalLineTo(17f)
            curveTo(14.5f, 17.339f, 14.725f, 17.625f, 15.033f, 17.718f)
            curveTo(15.102f, 17.739f, 15.175f, 17.75f, 15.25f, 17.75f)
            curveTo(15.498f, 17.75f, 15.718f, 17.629f, 15.855f, 17.444f)
            curveTo(15.946f, 17.319f, 16f, 17.166f, 16f, 17f)
            verticalLineTo(16.95f)
            curveTo(16f, 15.873f, 15.127f, 15f, 14.05f, 15f)
            horizontalLineTo(13.95f)
            curveTo(12.873f, 15f, 12f, 15.873f, 12f, 16.95f)
            verticalLineTo(17.323f)
            curveTo(12f, 17.682f, 12.11f, 18.023f, 12.303f, 18.308f)
            curveTo(12.422f, 18.483f, 12.573f, 18.636f, 12.75f, 18.759f)
            curveTo(12.858f, 18.834f, 12.975f, 18.898f, 13.1f, 18.948f)
            lineTo(13.666f, 19.174f)
            lineTo(14.379f, 19.602f)
            curveTo(14.454f, 19.647f, 14.5f, 19.728f, 14.5f, 19.816f)
            verticalLineTo(20.05f)
            curveTo(14.5f, 20.299f, 14.299f, 20.5f, 14.05f, 20.5f)
            horizontalLineTo(13.95f)
            curveTo(13.752f, 20.5f, 13.584f, 20.372f, 13.524f, 20.194f)
            curveTo(13.508f, 20.149f, 13.5f, 20.101f, 13.5f, 20.05f)
            verticalLineTo(20f)
            curveTo(13.5f, 19.661f, 13.275f, 19.375f, 12.967f, 19.282f)
            curveTo(12.898f, 19.261f, 12.825f, 19.25f, 12.75f, 19.25f)
            curveTo(12.502f, 19.25f, 12.282f, 19.371f, 12.145f, 19.556f)
            curveTo(12.054f, 19.681f, 12f, 19.834f, 12f, 20f)
            verticalLineTo(20.05f)
            curveTo(12f, 21.127f, 12.873f, 22f, 13.95f, 22f)
            horizontalLineTo(14.05f)
            close()
            moveTo(11f, 20.05f)
            curveTo(11f, 20.395f, 10.91f, 20.719f, 10.753f, 21f)
            curveTo(10.42f, 21.597f, 9.782f, 22f, 9.05f, 22f)
            horizontalLineTo(8.95f)
            curveTo(8.218f, 22f, 7.58f, 21.597f, 7.247f, 21f)
            curveTo(7.09f, 20.719f, 7f, 20.395f, 7f, 20.05f)
            verticalLineTo(20f)
            curveTo(7f, 19.834f, 7.054f, 19.681f, 7.145f, 19.556f)
            curveTo(7.282f, 19.371f, 7.502f, 19.25f, 7.75f, 19.25f)
            curveTo(7.825f, 19.25f, 7.898f, 19.261f, 7.966f, 19.282f)
            curveTo(8.275f, 19.375f, 8.5f, 19.661f, 8.5f, 20f)
            verticalLineTo(20.05f)
            curveTo(8.5f, 20.101f, 8.508f, 20.149f, 8.524f, 20.194f)
            curveTo(8.584f, 20.372f, 8.752f, 20.5f, 8.95f, 20.5f)
            horizontalLineTo(9.05f)
            curveTo(9.299f, 20.5f, 9.5f, 20.299f, 9.5f, 20.05f)
            verticalLineTo(19.816f)
            curveTo(9.5f, 19.728f, 9.454f, 19.647f, 9.379f, 19.602f)
            lineTo(8.666f, 19.174f)
            lineTo(8.1f, 18.948f)
            curveTo(7.975f, 18.898f, 7.858f, 18.834f, 7.75f, 18.759f)
            curveTo(7.573f, 18.636f, 7.422f, 18.483f, 7.303f, 18.308f)
            curveTo(7.11f, 18.023f, 7f, 17.682f, 7f, 17.323f)
            verticalLineTo(16.95f)
            curveTo(7f, 15.873f, 7.873f, 15f, 8.95f, 15f)
            horizontalLineTo(9.05f)
            curveTo(10.127f, 15f, 11f, 15.873f, 11f, 16.95f)
            verticalLineTo(17f)
            curveTo(11f, 17.166f, 10.946f, 17.319f, 10.855f, 17.444f)
            curveTo(10.718f, 17.629f, 10.498f, 17.75f, 10.25f, 17.75f)
            curveTo(10.175f, 17.75f, 10.102f, 17.739f, 10.033f, 17.718f)
            curveTo(9.725f, 17.625f, 9.5f, 17.339f, 9.5f, 17f)
            verticalLineTo(16.95f)
            curveTo(9.5f, 16.899f, 9.492f, 16.851f, 9.476f, 16.806f)
            curveTo(9.416f, 16.628f, 9.248f, 16.5f, 9.05f, 16.5f)
            horizontalLineTo(8.95f)
            curveTo(8.701f, 16.5f, 8.5f, 16.701f, 8.5f, 16.95f)
            verticalLineTo(17.184f)
            curveTo(8.5f, 17.272f, 8.546f, 17.353f, 8.621f, 17.398f)
            lineTo(9.334f, 17.826f)
            lineTo(9.9f, 18.052f)
            curveTo(10.025f, 18.102f, 10.142f, 18.166f, 10.25f, 18.241f)
            curveTo(10.427f, 18.364f, 10.578f, 18.517f, 10.697f, 18.692f)
            curveTo(10.89f, 18.977f, 11f, 19.318f, 11f, 19.677f)
            verticalLineTo(20.05f)
            close()
            moveTo(5.95f, 21.999f)
            curveTo(5.967f, 21.983f, 5.984f, 21.966f, 6f, 21.949f)
            verticalLineTo(22f)
            curveTo(5.983f, 22f, 5.967f, 22f, 5.95f, 21.999f)
            close()
            moveTo(4.826f, 21.62f)
            curveTo(5.531f, 21.177f, 6f, 20.393f, 6f, 19.5f)
            curveTo(6f, 19.364f, 5.964f, 19.236f, 5.9f, 19.125f)
            curveTo(5.77f, 18.901f, 5.528f, 18.75f, 5.25f, 18.75f)
            curveTo(4.972f, 18.75f, 4.73f, 18.901f, 4.6f, 19.125f)
            curveTo(4.536f, 19.236f, 4.5f, 19.364f, 4.5f, 19.5f)
            curveTo(4.5f, 19.858f, 4.312f, 20.171f, 4.03f, 20.348f)
            curveTo(3.876f, 20.444f, 3.695f, 20.5f, 3.5f, 20.5f)
            curveTo(2.948f, 20.5f, 2.5f, 20.052f, 2.5f, 19.5f)
            verticalLineTo(17.5f)
            curveTo(2.5f, 16.948f, 2.948f, 16.5f, 3.5f, 16.5f)
            curveTo(3.682f, 16.5f, 3.853f, 16.549f, 4f, 16.634f)
            curveTo(4.299f, 16.807f, 4.5f, 17.13f, 4.5f, 17.5f)
            curveTo(4.5f, 17.636f, 4.536f, 17.764f, 4.6f, 17.875f)
            curveTo(4.73f, 18.099f, 4.972f, 18.25f, 5.25f, 18.25f)
            curveTo(5.528f, 18.25f, 5.77f, 18.099f, 5.9f, 17.875f)
            curveTo(5.964f, 17.764f, 6f, 17.636f, 6f, 17.5f)
            curveTo(6f, 16.291f, 5.141f, 15.282f, 4f, 15.05f)
            curveTo(3.838f, 15.017f, 3.671f, 15f, 3.5f, 15f)
            curveTo(2.119f, 15f, 1f, 16.119f, 1f, 17.5f)
            verticalLineTo(19.5f)
            curveTo(1f, 20.881f, 2.119f, 22f, 3.5f, 22f)
            curveTo(3.987f, 22f, 4.442f, 21.861f, 4.826f, 21.62f)
            close()
            moveTo(13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentCssPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentCss, contentDescription = null)
    }
}
