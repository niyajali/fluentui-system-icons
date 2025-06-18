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

public val FluentUi.Light.WrenchScrewdriver: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.WrenchScrewdriver",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.5f, 3f)
            horizontalLineTo(25.5f)
            curveTo(25.689f, 3f, 25.862f, 3.107f, 25.947f, 3.276f)
            lineTo(27.447f, 6.276f)
            curveTo(27.518f, 6.417f, 27.518f, 6.583f, 27.447f, 6.724f)
            lineTo(26f, 9.618f)
            verticalLineTo(16f)
            horizontalLineTo(28.5f)
            curveTo(28.776f, 16f, 29f, 16.224f, 29f, 16.5f)
            verticalLineTo(23.5f)
            curveTo(29f, 26.538f, 26.538f, 29f, 23.5f, 29f)
            curveTo(20.462f, 29f, 18f, 26.538f, 18f, 23.5f)
            verticalLineTo(16.5f)
            curveTo(18f, 16.224f, 18.224f, 16f, 18.5f, 16f)
            horizontalLineTo(21f)
            verticalLineTo(9.618f)
            lineTo(19.553f, 6.724f)
            curveTo(19.482f, 6.583f, 19.482f, 6.417f, 19.553f, 6.276f)
            lineTo(21.053f, 3.276f)
            curveTo(21.138f, 3.107f, 21.311f, 3f, 21.5f, 3f)
            close()
            moveTo(25f, 16f)
            verticalLineTo(9.5f)
            curveTo(25f, 9.422f, 25.018f, 9.346f, 25.053f, 9.276f)
            lineTo(26.441f, 6.5f)
            lineTo(25.191f, 4f)
            horizontalLineTo(21.809f)
            lineTo(20.559f, 6.5f)
            lineTo(21.947f, 9.276f)
            curveTo(21.982f, 9.346f, 22f, 9.422f, 22f, 9.5f)
            verticalLineTo(16f)
            horizontalLineTo(25f)
            close()
            moveTo(19f, 17f)
            verticalLineTo(20f)
            horizontalLineTo(28f)
            verticalLineTo(17f)
            horizontalLineTo(19f)
            close()
            moveTo(19f, 21f)
            verticalLineTo(23.5f)
            curveTo(19f, 25.985f, 21.015f, 28f, 23.5f, 28f)
            curveTo(25.985f, 28f, 28f, 25.985f, 28f, 23.5f)
            verticalLineTo(21f)
            horizontalLineTo(19f)
            close()
            moveTo(7.777f, 3.582f)
            curveTo(7.916f, 3.675f, 8f, 3.831f, 8f, 3.998f)
            verticalLineTo(9f)
            curveTo(8f, 10.105f, 8.895f, 11f, 10f, 11f)
            curveTo(11.105f, 11f, 12f, 10.105f, 12f, 9f)
            verticalLineTo(3.998f)
            curveTo(12f, 3.831f, 12.084f, 3.675f, 12.223f, 3.582f)
            curveTo(12.362f, 3.489f, 12.538f, 3.472f, 12.692f, 3.537f)
            curveTo(15.221f, 4.591f, 17f, 7.087f, 17f, 10f)
            curveTo(17f, 12.793f, 15.364f, 15.203f, 13f, 16.326f)
            verticalLineTo(26f)
            curveTo(13f, 27.657f, 11.657f, 29f, 10f, 29f)
            curveTo(8.343f, 29f, 7f, 27.657f, 7f, 26f)
            verticalLineTo(16.326f)
            curveTo(4.636f, 15.203f, 3f, 12.793f, 3f, 10f)
            curveTo(3f, 7.087f, 4.779f, 4.591f, 7.308f, 3.537f)
            curveTo(7.462f, 3.472f, 7.638f, 3.489f, 7.777f, 3.582f)
            close()
            moveTo(7f, 4.803f)
            curveTo(5.206f, 5.84f, 4f, 7.78f, 4f, 10f)
            curveTo(4f, 12.495f, 5.523f, 14.636f, 7.692f, 15.54f)
            curveTo(7.879f, 15.618f, 8f, 15.8f, 8f, 16.002f)
            verticalLineTo(26f)
            curveTo(8f, 27.105f, 8.895f, 28f, 10f, 28f)
            curveTo(11.105f, 28f, 12f, 27.105f, 12f, 26f)
            verticalLineTo(16.002f)
            curveTo(12f, 15.8f, 12.121f, 15.618f, 12.308f, 15.54f)
            curveTo(14.477f, 14.636f, 16f, 12.495f, 16f, 10f)
            curveTo(16f, 7.78f, 14.794f, 5.84f, 13f, 4.803f)
            verticalLineTo(9f)
            curveTo(13f, 10.657f, 11.657f, 12f, 10f, 12f)
            curveTo(8.343f, 12f, 7f, 10.657f, 7f, 9f)
            verticalLineTo(4.803f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WrenchScrewdriverPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.WrenchScrewdriver, contentDescription = null)
    }
}
