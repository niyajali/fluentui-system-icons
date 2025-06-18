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

public val FluentUi.Regular.ArrowForward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowForward",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.72f, 6.28f)
            curveTo(14.427f, 5.987f, 14.427f, 5.513f, 14.72f, 5.22f)
            curveTo(15.013f, 4.927f, 15.487f, 4.927f, 15.78f, 5.22f)
            lineTo(20.78f, 10.22f)
            curveTo(21.073f, 10.513f, 21.073f, 10.987f, 20.78f, 11.28f)
            lineTo(15.78f, 16.28f)
            curveTo(15.487f, 16.573f, 15.013f, 16.573f, 14.72f, 16.28f)
            curveTo(14.427f, 15.987f, 14.427f, 15.513f, 14.72f, 15.22f)
            lineTo(18.439f, 11.5f)
            horizontalLineTo(10.75f)
            curveTo(7.298f, 11.5f, 4.5f, 14.298f, 4.5f, 17.75f)
            verticalLineTo(18.25f)
            curveTo(4.5f, 18.664f, 4.164f, 19f, 3.75f, 19f)
            curveTo(3.336f, 19f, 3f, 18.664f, 3f, 18.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 13.47f, 6.47f, 10f, 10.75f, 10f)
            horizontalLineTo(18.439f)
            lineTo(14.72f, 6.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowForward, contentDescription = null)
    }
}
