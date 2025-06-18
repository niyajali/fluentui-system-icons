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

public val FluentUi.Regular.Flowchart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flowchart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.248f, 2.996f)
            curveTo(4.005f, 2.996f, 2.998f, 4.003f, 2.998f, 5.246f)
            lineTo(2.998f, 7.753f)
            curveTo(2.998f, 8.996f, 4.005f, 10.003f, 5.248f, 10.003f)
            horizontalLineTo(5.75f)
            verticalLineTo(13.71f)
            curveTo(5.703f, 13.745f, 5.658f, 13.783f, 5.616f, 13.826f)
            lineTo(2.824f, 16.617f)
            curveTo(2.335f, 17.105f, 2.335f, 17.897f, 2.824f, 18.385f)
            lineTo(5.616f, 21.177f)
            curveTo(6.104f, 21.665f, 6.896f, 21.665f, 7.384f, 21.177f)
            lineTo(10.175f, 18.385f)
            curveTo(10.217f, 18.342f, 10.256f, 18.298f, 10.291f, 18.251f)
            horizontalLineTo(14.005f)
            verticalLineTo(18.755f)
            curveTo(14.005f, 19.997f, 15.012f, 21.005f, 16.255f, 21.005f)
            horizontalLineTo(18.749f)
            curveTo(19.991f, 21.005f, 20.999f, 19.997f, 20.999f, 18.755f)
            verticalLineTo(16.25f)
            curveTo(20.999f, 15.008f, 19.991f, 14f, 18.749f, 14f)
            horizontalLineTo(16.255f)
            curveTo(15.012f, 14f, 14.005f, 15.008f, 14.005f, 16.25f)
            verticalLineTo(16.751f)
            horizontalLineTo(10.29f)
            curveTo(10.255f, 16.704f, 10.217f, 16.66f, 10.174f, 16.617f)
            lineTo(7.384f, 13.826f)
            curveTo(7.341f, 13.784f, 7.297f, 13.745f, 7.25f, 13.71f)
            verticalLineTo(10.003f)
            horizontalLineTo(7.755f)
            curveTo(8.997f, 10.003f, 10.005f, 8.996f, 10.005f, 7.753f)
            verticalLineTo(5.246f)
            curveTo(10.005f, 4.003f, 8.997f, 2.996f, 7.755f, 2.996f)
            horizontalLineTo(5.248f)
            close()
            moveTo(4.498f, 5.246f)
            curveTo(4.498f, 4.832f, 4.833f, 4.496f, 5.248f, 4.496f)
            horizontalLineTo(7.755f)
            curveTo(8.169f, 4.496f, 8.505f, 4.832f, 8.505f, 5.246f)
            verticalLineTo(7.753f)
            curveTo(8.505f, 8.168f, 8.169f, 8.503f, 7.755f, 8.503f)
            horizontalLineTo(5.248f)
            curveTo(4.833f, 8.503f, 4.498f, 8.168f, 4.498f, 7.753f)
            lineTo(4.498f, 5.246f)
            close()
            moveTo(4.061f, 17.501f)
            lineTo(6.5f, 15.064f)
            lineTo(8.937f, 17.501f)
            lineTo(6.5f, 19.94f)
            lineTo(4.061f, 17.501f)
            close()
            moveTo(16.255f, 15.5f)
            horizontalLineTo(18.749f)
            curveTo(19.163f, 15.5f, 19.499f, 15.836f, 19.499f, 16.25f)
            verticalLineTo(18.755f)
            curveTo(19.499f, 19.169f, 19.163f, 19.505f, 18.749f, 19.505f)
            horizontalLineTo(16.255f)
            curveTo(15.841f, 19.505f, 15.505f, 19.169f, 15.505f, 18.755f)
            verticalLineTo(16.25f)
            curveTo(15.505f, 15.836f, 15.841f, 15.5f, 16.255f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlowchartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Flowchart, contentDescription = null)
    }
}
