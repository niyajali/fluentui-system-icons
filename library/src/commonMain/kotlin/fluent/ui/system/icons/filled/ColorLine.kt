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

public val FluentIcons.Filled.ColorLine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColorLine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.382f, 14f)
            horizontalLineTo(4f)
            curveTo(2.895f, 14f, 2f, 14.895f, 2f, 16f)
            verticalLineTo(20f)
            curveTo(2f, 21.105f, 2.895f, 22f, 4f, 22f)
            horizontalLineTo(20f)
            curveTo(21.105f, 22f, 22f, 21.105f, 22f, 20f)
            verticalLineTo(16f)
            curveTo(22f, 14.895f, 21.105f, 14f, 20f, 14f)
            horizontalLineTo(13.546f)
            lineTo(12.23f, 15.314f)
            curveTo(11.85f, 15.693f, 11.382f, 15.972f, 10.868f, 16.127f)
            lineTo(6.575f, 17.415f)
            curveTo(5.517f, 17.733f, 4.402f, 17.133f, 4.084f, 16.075f)
            curveTo(3.968f, 15.687f, 3.972f, 15.273f, 4.096f, 14.887f)
            lineTo(4.382f, 14f)
            close()
            moveTo(18.648f, 2.944f)
            curveTo(19.904f, 4.201f, 19.904f, 6.239f, 18.646f, 7.495f)
            lineTo(11.523f, 14.606f)
            curveTo(11.26f, 14.869f, 10.936f, 15.062f, 10.58f, 15.169f)
            lineTo(6.287f, 16.458f)
            curveTo(5.759f, 16.616f, 5.201f, 16.316f, 5.042f, 15.787f)
            curveTo(4.984f, 15.593f, 4.986f, 15.386f, 5.048f, 15.193f)
            lineTo(6.41f, 10.965f)
            curveTo(6.519f, 10.625f, 6.708f, 10.315f, 6.962f, 10.063f)
            lineTo(14.094f, 2.941f)
            curveTo(15.353f, 1.685f, 17.391f, 1.686f, 18.648f, 2.944f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColorLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ColorLine, contentDescription = null)
    }
}
