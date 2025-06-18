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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.HandDraw: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.HandDraw",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 2.5f)
            curveTo(14f, 2.224f, 14.224f, 2f, 14.5f, 2f)
            horizontalLineTo(15.5f)
            curveTo(19.51f, 2f, 22.31f, 2.25f, 24.121f, 2.702f)
            curveTo(25.024f, 2.928f, 25.723f, 3.214f, 26.206f, 3.577f)
            curveTo(26.704f, 3.949f, 27f, 4.429f, 27f, 5f)
            curveTo(27f, 5.47f, 26.878f, 5.948f, 26.48f, 6.368f)
            curveTo(26.101f, 6.767f, 25.517f, 7.064f, 24.697f, 7.294f)
            curveTo(23.062f, 7.752f, 20.249f, 8f, 15.5f, 8f)
            curveTo(10.749f, 8f, 8.062f, 8.252f, 6.572f, 8.669f)
            curveTo(5.83f, 8.877f, 5.445f, 9.11f, 5.246f, 9.321f)
            curveTo(5.065f, 9.511f, 5f, 9.72f, 5f, 10f)
            curveTo(5f, 10.179f, 5.078f, 10.387f, 5.394f, 10.623f)
            curveTo(5.723f, 10.87f, 6.274f, 11.116f, 7.121f, 11.327f)
            curveTo(8.353f, 11.635f, 10.123f, 11.852f, 12.538f, 11.946f)
            curveTo(12.513f, 12.127f, 12.5f, 12.312f, 12.5f, 12.5f)
            verticalLineTo(12.946f)
            curveTo(10.044f, 12.85f, 8.199f, 12.628f, 6.879f, 12.298f)
            curveTo(5.976f, 12.072f, 5.277f, 11.786f, 4.794f, 11.423f)
            curveTo(4.297f, 11.05f, 4f, 10.571f, 4f, 10f)
            curveTo(4f, 9.53f, 4.122f, 9.052f, 4.52f, 8.632f)
            curveTo(4.899f, 8.233f, 5.483f, 7.936f, 6.303f, 7.706f)
            curveTo(7.939f, 7.248f, 10.751f, 7f, 15.5f, 7f)
            curveTo(20.251f, 7f, 22.938f, 6.748f, 24.428f, 6.331f)
            curveTo(25.17f, 6.123f, 25.555f, 5.89f, 25.754f, 5.679f)
            curveTo(25.935f, 5.489f, 26f, 5.28f, 26f, 5f)
            curveTo(26f, 4.821f, 25.921f, 4.613f, 25.606f, 4.377f)
            curveTo(25.277f, 4.13f, 24.726f, 3.884f, 23.879f, 3.673f)
            curveTo(22.19f, 3.25f, 19.49f, 3f, 15.5f, 3f)
            horizontalLineTo(14.5f)
            curveTo(14.224f, 3f, 14f, 2.776f, 14f, 2.5f)
            close()
            moveTo(16.476f, 10f)
            curveTo(15.096f, 10f, 13.977f, 11.119f, 13.977f, 12.499f)
            verticalLineTo(19.231f)
            lineTo(12.691f, 18.662f)
            curveTo(10.719f, 17.788f, 8.405f, 18.438f, 7.178f, 20.212f)
            curveTo(6.814f, 20.738f, 7.037f, 21.452f, 7.605f, 21.702f)
            curveTo(13.318f, 24.22f, 15.238f, 26.513f, 16.042f, 28.242f)
            curveTo(16.544f, 29.321f, 17.658f, 30.173f, 18.959f, 29.972f)
            lineTo(22.594f, 29.412f)
            curveTo(23.589f, 29.259f, 24.396f, 28.523f, 24.639f, 27.545f)
            lineTo(25.864f, 22.625f)
            curveTo(26.5f, 20.068f, 24.813f, 17.514f, 22.212f, 17.095f)
            lineTo(18.975f, 16.574f)
            verticalLineTo(12.499f)
            curveTo(18.975f, 11.119f, 17.856f, 10f, 16.476f, 10f)
            close()
            moveTo(14.977f, 12.499f)
            curveTo(14.977f, 11.671f, 15.648f, 11f, 16.476f, 11f)
            curveTo(17.304f, 11f, 17.975f, 11.671f, 17.975f, 12.499f)
            verticalLineTo(17f)
            curveTo(17.975f, 17.246f, 18.154f, 17.455f, 18.396f, 17.494f)
            lineTo(22.053f, 18.082f)
            curveTo(24.076f, 18.408f, 25.388f, 20.394f, 24.893f, 22.383f)
            lineTo(23.669f, 27.304f)
            curveTo(23.522f, 27.89f, 23.039f, 28.332f, 22.441f, 28.424f)
            lineTo(18.807f, 28.984f)
            curveTo(18.065f, 29.098f, 17.319f, 28.616f, 16.949f, 27.821f)
            curveTo(16.005f, 25.791f, 13.845f, 23.359f, 8.008f, 20.787f)
            curveTo(8.005f, 20.786f, 8.005f, 20.785f, 8.004f, 20.785f)
            curveTo(8.003f, 20.784f, 8.002f, 20.782f, 8.002f, 20.78f)
            curveTo(8.956f, 19.403f, 10.754f, 18.897f, 12.286f, 19.576f)
            lineTo(14.274f, 20.457f)
            curveTo(14.429f, 20.526f, 14.608f, 20.511f, 14.75f, 20.419f)
            curveTo(14.891f, 20.327f, 14.977f, 20.169f, 14.977f, 20f)
            verticalLineTo(12.499f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HandDrawPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.HandDraw, contentDescription = null)
    }
}
