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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.TextStrikethrough: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextStrikethrough",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.848f, 11.5f)
            horizontalLineTo(19.501f)
            curveTo(20.053f, 11.5f, 20.501f, 11.948f, 20.501f, 12.5f)
            curveTo(20.501f, 13.053f, 20.053f, 13.5f, 19.501f, 13.5f)
            horizontalLineTo(17.114f)
            curveTo(17.775f, 14.275f, 18.112f, 15.175f, 18.112f, 16.185f)
            curveTo(18.112f, 19.114f, 14.832f, 21.1f, 11.079f, 20.664f)
            curveTo(8.751f, 20.393f, 7.114f, 19.445f, 6.252f, 17.831f)
            curveTo(5.992f, 17.344f, 6.045f, 16.816f, 6.5f, 16.5f)
            curveTo(6.955f, 16.185f, 7.756f, 16.402f, 8.016f, 16.889f)
            curveTo(8.549f, 17.886f, 9.62f, 18.481f, 11.31f, 18.677f)
            curveTo(13.896f, 18.978f, 16.112f, 17.767f, 16.112f, 16.185f)
            curveTo(16.112f, 15.087f, 15.565f, 14.245f, 14.005f, 13.5f)
            horizontalLineTo(5f)
            curveTo(4.448f, 13.5f, 4f, 13.053f, 4f, 12.5f)
            curveTo(4f, 11.948f, 4.448f, 11.5f, 5f, 11.5f)
            horizontalLineTo(13.812f)
            curveTo(13.831f, 11.5f, 13.832f, 11.5f, 13.848f, 11.5f)
            close()
            moveTo(6.987f, 9.695f)
            curveTo(6.882f, 9.537f, 6.783f, 9.37f, 6.689f, 9.186f)
            curveTo(6.389f, 8.595f, 6.221f, 7.971f, 6.254f, 7.35f)
            curveTo(6.414f, 4.386f, 9.188f, 2.637f, 12.856f, 3.064f)
            curveTo(15.117f, 3.326f, 16.846f, 4.148f, 18.003f, 5.55f)
            curveTo(18.355f, 5.976f, 18.276f, 6.599f, 17.85f, 6.95f)
            curveTo(17.424f, 7.302f, 16.802f, 7.276f, 16.45f, 6.85f)
            curveTo(15.637f, 5.865f, 14.382f, 5.254f, 12.625f, 5.05f)
            curveTo(10.065f, 4.753f, 8.254f, 5.768f, 8.254f, 7.374f)
            curveTo(8.254f, 8.087f, 8.493f, 8.593f, 9.016f, 9.183f)
            curveTo(9.241f, 9.437f, 9.663f, 9.709f, 10.281f, 9.998f)
            horizontalLineTo(7.192f)
            curveTo(7.081f, 9.835f, 7.012f, 9.734f, 6.987f, 9.695f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextStrikethroughPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextStrikethrough, contentDescription = null)
    }
}
