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

public val FluentUi.Regular.Question: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Question",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4f)
            curveTo(9.236f, 4f, 7f, 6.236f, 7f, 9f)
            curveTo(7f, 9.414f, 7.336f, 9.75f, 7.75f, 9.75f)
            curveTo(8.164f, 9.75f, 8.5f, 9.414f, 8.5f, 9f)
            curveTo(8.5f, 7.064f, 10.064f, 5.5f, 12f, 5.5f)
            curveTo(13.936f, 5.5f, 15.5f, 7.064f, 15.5f, 9f)
            curveTo(15.5f, 9.852f, 15.278f, 10.42f, 14.971f, 10.859f)
            curveTo(14.647f, 11.323f, 14.204f, 11.683f, 13.669f, 12.092f)
            curveTo(13.624f, 12.126f, 13.578f, 12.161f, 13.531f, 12.197f)
            curveTo(12.521f, 12.965f, 11.25f, 13.931f, 11.25f, 16f)
            verticalLineTo(16.25f)
            curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
            curveTo(12.414f, 17f, 12.75f, 16.664f, 12.75f, 16.25f)
            verticalLineTo(16f)
            curveTo(12.75f, 14.683f, 13.464f, 14.137f, 14.535f, 13.318f)
            lineTo(14.581f, 13.283f)
            curveTo(15.108f, 12.88f, 15.728f, 12.396f, 16.201f, 11.719f)
            curveTo(16.69f, 11.018f, 17f, 10.148f, 17f, 9f)
            curveTo(17f, 6.236f, 14.764f, 4f, 12f, 4f)
            close()
            moveTo(12f, 21f)
            curveTo(12.552f, 21f, 13f, 20.552f, 13f, 20f)
            curveTo(13f, 19.448f, 12.552f, 19f, 12f, 19f)
            curveTo(11.448f, 19f, 11f, 19.448f, 11f, 20f)
            curveTo(11f, 20.552f, 11.448f, 21f, 12f, 21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun QuestionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Question, contentDescription = null)
    }
}
