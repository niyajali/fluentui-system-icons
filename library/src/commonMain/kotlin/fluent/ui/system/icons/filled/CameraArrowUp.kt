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

public val FluentUi.Filled.CameraArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CameraArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.925f, 2.503f)
            curveTo(14.722f, 2.503f, 15.461f, 2.925f, 15.865f, 3.613f)
            lineTo(16.679f, 5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineTo(12.81f)
            curveTo(20.832f, 11.689f, 19.247f, 11f, 17.5f, 11f)
            curveTo(17.084f, 11f, 16.677f, 11.039f, 16.282f, 11.114f)
            curveTo(15.698f, 9.307f, 14.002f, 8f, 12f, 8f)
            curveTo(9.515f, 8f, 7.5f, 10.015f, 7.5f, 12.5f)
            curveTo(7.5f, 14.651f, 9.01f, 16.45f, 11.028f, 16.895f)
            curveTo(11.009f, 17.094f, 11f, 17.296f, 11f, 17.5f)
            curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(8.25f)
            curveTo(2f, 6.455f, 3.455f, 5f, 5.25f, 5f)
            horizontalLineTo(7.33f)
            lineTo(8.205f, 3.576f)
            curveTo(8.614f, 2.909f, 9.34f, 2.503f, 10.122f, 2.503f)
            horizontalLineTo(13.925f)
            close()
            moveTo(12f, 9.5f)
            curveTo(13.33f, 9.5f, 14.457f, 10.365f, 14.851f, 11.563f)
            curveTo(13.203f, 12.299f, 11.918f, 13.701f, 11.338f, 15.427f)
            curveTo(10f, 15.125f, 9f, 13.929f, 9f, 12.5f)
            curveTo(9f, 10.843f, 10.343f, 9.5f, 12f, 9.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(17f, 20.5f)
            curveTo(17f, 20.776f, 17.224f, 21f, 17.5f, 21f)
            curveTo(17.776f, 21f, 18f, 20.776f, 18f, 20.5f)
            verticalLineTo(15.707f)
            lineTo(19.646f, 17.354f)
            curveTo(19.842f, 17.549f, 20.158f, 17.549f, 20.354f, 17.354f)
            curveTo(20.549f, 17.158f, 20.549f, 16.842f, 20.354f, 16.646f)
            lineTo(17.854f, 14.146f)
            curveTo(17.658f, 13.951f, 17.342f, 13.951f, 17.146f, 14.146f)
            lineTo(14.646f, 16.646f)
            curveTo(14.451f, 16.842f, 14.451f, 17.158f, 14.646f, 17.354f)
            curveTo(14.842f, 17.549f, 15.158f, 17.549f, 15.354f, 17.354f)
            lineTo(17f, 15.707f)
            verticalLineTo(20.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CameraArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CameraArrowUp, contentDescription = null)
    }
}
