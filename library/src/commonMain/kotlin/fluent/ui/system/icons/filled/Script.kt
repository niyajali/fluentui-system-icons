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

public val FluentUi.Filled.Script: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Script",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 2.038f)
            verticalLineTo(2f)
            curveTo(19.933f, 2f, 19.866f, 2.002f, 19.799f, 2.007f)
            verticalLineTo(2f)
            horizontalLineTo(7.75f)
            curveTo(5.955f, 2f, 4.5f, 3.455f, 4.5f, 5.25f)
            verticalLineTo(15.5f)
            horizontalLineTo(12.25f)
            curveTo(12.94f, 15.5f, 13.5f, 16.06f, 13.5f, 16.75f)
            verticalLineTo(19.75f)
            curveTo(13.5f, 21.018f, 14.594f, 22f, 16.027f, 22f)
            curveTo(17.319f, 22f, 18.336f, 21.223f, 18.524f, 20.118f)
            curveTo(18.528f, 20.059f, 18.531f, 19.999f, 18.531f, 19.938f)
            lineTo(18.532f, 4.968f)
            lineTo(18.532f, 4.959f)
            lineTo(18.532f, 4.609f)
            curveTo(18.532f, 3.515f, 19.121f, 2.557f, 20f, 2.038f)
            close()
            moveTo(1f, 17.902f)
            curveTo(1f, 17.404f, 1.404f, 17f, 1.902f, 17f)
            horizontalLineTo(12f)
            verticalLineTo(19.85f)
            horizontalLineTo(12.001f)
            curveTo(12.022f, 20.657f, 12.299f, 21.396f, 12.752f, 22f)
            horizontalLineTo(4f)
            curveTo(2.377f, 22f, 1f, 20.765f, 1f, 19.075f)
            verticalLineTo(17.902f)
            close()
            moveTo(23.25f, 4.375f)
            verticalLineTo(7.036f)
            curveTo(23.25f, 7.982f, 22.483f, 8.75f, 21.536f, 8.75f)
            lineTo(20f, 8.75f)
            verticalLineTo(4.375f)
            curveTo(20f, 3.477f, 20.728f, 2.75f, 21.625f, 2.75f)
            curveTo(22.522f, 2.75f, 23.25f, 3.477f, 23.25f, 4.375f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Script, contentDescription = null)
    }
}
