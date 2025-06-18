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

public val FluentUi.Filled.DualScreenUpdate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenUpdate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.245f, 4.004f)
            curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
            verticalLineTo(18.25f)
            curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
            horizontalLineTo(12.998f)
            curveTo(12.911f, 20f, 12.825f, 19.993f, 12.742f, 19.981f)
            lineTo(12.742f, 4.023f)
            curveTo(12.825f, 4.011f, 12.911f, 4.004f, 12.998f, 4.004f)
            horizontalLineTo(20.245f)
            close()
            moveTo(10.998f, 4.002f)
            curveTo(11.081f, 4.002f, 11.163f, 4.008f, 11.243f, 4.019f)
            lineTo(11.243f, 19.98f)
            curveTo(11.163f, 19.991f, 11.081f, 19.997f, 10.998f, 19.997f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
            horizontalLineTo(10.998f)
            close()
            moveTo(17.5f, 7.001f)
            lineTo(17.398f, 7.008f)
            lineTo(17.3f, 7.027f)
            curveTo(17.017f, 7.105f, 16.801f, 7.343f, 16.756f, 7.637f)
            lineTo(16.748f, 7.749f)
            lineTo(16.747f, 14.446f)
            lineTo(15.784f, 13.487f)
            lineTo(15.7f, 13.415f)
            curveTo(15.405f, 13.198f, 14.987f, 13.222f, 14.72f, 13.487f)
            curveTo(14.453f, 13.753f, 14.429f, 14.169f, 14.648f, 14.462f)
            lineTo(14.72f, 14.546f)
            lineTo(16.968f, 16.783f)
            lineTo(17.076f, 16.872f)
            lineTo(17.153f, 16.918f)
            lineTo(17.264f, 16.965f)
            lineTo(17.361f, 16.989f)
            lineTo(17.453f, 17.001f)
            horizontalLineTo(17.547f)
            lineTo(17.64f, 16.989f)
            lineTo(17.702f, 16.975f)
            lineTo(17.803f, 16.939f)
            lineTo(17.864f, 16.909f)
            lineTo(17.931f, 16.867f)
            lineTo(17.993f, 16.819f)
            lineTo(18.032f, 16.783f)
            lineTo(20.28f, 14.546f)
            lineTo(20.353f, 14.462f)
            curveTo(20.547f, 14.201f, 20.549f, 13.844f, 20.36f, 13.581f)
            lineTo(20.28f, 13.487f)
            lineTo(20.195f, 13.415f)
            curveTo(19.934f, 13.222f, 19.574f, 13.219f, 19.31f, 13.408f)
            lineTo(19.216f, 13.487f)
            lineTo(18.251f, 14.446f)
            lineTo(18.252f, 7.749f)
            lineTo(18.245f, 7.648f)
            curveTo(18.2f, 7.316f, 17.936f, 7.053f, 17.602f, 7.008f)
            lineTo(17.5f, 7.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenUpdatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DualScreenUpdate, contentDescription = null)
    }
}
