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

public val FluentUi.Filled.ShareScreenStop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenStop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.25f, 4f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(22f, 18.993f, 20.993f, 20f, 19.75f, 20f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            close()
            moveTo(9.28f, 8.215f)
            curveTo(8.987f, 7.922f, 8.513f, 7.922f, 8.22f, 8.215f)
            curveTo(7.927f, 8.508f, 7.927f, 8.983f, 8.22f, 9.276f)
            lineTo(10.94f, 11.996f)
            lineTo(8.219f, 14.72f)
            curveTo(7.927f, 15.013f, 7.927f, 15.488f, 8.22f, 15.781f)
            curveTo(8.513f, 16.073f, 8.988f, 16.073f, 9.281f, 15.78f)
            lineTo(12f, 13.057f)
            lineTo(14.724f, 15.78f)
            curveTo(15.017f, 16.073f, 15.492f, 16.073f, 15.785f, 15.78f)
            curveTo(16.078f, 15.487f, 16.078f, 15.013f, 15.785f, 14.72f)
            lineTo(13.061f, 11.996f)
            lineTo(15.784f, 9.281f)
            curveTo(16.077f, 8.989f, 16.078f, 8.514f, 15.786f, 8.22f)
            curveTo(15.493f, 7.927f, 15.018f, 7.926f, 14.725f, 8.219f)
            lineTo(12.001f, 10.936f)
            lineTo(9.28f, 8.215f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareScreenStopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShareScreenStop, contentDescription = null)
    }
}
