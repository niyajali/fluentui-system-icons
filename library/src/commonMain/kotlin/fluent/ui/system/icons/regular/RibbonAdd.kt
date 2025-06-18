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

public val FluentUi.Regular.RibbonAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RibbonAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 3.462f, 20.538f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
            curveTo(12f, 9.537f, 14.462f, 11.999f, 17.5f, 11.999f)
            curveTo(20.538f, 11.999f, 23f, 9.537f, 23f, 6.5f)
            close()
            moveTo(18.001f, 7f)
            lineTo(18.001f, 9.503f)
            curveTo(18.001f, 9.779f, 17.777f, 10.003f, 17.501f, 10.003f)
            curveTo(17.225f, 10.003f, 17.001f, 9.779f, 17.001f, 9.503f)
            lineTo(17.001f, 7f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
            curveTo(13.996f, 6.223f, 14.22f, 6f, 14.496f, 6f)
            horizontalLineTo(17f)
            lineTo(17f, 3.499f)
            curveTo(17f, 3.223f, 17.224f, 2.999f, 17.5f, 2.999f)
            curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
            lineTo(18f, 6f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 6f, 20.996f, 6.223f, 20.996f, 6.5f)
            curveTo(20.996f, 6.776f, 20.772f, 7f, 20.497f, 7f)
            horizontalLineTo(18.001f)
            close()
            moveTo(11f, 2f)
            curveTo(11.562f, 2f, 12.109f, 2.066f, 12.633f, 2.191f)
            curveTo(12.271f, 2.6f, 11.96f, 3.055f, 11.709f, 3.545f)
            curveTo(11.477f, 3.515f, 11.24f, 3.5f, 11f, 3.5f)
            curveTo(7.962f, 3.5f, 5.5f, 5.962f, 5.5f, 8.999f)
            curveTo(5.5f, 12.037f, 7.962f, 14.499f, 11f, 14.499f)
            curveTo(12.673f, 14.499f, 14.172f, 13.752f, 15.181f, 12.573f)
            curveTo(15.684f, 12.766f, 16.218f, 12.897f, 16.773f, 12.959f)
            curveTo(16.543f, 13.294f, 16.284f, 13.608f, 16.001f, 13.897f)
            lineTo(15.999f, 21.249f)
            curveTo(15.999f, 21.821f, 15.393f, 22.169f, 14.907f, 21.917f)
            lineTo(14.818f, 21.862f)
            lineTo(10.999f, 19.174f)
            lineTo(7.183f, 21.862f)
            curveTo(6.715f, 22.191f, 6.081f, 21.896f, 6.008f, 21.353f)
            lineTo(6.001f, 21.249f)
            lineTo(5.999f, 13.897f)
            curveTo(4.763f, 12.635f, 4f, 10.906f, 4f, 8.999f)
            curveTo(4f, 5.134f, 7.134f, 2f, 11f, 2f)
            close()
            moveTo(14.499f, 19.804f)
            lineTo(14.499f, 15.063f)
            curveTo(13.47f, 15.658f, 12.275f, 15.999f, 11f, 15.999f)
            curveTo(9.725f, 15.999f, 8.53f, 15.658f, 7.501f, 15.063f)
            lineTo(7.501f, 19.803f)
            lineTo(10.567f, 17.644f)
            curveTo(10.794f, 17.485f, 11.087f, 17.465f, 11.33f, 17.584f)
            lineTo(11.431f, 17.644f)
            lineTo(14.499f, 19.804f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RibbonAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RibbonAdd, contentDescription = null)
    }
}
