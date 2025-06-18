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

public val FluentIcons.Regular.HandLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HandLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.002f, 3.999f)
            verticalLineTo(10.251f)
            curveTo(12.002f, 10.665f, 11.666f, 11.001f, 11.252f, 11.001f)
            curveTo(10.838f, 11.001f, 10.502f, 10.665f, 10.502f, 10.251f)
            verticalLineTo(5.226f)
            curveTo(10.502f, 4.986f, 10.298f, 4.75f, 10.004f, 4.748f)
            curveTo(9.742f, 4.747f, 9.5f, 4.993f, 9.5f, 5.252f)
            verticalLineTo(12.751f)
            curveTo(9.5f, 13.058f, 9.312f, 13.335f, 9.026f, 13.448f)
            curveTo(8.741f, 13.561f, 8.415f, 13.488f, 8.205f, 13.266f)
            lineTo(8.204f, 13.265f)
            lineTo(8.201f, 13.262f)
            curveTo(8.197f, 13.258f, 8.19f, 13.25f, 8.179f, 13.24f)
            curveTo(8.158f, 13.219f, 8.123f, 13.186f, 8.077f, 13.144f)
            curveTo(7.985f, 13.061f, 7.848f, 12.945f, 7.676f, 12.823f)
            curveTo(7.324f, 12.574f, 6.867f, 12.328f, 6.373f, 12.241f)
            curveTo(5.836f, 12.147f, 5.326f, 12.205f, 4.988f, 12.38f)
            curveTo(4.779f, 12.487f, 4.616f, 12.645f, 4.542f, 12.908f)
            lineTo(6.201f, 14.155f)
            curveTo(6.229f, 14.175f, 6.255f, 14.198f, 6.28f, 14.223f)
            lineTo(8.455f, 16.396f)
            curveTo(9.39f, 17.329f, 10.167f, 18.407f, 10.758f, 19.589f)
            curveTo(11.037f, 20.147f, 11.608f, 20.5f, 12.233f, 20.5f)
            horizontalLineTo(14.961f)
            curveTo(15.532f, 20.5f, 16.029f, 20.228f, 16.286f, 19.787f)
            curveTo(17.022f, 18.527f, 18f, 16.5f, 18f, 14.754f)
            verticalLineTo(7.002f)
            curveTo(18f, 6.734f, 17.785f, 6.502f, 17.499f, 6.502f)
            curveTo(17.21f, 6.502f, 16.996f, 6.733f, 16.996f, 7.002f)
            verticalLineTo(10.501f)
            curveTo(16.996f, 10.915f, 16.66f, 11.251f, 16.246f, 11.251f)
            curveTo(15.832f, 11.251f, 15.496f, 10.915f, 15.496f, 10.501f)
            verticalLineTo(5.252f)
            curveTo(15.496f, 4.974f, 15.281f, 4.748f, 15f, 4.748f)
            curveTo(14.713f, 4.748f, 14.5f, 4.974f, 14.5f, 5.252f)
            verticalLineTo(10.251f)
            curveTo(14.5f, 10.665f, 14.164f, 11.001f, 13.75f, 11.001f)
            curveTo(13.336f, 11.001f, 13f, 10.665f, 13f, 10.251f)
            verticalLineTo(3.999f)
            curveTo(13f, 3.727f, 12.788f, 3.5f, 12.501f, 3.5f)
            curveTo(12.211f, 3.499f, 12.002f, 3.723f, 12.002f, 3.999f)
            close()
            moveTo(10.013f, 3.249f)
            curveTo(10.225f, 3.25f, 10.426f, 3.283f, 10.613f, 3.342f)
            lineTo(10.013f, 3.249f)
            close()
            moveTo(10.613f, 3.342f)
            curveTo(10.875f, 2.583f, 11.582f, 1.999f, 12.503f, 2f)
            curveTo(13.418f, 2.001f, 14.125f, 2.586f, 14.388f, 3.341f)
            curveTo(14.578f, 3.281f, 14.783f, 3.249f, 15f, 3.249f)
            curveTo(16.108f, 3.249f, 16.896f, 4.104f, 16.987f, 5.066f)
            curveTo(17.149f, 5.025f, 17.32f, 5.002f, 17.499f, 5.002f)
            curveTo(18.668f, 5.002f, 19.5f, 5.961f, 19.5f, 7.002f)
            verticalLineTo(14.754f)
            curveTo(19.5f, 16.934f, 18.329f, 19.265f, 17.582f, 20.544f)
            curveTo(17.025f, 21.496f, 16.002f, 22f, 14.961f, 22f)
            horizontalLineTo(12.233f)
            curveTo(11.04f, 22f, 9.95f, 21.326f, 9.416f, 20.259f)
            curveTo(8.898f, 19.222f, 8.215f, 18.276f, 7.395f, 17.457f)
            lineTo(5.257f, 15.321f)
            lineTo(3.299f, 13.85f)
            curveTo(3.111f, 13.708f, 3f, 13.486f, 3f, 13.25f)
            curveTo(3f, 12.189f, 3.531f, 11.444f, 4.299f, 11.047f)
            curveTo(5.015f, 10.678f, 5.882f, 10.633f, 6.632f, 10.764f)
            curveTo(7.151f, 10.855f, 7.615f, 11.048f, 8f, 11.259f)
            verticalLineTo(5.252f)
            curveTo(8f, 4.192f, 8.888f, 3.242f, 10.013f, 3.249f)
        }
    }.build()
}

@Preview
@Composable
private fun HandLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HandLeft, contentDescription = null)
    }
}
