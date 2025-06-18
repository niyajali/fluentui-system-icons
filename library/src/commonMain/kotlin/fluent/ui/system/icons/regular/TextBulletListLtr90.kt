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

public val FluentUi.Regular.TextBulletListLtr90: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBulletListLtr90",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.501f, 3.249f)
            curveTo(6.501f, 3.939f, 5.941f, 4.499f, 5.251f, 4.499f)
            curveTo(4.561f, 4.499f, 4.002f, 3.939f, 4.002f, 3.249f)
            curveTo(4.002f, 2.559f, 4.561f, 2f, 5.251f, 2f)
            curveTo(5.941f, 2f, 6.501f, 2.559f, 6.501f, 3.249f)
            close()
            moveTo(6.001f, 6.75f)
            lineTo(6.001f, 21.25f)
            curveTo(6.001f, 21.664f, 5.665f, 22f, 5.251f, 22f)
            curveTo(4.871f, 22f, 4.557f, 21.718f, 4.507f, 21.352f)
            lineTo(4.501f, 21.25f)
            lineTo(4.501f, 6.75f)
            curveTo(4.501f, 6.336f, 4.836f, 6f, 5.251f, 6f)
            curveTo(5.63f, 6f, 5.944f, 6.282f, 5.994f, 6.648f)
            lineTo(6.001f, 6.75f)
            close()
            moveTo(13f, 3.249f)
            curveTo(13f, 3.939f, 12.441f, 4.499f, 11.751f, 4.499f)
            curveTo(11.061f, 4.499f, 10.502f, 3.939f, 10.502f, 3.249f)
            curveTo(10.502f, 2.559f, 11.061f, 2f, 11.751f, 2f)
            curveTo(12.441f, 2f, 13f, 2.559f, 13f, 3.249f)
            close()
            moveTo(12.5f, 6.75f)
            lineTo(12.5f, 21.25f)
            curveTo(12.5f, 21.664f, 12.165f, 22f, 11.75f, 22f)
            curveTo(11.371f, 22f, 11.057f, 21.718f, 11.007f, 21.352f)
            lineTo(11f, 21.25f)
            lineTo(11f, 6.75f)
            curveTo(11f, 6.336f, 11.336f, 6f, 11.75f, 6f)
            curveTo(12.13f, 6f, 12.444f, 6.282f, 12.494f, 6.648f)
            lineTo(12.5f, 6.75f)
            close()
            moveTo(19.5f, 3.249f)
            curveTo(19.5f, 3.939f, 18.941f, 4.499f, 18.251f, 4.499f)
            curveTo(17.561f, 4.499f, 17.002f, 3.939f, 17.002f, 3.249f)
            curveTo(17.002f, 2.559f, 17.561f, 2f, 18.251f, 2f)
            curveTo(18.941f, 2f, 19.5f, 2.559f, 19.5f, 3.249f)
            close()
            moveTo(19f, 6.75f)
            lineTo(19f, 21.25f)
            curveTo(19f, 21.664f, 18.665f, 22f, 18.25f, 22f)
            curveTo(17.871f, 22f, 17.557f, 21.718f, 17.507f, 21.352f)
            lineTo(17.5f, 21.25f)
            lineTo(17.5f, 6.75f)
            curveTo(17.5f, 6.336f, 17.836f, 6f, 18.25f, 6f)
            curveTo(18.63f, 6f, 18.944f, 6.282f, 18.994f, 6.648f)
            lineTo(19f, 6.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextBulletListLtr90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.TextBulletListLtr90, contentDescription = null)
    }
}
