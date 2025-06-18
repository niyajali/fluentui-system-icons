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

public val FluentUi.Filled.PhoneLinkSetup: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneLinkSetup",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(17.793f, 12f, 18.081f, 12.024f, 18.361f, 12.072f)
            lineTo(18.534f, 12.788f)
            curveTo(18.793f, 13.862f, 19.874f, 14.522f, 20.947f, 14.263f)
            lineTo(21.045f, 14.237f)
            lineTo(21.646f, 14.058f)
            curveTo(22.009f, 14.525f, 22.299f, 15.055f, 22.5f, 15.628f)
            lineTo(22.053f, 16.059f)
            curveTo(21.299f, 16.784f, 21.237f, 17.959f, 21.884f, 18.757f)
            lineTo(22.025f, 18.914f)
            lineTo(22.5f, 19.372f)
            curveTo(22.299f, 19.945f, 22.009f, 20.474f, 21.647f, 20.941f)
            lineTo(21.045f, 20.763f)
            curveTo(19.986f, 20.45f, 18.873f, 21.055f, 18.56f, 22.114f)
            lineTo(18.534f, 22.212f)
            lineTo(18.361f, 22.928f)
            curveTo(18.081f, 22.976f, 17.793f, 23f, 17.5f, 23f)
            curveTo(17.207f, 23f, 16.919f, 22.975f, 16.638f, 22.928f)
            lineTo(16.466f, 22.212f)
            curveTo(16.207f, 21.138f, 15.127f, 20.478f, 14.053f, 20.737f)
            lineTo(13.955f, 20.763f)
            lineTo(13.353f, 20.941f)
            curveTo(12.991f, 20.474f, 12.701f, 19.945f, 12.5f, 19.372f)
            lineTo(12.947f, 18.941f)
            curveTo(13.701f, 18.216f, 13.763f, 17.041f, 13.116f, 16.243f)
            lineTo(12.975f, 16.086f)
            lineTo(12.5f, 15.628f)
            curveTo(12.701f, 15.055f, 12.991f, 14.526f, 13.353f, 14.059f)
            lineTo(13.955f, 14.237f)
            curveTo(15.014f, 14.55f, 16.127f, 13.945f, 16.44f, 12.886f)
            lineTo(16.466f, 12.788f)
            lineTo(16.638f, 12.072f)
            curveTo(16.919f, 12.025f, 17.207f, 12f, 17.5f, 12f)
            close()
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            lineTo(16f, 11.174f)
            curveTo(13.133f, 11.851f, 11f, 14.426f, 11f, 17.5f)
            curveTo(11f, 17.668f, 11.006f, 17.835f, 11.019f, 18f)
            lineTo(8.75f, 18f)
            curveTo(8.336f, 18f, 8f, 18.336f, 8f, 18.75f)
            curveTo(8f, 19.13f, 8.282f, 19.444f, 8.648f, 19.493f)
            lineTo(8.75f, 19.5f)
            horizontalLineTo(11.25f)
            lineTo(11.312f, 19.497f)
            curveTo(11.618f, 20.445f, 12.136f, 21.299f, 12.81f, 22.001f)
            lineTo(6.25f, 22f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(17.5f, 16f)
            curveTo(16.699f, 16f, 16.05f, 16.672f, 16.05f, 17.5f)
            curveTo(16.05f, 18.328f, 16.699f, 19f, 17.5f, 19f)
            curveTo(18.301f, 19f, 18.95f, 18.328f, 18.95f, 17.5f)
            curveTo(18.95f, 16.672f, 18.301f, 16f, 17.5f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneLinkSetupPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PhoneLinkSetup, contentDescription = null)
    }
}
