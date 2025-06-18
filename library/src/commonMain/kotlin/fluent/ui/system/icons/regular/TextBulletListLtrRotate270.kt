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

public val FluentIcons.Regular.TextBulletListLtrRotate270: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.TextBulletListLtrRotate270",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 20.751f)
                curveTo(17.5f, 20.061f, 18.059f, 19.501f, 18.749f, 19.501f)
                curveTo(19.439f, 19.501f, 19.999f, 20.061f, 19.999f, 20.751f)
                curveTo(19.999f, 21.441f, 19.439f, 22f, 18.749f, 22f)
                curveTo(18.059f, 22f, 17.5f, 21.441f, 17.5f, 20.751f)
                close()
                moveTo(18f, 17.25f)
                verticalLineTo(2.75f)
                curveTo(18f, 2.336f, 18.336f, 2f, 18.75f, 2f)
                curveTo(19.13f, 2f, 19.444f, 2.282f, 19.493f, 2.648f)
                lineTo(19.5f, 2.75f)
                verticalLineTo(17.25f)
                curveTo(19.5f, 17.664f, 19.164f, 18f, 18.75f, 18f)
                curveTo(18.37f, 18f, 18.056f, 17.718f, 18.007f, 17.352f)
                lineTo(18f, 17.25f)
                close()
                moveTo(11f, 20.751f)
                curveTo(11f, 20.061f, 11.559f, 19.501f, 12.249f, 19.501f)
                curveTo(12.939f, 19.501f, 13.499f, 20.061f, 13.499f, 20.751f)
                curveTo(13.499f, 21.441f, 12.939f, 22f, 12.249f, 22f)
                curveTo(11.559f, 22f, 11f, 21.441f, 11f, 20.751f)
                close()
                moveTo(11.5f, 17.25f)
                verticalLineTo(2.75f)
                curveTo(11.5f, 2.336f, 11.836f, 2f, 12.25f, 2f)
                curveTo(12.63f, 2f, 12.943f, 2.282f, 12.993f, 2.648f)
                lineTo(13f, 2.75f)
                verticalLineTo(17.25f)
                curveTo(13f, 17.664f, 12.664f, 18f, 12.25f, 18f)
                curveTo(11.87f, 18f, 11.557f, 17.718f, 11.507f, 17.352f)
                lineTo(11.5f, 17.25f)
                close()
                moveTo(4.5f, 20.751f)
                curveTo(4.5f, 20.061f, 5.059f, 19.501f, 5.749f, 19.501f)
                curveTo(6.439f, 19.501f, 6.999f, 20.061f, 6.999f, 20.751f)
                curveTo(6.999f, 21.441f, 6.439f, 22f, 5.749f, 22f)
                curveTo(5.059f, 22f, 4.5f, 21.441f, 4.5f, 20.751f)
                close()
                moveTo(5f, 17.25f)
                lineTo(5f, 2.75f)
                curveTo(5f, 2.336f, 5.336f, 2f, 5.75f, 2f)
                curveTo(6.13f, 2f, 6.443f, 2.282f, 6.493f, 2.648f)
                lineTo(6.5f, 2.75f)
                lineTo(6.5f, 17.25f)
                curveTo(6.5f, 17.664f, 6.164f, 18f, 5.75f, 18f)
                curveTo(5.37f, 18f, 5.057f, 17.718f, 5.007f, 17.352f)
                lineTo(5f, 17.25f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextBulletListLtrRotate270Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextBulletListLtrRotate270, contentDescription = null)
    }
}
