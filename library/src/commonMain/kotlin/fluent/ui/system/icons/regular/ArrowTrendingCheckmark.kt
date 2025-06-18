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

public val FluentUi.Regular.ArrowTrendingCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTrendingCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.25f, 3f)
            curveTo(20.664f, 3f, 21f, 3.336f, 21f, 3.75f)
            lineTo(21f, 8.75f)
            curveTo(21f, 9.164f, 20.664f, 9.5f, 20.25f, 9.5f)
            curveTo(19.836f, 9.5f, 19.5f, 9.164f, 19.5f, 8.75f)
            lineTo(19.5f, 5.561f)
            lineTo(13.53f, 11.53f)
            curveTo(13.237f, 11.823f, 12.763f, 11.823f, 12.47f, 11.53f)
            lineTo(10.25f, 9.311f)
            lineTo(4.28f, 15.28f)
            curveTo(3.987f, 15.573f, 3.513f, 15.573f, 3.22f, 15.28f)
            curveTo(2.927f, 14.987f, 2.927f, 14.513f, 3.22f, 14.22f)
            lineTo(9.72f, 7.72f)
            curveTo(10.013f, 7.427f, 10.487f, 7.427f, 10.78f, 7.72f)
            lineTo(13f, 9.939f)
            lineTo(18.439f, 4.5f)
            lineTo(15.25f, 4.5f)
            curveTo(14.836f, 4.5f, 14.5f, 4.164f, 14.5f, 3.75f)
            curveTo(14.5f, 3.336f, 14.836f, 3f, 15.25f, 3f)
            lineTo(20.25f, 3f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(20.854f, 15.146f)
            curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
            lineTo(16.5f, 18.793f)
            lineTo(14.854f, 17.146f)
            curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            lineTo(20.854f, 15.854f)
            curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTrendingCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowTrendingCheckmark, contentDescription = null)
    }
}
