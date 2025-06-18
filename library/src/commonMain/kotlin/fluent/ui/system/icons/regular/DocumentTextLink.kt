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

public val FluentUi.Regular.DocumentTextLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentTextLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18f, 20.5f)
            curveTo(18.276f, 20.5f, 18.5f, 20.275f, 18.5f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.896f, 10f, 12f, 9.104f, 12f, 8f)
            verticalLineTo(3.5f)
            horizontalLineTo(6f)
            curveTo(5.724f, 3.5f, 5.5f, 3.725f, 5.5f, 4f)
            verticalLineTo(14f)
            horizontalLineTo(4.75f)
            curveTo(4.495f, 14f, 4.244f, 14.02f, 4f, 14.059f)
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
            lineTo(19.414f, 8.414f)
            curveTo(19.789f, 8.789f, 20f, 9.298f, 20f, 9.828f)
            verticalLineTo(20f)
            curveTo(20f, 21.104f, 19.104f, 22f, 18f, 22f)
            horizontalLineTo(11.714f)
            curveTo(12.12f, 21.568f, 12.445f, 21.06f, 12.667f, 20.5f)
            horizontalLineTo(18f)
            close()
            moveTo(17.378f, 8.5f)
            lineTo(13.5f, 4.621f)
            verticalLineTo(8f)
            curveTo(13.5f, 8.275f, 13.724f, 8.5f, 14f, 8.5f)
            horizontalLineTo(17.378f)
            close()
            moveTo(9.775f, 14.25f)
            curveTo(10.629f, 14.539f, 11.375f, 15.065f, 11.933f, 15.75f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 15.75f, 16f, 15.414f, 16f, 15f)
            curveTo(16f, 14.586f, 15.664f, 14.25f, 15.25f, 14.25f)
            horizontalLineTo(9.775f)
            close()
            moveTo(12.667f, 17f)
            curveTo(12.853f, 17.468f, 12.966f, 17.973f, 12.993f, 18.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 18.5f, 16f, 18.164f, 16f, 17.75f)
            curveTo(16f, 17.336f, 15.664f, 17f, 15.25f, 17f)
            horizontalLineTo(12.667f)
            close()
            moveTo(8.75f, 11.5f)
            curveTo(8.336f, 11.5f, 8f, 11.836f, 8f, 12.25f)
            curveTo(8f, 12.664f, 8.336f, 13f, 8.75f, 13f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 13f, 16f, 12.664f, 16f, 12.25f)
            curveTo(16f, 11.836f, 15.664f, 11.5f, 15.25f, 11.5f)
            horizontalLineTo(8.75f)
            close()
            moveTo(12f, 18.75f)
            curveTo(12f, 16.679f, 10.321f, 15f, 8.25f, 15f)
            lineTo(8.148f, 15.007f)
            curveTo(7.782f, 15.057f, 7.5f, 15.37f, 7.5f, 15.75f)
            curveTo(7.5f, 16.164f, 7.836f, 16.5f, 8.25f, 16.5f)
            lineTo(8.404f, 16.505f)
            curveTo(9.575f, 16.584f, 10.5f, 17.559f, 10.5f, 18.75f)
            curveTo(10.5f, 19.993f, 9.493f, 21f, 8.25f, 21f)
            lineTo(8.247f, 21.005f)
            lineTo(8.145f, 21.012f)
            curveTo(7.779f, 21.063f, 7.498f, 21.378f, 7.5f, 21.758f)
            curveTo(7.502f, 22.172f, 7.839f, 22.507f, 8.253f, 22.505f)
            verticalLineTo(22.5f)
            lineTo(8.452f, 22.495f)
            curveTo(10.428f, 22.391f, 12f, 20.754f, 12f, 18.75f)
            close()
            moveTo(5.5f, 15.75f)
            curveTo(5.5f, 15.336f, 5.164f, 15f, 4.75f, 15f)
            lineTo(4.551f, 15.005f)
            curveTo(2.572f, 15.109f, 1f, 16.746f, 1f, 18.75f)
            curveTo(1f, 20.821f, 2.679f, 22.5f, 4.75f, 22.5f)
            lineTo(4.852f, 22.493f)
            curveTo(5.218f, 22.444f, 5.5f, 22.13f, 5.5f, 21.75f)
            curveTo(5.5f, 21.336f, 5.164f, 21f, 4.75f, 21f)
            lineTo(4.596f, 20.995f)
            curveTo(3.425f, 20.916f, 2.5f, 19.941f, 2.5f, 18.75f)
            curveTo(2.5f, 17.507f, 3.507f, 16.5f, 4.75f, 16.5f)
            lineTo(4.852f, 16.493f)
            curveTo(5.218f, 16.444f, 5.5f, 16.13f, 5.5f, 15.75f)
            close()
            moveTo(9f, 18.75f)
            curveTo(9f, 18.336f, 8.664f, 18f, 8.25f, 18f)
            horizontalLineTo(4.75f)
            lineTo(4.648f, 18.007f)
            curveTo(4.282f, 18.056f, 4f, 18.37f, 4f, 18.75f)
            curveTo(4f, 19.164f, 4.336f, 19.5f, 4.75f, 19.5f)
            horizontalLineTo(8.25f)
            lineTo(8.352f, 19.493f)
            curveTo(8.718f, 19.444f, 9f, 19.13f, 9f, 18.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTextLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentTextLink, contentDescription = null)
    }
}
