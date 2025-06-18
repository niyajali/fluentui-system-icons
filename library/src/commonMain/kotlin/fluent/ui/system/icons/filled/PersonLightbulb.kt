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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.PersonLightbulb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonLightbulb",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13f, 16f)
            curveTo(13f, 15.289f, 13.149f, 14.613f, 13.417f, 14f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(4.004f, 17.741f, 4.182f, 18.299f, 4.514f, 18.765f)
            curveTo(6.056f, 20.929f, 8.579f, 22.001f, 12f, 22.001f)
            curveTo(13.175f, 22.001f, 14.245f, 21.875f, 15.205f, 21.621f)
            lineTo(14.859f, 19.89f)
            curveTo(13.727f, 18.974f, 13f, 17.572f, 13f, 16f)
            close()
            moveTo(17f, 7.005f)
            curveTo(17f, 4.243f, 14.762f, 2.005f, 12f, 2.005f)
            curveTo(9.239f, 2.005f, 7f, 4.243f, 7f, 7.005f)
            curveTo(7f, 9.766f, 9.239f, 12.005f, 12f, 12.005f)
            curveTo(14.762f, 12.005f, 17f, 9.766f, 17f, 7.005f)
            close()
            moveTo(22f, 16f)
            curveTo(22f, 17.381f, 21.301f, 18.598f, 20.237f, 19.317f)
            lineTo(20.101f, 20f)
            horizontalLineTo(15.901f)
            lineTo(15.764f, 19.317f)
            curveTo(14.7f, 18.598f, 14f, 17.381f, 14f, 16f)
            curveTo(14f, 13.791f, 15.791f, 12f, 18f, 12f)
            curveTo(20.21f, 12f, 22f, 13.791f, 22f, 16f)
            close()
            moveTo(16.101f, 21f)
            lineTo(16.259f, 21.794f)
            curveTo(16.4f, 22.495f, 17.015f, 23f, 17.73f, 23f)
            horizontalLineTo(18.271f)
            curveTo(18.986f, 23f, 19.601f, 22.495f, 19.742f, 21.794f)
            lineTo(19.9f, 21f)
            horizontalLineTo(16.101f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonLightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonLightbulb, contentDescription = null)
    }
}
