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

public val FluentUi.Regular.PersonWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.709f, 15.5f)
            lineTo(14.458f, 14f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
            verticalLineTo(16.826f)
            curveTo(4.004f, 17.719f, 4.322f, 18.583f, 4.902f, 19.262f)
            curveTo(6.307f, 20.906f, 8.37f, 21.804f, 11.05f, 21.972f)
            curveTo(10.955f, 21.492f, 11.001f, 20.975f, 11.223f, 20.48f)
            curveTo(8.886f, 20.349f, 7.174f, 19.613f, 6.043f, 18.288f)
            curveTo(5.695f, 17.88f, 5.504f, 17.362f, 5.504f, 16.826f)
            verticalLineTo(16.249f)
            curveTo(5.504f, 15.835f, 5.839f, 15.5f, 6.253f, 15.5f)
            horizontalLineTo(13.709f)
            close()
            moveTo(12f, 2.005f)
            curveTo(14.762f, 2.005f, 17f, 4.243f, 17f, 7.005f)
            curveTo(17f, 9.766f, 14.762f, 12.005f, 12f, 12.005f)
            curveTo(9.239f, 12.005f, 7f, 9.766f, 7f, 7.005f)
            curveTo(7f, 4.243f, 9.239f, 2.005f, 12f, 2.005f)
            close()
            moveTo(12f, 3.505f)
            curveTo(10.067f, 3.505f, 8.5f, 5.072f, 8.5f, 7.005f)
            curveTo(8.5f, 8.938f, 10.067f, 10.505f, 12f, 10.505f)
            curveTo(13.933f, 10.505f, 15.5f, 8.938f, 15.5f, 7.005f)
            curveTo(15.5f, 5.072f, 13.933f, 3.505f, 12f, 3.505f)
            close()
            moveTo(16.161f, 12.83f)
            lineTo(12.164f, 20.828f)
            curveTo(11.665f, 21.826f, 12.391f, 23f, 13.507f, 23f)
            horizontalLineTo(21.501f)
            curveTo(22.617f, 23f, 23.342f, 21.826f, 22.844f, 20.828f)
            lineTo(18.847f, 12.83f)
            curveTo(18.294f, 11.723f, 16.714f, 11.723f, 16.161f, 12.83f)
            close()
            moveTo(18.004f, 15.496f)
            verticalLineTo(18.497f)
            curveTo(18.004f, 18.774f, 17.78f, 18.998f, 17.504f, 18.998f)
            curveTo(17.228f, 18.998f, 17.003f, 18.774f, 17.003f, 18.497f)
            verticalLineTo(15.496f)
            curveTo(17.003f, 15.219f, 17.228f, 14.995f, 17.504f, 14.995f)
            curveTo(17.78f, 14.995f, 18.004f, 15.219f, 18.004f, 15.496f)
            close()
            moveTo(17.504f, 20.999f)
            curveTo(17.228f, 20.999f, 17.003f, 20.775f, 17.003f, 20.499f)
            curveTo(17.003f, 20.222f, 17.228f, 19.998f, 17.504f, 19.998f)
            curveTo(17.78f, 19.998f, 18.004f, 20.222f, 18.004f, 20.499f)
            curveTo(18.004f, 20.775f, 17.78f, 20.999f, 17.504f, 20.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PersonWarning, contentDescription = null)
    }
}
