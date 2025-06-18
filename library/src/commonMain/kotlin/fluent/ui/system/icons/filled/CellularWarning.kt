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

public val FluentUi.Filled.CellularWarning: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CellularWarning",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 9f)
            curveTo(16.552f, 9f, 17f, 9.446f, 17f, 9.995f)
            verticalLineTo(11.049f)
            curveTo(16.292f, 11.19f, 15.636f, 11.635f, 15.263f, 12.383f)
            lineTo(15f, 12.909f)
            verticalLineTo(9.995f)
            curveTo(15f, 9.446f, 15.448f, 9f, 16f, 9f)
            close()
            moveTo(19f, 6.999f)
            verticalLineTo(11.493f)
            curveTo(19.297f, 11.715f, 19.552f, 12.012f, 19.737f, 12.383f)
            lineTo(21f, 14.91f)
            verticalLineTo(6.999f)
            curveTo(21f, 6.447f, 20.552f, 6f, 20f, 6f)
            curveTo(19.448f, 6f, 19f, 6.447f, 19f, 6.999f)
            close()
            moveTo(11.267f, 20.381f)
            lineTo(13f, 16.912f)
            verticalLineTo(13f)
            curveTo(13f, 12.448f, 12.552f, 12f, 12f, 12f)
            curveTo(11.448f, 12f, 11f, 12.448f, 11f, 13f)
            verticalLineTo(20f)
            curveTo(11f, 20.213f, 11.067f, 20.411f, 11.18f, 20.573f)
            curveTo(11.206f, 20.509f, 11.235f, 20.445f, 11.267f, 20.381f)
            close()
            moveTo(8f, 15f)
            curveTo(8.552f, 15f, 9f, 15.445f, 9f, 15.994f)
            verticalLineTo(20.006f)
            curveTo(9f, 20.555f, 8.552f, 21f, 8f, 21f)
            curveTo(7.448f, 21f, 7f, 20.555f, 7f, 20.006f)
            verticalLineTo(15.994f)
            curveTo(7f, 15.445f, 7.448f, 15f, 8f, 15f)
            close()
            moveTo(4f, 18f)
            curveTo(4.552f, 18f, 5f, 18.44f, 5f, 18.984f)
            verticalLineTo(20.016f)
            curveTo(5f, 20.56f, 4.552f, 21f, 4f, 21f)
            curveTo(3.448f, 21f, 3f, 20.56f, 3f, 20.016f)
            verticalLineTo(18.984f)
            curveTo(3f, 18.44f, 3.448f, 18f, 4f, 18f)
            close()
            moveTo(16.157f, 12.83f)
            lineTo(12.16f, 20.828f)
            curveTo(11.661f, 21.826f, 12.387f, 23f, 13.503f, 23f)
            horizontalLineTo(21.497f)
            curveTo(22.613f, 23f, 23.338f, 21.826f, 22.84f, 20.828f)
            lineTo(18.843f, 12.83f)
            curveTo(18.29f, 11.723f, 16.71f, 11.723f, 16.157f, 12.83f)
            close()
            moveTo(18f, 15.496f)
            verticalLineTo(18.497f)
            curveTo(18f, 18.774f, 17.776f, 18.998f, 17.5f, 18.998f)
            curveTo(17.224f, 18.998f, 17f, 18.774f, 17f, 18.497f)
            verticalLineTo(15.496f)
            curveTo(17f, 15.219f, 17.224f, 14.995f, 17.5f, 14.995f)
            curveTo(17.776f, 14.995f, 18f, 15.219f, 18f, 15.496f)
            close()
            moveTo(17.5f, 20.999f)
            curveTo(17.224f, 20.999f, 17f, 20.775f, 17f, 20.499f)
            curveTo(17f, 20.222f, 17.224f, 19.998f, 17.5f, 19.998f)
            curveTo(17.776f, 19.998f, 18f, 20.222f, 18f, 20.499f)
            curveTo(18f, 20.775f, 17.776f, 20.999f, 17.5f, 20.999f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CellularWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CellularWarning, contentDescription = null)
    }
}
