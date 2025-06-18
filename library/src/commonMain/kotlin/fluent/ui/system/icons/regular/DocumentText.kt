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

public val FluentUi.Regular.DocumentText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 11.5f)
            curveTo(8.336f, 11.5f, 8f, 11.836f, 8f, 12.25f)
            curveTo(8f, 12.664f, 8.336f, 13f, 8.75f, 13f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 13f, 16f, 12.664f, 16f, 12.25f)
            curveTo(16f, 11.836f, 15.664f, 11.5f, 15.25f, 11.5f)
            horizontalLineTo(8.75f)
            close()
            moveTo(8.75f, 14.25f)
            curveTo(8.336f, 14.25f, 8f, 14.586f, 8f, 15f)
            curveTo(8f, 15.414f, 8.336f, 15.75f, 8.75f, 15.75f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 15.75f, 16f, 15.414f, 16f, 15f)
            curveTo(16f, 14.586f, 15.664f, 14.25f, 15.25f, 14.25f)
            horizontalLineTo(8.75f)
            close()
            moveTo(8.75f, 17f)
            curveTo(8.336f, 17f, 8f, 17.336f, 8f, 17.75f)
            curveTo(8f, 18.164f, 8.336f, 18.5f, 8.75f, 18.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 18.5f, 16f, 18.164f, 16f, 17.75f)
            curveTo(16f, 17.336f, 15.664f, 17f, 15.25f, 17f)
            horizontalLineTo(8.75f)
            close()
            moveTo(13.585f, 2.586f)
            lineTo(19.414f, 8.414f)
            curveTo(19.789f, 8.789f, 20f, 9.298f, 20f, 9.828f)
            verticalLineTo(20f)
            curveTo(20f, 21.104f, 19.104f, 22f, 18f, 22f)
            horizontalLineTo(6f)
            curveTo(4.896f, 22f, 4f, 21.104f, 4f, 20f)
            verticalLineTo(4f)
            curveTo(4f, 2.896f, 4.896f, 2f, 6f, 2f)
            horizontalLineTo(12.172f)
            curveTo(12.2f, 2f, 12.227f, 2.004f, 12.254f, 2.007f)
            curveTo(12.274f, 2.01f, 12.293f, 2.013f, 12.313f, 2.014f)
            curveTo(12.528f, 2.029f, 12.74f, 2.07f, 12.937f, 2.152f)
            curveTo(12.994f, 2.176f, 13.049f, 2.208f, 13.103f, 2.239f)
            curveTo(13.12f, 2.249f, 13.136f, 2.259f, 13.153f, 2.268f)
            curveTo(13.168f, 2.276f, 13.184f, 2.284f, 13.2f, 2.292f)
            curveTo(13.228f, 2.305f, 13.256f, 2.319f, 13.281f, 2.336f)
            curveTo(13.359f, 2.389f, 13.429f, 2.452f, 13.5f, 2.516f)
            curveTo(13.512f, 2.526f, 13.524f, 2.536f, 13.536f, 2.545f)
            curveTo(13.553f, 2.558f, 13.57f, 2.571f, 13.585f, 2.586f)
            close()
            moveTo(18f, 20.5f)
            curveTo(18.276f, 20.5f, 18.5f, 20.275f, 18.5f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.896f, 10f, 12f, 9.104f, 12f, 8f)
            verticalLineTo(3.5f)
            horizontalLineTo(6f)
            curveTo(5.724f, 3.5f, 5.5f, 3.725f, 5.5f, 4f)
            verticalLineTo(20f)
            curveTo(5.5f, 20.275f, 5.724f, 20.5f, 6f, 20.5f)
            horizontalLineTo(18f)
            close()
            moveTo(17.378f, 8.5f)
            lineTo(13.5f, 4.621f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.275f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(17.378f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentText, contentDescription = null)
    }
}
