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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.267f, 4.209f)
            curveTo(12.967f, 3.923f, 12.493f, 3.935f, 12.207f, 4.235f)
            curveTo(11.921f, 4.535f, 11.933f, 5.009f, 12.233f, 5.295f)
            lineTo(18.484f, 11.25f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 11.25f, 3f, 11.585f, 3f, 12f)
            curveTo(3f, 12.414f, 3.336f, 12.75f, 3.75f, 12.75f)
            horizontalLineTo(18.484f)
            lineTo(12.233f, 18.704f)
            curveTo(11.933f, 18.99f, 11.921f, 19.465f, 12.207f, 19.765f)
            curveTo(12.493f, 20.065f, 12.967f, 20.076f, 13.267f, 19.791f)
            lineTo(20.686f, 12.724f)
            curveTo(20.855f, 12.563f, 20.955f, 12.358f, 20.986f, 12.144f)
            curveTo(20.995f, 12.097f, 21f, 12.049f, 21f, 12f)
            curveTo(21f, 11.95f, 20.995f, 11.902f, 20.986f, 11.855f)
            curveTo(20.955f, 11.642f, 20.855f, 11.436f, 20.686f, 11.276f)
            lineTo(13.267f, 4.209f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowRight, contentDescription = null)
    }
}
