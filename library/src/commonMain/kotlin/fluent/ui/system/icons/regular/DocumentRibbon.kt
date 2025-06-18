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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.DocumentRibbon: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentRibbon",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.5f, 20.002f)
            curveTo(18.5f, 20.277f, 18.276f, 20.502f, 18f, 20.502f)
            horizontalLineTo(9f)
            verticalLineTo(22.003f)
            horizontalLineTo(18f)
            curveTo(19.104f, 22.003f, 20f, 21.107f, 20f, 20.002f)
            verticalLineTo(9.829f)
            curveTo(20f, 9.299f, 19.789f, 8.79f, 19.414f, 8.415f)
            lineTo(13.585f, 2.586f)
            curveTo(13.57f, 2.571f, 13.553f, 2.558f, 13.536f, 2.545f)
            curveTo(13.524f, 2.536f, 13.512f, 2.526f, 13.5f, 2.516f)
            curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
            curveTo(13.256f, 2.319f, 13.228f, 2.306f, 13.2f, 2.292f)
            curveTo(13.184f, 2.284f, 13.168f, 2.276f, 13.153f, 2.268f)
            curveTo(13.136f, 2.259f, 13.12f, 2.249f, 13.103f, 2.239f)
            curveTo(13.049f, 2.208f, 12.994f, 2.177f, 12.937f, 2.152f)
            curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
            curveTo(12.293f, 2.013f, 12.274f, 2.01f, 12.254f, 2.007f)
            curveTo(12.227f, 2.004f, 12.2f, 2f, 12.172f, 2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
            verticalLineTo(11.257f)
            curveTo(4.469f, 11.091f, 4.974f, 11.001f, 5.5f, 11.001f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8.001f)
            curveTo(12f, 9.105f, 12.896f, 10.001f, 14f, 10.001f)
            horizontalLineTo(18.5f)
            verticalLineTo(20.002f)
            close()
            moveTo(13.5f, 4.621f)
            lineTo(17.378f, 8.501f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.501f, 13.5f, 8.276f, 13.5f, 8.001f)
            verticalLineTo(4.621f)
            close()
            moveTo(9f, 15.502f)
            curveTo(9f, 17.435f, 7.433f, 19.002f, 5.5f, 19.002f)
            curveTo(3.567f, 19.002f, 2f, 17.435f, 2f, 15.502f)
            curveTo(2f, 13.568f, 3.567f, 12.001f, 5.5f, 12.001f)
            curveTo(7.433f, 12.001f, 9f, 13.568f, 9f, 15.502f)
            close()
            moveTo(3f, 19.244f)
            verticalLineTo(22.288f)
            curveTo(3f, 22.921f, 3.765f, 23.238f, 4.212f, 22.791f)
            lineTo(5.5f, 21.503f)
            lineTo(6.788f, 22.791f)
            curveTo(7.235f, 23.238f, 8f, 22.921f, 8f, 22.288f)
            verticalLineTo(19.244f)
            curveTo(7.285f, 19.723f, 6.425f, 20.002f, 5.5f, 20.002f)
            curveTo(4.575f, 20.002f, 3.715f, 19.723f, 3f, 19.244f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentRibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentRibbon, contentDescription = null)
    }
}
