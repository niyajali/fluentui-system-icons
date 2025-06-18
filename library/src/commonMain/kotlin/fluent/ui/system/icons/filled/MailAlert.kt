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

public val FluentUi.Filled.MailAlert: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailAlert",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.503f, 1f)
            curveTo(15.293f, 1f, 13.502f, 2.791f, 13.502f, 5f)
            lineTo(13.502f, 8f)
            lineTo(12.554f, 8.8f)
            curveTo(12.246f, 9.06f, 12.092f, 9.19f, 12.046f, 9.291f)
            curveTo(11.931f, 9.541f, 12.039f, 9.836f, 12.288f, 9.953f)
            curveTo(12.389f, 10f, 12.59f, 10f, 12.993f, 10f)
            horizontalLineTo(22.012f)
            curveTo(22.415f, 10f, 22.616f, 10f, 22.717f, 9.953f)
            curveTo(22.966f, 9.836f, 23.073f, 9.541f, 22.959f, 9.291f)
            curveTo(22.912f, 9.19f, 22.758f, 9.06f, 22.451f, 8.8f)
            lineTo(21.503f, 8f)
            verticalLineTo(5f)
            curveTo(21.503f, 2.791f, 19.712f, 1f, 17.503f, 1f)
            close()
            moveTo(19.003f, 11f)
            curveTo(18.784f, 11.583f, 18.195f, 12f, 17.503f, 12f)
            curveTo(16.81f, 12f, 16.221f, 11.583f, 16.003f, 11f)
            horizontalLineTo(19.003f)
            close()
            moveTo(22f, 16.75f)
            verticalLineTo(11f)
            lineTo(20.067f, 11f)
            lineTo(19.935f, 11.351f)
            curveTo(19.565f, 12.339f, 18.592f, 13f, 17.499f, 13f)
            curveTo(16.684f, 13f, 15.936f, 12.633f, 15.455f, 12.037f)
            lineTo(12.348f, 13.664f)
            curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
            lineTo(2f, 8.608f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            close()
            moveTo(12f, 12.153f)
            lineTo(14.202f, 11f)
            lineTo(12.966f, 11f)
            curveTo(12.785f, 11f, 12.611f, 11f, 12.471f, 10.993f)
            curveTo(12.355f, 10.987f, 12.103f, 10.972f, 11.858f, 10.858f)
            curveTo(11.113f, 10.507f, 10.79f, 9.622f, 11.133f, 8.874f)
            curveTo(11.246f, 8.629f, 11.429f, 8.455f, 11.514f, 8.376f)
            curveTo(11.616f, 8.28f, 11.749f, 8.168f, 11.888f, 8.051f)
            lineTo(12.499f, 7.535f)
            lineTo(12.499f, 5f)
            curveTo(12.499f, 4.658f, 12.533f, 4.323f, 12.599f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.064f, 4.005f)
            curveTo(3.464f, 4.095f, 2.174f, 5.343f, 2.016f, 6.924f)
            lineTo(12f, 12.153f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailAlertPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailAlert, contentDescription = null)
    }
}
