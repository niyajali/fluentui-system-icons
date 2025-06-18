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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.DualScreenUpdate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenUpdate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.748f, 4.002f)
            lineTo(12.747f, 4.004f)
            lineTo(20.245f, 4.004f)
            curveTo(21.212f, 4.004f, 21.995f, 4.788f, 21.995f, 5.754f)
            verticalLineTo(18.25f)
            curveTo(21.995f, 19.216f, 21.212f, 20f, 20.245f, 20f)
            horizontalLineTo(11.248f)
            lineTo(11.247f, 19.997f)
            lineTo(3.75f, 19.997f)
            curveTo(2.783f, 19.997f, 2f, 19.214f, 2f, 18.247f)
            verticalLineTo(5.752f)
            curveTo(2f, 4.785f, 2.783f, 4.002f, 3.75f, 4.002f)
            horizontalLineTo(12.748f)
            close()
            moveTo(20.245f, 5.504f)
            horizontalLineTo(12.748f)
            verticalLineTo(18.5f)
            horizontalLineTo(20.245f)
            curveTo(20.383f, 18.5f, 20.495f, 18.388f, 20.495f, 18.25f)
            verticalLineTo(5.754f)
            curveTo(20.495f, 5.616f, 20.383f, 5.504f, 20.245f, 5.504f)
            close()
            moveTo(11.248f, 5.502f)
            horizontalLineTo(3.75f)
            curveTo(3.612f, 5.502f, 3.5f, 5.614f, 3.5f, 5.752f)
            verticalLineTo(18.247f)
            curveTo(3.5f, 18.385f, 3.612f, 18.497f, 3.75f, 18.497f)
            horizontalLineTo(11.248f)
            verticalLineTo(5.502f)
            close()
            moveTo(16.5f, 7.001f)
            curveTo(16.881f, 7.001f, 17.195f, 7.282f, 17.245f, 7.648f)
            lineTo(17.252f, 7.749f)
            lineTo(17.251f, 14.446f)
            lineTo(18.216f, 13.487f)
            curveTo(18.483f, 13.222f, 18.901f, 13.198f, 19.195f, 13.415f)
            lineTo(19.28f, 13.487f)
            curveTo(19.547f, 13.753f, 19.571f, 14.169f, 19.353f, 14.462f)
            lineTo(19.28f, 14.546f)
            lineTo(17.032f, 16.783f)
            lineTo(16.993f, 16.819f)
            lineTo(16.931f, 16.867f)
            lineTo(16.864f, 16.909f)
            lineTo(16.803f, 16.939f)
            lineTo(16.702f, 16.975f)
            lineTo(16.64f, 16.989f)
            lineTo(16.547f, 17.001f)
            horizontalLineTo(16.453f)
            lineTo(16.361f, 16.989f)
            lineTo(16.264f, 16.965f)
            lineTo(16.153f, 16.918f)
            lineTo(16.076f, 16.872f)
            lineTo(15.968f, 16.783f)
            lineTo(13.72f, 14.546f)
            curveTo(13.427f, 14.254f, 13.427f, 13.78f, 13.72f, 13.487f)
            curveTo(13.987f, 13.222f, 14.405f, 13.198f, 14.7f, 13.415f)
            lineTo(14.784f, 13.487f)
            lineTo(15.747f, 14.446f)
            lineTo(15.748f, 7.749f)
            curveTo(15.748f, 7.405f, 15.982f, 7.115f, 16.3f, 7.027f)
            lineTo(16.398f, 7.008f)
            lineTo(16.5f, 7.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenUpdatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreenUpdate, contentDescription = null)
    }
}
