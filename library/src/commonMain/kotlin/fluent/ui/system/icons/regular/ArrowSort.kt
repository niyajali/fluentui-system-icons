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

public val FluentUi.Regular.ArrowSort: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSort",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.251f, 4f)
            lineTo(17.149f, 4.007f)
            curveTo(16.783f, 4.057f, 16.501f, 4.37f, 16.501f, 4.75f)
            lineTo(16.5f, 17.442f)
            lineTo(13.28f, 14.224f)
            lineTo(13.196f, 14.152f)
            curveTo(12.902f, 13.934f, 12.486f, 13.958f, 12.219f, 14.225f)
            curveTo(11.927f, 14.518f, 11.927f, 14.993f, 12.22f, 15.285f)
            lineTo(16.724f, 19.785f)
            lineTo(16.808f, 19.858f)
            curveTo(17.101f, 20.076f, 17.518f, 20.051f, 17.784f, 19.785f)
            lineTo(22.281f, 15.285f)
            lineTo(22.353f, 15.201f)
            curveTo(22.571f, 14.907f, 22.546f, 14.491f, 22.28f, 14.224f)
            lineTo(22.196f, 14.152f)
            curveTo(21.902f, 13.934f, 21.486f, 13.958f, 21.219f, 14.225f)
            lineTo(18f, 17.446f)
            lineTo(18.001f, 4.75f)
            lineTo(17.994f, 4.648f)
            curveTo(17.944f, 4.282f, 17.631f, 4f, 17.251f, 4f)
            close()
            moveTo(6.214f, 4.22f)
            lineTo(1.72f, 8.715f)
            lineTo(1.647f, 8.799f)
            curveTo(1.429f, 9.092f, 1.453f, 9.509f, 1.72f, 9.775f)
            lineTo(1.804f, 9.848f)
            curveTo(2.097f, 10.066f, 2.514f, 10.042f, 2.78f, 9.775f)
            lineTo(5.997f, 6.557f)
            lineTo(5.998f, 19.255f)
            lineTo(6.005f, 19.357f)
            curveTo(6.054f, 19.723f, 6.368f, 20.005f, 6.748f, 20.005f)
            lineTo(6.849f, 19.998f)
            curveTo(7.216f, 19.948f, 7.498f, 19.635f, 7.498f, 19.255f)
            lineTo(7.497f, 6.559f)
            lineTo(10.72f, 9.776f)
            lineTo(10.804f, 9.848f)
            curveTo(11.098f, 10.066f, 11.514f, 10.041f, 11.781f, 9.775f)
            curveTo(12.073f, 9.482f, 12.073f, 9.007f, 11.779f, 8.714f)
            lineTo(7.275f, 4.219f)
            lineTo(7.19f, 4.147f)
            curveTo(6.897f, 3.929f, 6.48f, 3.954f, 6.214f, 4.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSortPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowSort, contentDescription = null)
    }
}
