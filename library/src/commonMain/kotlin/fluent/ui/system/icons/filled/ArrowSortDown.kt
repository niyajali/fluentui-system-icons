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

public val FluentUi.Filled.ArrowSortDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.883f, 4.011f)
            lineTo(12f, 4.004f)
            curveTo(12.513f, 4.004f, 12.936f, 4.39f, 12.993f, 4.887f)
            lineTo(13f, 5.004f)
            lineTo(13f, 16.588f)
            lineTo(15.293f, 14.294f)
            curveTo(15.653f, 13.933f, 16.22f, 13.905f, 16.612f, 14.21f)
            lineTo(16.707f, 14.293f)
            curveTo(17.067f, 14.654f, 17.095f, 15.221f, 16.791f, 15.613f)
            lineTo(16.707f, 15.708f)
            lineTo(12.711f, 19.708f)
            curveTo(12.351f, 20.068f, 11.784f, 20.096f, 11.391f, 19.791f)
            lineTo(11.297f, 19.708f)
            lineTo(7.293f, 15.708f)
            curveTo(6.903f, 15.318f, 6.902f, 14.685f, 7.293f, 14.294f)
            curveTo(7.653f, 13.933f, 8.22f, 13.905f, 8.613f, 14.21f)
            lineTo(8.707f, 14.293f)
            lineTo(11f, 16.584f)
            lineTo(11f, 5.004f)
            curveTo(11f, 4.491f, 11.386f, 4.068f, 11.883f, 4.011f)
            lineTo(12f, 4.004f)
            lineTo(11.883f, 4.011f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSortDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowSortDown, contentDescription = null)
    }
}
