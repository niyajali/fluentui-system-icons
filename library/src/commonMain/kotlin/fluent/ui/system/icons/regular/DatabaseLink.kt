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

public val FluentUi.Regular.DatabaseLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DatabaseLink",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 6f)
            verticalLineTo(18f)
            curveTo(4f, 18.691f, 4.315f, 19.293f, 4.774f, 19.78f)
            curveTo(5.229f, 20.262f, 5.853f, 20.663f, 6.567f, 20.983f)
            curveTo(7.996f, 21.623f, 9.917f, 22f, 12f, 22f)
            curveTo(12.511f, 22f, 13.012f, 21.977f, 13.499f, 21.934f)
            curveTo(12.854f, 21.586f, 12.298f, 21.093f, 11.876f, 20.5f)
            curveTo(10.005f, 20.485f, 8.349f, 20.138f, 7.18f, 19.614f)
            curveTo(6.582f, 19.346f, 6.144f, 19.046f, 5.865f, 18.75f)
            curveTo(5.59f, 18.459f, 5.5f, 18.207f, 5.5f, 18f)
            verticalLineTo(8.392f)
            curveTo(5.821f, 8.613f, 6.181f, 8.809f, 6.567f, 8.982f)
            curveTo(7.996f, 9.623f, 9.917f, 10f, 12f, 10f)
            curveTo(14.083f, 10f, 16.004f, 9.623f, 17.433f, 8.982f)
            curveTo(17.819f, 8.809f, 18.179f, 8.613f, 18.5f, 8.392f)
            verticalLineTo(13f)
            horizontalLineTo(19.25f)
            curveTo(19.505f, 13f, 19.756f, 13.02f, 20f, 13.059f)
            verticalLineTo(6f)
            curveTo(20f, 5.309f, 19.685f, 4.707f, 19.226f, 4.22f)
            curveTo(18.771f, 3.738f, 18.147f, 3.337f, 17.433f, 3.018f)
            curveTo(16.004f, 2.377f, 14.083f, 2f, 12f, 2f)
            curveTo(9.917f, 2f, 7.996f, 2.377f, 6.567f, 3.018f)
            curveTo(5.853f, 3.337f, 5.229f, 3.738f, 4.774f, 4.22f)
            curveTo(4.315f, 4.707f, 4f, 5.309f, 4f, 6f)
            close()
            moveTo(5.5f, 6f)
            curveTo(5.5f, 5.793f, 5.59f, 5.541f, 5.865f, 5.25f)
            curveTo(6.144f, 4.954f, 6.582f, 4.654f, 7.18f, 4.386f)
            curveTo(8.375f, 3.851f, 10.079f, 3.5f, 12f, 3.5f)
            curveTo(13.921f, 3.5f, 15.625f, 3.851f, 16.82f, 4.386f)
            curveTo(17.418f, 4.654f, 17.856f, 4.954f, 18.135f, 5.25f)
            curveTo(18.41f, 5.541f, 18.5f, 5.793f, 18.5f, 6f)
            curveTo(18.5f, 6.207f, 18.41f, 6.459f, 18.135f, 6.75f)
            curveTo(17.856f, 7.046f, 17.418f, 7.345f, 16.82f, 7.614f)
            curveTo(15.625f, 8.149f, 13.921f, 8.5f, 12f, 8.5f)
            curveTo(10.079f, 8.5f, 8.375f, 8.149f, 7.18f, 7.614f)
            curveTo(6.582f, 7.345f, 6.144f, 7.046f, 5.865f, 6.75f)
            curveTo(5.59f, 6.459f, 5.5f, 6.207f, 5.5f, 6f)
            close()
            moveTo(23f, 17.75f)
            curveTo(23f, 15.679f, 21.321f, 14f, 19.25f, 14f)
            lineTo(19.148f, 14.007f)
            curveTo(18.782f, 14.057f, 18.5f, 14.37f, 18.5f, 14.75f)
            curveTo(18.5f, 15.164f, 18.836f, 15.5f, 19.25f, 15.5f)
            lineTo(19.404f, 15.505f)
            curveTo(20.575f, 15.584f, 21.5f, 16.559f, 21.5f, 17.75f)
            curveTo(21.5f, 18.993f, 20.493f, 20f, 19.25f, 20f)
            lineTo(19.247f, 20.005f)
            lineTo(19.145f, 20.012f)
            curveTo(18.779f, 20.063f, 18.498f, 20.378f, 18.5f, 20.758f)
            curveTo(18.502f, 21.172f, 18.839f, 21.507f, 19.253f, 21.505f)
            verticalLineTo(21.5f)
            lineTo(19.452f, 21.495f)
            curveTo(21.428f, 21.391f, 23f, 19.754f, 23f, 17.75f)
            close()
            moveTo(16.5f, 14.75f)
            curveTo(16.5f, 14.336f, 16.164f, 14f, 15.75f, 14f)
            lineTo(15.551f, 14.005f)
            curveTo(13.572f, 14.109f, 12f, 15.746f, 12f, 17.75f)
            curveTo(12f, 19.821f, 13.679f, 21.5f, 15.75f, 21.5f)
            lineTo(15.852f, 21.493f)
            curveTo(16.218f, 21.444f, 16.5f, 21.13f, 16.5f, 20.75f)
            curveTo(16.5f, 20.336f, 16.164f, 20f, 15.75f, 20f)
            lineTo(15.596f, 19.995f)
            curveTo(14.425f, 19.916f, 13.5f, 18.941f, 13.5f, 17.75f)
            curveTo(13.5f, 16.507f, 14.507f, 15.5f, 15.75f, 15.5f)
            lineTo(15.852f, 15.493f)
            curveTo(16.218f, 15.443f, 16.5f, 15.13f, 16.5f, 14.75f)
            close()
            moveTo(20f, 17.75f)
            curveTo(20f, 17.336f, 19.664f, 17f, 19.25f, 17f)
            horizontalLineTo(15.75f)
            lineTo(15.648f, 17.007f)
            curveTo(15.282f, 17.056f, 15f, 17.37f, 15f, 17.75f)
            curveTo(15f, 18.164f, 15.336f, 18.5f, 15.75f, 18.5f)
            horizontalLineTo(19.25f)
            lineTo(19.352f, 18.493f)
            curveTo(19.718f, 18.444f, 20f, 18.13f, 20f, 17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DatabaseLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DatabaseLink, contentDescription = null)
    }
}
