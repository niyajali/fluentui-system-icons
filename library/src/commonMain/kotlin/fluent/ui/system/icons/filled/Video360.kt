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

public val FluentUi.Filled.Video360: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Video360",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.692f, 4.017f)
            curveTo(3.318f, 3.824f, 2f, 4.875f, 2f, 6.316f)
            lineTo(2f, 17.684f)
            curveTo(2f, 19.125f, 3.318f, 20.175f, 4.691f, 19.983f)
            curveTo(4.888f, 19.955f, 5.1f, 19.927f, 5.327f, 19.899f)
            curveTo(6.914f, 19.7f, 9.209f, 19.5f, 12f, 19.5f)
            curveTo(15.189f, 19.5f, 17.732f, 19.762f, 19.309f, 19.983f)
            curveTo(20.682f, 20.175f, 22f, 19.125f, 22f, 17.684f)
            verticalLineTo(6.316f)
            curveTo(22f, 4.875f, 20.682f, 3.824f, 19.308f, 4.017f)
            curveTo(17.732f, 4.238f, 15.191f, 4.5f, 12f, 4.5f)
            curveTo(8.809f, 4.5f, 6.268f, 4.238f, 4.692f, 4.017f)
            close()
            moveTo(19f, 18.428f)
            curveTo(18.066f, 18.309f, 16.885f, 18.187f, 15.5f, 18.104f)
            verticalLineTo(15f)
            horizontalLineTo(18f)
            curveTo(18.552f, 15f, 19f, 15.447f, 19f, 16f)
            verticalLineTo(18.428f)
            close()
            moveTo(13.999f, 18.033f)
            curveTo(13.365f, 18.012f, 12.697f, 18f, 12f, 18f)
            curveTo(11.303f, 18f, 10.635f, 18.012f, 10.001f, 18.033f)
            curveTo(10f, 18.022f, 10f, 18.011f, 10f, 18f)
            verticalLineTo(15f)
            curveTo(10f, 14.447f, 10.448f, 14f, 11f, 14f)
            horizontalLineTo(13f)
            curveTo(13.552f, 14f, 14f, 14.447f, 14f, 15f)
            verticalLineTo(18f)
            curveTo(14f, 18.011f, 14f, 18.022f, 13.999f, 18.033f)
            close()
            moveTo(8.5f, 18.104f)
            curveTo(7.114f, 18.187f, 5.933f, 18.309f, 5f, 18.428f)
            verticalLineTo(16f)
            curveTo(5f, 15.447f, 5.448f, 15f, 6f, 15f)
            horizontalLineTo(8.5f)
            verticalLineTo(18.104f)
            close()
            moveTo(12f, 13f)
            curveTo(11.172f, 13f, 10.5f, 12.328f, 10.5f, 11.5f)
            curveTo(10.5f, 10.671f, 11.172f, 10f, 12f, 10f)
            curveTo(12.828f, 10f, 13.5f, 10.671f, 13.5f, 11.5f)
            curveTo(13.5f, 12.328f, 12.828f, 13f, 12f, 13f)
            close()
            moveTo(8.5f, 12.5f)
            curveTo(8.5f, 13.328f, 7.828f, 14f, 7f, 14f)
            curveTo(6.172f, 14f, 5.5f, 13.328f, 5.5f, 12.5f)
            curveTo(5.5f, 11.671f, 6.172f, 11f, 7f, 11f)
            curveTo(7.828f, 11f, 8.5f, 11.671f, 8.5f, 12.5f)
            close()
            moveTo(18.5f, 12.5f)
            curveTo(18.5f, 13.328f, 17.828f, 14f, 17f, 14f)
            curveTo(16.172f, 14f, 15.5f, 13.328f, 15.5f, 12.5f)
            curveTo(15.5f, 11.671f, 16.172f, 11f, 17f, 11f)
            curveTo(17.828f, 11f, 18.5f, 11.671f, 18.5f, 12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Video360Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Video360, contentDescription = null)
    }
}
