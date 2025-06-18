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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.DocumentLightning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.DocumentLightning",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 5f)
            curveTo(6f, 3.895f, 6.895f, 3f, 8f, 3f)
            horizontalLineTo(16f)
            verticalLineTo(10f)
            curveTo(16f, 11.657f, 17.343f, 13f, 19f, 13f)
            horizontalLineTo(26f)
            verticalLineTo(27f)
            curveTo(26f, 28.105f, 25.105f, 29f, 24f, 29f)
            horizontalLineTo(9.944f)
            lineTo(8.906f, 30f)
            horizontalLineTo(24f)
            curveTo(25.657f, 30f, 27f, 28.657f, 27f, 27f)
            verticalLineTo(12.535f)
            curveTo(27f, 11.74f, 26.684f, 10.977f, 26.121f, 10.414f)
            lineTo(18.586f, 2.879f)
            curveTo(18.023f, 2.316f, 17.26f, 2f, 16.465f, 2f)
            horizontalLineTo(8f)
            curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
            verticalLineTo(13.763f)
            curveTo(5.307f, 13.61f, 5.647f, 13.519f, 6f, 13.503f)
            verticalLineTo(5f)
            close()
            moveTo(25.927f, 12f)
            horizontalLineTo(19f)
            curveTo(17.895f, 12f, 17f, 11.105f, 17f, 10f)
            verticalLineTo(3.073f)
            curveTo(17.329f, 3.165f, 17.633f, 3.34f, 17.879f, 3.586f)
            lineTo(25.414f, 11.121f)
            curveTo(25.66f, 11.367f, 25.835f, 11.671f, 25.927f, 12f)
            close()
            moveTo(6.119f, 15f)
            horizontalLineTo(14.501f)
            curveTo(14.89f, 15f, 15.13f, 15.426f, 14.928f, 15.759f)
            lineTo(11.749f, 21f)
            horizontalLineTo(14.239f)
            curveTo(14.914f, 21f, 15.246f, 21.822f, 14.76f, 22.29f)
            lineTo(6.013f, 30.717f)
            curveTo(5.255f, 31.447f, 4.028f, 30.662f, 4.374f, 29.668f)
            lineTo(5.999f, 25f)
            horizontalLineTo(1.748f)
            curveTo(1.192f, 25f, 0.829f, 24.415f, 1.076f, 23.917f)
            lineTo(5.223f, 15.556f)
            curveTo(5.392f, 15.215f, 5.739f, 15f, 6.119f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentLightningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.DocumentLightning, contentDescription = null)
    }
}
