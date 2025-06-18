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

public val FluentUi.Regular.MusicNote2: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MusicNote2",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.698f, 2.148f)
            curveTo(19.888f, 2.29f, 20f, 2.513f, 20f, 2.75f)
            verticalLineTo(16.25f)
            curveTo(20f, 16.277f, 19.999f, 16.303f, 19.996f, 16.329f)
            curveTo(19.999f, 16.386f, 20f, 16.443f, 20f, 16.5f)
            curveTo(20f, 18.433f, 18.433f, 20f, 16.5f, 20f)
            curveTo(14.567f, 20f, 13f, 18.433f, 13f, 16.5f)
            curveTo(13f, 14.567f, 14.567f, 13f, 16.5f, 13f)
            curveTo(17.244f, 13f, 17.933f, 13.232f, 18.5f, 13.627f)
            verticalLineTo(7.758f)
            lineTo(10f, 10.308f)
            verticalLineTo(18.25f)
            curveTo(10f, 18.277f, 9.999f, 18.303f, 9.996f, 18.329f)
            curveTo(9.999f, 18.386f, 10f, 18.443f, 10f, 18.5f)
            curveTo(10f, 20.433f, 8.433f, 22f, 6.5f, 22f)
            curveTo(4.567f, 22f, 3f, 20.433f, 3f, 18.5f)
            curveTo(3f, 16.567f, 4.567f, 15f, 6.5f, 15f)
            curveTo(7.244f, 15f, 7.933f, 15.232f, 8.5f, 15.627f)
            verticalLineTo(5.75f)
            curveTo(8.5f, 5.419f, 8.717f, 5.127f, 9.034f, 5.032f)
            lineTo(19.035f, 2.032f)
            curveTo(19.262f, 1.964f, 19.507f, 2.007f, 19.698f, 2.148f)
            close()
            moveTo(10f, 8.742f)
            lineTo(18.5f, 6.192f)
            verticalLineTo(3.758f)
            lineTo(10f, 6.308f)
            verticalLineTo(8.742f)
            close()
            moveTo(6.5f, 16.5f)
            curveTo(5.395f, 16.5f, 4.5f, 17.395f, 4.5f, 18.5f)
            curveTo(4.5f, 19.605f, 5.395f, 20.5f, 6.5f, 20.5f)
            curveTo(7.605f, 20.5f, 8.5f, 19.605f, 8.5f, 18.5f)
            curveTo(8.5f, 17.395f, 7.605f, 16.5f, 6.5f, 16.5f)
            close()
            moveTo(14.5f, 16.5f)
            curveTo(14.5f, 17.605f, 15.395f, 18.5f, 16.5f, 18.5f)
            curveTo(17.605f, 18.5f, 18.5f, 17.605f, 18.5f, 16.5f)
            curveTo(18.5f, 15.395f, 17.605f, 14.5f, 16.5f, 14.5f)
            curveTo(15.395f, 14.5f, 14.5f, 15.395f, 14.5f, 16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MusicNote2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MusicNote2, contentDescription = null)
    }
}
