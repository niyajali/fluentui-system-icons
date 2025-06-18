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

public val FluentIcons.Regular.TextBulletListRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBulletListRtl",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.751f, 17.5f)
            curveTo(20.061f, 17.5f, 19.501f, 18.059f, 19.501f, 18.749f)
            curveTo(19.501f, 19.439f, 20.061f, 19.999f, 20.751f, 19.999f)
            curveTo(21.441f, 19.999f, 22f, 19.439f, 22f, 18.749f)
            curveTo(22f, 18.059f, 21.441f, 17.5f, 20.751f, 17.5f)
            close()
            moveTo(17.25f, 18f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 18f, 2f, 18.336f, 2f, 18.75f)
            curveTo(2f, 19.13f, 2.282f, 19.444f, 2.648f, 19.493f)
            lineTo(2.75f, 19.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 19.5f, 18f, 19.164f, 18f, 18.75f)
            curveTo(18f, 18.37f, 17.718f, 18.056f, 17.352f, 18.007f)
            lineTo(17.25f, 18f)
            close()
            moveTo(20.751f, 11f)
            curveTo(20.061f, 11f, 19.501f, 11.559f, 19.501f, 12.249f)
            curveTo(19.501f, 12.939f, 20.061f, 13.499f, 20.751f, 13.499f)
            curveTo(21.441f, 13.499f, 22f, 12.939f, 22f, 12.249f)
            curveTo(22f, 11.559f, 21.441f, 11f, 20.751f, 11f)
            close()
            moveTo(17.25f, 11.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11.5f, 2f, 11.836f, 2f, 12.25f)
            curveTo(2f, 12.63f, 2.282f, 12.943f, 2.648f, 12.993f)
            lineTo(2.75f, 13f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 13f, 18f, 12.664f, 18f, 12.25f)
            curveTo(18f, 11.87f, 17.718f, 11.557f, 17.352f, 11.507f)
            lineTo(17.25f, 11.5f)
            close()
            moveTo(20.751f, 4.5f)
            curveTo(20.061f, 4.5f, 19.501f, 5.059f, 19.501f, 5.749f)
            curveTo(19.501f, 6.439f, 20.061f, 6.999f, 20.751f, 6.999f)
            curveTo(21.441f, 6.999f, 22f, 6.439f, 22f, 5.749f)
            curveTo(22f, 5.059f, 21.441f, 4.5f, 20.751f, 4.5f)
            close()
            moveTo(17.25f, 5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
            curveTo(2f, 6.13f, 2.282f, 6.443f, 2.648f, 6.493f)
            lineTo(2.75f, 6.5f)
            horizontalLineTo(17.25f)
            curveTo(17.664f, 6.5f, 18f, 6.164f, 18f, 5.75f)
            curveTo(18f, 5.37f, 17.718f, 5.057f, 17.352f, 5.007f)
            lineTo(17.25f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextBulletListRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBulletListRtl, contentDescription = null)
    }
}
