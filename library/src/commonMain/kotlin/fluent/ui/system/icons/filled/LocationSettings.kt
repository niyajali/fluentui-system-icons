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

public val FluentUi.Filled.LocationSettings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationSettings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.5f, 12f)
            curveTo(19.218f, 12f, 19.909f, 12.116f, 20.555f, 12.332f)
            curveTo(21.065f, 9.603f, 20.264f, 6.679f, 18.153f, 4.568f)
            curveTo(14.753f, 1.167f, 9.24f, 1.167f, 5.839f, 4.568f)
            curveTo(2.439f, 7.968f, 2.439f, 13.481f, 5.839f, 16.882f)
            curveTo(6.135f, 17.178f, 6.502f, 17.541f, 6.941f, 17.972f)
            lineTo(10.432f, 21.368f)
            curveTo(11.108f, 22.021f, 12.09f, 22.168f, 12.905f, 21.81f)
            curveTo(12.33f, 20.84f, 12f, 19.709f, 12f, 18.5f)
            curveTo(12f, 14.91f, 14.91f, 12f, 18.5f, 12f)
            close()
            moveTo(14.497f, 11f)
            curveTo(14.497f, 12.38f, 13.377f, 13.5f, 11.996f, 13.5f)
            curveTo(10.616f, 13.5f, 9.496f, 12.38f, 9.496f, 11f)
            curveTo(9.496f, 9.619f, 10.616f, 8.499f, 11.996f, 8.499f)
            curveTo(13.377f, 8.499f, 14.497f, 9.619f, 14.497f, 11f)
            close()
            moveTo(15.281f, 14.976f)
            curveTo(15.596f, 16.066f, 14.941f, 17.199f, 13.84f, 17.472f)
            lineTo(13.256f, 17.617f)
            curveTo(13.211f, 17.904f, 13.188f, 18.199f, 13.188f, 18.5f)
            curveTo(13.188f, 18.815f, 13.213f, 19.124f, 13.262f, 19.424f)
            lineTo(13.802f, 19.554f)
            curveTo(14.914f, 19.822f, 15.575f, 20.967f, 15.252f, 22.064f)
            lineTo(15.065f, 22.695f)
            curveTo(15.504f, 23.081f, 16.005f, 23.394f, 16.549f, 23.617f)
            lineTo(17.043f, 23.098f)
            curveTo(17.831f, 22.269f, 19.153f, 22.269f, 19.942f, 23.099f)
            lineTo(20.441f, 23.624f)
            curveTo(20.984f, 23.403f, 21.484f, 23.093f, 21.923f, 22.711f)
            lineTo(21.725f, 22.025f)
            curveTo(21.41f, 20.934f, 22.065f, 19.801f, 23.167f, 19.528f)
            lineTo(23.75f, 19.384f)
            curveTo(23.795f, 19.096f, 23.818f, 18.801f, 23.818f, 18.5f)
            curveTo(23.818f, 18.186f, 23.793f, 17.877f, 23.744f, 17.577f)
            lineTo(23.205f, 17.447f)
            curveTo(22.092f, 17.179f, 21.431f, 16.034f, 21.755f, 14.936f)
            lineTo(21.941f, 14.306f)
            curveTo(21.502f, 13.92f, 21.001f, 13.607f, 20.457f, 13.384f)
            lineTo(19.964f, 13.902f)
            curveTo(19.175f, 14.732f, 17.853f, 14.731f, 17.065f, 13.902f)
            lineTo(16.566f, 13.377f)
            curveTo(16.022f, 13.597f, 15.522f, 13.907f, 15.083f, 14.29f)
            lineTo(15.281f, 14.976f)
            close()
            moveTo(18.503f, 20f)
            curveTo(17.702f, 20f, 17.053f, 19.329f, 17.053f, 18.5f)
            curveTo(17.053f, 17.672f, 17.702f, 17f, 18.503f, 17f)
            curveTo(19.304f, 17f, 19.953f, 17.672f, 19.953f, 18.5f)
            curveTo(19.953f, 19.329f, 19.304f, 20f, 18.503f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LocationSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.LocationSettings, contentDescription = null)
    }
}
