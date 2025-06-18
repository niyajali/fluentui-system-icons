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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.ArrowHookUpRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 18f)
            horizontalLineTo(16f)
            curveTo(16.552f, 18f, 17f, 18.448f, 17f, 19f)
            curveTo(17f, 19.552f, 16.552f, 20f, 16f, 20f)
            horizontalLineTo(10.5f)
            curveTo(6.91f, 20f, 4f, 17.09f, 4f, 13.5f)
            curveTo(4f, 9.91f, 6.91f, 7f, 10.5f, 7f)
            horizontalLineTo(15.64f)
            lineTo(13.707f, 5.067f)
            curveTo(13.317f, 4.677f, 13.317f, 4.043f, 13.707f, 3.653f)
            curveTo(14.098f, 3.262f, 14.731f, 3.262f, 15.121f, 3.653f)
            lineTo(18.65f, 7.182f)
            curveTo(18.742f, 7.273f, 18.812f, 7.378f, 18.861f, 7.49f)
            curveTo(18.949f, 7.64f, 19f, 7.814f, 19f, 8f)
            curveTo(19f, 8.29f, 18.877f, 8.551f, 18.68f, 8.733f)
            curveTo(18.671f, 8.743f, 18.662f, 8.752f, 18.653f, 8.762f)
            lineTo(15.122f, 12.293f)
            curveTo(14.731f, 12.683f, 14.098f, 12.683f, 13.707f, 12.293f)
            curveTo(13.317f, 11.902f, 13.317f, 11.269f, 13.707f, 10.879f)
            lineTo(15.586f, 9f)
            horizontalLineTo(10.5f)
            curveTo(8.015f, 9f, 6f, 11.015f, 6f, 13.5f)
            curveTo(6f, 15.985f, 8.015f, 18f, 10.5f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowHookUpRight, contentDescription = null)
    }
}
