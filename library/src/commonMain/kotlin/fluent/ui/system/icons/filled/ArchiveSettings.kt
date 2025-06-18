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

public val FluentUi.Filled.ArchiveSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArchiveSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(19.5f)
            curveTo(20.328f, 3f, 21f, 3.672f, 21f, 4.5f)
            verticalLineTo(6f)
            curveTo(21f, 6.828f, 20.328f, 7.5f, 19.5f, 7.5f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 7.5f, 3f, 6.828f, 3f, 6f)
            verticalLineTo(4.5f)
            close()
            moveTo(4f, 9f)
            horizontalLineTo(20f)
            verticalLineTo(11.498f)
            curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
            curveTo(16.418f, 11f, 15.397f, 11.264f, 14.5f, 11.732f)
            curveTo(14.49f, 11.326f, 14.158f, 11f, 13.75f, 11f)
            horizontalLineTo(10.25f)
            curveTo(9.836f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
            curveTo(9.5f, 12.164f, 9.836f, 12.5f, 10.25f, 12.5f)
            horizontalLineTo(13.346f)
            curveTo(11.913f, 13.692f, 11f, 15.49f, 11f, 17.5f)
            curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
            horizontalLineTo(7.75f)
            curveTo(5.679f, 21f, 4f, 19.321f, 4f, 17.25f)
            verticalLineTo(9f)
            close()
            moveTo(14.277f, 13.976f)
            curveTo(14.592f, 15.066f, 13.938f, 16.199f, 12.836f, 16.472f)
            lineTo(12.252f, 16.617f)
            curveTo(12.207f, 16.904f, 12.184f, 17.199f, 12.184f, 17.5f)
            curveTo(12.184f, 17.815f, 12.209f, 18.124f, 12.258f, 18.424f)
            lineTo(12.798f, 18.554f)
            curveTo(13.91f, 18.822f, 14.571f, 19.967f, 14.248f, 21.064f)
            lineTo(14.061f, 21.695f)
            curveTo(14.5f, 22.081f, 15.001f, 22.394f, 15.545f, 22.617f)
            lineTo(16.039f, 22.098f)
            curveTo(16.827f, 21.269f, 18.15f, 21.269f, 18.938f, 22.099f)
            lineTo(19.437f, 22.624f)
            curveTo(19.98f, 22.403f, 20.48f, 22.093f, 20.919f, 21.711f)
            lineTo(20.721f, 21.025f)
            curveTo(20.407f, 19.934f, 21.061f, 18.801f, 22.163f, 18.528f)
            lineTo(22.746f, 18.384f)
            curveTo(22.791f, 18.096f, 22.815f, 17.801f, 22.815f, 17.5f)
            curveTo(22.815f, 17.186f, 22.789f, 16.877f, 22.74f, 16.577f)
            lineTo(22.201f, 16.447f)
            curveTo(21.088f, 16.179f, 20.427f, 15.034f, 20.751f, 13.936f)
            lineTo(20.937f, 13.306f)
            curveTo(20.498f, 12.92f, 19.997f, 12.607f, 19.453f, 12.384f)
            lineTo(18.96f, 12.902f)
            curveTo(18.171f, 13.732f, 16.849f, 13.731f, 16.061f, 12.902f)
            lineTo(15.562f, 12.377f)
            curveTo(15.018f, 12.597f, 14.518f, 12.907f, 14.079f, 13.29f)
            lineTo(14.277f, 13.976f)
            close()
            moveTo(17.499f, 19f)
            curveTo(16.698f, 19f, 16.049f, 18.329f, 16.049f, 17.5f)
            curveTo(16.049f, 16.672f, 16.698f, 16f, 17.499f, 16f)
            curveTo(18.3f, 16f, 18.949f, 16.672f, 18.949f, 17.5f)
            curveTo(18.949f, 18.329f, 18.3f, 19f, 17.499f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArchiveSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArchiveSettings, contentDescription = null)
    }
}
