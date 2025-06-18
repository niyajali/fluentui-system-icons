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

public val FluentUi.Filled.ArrowTrendingText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTrendingText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 4f)
            curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
            lineTo(15f, 3f)
            curveTo(14.448f, 3f, 14f, 3.448f, 14f, 4f)
            curveTo(14f, 4.552f, 14.448f, 5f, 15f, 5f)
            lineTo(17.586f, 5f)
            lineTo(12.5f, 10.086f)
            lineTo(10.707f, 8.293f)
            curveTo(10.52f, 8.105f, 10.265f, 8f, 10f, 8f)
            curveTo(9.735f, 8f, 9.48f, 8.105f, 9.293f, 8.293f)
            lineTo(3.293f, 14.293f)
            curveTo(2.902f, 14.683f, 2.902f, 15.317f, 3.293f, 15.707f)
            curveTo(3.683f, 16.098f, 4.317f, 16.098f, 4.707f, 15.707f)
            lineTo(10f, 10.414f)
            lineTo(11.793f, 12.207f)
            curveTo(11.946f, 12.361f, 12.144f, 12.459f, 12.357f, 12.49f)
            curveTo(12.653f, 12.295f, 12.985f, 12.152f, 13.342f, 12.072f)
            lineTo(19f, 6.414f)
            lineTo(19f, 9f)
            curveTo(19f, 9.552f, 19.448f, 10f, 20f, 10f)
            curveTo(20.552f, 10f, 21f, 9.552f, 21f, 9f)
            lineTo(21f, 4f)
            close()
            moveTo(14f, 13f)
            curveTo(12.895f, 13f, 12f, 13.895f, 12f, 15f)
            verticalLineTo(21f)
            curveTo(12f, 22.105f, 12.895f, 23f, 14f, 23f)
            horizontalLineTo(21f)
            curveTo(22.105f, 23f, 23f, 22.105f, 23f, 21f)
            verticalLineTo(15f)
            curveTo(23f, 13.895f, 22.105f, 13f, 21f, 13f)
            horizontalLineTo(14f)
            close()
            moveTo(14f, 16.5f)
            curveTo(14f, 16.224f, 14.224f, 16f, 14.5f, 16f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 16f, 21f, 16.224f, 21f, 16.5f)
            curveTo(21f, 16.776f, 20.776f, 17f, 20.5f, 17f)
            horizontalLineTo(14.5f)
            curveTo(14.224f, 17f, 14f, 16.776f, 14f, 16.5f)
            close()
            moveTo(14f, 19.5f)
            curveTo(14f, 19.224f, 14.224f, 19f, 14.5f, 19f)
            horizontalLineTo(20.5f)
            curveTo(20.776f, 19f, 21f, 19.224f, 21f, 19.5f)
            curveTo(21f, 19.776f, 20.776f, 20f, 20.5f, 20f)
            horizontalLineTo(14.5f)
            curveTo(14.224f, 20f, 14f, 19.776f, 14f, 19.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTrendingTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowTrendingText, contentDescription = null)
    }
}
