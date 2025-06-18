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

public val FluentUi.Regular.Orientation: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Orientation",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 4f)
            curveTo(6.336f, 4f, 6f, 4.336f, 6f, 4.75f)
            curveTo(6f, 5.164f, 6.336f, 5.5f, 6.75f, 5.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 5.5f, 9f, 5.164f, 9f, 4.75f)
            curveTo(9f, 4.336f, 8.664f, 4f, 8.25f, 4f)
            horizontalLineTo(6.75f)
            close()
            moveTo(3.5f, 8.75f)
            curveTo(3.5f, 8.336f, 3.164f, 8f, 2.75f, 8f)
            curveTo(2.336f, 8f, 2f, 8.336f, 2f, 8.75f)
            verticalLineTo(10.25f)
            curveTo(2f, 10.664f, 2.336f, 11f, 2.75f, 11f)
            curveTo(3.164f, 11f, 3.5f, 10.664f, 3.5f, 10.25f)
            verticalLineTo(8.75f)
            close()
            moveTo(3.9f, 11f)
            curveTo(2.851f, 11f, 2f, 11.851f, 2f, 12.9f)
            verticalLineTo(18.1f)
            curveTo(2f, 19.149f, 2.851f, 20f, 3.9f, 20f)
            horizontalLineTo(14.1f)
            curveTo(15.149f, 20f, 16f, 19.149f, 16f, 18.1f)
            verticalLineTo(12.9f)
            curveTo(16f, 11.851f, 15.149f, 11f, 14.1f, 11f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 11f, 13f, 10.664f, 13f, 10.25f)
            verticalLineTo(8.75f)
            curveTo(13f, 8.336f, 12.664f, 8f, 12.25f, 8f)
            curveTo(11.836f, 8f, 11.5f, 8.336f, 11.5f, 8.75f)
            verticalLineTo(10.25f)
            curveTo(11.5f, 10.664f, 11.836f, 11f, 12.25f, 11f)
            horizontalLineTo(3.9f)
            close()
            moveTo(3.5f, 12.9f)
            curveTo(3.5f, 12.679f, 3.679f, 12.5f, 3.9f, 12.5f)
            horizontalLineTo(14.1f)
            curveTo(14.321f, 12.5f, 14.5f, 12.679f, 14.5f, 12.9f)
            verticalLineTo(18.1f)
            curveTo(14.5f, 18.321f, 14.321f, 18.5f, 14.1f, 18.5f)
            horizontalLineTo(3.9f)
            curveTo(3.679f, 18.5f, 3.5f, 18.321f, 3.5f, 18.1f)
            verticalLineTo(12.9f)
            close()
            moveTo(3.75f, 5.5f)
            curveTo(3.612f, 5.5f, 3.5f, 5.612f, 3.5f, 5.75f)
            verticalLineTo(6.25f)
            curveTo(3.5f, 6.664f, 3.164f, 7f, 2.75f, 7f)
            curveTo(2.336f, 7f, 2f, 6.664f, 2f, 6.25f)
            verticalLineTo(5.75f)
            curveTo(2f, 4.784f, 2.783f, 4f, 3.75f, 4f)
            horizontalLineTo(4.25f)
            curveTo(4.664f, 4f, 5f, 4.336f, 5f, 4.75f)
            curveTo(5f, 5.164f, 4.664f, 5.5f, 4.25f, 5.5f)
            horizontalLineTo(3.75f)
            close()
            moveTo(11.5f, 5.75f)
            curveTo(11.5f, 5.612f, 11.388f, 5.5f, 11.25f, 5.5f)
            horizontalLineTo(10.75f)
            curveTo(10.336f, 5.5f, 10f, 5.164f, 10f, 4.75f)
            curveTo(10f, 4.336f, 10.336f, 4f, 10.75f, 4f)
            horizontalLineTo(11.25f)
            curveTo(12.217f, 4f, 13f, 4.784f, 13f, 5.75f)
            verticalLineTo(6.25f)
            curveTo(13f, 6.664f, 12.664f, 7f, 12.25f, 7f)
            curveTo(11.836f, 7f, 11.5f, 6.664f, 11.5f, 6.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(17f, 16.076f)
            curveTo(17f, 16.56f, 17.419f, 16.945f, 17.888f, 16.823f)
            curveTo(20.253f, 16.208f, 22f, 14.058f, 22f, 11.5f)
            curveTo(22f, 8.809f, 20.068f, 6.57f, 17.515f, 6.093f)
            lineTo(17.819f, 5.738f)
            curveTo(18.089f, 5.424f, 18.053f, 4.95f, 17.738f, 4.681f)
            curveTo(17.424f, 4.411f, 16.95f, 4.447f, 16.681f, 4.762f)
            lineTo(15.181f, 6.512f)
            curveTo(14.94f, 6.793f, 14.94f, 7.207f, 15.181f, 7.488f)
            lineTo(16.681f, 9.238f)
            curveTo(16.95f, 9.553f, 17.424f, 9.589f, 17.738f, 9.319f)
            curveTo(18.053f, 9.05f, 18.089f, 8.576f, 17.819f, 8.262f)
            lineTo(17.222f, 7.565f)
            curveTo(19.087f, 7.905f, 20.5f, 9.537f, 20.5f, 11.5f)
            curveTo(20.5f, 13.33f, 19.271f, 14.873f, 17.594f, 15.349f)
            curveTo(17.261f, 15.443f, 17f, 15.729f, 17f, 16.076f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OrientationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Orientation, contentDescription = null)
    }
}
