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

public val FluentIcons.Regular.CircleHintHalfVertical: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleHintHalfVertical",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.781f, 3.253f)
            curveTo(7.14f, 3.367f, 3.396f, 7.094f, 3.254f, 11.728f)
            curveTo(3.251f, 11.818f, 3.25f, 11.909f, 3.25f, 12f)
            curveTo(3.25f, 12.073f, 3.251f, 12.146f, 3.253f, 12.219f)
            curveTo(3.305f, 14.334f, 4.107f, 16.263f, 5.404f, 17.75f)
            curveTo(5.63f, 18.008f, 5.87f, 18.253f, 6.124f, 18.483f)
            curveTo(7.582f, 19.806f, 9.488f, 20.643f, 11.587f, 20.74f)
            curveTo(11.724f, 20.747f, 11.862f, 20.75f, 12f, 20.75f)
            curveTo(12.585f, 20.75f, 13.156f, 20.693f, 13.708f, 20.583f)
            curveTo(14.115f, 20.503f, 14.509f, 20.767f, 14.59f, 21.174f)
            curveTo(14.67f, 21.58f, 14.406f, 21.975f, 14f, 22.055f)
            curveTo(13.352f, 22.183f, 12.684f, 22.25f, 12f, 22.25f)
            curveTo(11.915f, 22.25f, 11.829f, 22.249f, 11.744f, 22.247f)
            curveTo(9.302f, 22.187f, 7.071f, 21.273f, 5.34f, 19.792f)
            curveTo(5.01f, 19.509f, 4.698f, 19.206f, 4.406f, 18.884f)
            curveTo(2.755f, 17.065f, 1.75f, 14.65f, 1.75f, 12f)
            curveTo(1.75f, 6.339f, 6.339f, 1.75f, 12f, 1.75f)
            curveTo(12.684f, 1.75f, 13.352f, 1.817f, 14f, 1.945f)
            curveTo(14.406f, 2.025f, 14.67f, 2.42f, 14.59f, 2.826f)
            curveTo(14.509f, 3.233f, 14.115f, 3.497f, 13.708f, 3.417f)
            curveTo(13.156f, 3.307f, 12.585f, 3.25f, 12f, 3.25f)
            curveTo(11.927f, 3.25f, 11.854f, 3.251f, 11.781f, 3.253f)
            close()
            moveTo(17.696f, 3.477f)
            curveTo(17.351f, 3.246f, 16.886f, 3.339f, 16.655f, 3.683f)
            curveTo(16.425f, 4.027f, 16.517f, 4.493f, 16.861f, 4.723f)
            curveTo(17.816f, 5.362f, 18.638f, 6.184f, 19.277f, 7.139f)
            curveTo(19.507f, 7.483f, 19.973f, 7.575f, 20.317f, 7.345f)
            curveTo(20.661f, 7.114f, 20.753f, 6.649f, 20.523f, 6.304f)
            curveTo(19.775f, 5.187f, 18.813f, 4.225f, 17.696f, 3.477f)
            close()
            moveTo(22.055f, 10f)
            curveTo(21.975f, 9.594f, 21.58f, 9.33f, 21.174f, 9.41f)
            curveTo(20.767f, 9.491f, 20.503f, 9.885f, 20.583f, 10.292f)
            curveTo(20.693f, 10.844f, 20.75f, 11.415f, 20.75f, 12f)
            curveTo(20.75f, 12.585f, 20.693f, 13.156f, 20.583f, 13.708f)
            curveTo(20.503f, 14.115f, 20.767f, 14.509f, 21.174f, 14.59f)
            curveTo(21.58f, 14.67f, 21.975f, 14.406f, 22.055f, 14f)
            curveTo(22.183f, 13.352f, 22.25f, 12.684f, 22.25f, 12f)
            curveTo(22.25f, 11.316f, 22.183f, 10.648f, 22.055f, 10f)
            close()
            moveTo(20.523f, 17.696f)
            curveTo(20.753f, 17.351f, 20.661f, 16.886f, 20.317f, 16.655f)
            curveTo(19.973f, 16.425f, 19.507f, 16.517f, 19.277f, 16.861f)
            curveTo(18.638f, 17.816f, 17.816f, 18.638f, 16.861f, 19.277f)
            curveTo(16.517f, 19.507f, 16.425f, 19.973f, 16.655f, 20.317f)
            curveTo(16.886f, 20.661f, 17.351f, 20.753f, 17.696f, 20.523f)
            curveTo(18.813f, 19.775f, 19.775f, 18.813f, 20.523f, 17.696f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleHintHalfVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CircleHintHalfVertical, contentDescription = null)
    }
}
