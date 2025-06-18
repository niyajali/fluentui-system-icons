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

public val FluentUi.Regular.Link: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Link",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.25f, 7f)
            curveTo(9.664f, 7f, 10f, 7.336f, 10f, 7.75f)
            curveTo(10f, 8.127f, 9.722f, 8.438f, 9.361f, 8.492f)
            lineTo(9.25f, 8.5f)
            horizontalLineTo(7f)
            curveTo(5.067f, 8.5f, 3.5f, 10.067f, 3.5f, 12f)
            curveTo(3.5f, 13.864f, 4.957f, 15.388f, 6.794f, 15.494f)
            lineTo(7f, 15.5f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 15.5f, 10f, 15.836f, 10f, 16.25f)
            curveTo(10f, 16.627f, 9.722f, 16.938f, 9.361f, 16.992f)
            lineTo(9.25f, 17f)
            horizontalLineTo(7f)
            curveTo(4.239f, 17f, 2f, 14.761f, 2f, 12f)
            curveTo(2f, 9.322f, 4.105f, 7.136f, 6.75f, 7.006f)
            lineTo(7f, 7f)
            horizontalLineTo(9.25f)
            close()
            moveTo(17f, 7f)
            curveTo(19.761f, 7f, 22f, 9.239f, 22f, 12f)
            curveTo(22f, 14.678f, 19.895f, 16.864f, 17.25f, 16.994f)
            lineTo(17f, 17f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 17f, 14f, 16.664f, 14f, 16.25f)
            curveTo(14f, 15.873f, 14.278f, 15.562f, 14.639f, 15.508f)
            lineTo(14.75f, 15.5f)
            horizontalLineTo(17f)
            curveTo(18.933f, 15.5f, 20.5f, 13.933f, 20.5f, 12f)
            curveTo(20.5f, 10.136f, 19.043f, 8.612f, 17.206f, 8.506f)
            lineTo(17f, 8.5f)
            horizontalLineTo(14.75f)
            curveTo(14.336f, 8.5f, 14f, 8.164f, 14f, 7.75f)
            curveTo(14f, 7.373f, 14.278f, 7.062f, 14.639f, 7.008f)
            lineTo(14.75f, 7f)
            horizontalLineTo(17f)
            close()
            moveTo(7f, 11.25f)
            horizontalLineTo(17f)
            curveTo(17.414f, 11.25f, 17.75f, 11.586f, 17.75f, 12f)
            curveTo(17.75f, 12.38f, 17.468f, 12.693f, 17.102f, 12.743f)
            lineTo(17f, 12.75f)
            horizontalLineTo(7f)
            curveTo(6.586f, 12.75f, 6.25f, 12.414f, 6.25f, 12f)
            curveTo(6.25f, 11.62f, 6.532f, 11.307f, 6.898f, 11.257f)
            lineTo(7f, 11.25f)
            horizontalLineTo(17f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Link, contentDescription = null)
    }
}
