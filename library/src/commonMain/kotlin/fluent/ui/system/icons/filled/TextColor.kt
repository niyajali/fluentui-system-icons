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

public val FluentUi.Filled.TextColor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.75f, 14.5f)
            curveTo(18.993f, 14.5f, 20f, 15.508f, 20f, 16.75f)
            verticalLineTo(19.75f)
            curveTo(20f, 20.993f, 18.993f, 22f, 17.75f, 22f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 22f, 3f, 20.993f, 3f, 19.75f)
            verticalLineTo(16.75f)
            curveTo(3f, 15.508f, 4.007f, 14.5f, 5.25f, 14.5f)
            horizontalLineTo(17.75f)
            close()
            moveTo(7.053f, 11.969f)
            lineTo(10.806f, 2.474f)
            curveTo(11.042f, 1.879f, 11.849f, 1.844f, 12.151f, 2.37f)
            lineTo(12.201f, 2.475f)
            lineTo(15.948f, 11.975f)
            curveTo(16.1f, 12.361f, 15.91f, 12.796f, 15.525f, 12.948f)
            curveTo(15.172f, 13.087f, 14.776f, 12.94f, 14.596f, 12.618f)
            lineTo(14.552f, 12.526f)
            lineTo(13.556f, 10f)
            horizontalLineTo(9.443f)
            lineTo(8.447f, 12.521f)
            curveTo(8.308f, 12.874f, 7.93f, 13.062f, 7.571f, 12.974f)
            lineTo(7.474f, 12.943f)
            curveTo(7.121f, 12.803f, 6.933f, 12.425f, 7.021f, 12.067f)
            lineTo(7.053f, 11.969f)
            lineTo(10.806f, 2.474f)
            lineTo(7.053f, 11.969f)
            close()
            moveTo(11.503f, 4.792f)
            lineTo(10.036f, 8.5f)
            horizontalLineTo(12.964f)
            lineTo(11.503f, 4.792f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColor, contentDescription = null)
    }
}
