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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.TextHeader1LinesCaret: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextHeader1LinesCaret",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 2f)
            curveTo(3.552f, 2f, 4f, 2.448f, 4f, 3f)
            verticalLineTo(5.5f)
            horizontalLineTo(7f)
            verticalLineTo(3.002f)
            curveTo(7f, 2.449f, 7.448f, 2.002f, 8f, 2.002f)
            curveTo(8.552f, 2.002f, 9f, 2.449f, 9f, 3.002f)
            verticalLineTo(9.995f)
            curveTo(9f, 10.547f, 8.552f, 10.995f, 8f, 10.995f)
            curveTo(7.448f, 10.995f, 7f, 10.547f, 7f, 9.995f)
            lineTo(7f, 7.5f)
            lineTo(4f, 7.5f)
            verticalLineTo(10f)
            curveTo(4f, 10.552f, 3.552f, 11f, 3f, 11f)
            curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
            lineTo(2f, 3f)
            curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
            close()
            moveTo(17.557f, 5.462f)
            curveTo(17.673f, 5.182f, 17.947f, 4.999f, 18.25f, 4.999f)
            horizontalLineTo(21.252f)
            curveTo(21.555f, 4.999f, 21.829f, 5.182f, 21.945f, 5.462f)
            curveTo(22.061f, 5.742f, 21.997f, 6.065f, 21.782f, 6.28f)
            lineTo(20.282f, 7.78f)
            curveTo(19.989f, 8.073f, 19.514f, 8.073f, 19.22f, 7.78f)
            lineTo(17.72f, 6.28f)
            curveTo(17.505f, 6.065f, 17.441f, 5.742f, 17.557f, 5.462f)
            close()
            moveTo(3f, 19f)
            curveTo(2.448f, 19f, 2f, 19.448f, 2f, 20f)
            curveTo(2f, 20.552f, 2.448f, 21f, 3f, 21f)
            horizontalLineTo(21f)
            curveTo(21.552f, 21f, 22f, 20.552f, 22f, 20f)
            curveTo(22f, 19.448f, 21.552f, 19f, 21f, 19f)
            horizontalLineTo(3f)
            close()
            moveTo(2f, 15f)
            curveTo(2f, 14.448f, 2.448f, 14f, 3f, 14f)
            horizontalLineTo(21f)
            curveTo(21.552f, 14f, 22f, 14.448f, 22f, 15f)
            curveTo(22f, 15.552f, 21.552f, 16f, 21f, 16f)
            horizontalLineTo(3f)
            curveTo(2.448f, 16f, 2f, 15.552f, 2f, 15f)
            close()
            moveTo(13f, 10f)
            curveTo(13f, 10.55f, 13.45f, 11f, 14f, 11f)
            curveTo(14.55f, 11f, 15f, 10.55f, 15f, 10f)
            verticalLineTo(3f)
            curveTo(15f, 2.54f, 14.68f, 2.14f, 14.23f, 2.03f)
            curveTo(13.78f, 1.92f, 13.31f, 2.14f, 13.11f, 2.54f)
            curveTo(12.61f, 3.54f, 11.58f, 4.09f, 11.55f, 4.1f)
            curveTo(11.06f, 4.35f, 10.86f, 4.95f, 11.11f, 5.44f)
            curveTo(11.35f, 5.94f, 11.96f, 6.14f, 12.45f, 5.89f)
            curveTo(12.46f, 5.884f, 12.479f, 5.874f, 12.504f, 5.86f)
            curveTo(12.596f, 5.81f, 12.779f, 5.71f, 13f, 5.56f)
            verticalLineTo(10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextHeader1LinesCaretPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextHeader1LinesCaret, contentDescription = null)
    }
}
