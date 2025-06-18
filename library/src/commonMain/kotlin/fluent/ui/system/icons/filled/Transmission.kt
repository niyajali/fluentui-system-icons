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

public val FluentUi.Filled.Transmission: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Transmission",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(10.481f, 2f, 9.25f, 3.231f, 9.25f, 4.75f)
            curveTo(9.25f, 6.009f, 10.096f, 7.07f, 11.25f, 7.396f)
            verticalLineTo(11.25f)
            curveTo(11.25f, 11.664f, 11.586f, 12f, 12f, 12f)
            curveTo(12.414f, 12f, 12.75f, 11.664f, 12.75f, 11.25f)
            verticalLineTo(7.396f)
            curveTo(13.904f, 7.07f, 14.75f, 6.009f, 14.75f, 4.75f)
            curveTo(14.75f, 3.231f, 13.519f, 2f, 12f, 2f)
            close()
            moveTo(5.5f, 4f)
            curveTo(4.119f, 4f, 3f, 5.119f, 3f, 6.5f)
            verticalLineTo(18.5f)
            curveTo(3f, 19.881f, 4.119f, 21f, 5.5f, 21f)
            curveTo(6.881f, 21f, 8f, 19.881f, 8f, 18.5f)
            verticalLineTo(15f)
            horizontalLineTo(9.5f)
            verticalLineTo(18.5f)
            curveTo(9.5f, 19.881f, 10.619f, 21f, 12f, 21f)
            curveTo(13.381f, 21f, 14.5f, 19.881f, 14.5f, 18.5f)
            verticalLineTo(15f)
            horizontalLineTo(19f)
            curveTo(20.105f, 15f, 21f, 14.105f, 21f, 13f)
            verticalLineTo(6.5f)
            curveTo(21f, 5.119f, 19.881f, 4f, 18.5f, 4f)
            curveTo(17.119f, 4f, 16f, 5.119f, 16f, 6.5f)
            verticalLineTo(10f)
            horizontalLineTo(13.75f)
            verticalLineTo(11.5f)
            horizontalLineTo(17.5f)
            verticalLineTo(6.5f)
            curveTo(17.5f, 5.948f, 17.948f, 5.5f, 18.5f, 5.5f)
            curveTo(19.052f, 5.5f, 19.5f, 5.948f, 19.5f, 6.5f)
            verticalLineTo(13f)
            curveTo(19.5f, 13.276f, 19.276f, 13.5f, 19f, 13.5f)
            horizontalLineTo(13f)
            verticalLineTo(18.5f)
            curveTo(13f, 19.052f, 12.552f, 19.5f, 12f, 19.5f)
            curveTo(11.448f, 19.5f, 11f, 19.052f, 11f, 18.5f)
            verticalLineTo(13.5f)
            horizontalLineTo(6.5f)
            verticalLineTo(18.5f)
            curveTo(6.5f, 19.052f, 6.052f, 19.5f, 5.5f, 19.5f)
            curveTo(4.948f, 19.5f, 4.5f, 19.052f, 4.5f, 18.5f)
            verticalLineTo(6.5f)
            curveTo(4.5f, 5.948f, 4.948f, 5.5f, 5.5f, 5.5f)
            curveTo(6.052f, 5.5f, 6.5f, 5.948f, 6.5f, 6.5f)
            verticalLineTo(11.5f)
            horizontalLineTo(10.25f)
            verticalLineTo(10f)
            horizontalLineTo(8f)
            verticalLineTo(6.5f)
            curveTo(8f, 5.119f, 6.881f, 4f, 5.5f, 4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TransmissionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Transmission, contentDescription = null)
    }
}
