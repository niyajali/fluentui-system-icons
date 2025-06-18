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

public val FluentUi.Filled.SlideMicrophone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideMicrophone",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineTo(14.5f)
            curveTo(22f, 12.769f, 20.617f, 11f, 18.5f, 11f)
            curveTo(16.385f, 11f, 15f, 12.759f, 15f, 14.5f)
            verticalLineTo(16.085f)
            curveTo(14.844f, 16.03f, 14.675f, 16f, 14.5f, 16f)
            curveTo(13.672f, 16f, 13f, 16.672f, 13f, 17.5f)
            curveTo(13f, 18.419f, 13.278f, 19.27f, 13.753f, 20f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
            moveTo(6.75f, 8f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 9.5f, 12f, 9.164f, 12f, 8.75f)
            curveTo(12f, 8.336f, 11.664f, 8f, 11.25f, 8f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6.75f, 11f)
            curveTo(6.336f, 11f, 6f, 11.336f, 6f, 11.75f)
            curveTo(6f, 12.164f, 6.336f, 12.5f, 6.75f, 12.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 12.5f, 14f, 12.164f, 14f, 11.75f)
            curveTo(14f, 11.336f, 13.664f, 11f, 13.25f, 11f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6f, 14.75f)
            curveTo(6f, 15.164f, 6.336f, 15.5f, 6.75f, 15.5f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 15.5f, 13f, 15.164f, 13f, 14.75f)
            curveTo(13f, 14.336f, 12.664f, 14f, 12.25f, 14f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            close()
            moveTo(15f, 17.5f)
            curveTo(15f, 18.585f, 15.603f, 19.478f, 16.521f, 20f)
            curveTo(17.084f, 20.32f, 17.766f, 20.5f, 18.5f, 20.5f)
            curveTo(20.433f, 20.5f, 22f, 19.25f, 22f, 17.5f)
            curveTo(22f, 17.224f, 22.224f, 17f, 22.5f, 17f)
            curveTo(22.776f, 17f, 23f, 17.224f, 23f, 17.5f)
            curveTo(23f, 19.5f, 21.25f, 21.224f, 19f, 21.472f)
            verticalLineTo(22.5f)
            curveTo(19f, 22.776f, 18.776f, 23f, 18.5f, 23f)
            curveTo(18.224f, 23f, 18f, 22.776f, 18f, 22.5f)
            verticalLineTo(21.472f)
            curveTo(16.801f, 21.34f, 15.744f, 20.789f, 15.018f, 20f)
            curveTo(14.382f, 19.308f, 14f, 18.434f, 14f, 17.5f)
            curveTo(14f, 17.224f, 14.224f, 17f, 14.5f, 17f)
            curveTo(14.776f, 17f, 15f, 17.224f, 15f, 17.5f)
            close()
            moveTo(16f, 14.5f)
            curveTo(16f, 13.246f, 17f, 12f, 18.5f, 12f)
            curveTo(20f, 12f, 21f, 13.254f, 21f, 14.5f)
            verticalLineTo(17f)
            curveTo(21f, 18.246f, 20f, 19.5f, 18.5f, 19.5f)
            curveTo(17f, 19.5f, 16f, 18.252f, 16f, 17f)
            verticalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideMicrophonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SlideMicrophone, contentDescription = null)
    }
}
