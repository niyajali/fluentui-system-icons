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

public val FluentUi.Filled.PanelLeftHeaderAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelLeftHeaderAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(12.81f)
            curveTo(21.556f, 12.383f, 21.051f, 12.019f, 20.5f, 11.732f)
            verticalLineTo(10.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(18.5f)
            horizontalLineTo(11.076f)
            curveTo(11.157f, 19.023f, 11.3f, 19.526f, 11.498f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(20.5f, 7.25f)
            curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(9f)
            horizontalLineTo(20.5f)
            verticalLineTo(7.25f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(18.001f, 18f)
            lineTo(18.001f, 20.503f)
            curveTo(18.001f, 20.78f, 17.777f, 21.003f, 17.501f, 21.003f)
            curveTo(17.225f, 21.003f, 17.001f, 20.78f, 17.001f, 20.503f)
            lineTo(17.001f, 18f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 18f, 13.996f, 17.776f, 13.996f, 17.5f)
            curveTo(13.996f, 17.224f, 14.22f, 17f, 14.496f, 17f)
            horizontalLineTo(17f)
            lineTo(17f, 14.499f)
            curveTo(17f, 14.223f, 17.224f, 13.999f, 17.5f, 13.999f)
            curveTo(17.776f, 13.999f, 18f, 14.223f, 18f, 14.499f)
            lineTo(18f, 17f)
            horizontalLineTo(20.497f)
            curveTo(20.772f, 17f, 20.996f, 17.224f, 20.996f, 17.5f)
            curveTo(20.996f, 17.776f, 20.772f, 18f, 20.497f, 18f)
            horizontalLineTo(18.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PanelLeftHeaderAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PanelLeftHeaderAdd, contentDescription = null)
    }
}
