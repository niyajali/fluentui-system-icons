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

public val FluentUi.Regular.Bug: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bug",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 2.752f)
            curveTo(10.5f, 2.338f, 10.164f, 2.002f, 9.75f, 2.002f)
            curveTo(9.336f, 2.002f, 9f, 2.338f, 9f, 2.752f)
            verticalLineTo(3.504f)
            curveTo(9f, 4.137f, 9.196f, 4.723f, 9.53f, 5.207f)
            curveTo(8.137f, 5.686f, 7.115f, 6.962f, 7.009f, 8.491f)
            horizontalLineTo(6.762f)
            lineTo(6.753f, 8.491f)
            curveTo(5.511f, 8.486f, 4.507f, 7.474f, 4.512f, 6.232f)
            lineTo(4.519f, 4.746f)
            curveTo(4.52f, 4.332f, 4.186f, 3.995f, 3.772f, 3.993f)
            curveTo(3.358f, 3.991f, 3.02f, 4.326f, 3.019f, 4.74f)
            lineTo(3.012f, 6.225f)
            curveTo(3.004f, 8.296f, 4.676f, 9.982f, 6.747f, 9.991f)
            lineTo(6.762f, 9.991f)
            horizontalLineTo(7f)
            verticalLineTo(11.501f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11.501f, 2f, 11.836f, 2f, 12.251f)
            curveTo(2f, 12.665f, 2.336f, 13.001f, 2.75f, 13.001f)
            horizontalLineTo(7f)
            verticalLineTo(14.993f)
            horizontalLineTo(6.762f)
            lineTo(6.747f, 14.993f)
            curveTo(4.676f, 15.002f, 3.004f, 16.687f, 3.012f, 18.758f)
            lineTo(3.019f, 20.244f)
            curveTo(3.02f, 20.658f, 3.358f, 20.993f, 3.772f, 20.991f)
            curveTo(4.186f, 20.989f, 4.52f, 20.652f, 4.519f, 20.238f)
            lineTo(4.512f, 18.752f)
            curveTo(4.507f, 17.51f, 5.511f, 16.498f, 6.753f, 16.493f)
            lineTo(6.762f, 16.493f)
            horizontalLineTo(7.226f)
            curveTo(7.861f, 18.526f, 9.758f, 20.001f, 12f, 20.001f)
            curveTo(14.242f, 20.001f, 16.139f, 18.526f, 16.774f, 16.493f)
            horizontalLineTo(17.237f)
            lineTo(17.247f, 16.493f)
            curveTo(18.49f, 16.498f, 19.493f, 17.51f, 19.487f, 18.752f)
            lineTo(19.481f, 20.238f)
            curveTo(19.48f, 20.652f, 19.814f, 20.989f, 20.228f, 20.991f)
            curveTo(20.642f, 20.993f, 20.98f, 20.658f, 20.981f, 20.244f)
            lineTo(20.987f, 18.758f)
            curveTo(20.996f, 16.687f, 19.324f, 15.002f, 17.253f, 14.993f)
            lineTo(17.237f, 14.993f)
            horizontalLineTo(17f)
            verticalLineTo(13.001f)
            horizontalLineTo(21.251f)
            curveTo(21.666f, 13.001f, 22.001f, 12.665f, 22.001f, 12.251f)
            curveTo(22.001f, 11.836f, 21.666f, 11.501f, 21.251f, 11.501f)
            horizontalLineTo(17f)
            verticalLineTo(9.991f)
            horizontalLineTo(17.237f)
            lineTo(17.253f, 9.991f)
            curveTo(19.324f, 9.982f, 20.996f, 8.296f, 20.987f, 6.225f)
            lineTo(20.981f, 4.74f)
            curveTo(20.98f, 4.326f, 20.642f, 3.991f, 20.228f, 3.993f)
            curveTo(19.814f, 3.995f, 19.48f, 4.332f, 19.481f, 4.746f)
            lineTo(19.487f, 6.232f)
            curveTo(19.493f, 7.474f, 18.49f, 8.486f, 17.247f, 8.491f)
            lineTo(17.237f, 8.491f)
            horizontalLineTo(16.991f)
            curveTo(16.885f, 6.962f, 15.863f, 5.686f, 14.47f, 5.207f)
            curveTo(14.804f, 4.723f, 15f, 4.137f, 15f, 3.504f)
            verticalLineTo(2.752f)
            curveTo(15f, 2.338f, 14.664f, 2.002f, 14.25f, 2.002f)
            curveTo(13.836f, 2.002f, 13.5f, 2.338f, 13.5f, 2.752f)
            verticalLineTo(3.504f)
            curveTo(13.5f, 4.332f, 12.828f, 5.004f, 12f, 5.004f)
            curveTo(11.172f, 5.004f, 10.5f, 4.332f, 10.5f, 3.504f)
            verticalLineTo(2.752f)
            close()
            moveTo(8.5f, 8.754f)
            curveTo(8.5f, 7.511f, 9.507f, 6.504f, 10.75f, 6.504f)
            horizontalLineTo(13.25f)
            curveTo(14.493f, 6.504f, 15.5f, 7.511f, 15.5f, 8.754f)
            verticalLineTo(15.001f)
            curveTo(15.5f, 16.934f, 13.933f, 18.501f, 12f, 18.501f)
            curveTo(10.067f, 18.501f, 8.5f, 16.934f, 8.5f, 15.001f)
            verticalLineTo(8.754f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BugPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Bug, contentDescription = null)
    }
}
