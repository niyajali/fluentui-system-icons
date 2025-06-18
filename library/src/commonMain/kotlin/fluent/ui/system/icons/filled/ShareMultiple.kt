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

public val FluentUi.Filled.ShareMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.97f, 13.95f)
            curveTo(9.06f, 13.98f, 9.16f, 14f, 9.25f, 14f)
            curveTo(9.45f, 14f, 9.65f, 13.92f, 9.79f, 13.77f)
            lineTo(9.792f, 13.768f)
            curveTo(9.861f, 13.697f, 12.157f, 11.356f, 15.49f, 11.04f)
            verticalLineTo(13.25f)
            curveTo(15.49f, 13.55f, 15.66f, 13.82f, 15.94f, 13.94f)
            curveTo(16.21f, 14.05f, 16.53f, 14f, 16.75f, 13.79f)
            lineTo(21.75f, 9.04f)
            curveTo(21.9f, 8.9f, 21.98f, 8.7f, 21.98f, 8.5f)
            curveTo(21.98f, 8.3f, 21.9f, 8.1f, 21.75f, 7.96f)
            lineTo(16.75f, 3.21f)
            curveTo(16.53f, 3f, 16.21f, 2.94f, 15.94f, 3.06f)
            curveTo(15.67f, 3.18f, 15.49f, 3.45f, 15.49f, 3.75f)
            verticalLineTo(6.03f)
            curveTo(13.47f, 6.16f, 11.83f, 6.84f, 10.62f, 8.06f)
            curveTo(8.51f, 10.17f, 8.5f, 13.13f, 8.5f, 13.25f)
            curveTo(8.5f, 13.56f, 8.69f, 13.83f, 8.97f, 13.95f)
            close()
            moveTo(12f, 4.75f)
            curveTo(12f, 4.336f, 11.664f, 4f, 11.25f, 4f)
            horizontalLineTo(8.75f)
            curveTo(6.955f, 4f, 5.5f, 5.455f, 5.5f, 7.25f)
            verticalLineTo(15.25f)
            curveTo(5.5f, 17.045f, 6.955f, 18.5f, 8.75f, 18.5f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 18.5f, 20f, 17.045f, 20f, 15.25f)
            verticalLineTo(14.75f)
            curveTo(20f, 14.336f, 19.664f, 14f, 19.25f, 14f)
            curveTo(18.836f, 14f, 18.5f, 14.336f, 18.5f, 14.75f)
            verticalLineTo(15.25f)
            curveTo(18.5f, 16.216f, 17.716f, 17f, 16.75f, 17f)
            horizontalLineTo(8.75f)
            curveTo(7.784f, 17f, 7f, 16.216f, 7f, 15.25f)
            verticalLineTo(7.25f)
            curveTo(7f, 6.284f, 7.784f, 5.5f, 8.75f, 5.5f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 5.5f, 12f, 5.164f, 12f, 4.75f)
            close()
            moveTo(4.5f, 7.25f)
            curveTo(4.5f, 7.168f, 4.502f, 7.087f, 4.507f, 7.007f)
            curveTo(3.601f, 7.583f, 3f, 8.597f, 3f, 9.75f)
            verticalLineTo(15.25f)
            curveTo(3f, 18.426f, 5.574f, 21f, 8.75f, 21f)
            horizontalLineTo(14.25f)
            curveTo(15.403f, 21f, 16.417f, 20.399f, 16.993f, 19.493f)
            curveTo(16.913f, 19.498f, 16.832f, 19.5f, 16.75f, 19.5f)
            horizontalLineTo(8.75f)
            curveTo(6.403f, 19.5f, 4.5f, 17.597f, 4.5f, 15.25f)
            verticalLineTo(7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShareMultiple, contentDescription = null)
    }
}
