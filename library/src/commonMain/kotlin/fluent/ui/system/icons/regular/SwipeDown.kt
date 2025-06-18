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

public val FluentUi.Regular.SwipeDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SwipeDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 5.997f)
            curveTo(12.38f, 5.997f, 12.693f, 6.279f, 12.743f, 6.644f)
            lineTo(12.75f, 6.746f)
            verticalLineTo(19.44f)
            lineTo(14.97f, 17.224f)
            curveTo(15.236f, 16.958f, 15.653f, 16.934f, 15.946f, 17.151f)
            lineTo(16.03f, 17.224f)
            curveTo(16.297f, 17.49f, 16.321f, 17.906f, 16.103f, 18.199f)
            lineTo(16.03f, 18.284f)
            lineTo(12.53f, 21.781f)
            curveTo(12.264f, 22.047f, 11.847f, 22.071f, 11.554f, 21.853f)
            lineTo(11.47f, 21.781f)
            lineTo(7.97f, 18.284f)
            curveTo(7.677f, 17.991f, 7.677f, 17.516f, 7.97f, 17.224f)
            curveTo(8.236f, 16.958f, 8.653f, 16.934f, 8.946f, 17.151f)
            lineTo(9.03f, 17.224f)
            lineTo(11.25f, 19.44f)
            verticalLineTo(6.746f)
            curveTo(11.25f, 6.332f, 11.586f, 5.997f, 12f, 5.997f)
            close()
            moveTo(12f, 2f)
            curveTo(14.761f, 2f, 17f, 4.237f, 17f, 6.996f)
            curveTo(17f, 9.139f, 15.649f, 10.968f, 13.751f, 11.677f)
            lineTo(13.751f, 10.025f)
            curveTo(14.797f, 9.42f, 15.5f, 8.29f, 15.5f, 6.996f)
            curveTo(15.5f, 5.064f, 13.933f, 3.499f, 12f, 3.499f)
            curveTo(10.067f, 3.499f, 8.5f, 5.064f, 8.5f, 6.996f)
            curveTo(8.5f, 8.29f, 9.204f, 9.421f, 10.25f, 10.025f)
            lineTo(10.25f, 11.677f)
            curveTo(8.352f, 10.968f, 7f, 9.14f, 7f, 6.996f)
            curveTo(7f, 4.237f, 9.239f, 2f, 12f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SwipeDown, contentDescription = null)
    }
}
