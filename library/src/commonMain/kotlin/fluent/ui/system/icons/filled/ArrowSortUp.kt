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

public val FluentUi.Filled.ArrowSortUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.293f, 8.293f)
            lineTo(11.288f, 4.293f)
            curveTo(11.649f, 3.933f, 12.216f, 3.905f, 12.608f, 4.209f)
            lineTo(12.702f, 4.292f)
            lineTo(16.708f, 8.292f)
            curveTo(17.098f, 8.683f, 17.099f, 9.316f, 16.709f, 9.707f)
            curveTo(16.348f, 10.067f, 15.781f, 10.095f, 15.389f, 9.791f)
            lineTo(15.294f, 9.708f)
            lineTo(13.001f, 7.417f)
            lineTo(13.001f, 19.001f)
            curveTo(13.001f, 19.514f, 12.615f, 19.936f, 12.118f, 19.994f)
            lineTo(12.001f, 20.001f)
            curveTo(11.488f, 20.001f, 11.066f, 19.615f, 11.008f, 19.117f)
            lineTo(11.001f, 19.001f)
            lineTo(11.001f, 7.41f)
            lineTo(8.707f, 9.707f)
            curveTo(8.347f, 10.067f, 7.78f, 10.095f, 7.388f, 9.791f)
            lineTo(7.293f, 9.707f)
            curveTo(6.933f, 9.347f, 6.905f, 8.78f, 7.209f, 8.388f)
            lineTo(7.293f, 8.293f)
            lineTo(11.288f, 4.293f)
            lineTo(7.293f, 8.293f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSortUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowSortUp, contentDescription = null)
    }
}
