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

public val FluentUi.Filled.PersonBoardAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBoardAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(14.75f)
            curveTo(3f, 16.545f, 4.455f, 18f, 6.25f, 18f)
            horizontalLineTo(11.019f)
            curveTo(11.006f, 17.835f, 11f, 17.668f, 11f, 17.5f)
            curveTo(11f, 16.793f, 11.113f, 16.111f, 11.322f, 15.474f)
            curveTo(11.063f, 15.491f, 10.789f, 15.5f, 10.5f, 15.5f)
            curveTo(9.18f, 15.5f, 8.055f, 15.243f, 7.26f, 14.739f)
            curveTo(6.841f, 14.474f, 6.53f, 14.216f, 6.322f, 13.91f)
            curveTo(6.117f, 13.609f, 6f, 13.246f, 6f, 12.75f)
            verticalLineTo(12.25f)
            curveTo(6f, 11.422f, 6.672f, 10.75f, 7.5f, 10.75f)
            horizontalLineTo(13.5f)
            curveTo(14.083f, 10.75f, 14.589f, 11.083f, 14.837f, 11.569f)
            curveTo(15.65f, 11.203f, 16.551f, 11f, 17.5f, 11f)
            curveTo(17.668f, 11f, 17.835f, 11.006f, 18f, 11.019f)
            verticalLineTo(6.25f)
            curveTo(18f, 4.455f, 16.545f, 3f, 14.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(6.011f, 19f)
            horizontalLineTo(11.174f)
            curveTo(11.299f, 19.528f, 11.488f, 20.031f, 11.732f, 20.5f)
            horizontalLineTo(8.75f)
            curveTo(7.599f, 20.5f, 6.588f, 19.902f, 6.011f, 19f)
            close()
            moveTo(20.5f, 8.75f)
            verticalLineTo(11.732f)
            curveTo(20.031f, 11.488f, 19.528f, 11.299f, 19f, 11.174f)
            verticalLineTo(6.011f)
            curveTo(19.902f, 6.588f, 20.5f, 7.599f, 20.5f, 8.75f)
            close()
            moveTo(12.75f, 7.5f)
            curveTo(12.75f, 8.743f, 11.743f, 9.75f, 10.5f, 9.75f)
            curveTo(9.257f, 9.75f, 8.25f, 8.743f, 8.25f, 7.5f)
            curveTo(8.25f, 6.257f, 9.257f, 5.25f, 10.5f, 5.25f)
            curveTo(11.743f, 5.25f, 12.75f, 6.257f, 12.75f, 7.5f)
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
private fun PersonBoardAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonBoardAdd, contentDescription = null)
    }
}
