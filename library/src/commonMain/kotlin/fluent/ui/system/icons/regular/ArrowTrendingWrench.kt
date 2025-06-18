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

public val FluentUi.Regular.ArrowTrendingWrench: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTrendingWrench",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            lineTo(15.25f, 3f)
            curveTo(14.836f, 3f, 14.5f, 3.336f, 14.5f, 3.75f)
            curveTo(14.5f, 4.164f, 14.836f, 4.5f, 15.25f, 4.5f)
            lineTo(18.439f, 4.5f)
            lineTo(13f, 9.939f)
            lineTo(10.78f, 7.72f)
            curveTo(10.487f, 7.427f, 10.013f, 7.427f, 9.72f, 7.72f)
            lineTo(3.22f, 14.22f)
            curveTo(2.927f, 14.513f, 2.927f, 14.987f, 3.22f, 15.28f)
            curveTo(3.513f, 15.573f, 3.987f, 15.573f, 4.28f, 15.28f)
            lineTo(10.25f, 9.311f)
            lineTo(12.47f, 11.53f)
            curveTo(12.763f, 11.823f, 13.237f, 11.823f, 13.53f, 11.53f)
            lineTo(19.5f, 5.561f)
            lineTo(19.5f, 8.75f)
            curveTo(19.5f, 9.164f, 19.836f, 9.5f, 20.25f, 9.5f)
            curveTo(20.664f, 9.5f, 21f, 9.164f, 21f, 8.75f)
            lineTo(21f, 3.75f)
            close()
            moveTo(20.48f, 11.833f)
            curveTo(20.731f, 11.582f, 20.645f, 11.16f, 20.299f, 11.084f)
            curveTo(19.012f, 10.804f, 17.614f, 11.163f, 16.614f, 12.164f)
            curveTo(15.427f, 13.351f, 15.142f, 15.098f, 15.759f, 16.555f)
            lineTo(12.018f, 20.296f)
            curveTo(11.432f, 20.882f, 11.432f, 21.831f, 12.018f, 22.417f)
            curveTo(12.604f, 23.003f, 13.553f, 23.003f, 14.139f, 22.417f)
            lineTo(17.881f, 18.676f)
            curveTo(19.337f, 19.292f, 21.084f, 19.007f, 22.271f, 17.82f)
            curveTo(23.271f, 16.82f, 23.631f, 15.422f, 23.35f, 14.136f)
            curveTo(23.275f, 13.789f, 22.852f, 13.704f, 22.601f, 13.954f)
            lineTo(20.857f, 15.699f)
            curveTo(20.271f, 16.285f, 19.321f, 16.285f, 18.735f, 15.699f)
            curveTo(18.149f, 15.113f, 18.149f, 14.164f, 18.735f, 13.578f)
            lineTo(20.48f, 11.833f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowTrendingWrenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowTrendingWrench, contentDescription = null)
    }
}
