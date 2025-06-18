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

public val FluentIcons.Filled.DualScreen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.245f, 4.002f)
            curveTo(21.212f, 4.002f, 21.995f, 4.786f, 21.995f, 5.752f)
            verticalLineTo(18.248f)
            curveTo(21.995f, 19.214f, 21.212f, 19.998f, 20.245f, 19.998f)
            horizontalLineTo(12.998f)
            curveTo(12.911f, 19.998f, 12.825f, 19.991f, 12.742f, 19.979f)
            lineTo(12.742f, 4.021f)
            curveTo(12.825f, 4.009f, 12.911f, 4.002f, 12.998f, 4.002f)
            horizontalLineTo(20.245f)
            close()
            moveTo(10.998f, 4f)
            curveTo(11.081f, 4f, 11.163f, 4.006f, 11.243f, 4.017f)
            lineTo(11.243f, 19.978f)
            curveTo(11.163f, 19.989f, 11.081f, 19.995f, 10.998f, 19.995f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 19.995f, 2f, 19.212f, 2f, 18.245f)
            verticalLineTo(5.75f)
            curveTo(2f, 4.784f, 2.783f, 4f, 3.75f, 4f)
            horizontalLineTo(10.998f)
            close()
            moveTo(9.243f, 15.499f)
            horizontalLineTo(7.741f)
            lineTo(7.639f, 15.506f)
            curveTo(7.273f, 15.555f, 6.991f, 15.869f, 6.991f, 16.249f)
            curveTo(6.991f, 16.628f, 7.273f, 16.942f, 7.639f, 16.992f)
            lineTo(7.741f, 16.999f)
            horizontalLineTo(9.243f)
            lineTo(9.345f, 16.992f)
            curveTo(9.711f, 16.942f, 9.993f, 16.628f, 9.993f, 16.249f)
            curveTo(9.993f, 15.869f, 9.711f, 15.555f, 9.345f, 15.506f)
            lineTo(9.243f, 15.499f)
            close()
            moveTo(16.239f, 15.499f)
            horizontalLineTo(14.739f)
            lineTo(14.637f, 15.506f)
            curveTo(14.271f, 15.555f, 13.989f, 15.869f, 13.989f, 16.249f)
            curveTo(13.989f, 16.628f, 14.271f, 16.942f, 14.637f, 16.992f)
            lineTo(14.739f, 16.999f)
            horizontalLineTo(16.239f)
            lineTo(16.34f, 16.992f)
            curveTo(16.707f, 16.942f, 16.989f, 16.628f, 16.989f, 16.249f)
            curveTo(16.989f, 15.869f, 16.707f, 15.555f, 16.34f, 15.506f)
            lineTo(16.239f, 15.499f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DualScreenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DualScreen, contentDescription = null)
    }
}
