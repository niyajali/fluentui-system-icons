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

public val FluentIcons.Filled.DataLine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataLine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16f, 6f)
            curveTo(16f, 4.343f, 17.343f, 3f, 19f, 3f)
            curveTo(20.657f, 3f, 22f, 4.343f, 22f, 6f)
            curveTo(22f, 7.657f, 20.657f, 9f, 19f, 9f)
            curveTo(18.838f, 9f, 18.679f, 8.987f, 18.524f, 8.962f)
            lineTo(16.486f, 12.321f)
            curveTo(16.81f, 12.8f, 17f, 13.378f, 17f, 14f)
            curveTo(17f, 15.657f, 15.657f, 17f, 14f, 17f)
            curveTo(13.097f, 17f, 12.288f, 16.601f, 11.738f, 15.97f)
            lineTo(7.996f, 17.841f)
            curveTo(7.999f, 17.893f, 8f, 17.947f, 8f, 18f)
            curveTo(8f, 19.657f, 6.657f, 21f, 5f, 21f)
            curveTo(3.343f, 21f, 2f, 19.657f, 2f, 18f)
            curveTo(2f, 16.343f, 3.343f, 15f, 5f, 15f)
            curveTo(6.066f, 15f, 7.002f, 15.556f, 7.535f, 16.394f)
            lineTo(11.066f, 14.629f)
            curveTo(11.023f, 14.426f, 11f, 14.216f, 11f, 14f)
            curveTo(11f, 12.343f, 12.343f, 11f, 14f, 11f)
            curveTo(14.482f, 11f, 14.938f, 11.114f, 15.341f, 11.316f)
            lineTo(17.139f, 8.353f)
            curveTo(16.445f, 7.804f, 16f, 6.954f, 16f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataLine, contentDescription = null)
    }
}
