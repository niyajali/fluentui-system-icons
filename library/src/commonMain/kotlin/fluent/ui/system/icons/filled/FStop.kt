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
package fluent.ui.system.icons.filled

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

public val FluentUi.Filled.FStop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FStop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.442f, 6.57f)
            curveTo(13.754f, 4.743f, 15.63f, 3.633f, 17.381f, 4.24f)
            lineTo(17.973f, 4.445f)
            curveTo(18.495f, 4.626f, 19.064f, 4.349f, 19.245f, 3.828f)
            curveTo(19.426f, 3.306f, 19.149f, 2.736f, 18.628f, 2.555f)
            lineTo(18.036f, 2.35f)
            curveTo(15.118f, 1.339f, 11.99f, 3.189f, 11.47f, 6.233f)
            lineTo(10.742f, 10.5f)
            horizontalLineTo(7f)
            curveTo(6.448f, 10.5f, 6f, 10.948f, 6f, 11.5f)
            curveTo(6f, 12.052f, 6.448f, 12.5f, 7f, 12.5f)
            horizontalLineTo(10.4f)
            lineTo(9.71f, 16.542f)
            curveTo(9.363f, 18.575f, 7.115f, 19.66f, 5.307f, 18.665f)
            lineTo(5.232f, 18.624f)
            curveTo(4.748f, 18.358f, 4.14f, 18.534f, 3.874f, 19.018f)
            curveTo(3.608f, 19.502f, 3.784f, 20.11f, 4.268f, 20.376f)
            lineTo(4.344f, 20.418f)
            curveTo(7.356f, 22.075f, 11.103f, 20.267f, 11.682f, 16.878f)
            lineTo(12.429f, 12.5f)
            horizontalLineTo(16f)
            curveTo(16.552f, 12.5f, 17f, 12.052f, 17f, 11.5f)
            curveTo(17f, 10.948f, 16.552f, 10.5f, 16f, 10.5f)
            horizontalLineTo(12.771f)
            lineTo(13.442f, 6.57f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FStopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FStop, contentDescription = null)
    }
}
