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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ArrowHookUpRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookUpRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 18.5f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 18.5f, 17f, 18.836f, 17f, 19.25f)
            curveTo(17f, 19.664f, 16.664f, 20f, 16.25f, 20f)
            horizontalLineTo(10.5f)
            curveTo(6.91f, 20f, 4f, 17.09f, 4f, 13.5f)
            curveTo(4f, 9.91f, 6.91f, 7f, 10.5f, 7f)
            horizontalLineTo(16.45f)
            lineTo(13.834f, 4.383f)
            curveTo(13.541f, 4.09f, 13.541f, 3.615f, 13.834f, 3.323f)
            curveTo(14.126f, 3.03f, 14.601f, 3.03f, 14.894f, 3.323f)
            lineTo(18.777f, 7.205f)
            curveTo(18.876f, 7.305f, 18.942f, 7.425f, 18.974f, 7.553f)
            curveTo(18.991f, 7.616f, 19f, 7.682f, 19f, 7.75f)
            curveTo(19f, 7.963f, 18.911f, 8.155f, 18.769f, 8.292f)
            lineTo(14.889f, 12.172f)
            curveTo(14.596f, 12.465f, 14.121f, 12.465f, 13.828f, 12.172f)
            curveTo(13.535f, 11.879f, 13.535f, 11.404f, 13.828f, 11.111f)
            lineTo(16.439f, 8.5f)
            horizontalLineTo(10.5f)
            curveTo(7.739f, 8.5f, 5.5f, 10.739f, 5.5f, 13.5f)
            curveTo(5.5f, 16.261f, 7.739f, 18.5f, 10.5f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookUpRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowHookUpRight, contentDescription = null)
    }
}
