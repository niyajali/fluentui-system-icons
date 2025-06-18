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

public val FluentUi.Filled.ZoomIn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ZoomIn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 10f)
            curveTo(17.5f, 11.71f, 16.928f, 13.287f, 15.964f, 14.548f)
            lineTo(20.707f, 19.293f)
            curveTo(21.098f, 19.683f, 21.098f, 20.317f, 20.707f, 20.707f)
            curveTo(20.347f, 21.068f, 19.779f, 21.095f, 19.387f, 20.79f)
            lineTo(19.293f, 20.707f)
            lineTo(14.548f, 15.964f)
            curveTo(13.287f, 16.928f, 11.71f, 17.5f, 10f, 17.5f)
            curveTo(5.858f, 17.5f, 2.5f, 14.142f, 2.5f, 10f)
            curveTo(2.5f, 5.858f, 5.858f, 2.5f, 10f, 2.5f)
            curveTo(14.142f, 2.5f, 17.5f, 5.858f, 17.5f, 10f)
            close()
            moveTo(10f, 5.5f)
            curveTo(9.448f, 5.5f, 9f, 5.948f, 9f, 6.5f)
            verticalLineTo(9f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 9f, 5.5f, 9.448f, 5.5f, 10f)
            curveTo(5.5f, 10.552f, 5.948f, 11f, 6.5f, 11f)
            horizontalLineTo(9f)
            verticalLineTo(13.5f)
            curveTo(9f, 14.052f, 9.448f, 14.5f, 10f, 14.5f)
            curveTo(10.552f, 14.5f, 11f, 14.052f, 11f, 13.5f)
            verticalLineTo(11f)
            horizontalLineTo(13.5f)
            curveTo(14.052f, 11f, 14.5f, 10.552f, 14.5f, 10f)
            curveTo(14.5f, 9.448f, 14.052f, 9f, 13.5f, 9f)
            horizontalLineTo(11f)
            verticalLineTo(6.5f)
            curveTo(11f, 5.948f, 10.552f, 5.5f, 10f, 5.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ZoomInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ZoomIn, contentDescription = null)
    }
}
