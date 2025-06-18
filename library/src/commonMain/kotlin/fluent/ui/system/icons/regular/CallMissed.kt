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

public val FluentUi.Regular.CallMissed: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CallMissed",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.014f, 2.496f)
            curveTo(15.957f, 2.496f, 18.889f, 3.338f, 20.79f, 5.065f)
            curveTo(21.744f, 5.933f, 22.182f, 7.227f, 21.961f, 8.488f)
            lineTo(21.918f, 8.698f)
            lineTo(21.726f, 9.515f)
            curveTo(21.41f, 10.859f, 20.145f, 11.761f, 18.771f, 11.621f)
            lineTo(17.016f, 11.443f)
            curveTo(15.845f, 11.325f, 14.879f, 10.473f, 14.615f, 9.326f)
            lineTo(14.225f, 7.64f)
            curveTo(14.21f, 7.575f, 14.169f, 7.518f, 14.112f, 7.483f)
            curveTo(13.791f, 7.287f, 13.078f, 7.164f, 12.014f, 7.164f)
            curveTo(10.549f, 7.164f, 9.861f, 7.393f, 9.822f, 7.557f)
            lineTo(9.414f, 9.327f)
            curveTo(9.149f, 10.473f, 8.184f, 11.325f, 7.013f, 11.444f)
            lineTo(5.267f, 11.622f)
            curveTo(3.896f, 11.761f, 2.634f, 10.865f, 2.314f, 9.525f)
            lineTo(2.118f, 8.708f)
            curveTo(1.8f, 7.376f, 2.233f, 5.976f, 3.248f, 5.057f)
            curveTo(5.148f, 3.335f, 8.078f, 2.496f, 12.014f, 2.496f)
            close()
            moveTo(12.014f, 3.996f)
            curveTo(8.417f, 3.996f, 5.838f, 4.735f, 4.255f, 6.168f)
            curveTo(3.646f, 6.72f, 3.386f, 7.56f, 3.577f, 8.359f)
            lineTo(3.773f, 9.176f)
            curveTo(3.918f, 9.785f, 4.492f, 10.193f, 5.115f, 10.129f)
            lineTo(6.861f, 9.951f)
            curveTo(7.393f, 9.897f, 7.832f, 9.51f, 7.952f, 8.989f)
            lineTo(8.362f, 7.214f)
            curveTo(8.631f, 6.084f, 9.892f, 5.664f, 12.014f, 5.664f)
            curveTo(13.332f, 5.664f, 14.279f, 5.827f, 14.895f, 6.203f)
            curveTo(15.296f, 6.449f, 15.581f, 6.845f, 15.687f, 7.303f)
            lineTo(16.076f, 8.989f)
            curveTo(16.196f, 9.51f, 16.635f, 9.897f, 17.168f, 9.951f)
            lineTo(18.922f, 10.129f)
            curveTo(19.547f, 10.193f, 20.122f, 9.783f, 20.265f, 9.171f)
            lineTo(20.457f, 8.355f)
            lineTo(20.491f, 8.184f)
            curveTo(20.606f, 7.442f, 20.342f, 6.686f, 19.781f, 6.175f)
            curveTo(18.199f, 4.737f, 15.617f, 3.996f, 12.014f, 3.996f)
            close()
            moveTo(12.5f, 14.75f)
            curveTo(12.5f, 14.336f, 12.164f, 14f, 11.75f, 14f)
            curveTo(11.335f, 14f, 11f, 14.336f, 11f, 14.75f)
            verticalLineTo(17.25f)
            curveTo(11f, 17.664f, 11.336f, 18f, 11.75f, 18f)
            horizontalLineTo(13.5f)
            curveTo(13.914f, 18f, 14.25f, 17.664f, 14.25f, 17.25f)
            curveTo(14.25f, 16.836f, 13.914f, 16.5f, 13.5f, 16.5f)
            horizontalLineTo(12.5f)
            verticalLineTo(14.75f)
            close()
            moveTo(6.5f, 16.5f)
            curveTo(6.5f, 13.463f, 8.962f, 11f, 12f, 11f)
            curveTo(15.037f, 11f, 17.5f, 13.463f, 17.5f, 16.5f)
            curveTo(17.5f, 19.538f, 15.037f, 22f, 12f, 22f)
            curveTo(8.962f, 22f, 6.5f, 19.538f, 6.5f, 16.5f)
            close()
            moveTo(12f, 12.5f)
            curveTo(9.791f, 12.5f, 8f, 14.291f, 8f, 16.5f)
            curveTo(8f, 18.709f, 9.791f, 20.5f, 12f, 20.5f)
            curveTo(14.209f, 20.5f, 16f, 18.709f, 16f, 16.5f)
            curveTo(16f, 14.291f, 14.209f, 12.5f, 12f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallMissedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CallMissed, contentDescription = null)
    }
}
