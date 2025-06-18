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
package fluent.ui.system.icons.regular

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

public val FluentUi.Regular.ArrowSortDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.649f, 4.007f)
            lineTo(11.751f, 4f)
            curveTo(12.131f, 4f, 12.444f, 4.282f, 12.494f, 4.648f)
            lineTo(12.501f, 4.75f)
            lineTo(12.5f, 17.446f)
            lineTo(15.719f, 14.225f)
            curveTo(15.986f, 13.958f, 16.402f, 13.934f, 16.696f, 14.152f)
            lineTo(16.78f, 14.224f)
            curveTo(17.046f, 14.491f, 17.071f, 14.907f, 16.853f, 15.201f)
            lineTo(16.781f, 15.285f)
            lineTo(12.284f, 19.785f)
            curveTo(12.018f, 20.051f, 11.601f, 20.076f, 11.308f, 19.858f)
            lineTo(11.224f, 19.785f)
            lineTo(6.72f, 15.285f)
            curveTo(6.427f, 14.993f, 6.427f, 14.518f, 6.719f, 14.225f)
            curveTo(6.986f, 13.958f, 7.402f, 13.934f, 7.696f, 14.152f)
            lineTo(7.78f, 14.224f)
            lineTo(11f, 17.442f)
            lineTo(11.001f, 4.75f)
            curveTo(11.001f, 4.37f, 11.283f, 4.057f, 11.649f, 4.007f)
            lineTo(11.751f, 4f)
            lineTo(11.649f, 4.007f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSortDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowSortDown, contentDescription = null)
    }
}
