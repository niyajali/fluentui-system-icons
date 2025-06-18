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

public val FluentUi.Filled.ShapeIntersect: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShapeIntersect",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineTo(13.25f)
            curveTo(15.045f, 2f, 16.5f, 3.455f, 16.5f, 5.25f)
            verticalLineTo(7.5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 7.5f, 22f, 8.955f, 22f, 10.75f)
            verticalLineTo(18.75f)
            curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
            horizontalLineTo(10.75f)
            curveTo(8.955f, 22f, 7.5f, 20.545f, 7.5f, 18.75f)
            verticalLineTo(16.5f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 16.5f, 2f, 15.045f, 2f, 13.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(15f, 5.25f)
            curveTo(15f, 4.284f, 14.217f, 3.5f, 13.25f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineTo(13.25f)
            curveTo(3.5f, 14.217f, 4.284f, 15f, 5.25f, 15f)
            horizontalLineTo(7.5f)
            verticalLineTo(10.75f)
            curveTo(7.5f, 10.113f, 7.683f, 9.519f, 8f, 9.017f)
            curveTo(8.241f, 8.635f, 8.559f, 8.307f, 8.933f, 8.055f)
            curveTo(8.961f, 8.036f, 8.989f, 8.018f, 9.017f, 8f)
            curveTo(9.519f, 7.683f, 10.113f, 7.5f, 10.75f, 7.5f)
            horizontalLineTo(15f)
            verticalLineTo(5.25f)
            close()
            moveTo(16f, 14.983f)
            curveTo(15.982f, 15.011f, 15.964f, 15.039f, 15.945f, 15.067f)
            curveTo(15.693f, 15.441f, 15.365f, 15.759f, 14.983f, 16f)
            curveTo(14.481f, 16.317f, 13.887f, 16.5f, 13.25f, 16.5f)
            horizontalLineTo(9f)
            verticalLineTo(18.75f)
            curveTo(9f, 19.716f, 9.783f, 20.5f, 10.75f, 20.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
            verticalLineTo(10.75f)
            curveTo(20.5f, 9.783f, 19.716f, 9f, 18.75f, 9f)
            horizontalLineTo(16.5f)
            verticalLineTo(13.25f)
            curveTo(16.5f, 13.887f, 16.317f, 14.481f, 16f, 14.983f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShapeIntersectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShapeIntersect, contentDescription = null)
    }
}
